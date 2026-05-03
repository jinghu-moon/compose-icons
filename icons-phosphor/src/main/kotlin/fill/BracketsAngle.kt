package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorFillIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 103.000 180.000 C 105.209 183.852 103.877 188.766 100.025 190.975 C 96.173 193.184 91.259 191.852 89.050 188.000 L 57.050 132.000 C 55.644 129.540 55.644 126.520 57.050 124.060 L 89.050 68.060 C 91.243 64.208 96.143 62.862 99.995 65.055 C 103.847 67.248 105.193 72.148 103.000 76.000 L 73.210 128.000 ZM 199.000 132.000 L 167.000 188.000 C 164.807 191.838 159.918 193.173 156.080 190.980 C 152.242 188.787 150.907 183.898 153.100 180.060 L 182.840 128.060 L 153.050 76.000 C 150.841 72.148 152.173 67.234 156.025 65.025 C 159.877 62.816 164.791 64.148 167.000 68.000 L 199.000 124.000 C 200.429 126.475 200.429 129.525 199.000 132.000 Z"),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
