package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareOne: ImageVector
    get() {
        if (_numberSquareOne != null) return _numberSquareOne!!
        _numberSquareOne = phosphorThinIcon(
            name = "NumberSquareOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM136 80v96c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-88.53L110.22 99.33c-1.839 1.226-4.324 .729-5.55-1.11-1.226-1.839-.729-4.324 1.11-5.55l24-16c1.228-.819 2.807-.896 4.108-.199 1.301 .697 2.113 2.053 2.112 3.529Z"),
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
        return _numberSquareOne!!
    }

private var _numberSquareOne: ImageVector? = null
