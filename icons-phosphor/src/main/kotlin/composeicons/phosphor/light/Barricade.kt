package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorLightIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 66h-192C24.268 66 18 72.268 18 80v72c0 7.732 6.268 14 14 14h26v34c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34h116v34c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34h26c7.732 0 14-6.268 14-14v-72c0-7.732-6.268-14-14-14ZM226 80v53.52L170.48 78h53.52c1.105 0 2 .895 2 2ZM32 78h49.52l76 76h-55L30 81.52v-1.52c0-1.105 .895-2 2-2ZM30 152v-53.52L85.52 154h-53.52c-1.105 0-2-.895-2-2ZM224 154h-49.52L98.48 78h55L226 150.48v1.52c0 1.105-.895 2-2 2Z"),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
