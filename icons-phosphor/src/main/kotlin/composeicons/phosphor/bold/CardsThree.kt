package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CardsThree: ImageVector
    get() {
        if (_cardsThree != null) return _cardsThree!!
        _cardsThree = phosphorBoldIcon(
            name = "CardsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 96h-160c-11.046 0-20 8.954-20 20v84c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-84c0-11.046-8.954-20-20-20ZM204 196h-152v-76h152ZM44 68C44 61.373 49.373 56 56 56h144c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-144C49.373 80 44 74.627 44 68ZM60 28C60 21.373 65.373 16 72 16h112c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-112C65.373 40 60 34.627 60 28Z"),
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
