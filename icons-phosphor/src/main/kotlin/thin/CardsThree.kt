package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CardsThree: ImageVector
    get() {
        if (_cardsThree != null) return _cardsThree!!
        _cardsThree = phosphorThinIcon(
            name = "CardsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 92.000 L 48.000 92.000 C 41.373 92.000 36.000 97.373 36.000 104.000 L 36.000 200.000 C 36.000 206.627 41.373 212.000 48.000 212.000 L 208.000 212.000 C 214.627 212.000 220.000 206.627 220.000 200.000 L 220.000 104.000 C 220.000 97.373 214.627 92.000 208.000 92.000 ZM 212.000 200.000 C 212.000 202.209 210.209 204.000 208.000 204.000 L 48.000 204.000 C 45.791 204.000 44.000 202.209 44.000 200.000 L 44.000 104.000 C 44.000 101.791 45.791 100.000 48.000 100.000 L 208.000 100.000 C 210.209 100.000 212.000 101.791 212.000 104.000 ZM 52.000 64.000 C 52.000 61.791 53.791 60.000 56.000 60.000 L 200.000 60.000 C 202.209 60.000 204.000 61.791 204.000 64.000 C 204.000 66.209 202.209 68.000 200.000 68.000 L 56.000 68.000 C 53.791 68.000 52.000 66.209 52.000 64.000 ZM 68.000 32.000 C 68.000 29.791 69.791 28.000 72.000 28.000 L 184.000 28.000 C 186.209 28.000 188.000 29.791 188.000 32.000 C 188.000 34.209 186.209 36.000 184.000 36.000 L 72.000 36.000 C 69.791 36.000 68.000 34.209 68.000 32.000 Z"),
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
