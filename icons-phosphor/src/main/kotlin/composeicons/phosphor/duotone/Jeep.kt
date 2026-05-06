package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Jeep: ImageVector
    get() {
        if (_jeep != null) return _jeep!!
        _jeep = phosphorDuotoneIcon(
            name = "Jeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 96h-192L42.65 46.32c.792-3.686 4.05-6.319 7.82-6.32h155.06c3.77 .001 7.028 2.634 7.82 6.32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M240 88h-9.53L221.18 44.65C219.572 37.287 213.067 32.028 205.53 32h-155.06c-7.537 .028-14.042 5.287-15.65 12.65L25.53 88h-9.53c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v96c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-24h96v24c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-96h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM50.47 48h155.06l8.57 40h-172.2ZM64 200h-24v-24h24ZM192 200v-24h24v24ZM216 160h-64v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32h-16v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32h-64v-56h176ZM56 132c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM176 132c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _jeep!!
    }

private var _jeep: ImageVector? = null
