package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CardsThree: ImageVector
    get() {
        if (_cardsThree != null) return _cardsThree!!
        _cardsThree = phosphorLightIcon(
            name = "CardsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 90h-160c-7.732 0-14 6.268-14 14v96c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-96c0-7.732-6.268-14-14-14ZM210 200c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-96c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM50 64c0-3.314 2.686-6 6-6h144c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-144c-3.314 0-6-2.686-6-6ZM66 32c0-3.314 2.686-6 6-6h112c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-112c-3.314 0-6-2.686-6-6Z"),
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
        return _cardsThree!!
    }

private var _cardsThree: ImageVector? = null
