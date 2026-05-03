package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorBoldIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 217.060 140.330 L 230.300 118.150 C 232.626 114.465 232.770 109.808 230.679 105.985 C 228.587 102.163 224.587 99.774 220.229 99.746 C 215.872 99.718 211.841 102.055 209.700 105.850 L 177.450 159.850 C 177.360 160.000 177.280 160.160 177.200 160.320 C 168.539 175.644 170.913 194.829 183.049 207.579 C 195.185 220.329 214.229 223.648 229.962 215.754 C 245.694 207.859 254.418 190.608 251.450 173.258 C 248.483 155.908 234.522 142.537 217.060 140.320 ZM 212.000 196.000 C 203.163 196.000 196.000 188.837 196.000 180.000 C 196.000 171.163 203.163 164.000 212.000 164.000 C 220.837 164.000 228.000 171.163 228.000 180.000 C 228.000 188.837 220.837 196.000 212.000 196.000 ZM 156.000 56.000 L 156.000 176.000 C 156.000 182.627 150.627 188.000 144.000 188.000 C 137.373 188.000 132.000 182.627 132.000 176.000 L 132.000 128.000 L 52.000 128.000 L 52.000 176.000 C 52.000 182.627 46.627 188.000 40.000 188.000 C 33.373 188.000 28.000 182.627 28.000 176.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 C 46.627 44.000 52.000 49.373 52.000 56.000 L 52.000 104.000 L 132.000 104.000 L 132.000 56.000 C 132.000 49.373 137.373 44.000 144.000 44.000 C 150.627 44.000 156.000 49.373 156.000 56.000 Z"),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
