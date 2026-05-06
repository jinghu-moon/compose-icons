package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = phosphorRegularIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 32h-112C54.327 32 40 46.327 40 64v144c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-16h64v16c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-144C216 46.327 201.673 32 184 32ZM56 176v-56h144v56ZM56 80h144v24h-144ZM72 48h112c8.837 0 16 7.163 16 16h-144C56 55.163 63.163 48 72 48ZM80 208h-24v-16h24ZM176 208v-16h24v16ZM104 148c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM176 148c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM248 80v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM24 80v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
