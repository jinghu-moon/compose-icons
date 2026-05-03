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
                pathData = parseSvgPathData("M 208.000 90.000 L 48.000 90.000 C 40.268 90.000 34.000 96.268 34.000 104.000 L 34.000 200.000 C 34.000 207.732 40.268 214.000 48.000 214.000 L 208.000 214.000 C 215.732 214.000 222.000 207.732 222.000 200.000 L 222.000 104.000 C 222.000 96.268 215.732 90.000 208.000 90.000 ZM 210.000 200.000 C 210.000 201.105 209.105 202.000 208.000 202.000 L 48.000 202.000 C 46.895 202.000 46.000 201.105 46.000 200.000 L 46.000 104.000 C 46.000 102.895 46.895 102.000 48.000 102.000 L 208.000 102.000 C 209.105 102.000 210.000 102.895 210.000 104.000 ZM 50.000 64.000 C 50.000 60.686 52.686 58.000 56.000 58.000 L 200.000 58.000 C 203.314 58.000 206.000 60.686 206.000 64.000 C 206.000 67.314 203.314 70.000 200.000 70.000 L 56.000 70.000 C 52.686 70.000 50.000 67.314 50.000 64.000 ZM 66.000 32.000 C 66.000 28.686 68.686 26.000 72.000 26.000 L 184.000 26.000 C 187.314 26.000 190.000 28.686 190.000 32.000 C 190.000 35.314 187.314 38.000 184.000 38.000 L 72.000 38.000 C 68.686 38.000 66.000 35.314 66.000 32.000 Z"),
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
