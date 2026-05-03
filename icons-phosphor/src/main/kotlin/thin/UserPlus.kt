package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserPlus: ImageVector
    get() {
        if (_userPlus != null) return _userPlus!!
        _userPlus = phosphorThinIcon(
            name = "UserPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.000 136.000 C 252.000 138.209 250.209 140.000 248.000 140.000 L 228.000 140.000 L 228.000 160.000 C 228.000 162.209 226.209 164.000 224.000 164.000 C 221.791 164.000 220.000 162.209 220.000 160.000 L 220.000 140.000 L 200.000 140.000 C 197.791 140.000 196.000 138.209 196.000 136.000 C 196.000 133.791 197.791 132.000 200.000 132.000 L 220.000 132.000 L 220.000 112.000 C 220.000 109.791 221.791 108.000 224.000 108.000 C 226.209 108.000 228.000 109.791 228.000 112.000 L 228.000 132.000 L 248.000 132.000 C 250.209 132.000 252.000 133.791 252.000 136.000 ZM 195.060 197.430 C 196.362 199.128 196.097 201.551 194.458 202.927 C 192.820 204.303 190.388 204.146 188.940 202.570 C 168.000 177.700 139.300 164.000 108.000 164.000 C 76.700 164.000 48.000 177.700 27.060 202.570 C 26.165 203.738 24.700 204.319 23.248 204.085 C 21.795 203.850 20.589 202.837 20.107 201.447 C 19.625 200.056 19.945 198.514 20.940 197.430 C 37.650 177.530 59.070 164.300 82.830 158.840 C 54.885 146.886 39.202 116.927 45.303 87.151 C 51.404 57.375 77.606 35.997 108.000 35.997 C 138.394 35.997 164.596 57.375 170.697 87.151 C 176.798 116.927 161.115 146.886 133.170 158.840 C 156.930 164.300 178.350 177.530 195.060 197.430 ZM 108.000 156.000 C 138.928 156.000 164.000 130.928 164.000 100.000 C 164.000 69.072 138.928 44.000 108.000 44.000 C 77.072 44.000 52.000 69.072 52.000 100.000 C 52.033 130.914 77.086 155.967 108.000 156.000 Z"),
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
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
