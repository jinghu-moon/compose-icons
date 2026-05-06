package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorRegularIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M123.49 98.81l-24 64c-1.164 3.136-4.155 5.216-7.5 5.216-3.345 0-6.336-2.081-7.5-5.216l-24-64c-1.552-4.142 .548-8.758 4.69-10.31 4.142-1.552 8.758 .548 10.31 4.69l16.51 44 16.51-44c1.552-4.142 6.168-6.242 10.31-4.69 4.142 1.552 6.242 6.168 4.69 10.31ZM256 128c-.05 44.162-35.838 79.95-80 80h-96C35.817 208 0 172.183 0 128 0 83.817 35.817 48 80 48h96c44.162 .05 79.95 35.838 80 80ZM240 128C239.961 92.67 211.33 64.039 176 64h-96C44.654 64 16 92.654 16 128c0 35.346 28.654 64 64 64h96c35.33-.039 63.961-28.67 64-64ZM180.84 138.35 191 156c2.193 3.838 .858 8.727-2.98 10.92-3.838 2.193-8.727 .858-10.92-2.98l-11.44-20c-.53 0-1.07 .05-1.61 .05h-12.05v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-63.99c0-4.418 3.582-8 8-8h20c12.032 .011 22.711 7.708 26.528 19.119 3.816 11.411-.084 23.984-9.688 31.231ZM152 128h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12Z"),
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
