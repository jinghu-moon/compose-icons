package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorBoldIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M185.08 114.46c11.777-14.343 14.23-34.19 6.301-50.97C183.451 46.711 166.559 36.007 148 36h-68C73.373 36 68 41.373 68 48v152c0 6.627 5.373 12 12 12h80c23.723-.01 44.432-16.075 50.34-39.051 5.908-22.976-4.484-47.037-25.26-58.489ZM92 60h56c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24h-56ZM160 188h-68v-56h68c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _textB!!
    }

private var _textB: ImageVector? = null
