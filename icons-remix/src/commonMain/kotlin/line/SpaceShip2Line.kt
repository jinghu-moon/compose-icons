package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpaceShip2Line: ImageVector
    get() {
        if (_spaceShip2Line != null) return _spaceShip2Line!!
        _spaceShip2Line = remixIcon(
            name = "SpaceShip2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.949 17.293 C 11.340 16.903 11.973 16.903 12.363 17.293 C 12.754 17.683 12.754 18.317 12.363 18.708 L 9.524 21.546 C 9.134 21.936 8.501 21.936 8.110 21.546 C 7.720 21.155 7.720 20.522 8.110 20.132 L 10.949 17.293 ZM 9.172 13.414 C 9.562 13.024 10.195 13.024 10.586 13.414 C 10.976 13.804 10.976 14.438 10.586 14.829 L 4.929 20.485 C 4.538 20.876 3.905 20.876 3.515 20.485 C 3.124 20.095 3.124 19.462 3.515 19.071 L 9.172 13.414 ZM 17.423 2.713 C 18.641 2.224 19.877 2.525 20.676 3.323 C 21.474 4.122 21.775 5.358 21.286 6.576 L 17.032 17.173 C 16.873 17.569 16.480 17.820 16.054 17.799 C 15.627 17.777 15.262 17.488 15.144 17.078 C 14.588 15.157 13.574 13.378 12.098 11.901 C 10.621 10.425 8.842 9.412 6.921 8.856 C 6.511 8.738 6.222 8.372 6.200 7.946 C 6.179 7.520 6.430 7.127 6.826 6.968 L 17.423 2.713 ZM 5.293 11.637 C 5.683 11.246 6.316 11.246 6.707 11.637 C 7.097 12.027 7.097 12.660 6.707 13.051 L 3.868 15.889 C 3.478 16.280 2.845 16.280 2.454 15.889 C 2.063 15.499 2.064 14.866 2.454 14.475 L 5.293 11.637 ZM 19.262 4.737 C 19.033 4.508 18.647 4.376 18.168 4.568 L 9.908 7.885 C 11.215 8.540 12.432 9.408 13.512 10.487 C 14.591 11.567 15.459 12.784 16.114 14.091 L 19.431 5.832 C 19.623 5.353 19.490 4.966 19.262 4.737 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _spaceShip2Line!!
    }

private var _spaceShip2Line: ImageVector? = null
