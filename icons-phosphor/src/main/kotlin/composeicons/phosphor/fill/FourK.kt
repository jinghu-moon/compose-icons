package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FourK: ImageVector
    get() {
        if (_fourK != null) return _fourK!!
        _fourK = phosphorFillIcon(
            name = "FourK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M79.55 136 96 113v23ZM232 56v144c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-144C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM124 144c0-4.418-3.582-8-8-8h-4v-48c0-3.478-2.247-6.557-5.559-7.619-3.312-1.061-6.93 .139-8.951 2.969L57.49 139.35c-1.742 2.439-1.975 5.646-.604 8.311 1.371 2.665 4.117 4.339 7.114 4.339h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h4c4.418 0 8-3.582 8-8ZM173.59 121.77 198.07 93.21c2.807-3.359 2.394-8.35-.928-11.201-3.322-2.851-8.318-2.503-11.212 .781l-28.13 32.81c0 0 0 0 0 0L152 122.37v-34.37c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-21l10.62-12.39 22.52 37.55c2.275 3.789 7.191 5.015 10.98 2.74 3.789-2.275 5.015-7.191 2.74-10.98Z"),
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
        return _fourK!!
    }

private var _fourK: ImageVector? = null
