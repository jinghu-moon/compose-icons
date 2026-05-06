package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorBoldIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 63.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L192 95 161 64 192.52 32.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L144 47 120.49 23.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L107 44 56.89 94.14c-8.253 8.252-12.89 19.444-12.89 31.115 0 11.671 4.637 22.863 12.89 31.115l12.88 12.88L23.51 215.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L86.77 186.25l12.88 12.88c8.252 8.253 19.444 12.89 31.115 12.89 11.671 0 22.863-4.637 31.115-12.89L212 149l3.51 3.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L209 112 240.52 80.49c2.249-2.255 3.51-5.311 3.504-8.496-.006-3.185-1.277-6.237-3.534-8.484ZM144.89 182.14c-3.751 3.752-8.839 5.861-14.145 5.861-5.306 0-10.394-2.108-14.145-5.861L73.86 139.4c-3.752-3.751-5.861-8.839-5.861-14.145 0-5.306 2.108-10.394 5.861-14.145L124 61l71 71Z"),
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
        return _plug!!
    }

private var _plug: ImageVector? = null
