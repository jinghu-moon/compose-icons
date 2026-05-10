package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorFillIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 48h-96C35.817 48 0 83.817 0 128c0 44.183 35.817 80 80 80h96c44.183 0 80-35.817 80-80C256 83.817 220.183 48 176 48ZM123.49 98.81l-24 64c-1.164 3.136-4.155 5.216-7.5 5.216-3.345 0-6.336-2.081-7.5-5.216l-24-64c-1.552-4.142 .548-8.758 4.69-10.31 4.142-1.552 8.758 .548 10.31 4.69l16.51 44 16.51-44c1.552-4.142 6.168-6.242 10.31-4.69 4.142 1.552 6.242 6.168 4.69 10.31ZM191 156c2.193 3.838 .858 8.727-2.98 10.92-3.838 2.193-8.727 .858-10.92-2.98l-11.44-20c-.53 0-1.07 .05-1.61 .05h-12.05v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-63.99c0-4.418 3.582-8 8-8h20c12.032 .011 22.711 7.708 26.528 19.119 3.816 11.411-.084 23.984-9.688 31.231ZM176 116c0 6.627-5.373 12-12 12h-12v-24h12c6.627 0 12 5.373 12 12Z"),
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
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
