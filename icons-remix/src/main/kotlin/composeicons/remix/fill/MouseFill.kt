package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MouseFill: ImageVector
    get() {
        if (_mouseFill != null) return _mouseFill!!
        _mouseFill = remixIcon(
            name = "MouseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.141 2h1.718c2.014 0 3.094 .278 4.072 .801 .978 .523 1.745 1.29 2.268 2.268 .523 .978 .801 2.058 .801 4.072v5.718c0 2.014-.278 3.094-.801 4.072-.523 .978-1.29 1.745-2.268 2.268-.978 .523-2.058 .801-4.072 .801h-1.718C9.127 22 8.047 21.722 7.069 21.199 6.092 20.676 5.324 19.908 4.801 18.931 4.278 17.953 4 16.873 4 14.859v-5.718C4 7.127 4.278 6.047 4.801 5.069 5.324 4.092 6.092 3.324 7.069 2.801 8.047 2.278 9.127 2 11.141 2ZM11 6v5h2v-5h-2Z"),
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
        return _mouseFill!!
    }

private var _mouseFill: ImageVector? = null
