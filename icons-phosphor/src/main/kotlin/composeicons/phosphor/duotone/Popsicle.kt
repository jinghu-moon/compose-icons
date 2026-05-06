package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorDuotoneIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 80v96c0 4.418-3.582 8-8 8h-112c-4.418 0-8-3.582-8-8v-96C64 44.654 92.654 16 128 16h0c35.346 0 64 28.654 64 64Z"),
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
                pathData = parseSvgPathData("M128 8C88.254 8.044 56.044 40.254 56 80v96c0 8.837 7.163 16 16 16h32v40c0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24v-40h32c8.837 0 16-7.163 16-16v-96C199.956 40.254 167.746 8.044 128 8ZM136 232c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40h16ZM184 176h-112v-96C72 49.072 97.072 24 128 24c30.928 0 56 25.072 56 56v96ZM120 72v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM152 72v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
