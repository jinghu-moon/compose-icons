package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = phosphorFillIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 80v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM16 72c-4.418 0-8 3.582-8 8v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24c0-4.418-3.582-8-8-8ZM216 64v144c0 8.837-7.163 16-16 16h-16c-8.837 0-16-7.163-16-16v-8h-80v8c0 8.837-7.163 16-16 16h-16c-8.837 0-16-7.163-16-16v-144C40 46.327 54.327 32 72 32h112c17.673 0 32 14.327 32 32ZM104 148c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12ZM176 148c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12ZM200 72h-144v40h144Z"),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
