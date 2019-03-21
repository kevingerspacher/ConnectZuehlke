import {Injectable} from '@angular/core';
import {Observable, of} from 'rxjs';
import {catchError} from 'rxjs/operators';
import {HttpClient} from '@angular/common/http';
import {Project} from "./domain/Project";

@Injectable({providedIn: 'root'})
export class ProjectService {

  constructor(private http: HttpClient) {
  }

  public getAllProjects(): Observable<Project[]> {
    return this.http
      .get<Project[]>('/api/admin/projects')
      .pipe(catchError(this.handleError('getAllProjects', [])));
  }

  public getProjectsBySearchTerm(searchTerm : string): Observable<Project[]> {
    return this.http
      .get<Project[]>(`api/admin/projects/search/${searchTerm}`)
      .pipe(catchError(this.handleError('getProjectsBySearchTerm', [])));
  }

  public saveProject(project: Project): Observable<Project> {
    return this.http.put<Project>(`/api/admin/projects/${project.id}`, project);
  }

  /**
   * Handle Http operation that failed.
   * Let the app continue.
   * @param operation - name of the operation that failed
   * @param result - optional value to return as the observable result
   */
  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

  private log(s: string) {
    console.log(`${this}: ${s}`);
  }

  getProject(id: string): Observable<Project> {
    return this.http
      .get<Project>(`/api/admin/projects/${id}`)
      .pipe(catchError(this.handleError('getProject', null)));
  }
}
