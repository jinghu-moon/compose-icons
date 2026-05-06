package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorBoldIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.42 39.86c-.355-6.077-5.203-10.925-11.28-11.28-39.6-2.33-74.59 2.34-104 13.87C84 53.48 62.31 70.58 49.39 91.9c-17.62 29.11-17.66 64.45-.45 98.19L31.51 207.52c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L65.94 207.09c16.74 8.54 33.88 12.85 50.45 12.85 16.835 .052 33.357-4.55 47.74-13.3 21.32-12.92 38.42-34.62 49.45-62.75C225.08 114.46 229.75 79.46 227.42 39.86ZM151.66 186.08C131.57 198.25 108 199.17 83.94 189l84.54-84.54c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L67 172.06c-10.14-24-9.22-47.63 3-67.72C90.91 69.81 140.54 50.62 204 52.09c1.38 63.44-17.81 113.08-52.34 133.99Z"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
