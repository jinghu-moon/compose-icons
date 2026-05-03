package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = phosphorBoldIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 72.000 L 36.000 72.000 C 24.954 72.000 16.000 80.954 16.000 92.000 L 16.000 204.000 C 16.000 215.046 24.954 224.000 36.000 224.000 L 180.000 224.000 C 191.046 224.000 200.000 215.046 200.000 204.000 L 200.000 92.000 C 200.000 80.954 191.046 72.000 180.000 72.000 ZM 176.000 200.000 L 40.000 200.000 L 40.000 96.000 L 176.000 96.000 ZM 240.000 52.000 L 240.000 176.000 C 240.000 182.627 234.627 188.000 228.000 188.000 C 221.373 188.000 216.000 182.627 216.000 176.000 L 216.000 56.000 L 64.000 56.000 C 57.373 56.000 52.000 50.627 52.000 44.000 C 52.000 37.373 57.373 32.000 64.000 32.000 L 220.000 32.000 C 231.046 32.000 240.000 40.954 240.000 52.000 Z"),
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
        return _cards!!
    }

private var _cards: ImageVector? = null
