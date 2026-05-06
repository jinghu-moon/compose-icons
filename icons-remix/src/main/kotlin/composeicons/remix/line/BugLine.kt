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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 19.9c2.282-.463 4-2.481 4-4.9v-3c0-.701-.144-1.378-.415-2h-9.169C7.144 10.622 7 11.299 7 12v3c0 2.419 1.718 4.437 4 4.9v-5.9h2v5.9ZM5.536 17.691C5.191 16.862 5 15.953 5 15h-3v-2h3v-1c0-.643 .087-1.265 .249-1.856L3.036 8.866l1-1.732L6.056 8.3C6.12 8.199 6.186 8.098 6.255 8h11.491c.069 .098 .135 .199 .198 .3L19.964 7.134l1 1.732-2.213 1.278c.162 .591 .249 1.214 .249 1.856v1h3v2h-3c0 .953-.191 1.862-.536 2.691l2.5 1.443-1 1.732L17.438 19.408C16.155 20.989 14.196 22 12 22 9.805 22 7.845 20.989 6.562 19.408L4.036 20.866l-1-1.732L5.536 17.691ZM8 6C8 3.791 9.791 2 12 2c2.209 0 4 1.791 4 4h-8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bugLine!!
    }

private var _bugLine: ImageVector? = null
