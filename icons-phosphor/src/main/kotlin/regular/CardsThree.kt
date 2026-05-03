package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CardsThree: ImageVector
    get() {
        if (_cardsThree != null) return _cardsThree!!
        _cardsThree = phosphorRegularIcon(
            name = "CardsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 88.000 L 48.000 88.000 C 39.163 88.000 32.000 95.163 32.000 104.000 L 32.000 200.000 C 32.000 208.837 39.163 216.000 48.000 216.000 L 208.000 216.000 C 216.837 216.000 224.000 208.837 224.000 200.000 L 224.000 104.000 C 224.000 95.163 216.837 88.000 208.000 88.000 ZM 208.000 200.000 L 48.000 200.000 L 48.000 104.000 L 208.000 104.000 L 208.000 200.000 ZM 48.000 64.000 C 48.000 59.582 51.582 56.000 56.000 56.000 L 200.000 56.000 C 204.418 56.000 208.000 59.582 208.000 64.000 C 208.000 68.418 204.418 72.000 200.000 72.000 L 56.000 72.000 C 51.582 72.000 48.000 68.418 48.000 64.000 ZM 64.000 32.000 C 64.000 27.582 67.582 24.000 72.000 24.000 L 184.000 24.000 C 188.418 24.000 192.000 27.582 192.000 32.000 C 192.000 36.418 188.418 40.000 184.000 40.000 L 72.000 40.000 C 67.582 40.000 64.000 36.418 64.000 32.000 Z"),
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
