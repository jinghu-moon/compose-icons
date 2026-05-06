package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorLightIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 10C89.358 10.044 58.044 41.358 58 80v96c0 7.732 6.268 14 14 14h34v42c0 12.15 9.85 22 22 22 12.15 0 22-9.85 22-22v-42h34c7.732 0 14-6.268 14-14v-96C197.956 41.358 166.642 10.044 128 10ZM138 232c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10v-42h20ZM186 176c0 1.105-.895 2-2 2h-112c-1.105 0-2-.895-2-2v-96C70 47.967 95.967 22 128 22c32.033 0 58 25.967 58 58ZM118 72v80c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-80c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM150 72v80c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-80c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
