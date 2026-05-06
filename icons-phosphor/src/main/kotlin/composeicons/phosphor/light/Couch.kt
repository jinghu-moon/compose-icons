package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorLightIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 107.37v-35.37c0-7.732-6.268-14-14-14h-192C24.268 58 18 64.268 18 72v35.37c-4.88 2.315-7.993 7.229-8 12.63v48c0 7.732 6.268 14 14 14h10v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h164v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h10c7.732 0 14-6.268 14-14v-48c-.007-5.401-3.12-10.315-8-12.63ZM226 72v34h-10c-7.732 0-14 6.268-14 14v18h-68v-68h90c1.105 0 2 .895 2 2ZM32 70h90v68h-68v-18c0-7.732-6.268-14-14-14h-10v-34c0-1.105 .895-2 2-2ZM234 168c0 1.105-.895 2-2 2h-208c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h16c1.105 0 2 .895 2 2v24c0 3.314 2.686 6 6 6h160c3.314 0 6-2.686 6-6v-24c0-1.105 .895-2 2-2h16c1.105 0 2 .895 2 2Z"),
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
        return _couch!!
    }

private var _couch: ImageVector? = null
