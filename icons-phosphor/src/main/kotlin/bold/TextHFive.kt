package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorBoldIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.000 180.000 C 252.000 202.091 234.091 220.000 212.000 220.000 C 201.299 220.160 190.990 215.975 183.430 208.400 C 178.791 203.667 178.867 196.069 183.600 191.430 C 188.333 186.791 195.931 186.867 200.570 191.600 C 203.617 194.570 207.748 196.160 212.000 196.000 C 220.837 196.000 228.000 188.837 228.000 180.000 C 228.000 171.163 220.837 164.000 212.000 164.000 C 207.748 163.840 203.617 165.430 200.570 168.400 C 196.901 172.152 191.219 173.085 186.542 170.702 C 181.866 168.319 179.281 163.174 180.160 158.000 L 188.160 110.000 C 189.136 104.223 194.141 99.996 200.000 100.000 L 240.000 100.000 C 246.627 100.000 252.000 105.373 252.000 112.000 C 252.000 118.627 246.627 124.000 240.000 124.000 L 210.170 124.000 L 207.460 140.230 C 208.969 140.078 210.484 140.001 212.000 140.000 C 234.091 140.000 252.000 157.909 252.000 180.000 ZM 144.000 44.000 C 137.373 44.000 132.000 49.373 132.000 56.000 L 132.000 104.000 L 52.000 104.000 L 52.000 56.000 C 52.000 49.373 46.627 44.000 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 C 46.627 188.000 52.000 182.627 52.000 176.000 L 52.000 128.000 L 132.000 128.000 L 132.000 176.000 C 132.000 182.627 137.373 188.000 144.000 188.000 C 150.627 188.000 156.000 182.627 156.000 176.000 L 156.000 56.000 C 156.000 49.373 150.627 44.000 144.000 44.000 Z"),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
