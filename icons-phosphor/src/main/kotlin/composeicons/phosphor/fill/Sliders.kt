package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sliders: ImageVector
    get() {
        if (_sliders != null) return _sliders!!
        _sliders = phosphorFillIcon(
            name = "Sliders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 136c-.001 12.382-8.134 23.292-20 26.83v53.17c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-53.17C36.138 159.289 28.009 148.379 28.009 136c0-12.379 8.129-23.289 19.991-26.83v-69.17c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v69.17c11.866 3.538 19.999 14.448 20 26.83ZM136 61.17v-21.17c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v21.17C108.138 64.711 100.009 75.621 100.009 88c0 12.379 8.129 23.289 19.991 26.83v101.17c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-101.17C147.862 111.289 155.991 100.379 155.991 88 155.991 75.621 147.862 64.711 136 61.17ZM208 141.17v-101.17c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v101.17c-11.862 3.541-19.991 14.451-19.991 26.83 0 12.379 8.129 23.289 19.991 26.83v21.17c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-21.17c11.862-3.541 19.991-14.451 19.991-26.83 0-12.379-8.129-23.289-19.991-26.83Z"),
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
        return _sliders!!
    }

private var _sliders: ImageVector? = null
