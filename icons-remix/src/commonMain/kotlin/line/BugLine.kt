package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BugLine: ImageVector
    get() {
        if (_bugLine != null) return _bugLine!!
        _bugLine = remixIcon(
            name = "BugLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 19.900 C 15.282 19.437 17.000 17.419 17.000 15.000 L 17.000 12.000 C 17.000 11.299 16.856 10.622 16.585 10.000 L 7.415 10.000 C 7.144 10.622 7.000 11.299 7.000 12.000 L 7.000 15.000 C 7.000 17.419 8.718 19.437 11.000 19.900 L 11.000 14.000 L 13.000 14.000 L 13.000 19.900 ZM 5.536 17.691 C 5.191 16.862 5.000 15.953 5.000 15.000 L 2.000 15.000 L 2.000 13.000 L 5.000 13.000 L 5.000 12.000 C 5.000 11.357 5.087 10.735 5.249 10.144 L 3.036 8.866 L 4.036 7.134 L 6.056 8.300 C 6.120 8.199 6.186 8.098 6.255 8.000 L 17.745 8.000 C 17.814 8.098 17.880 8.199 17.944 8.300 L 19.964 7.134 L 20.964 8.866 L 18.751 10.144 C 18.913 10.735 19.000 11.357 19.000 12.000 L 19.000 13.000 L 22.000 13.000 L 22.000 15.000 L 19.000 15.000 C 19.000 15.953 18.809 16.862 18.464 17.691 L 20.964 19.134 L 19.964 20.866 L 17.438 19.408 C 16.155 20.989 14.196 22.000 12.000 22.000 C 9.805 22.000 7.845 20.989 6.562 19.408 L 4.036 20.866 L 3.036 19.134 L 5.536 17.691 ZM 8.000 6.000 C 8.000 3.791 9.791 2.000 12.000 2.000 C 14.209 2.000 16.000 3.791 16.000 6.000 L 8.000 6.000 Z"),
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
        return _bugLine!!
    }

private var _bugLine: ImageVector? = null
