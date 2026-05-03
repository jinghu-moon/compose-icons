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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 96.000 L 48.000 96.000 C 36.954 96.000 28.000 104.954 28.000 116.000 L 28.000 200.000 C 28.000 211.046 36.954 220.000 48.000 220.000 L 208.000 220.000 C 219.046 220.000 228.000 211.046 228.000 200.000 L 228.000 116.000 C 228.000 104.954 219.046 96.000 208.000 96.000 ZM 204.000 196.000 L 52.000 196.000 L 52.000 120.000 L 204.000 120.000 ZM 44.000 68.000 C 44.000 61.373 49.373 56.000 56.000 56.000 L 200.000 56.000 C 206.627 56.000 212.000 61.373 212.000 68.000 C 212.000 74.627 206.627 80.000 200.000 80.000 L 56.000 80.000 C 49.373 80.000 44.000 74.627 44.000 68.000 ZM 60.000 28.000 C 60.000 21.373 65.373 16.000 72.000 16.000 L 184.000 16.000 C 190.627 16.000 196.000 21.373 196.000 28.000 C 196.000 34.627 190.627 40.000 184.000 40.000 L 72.000 40.000 C 65.373 40.000 60.000 34.627 60.000 28.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _cardsThree!!
    }

private var _cardsThree: ImageVector? = null
