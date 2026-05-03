package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorThinIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 180.000 C 99.281 180.000 76.000 156.719 76.000 128.000 C 76.000 99.281 99.281 76.000 128.000 76.000 C 156.719 76.000 180.000 99.281 180.000 128.000 C 179.967 156.705 156.705 179.967 128.000 180.000 ZM 167.470 82.870 C 157.591 74.191 145.122 69.016 132.000 68.150 L 132.000 36.090 C 153.616 37.016 174.208 45.560 190.130 60.210 ZM 124.000 68.150 C 110.878 69.016 98.409 74.191 88.530 82.870 L 65.870 60.210 C 81.792 45.560 102.384 37.016 124.000 36.090 ZM 82.870 88.530 C 74.191 98.409 69.016 110.878 68.150 124.000 L 36.090 124.000 C 37.016 102.384 45.560 81.792 60.210 65.870 ZM 68.150 132.000 C 69.016 145.122 74.191 157.591 82.870 167.470 L 60.210 190.130 C 45.560 174.208 37.016 153.616 36.090 132.000 ZM 88.530 173.130 C 98.409 181.809 110.878 186.984 124.000 187.850 L 124.000 219.910 C 102.384 218.984 81.792 210.440 65.870 195.790 ZM 132.000 187.850 C 145.122 186.984 157.591 181.809 167.470 173.130 L 190.130 195.790 C 174.208 210.440 153.616 218.984 132.000 219.910 ZM 173.130 167.470 C 181.809 157.591 186.984 145.122 187.850 132.000 L 219.910 132.000 C 218.984 153.616 210.440 174.208 195.790 190.130 ZM 187.850 124.000 C 186.984 110.878 181.809 98.409 173.130 88.530 L 195.790 65.870 C 210.440 81.792 218.984 102.384 219.910 124.000 Z"),
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
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
