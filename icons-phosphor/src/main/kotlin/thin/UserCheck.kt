package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorThinIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 133.170 158.840 C 161.115 146.886 176.798 116.927 170.697 87.151 C 164.596 57.375 138.394 35.997 108.000 35.997 C 77.606 35.997 51.404 57.375 45.303 87.151 C 39.202 116.927 54.885 146.886 82.830 158.840 C 59.070 164.300 37.650 177.530 20.940 197.430 C 19.945 198.514 19.625 200.056 20.107 201.447 C 20.589 202.837 21.795 203.850 23.248 204.085 C 24.700 204.319 26.165 203.738 27.060 202.570 C 48.000 177.700 76.710 164.000 108.000 164.000 C 139.290 164.000 168.000 177.700 188.940 202.570 C 190.388 204.146 192.820 204.303 194.458 202.927 C 196.097 201.551 196.362 199.128 195.060 197.430 C 178.350 177.530 156.930 164.300 133.170 158.840 ZM 52.000 100.000 C 52.000 69.072 77.072 44.000 108.000 44.000 C 138.928 44.000 164.000 69.072 164.000 100.000 C 164.000 130.928 138.928 156.000 108.000 156.000 C 77.086 155.967 52.033 130.914 52.000 100.000 ZM 250.830 130.830 L 218.830 162.830 C 218.080 163.581 217.062 164.003 216.000 164.003 C 214.938 164.003 213.920 163.581 213.170 162.830 L 197.170 146.830 C 195.607 145.267 195.607 142.733 197.170 141.170 C 198.733 139.607 201.267 139.607 202.830 141.170 L 216.000 154.340 L 245.170 125.170 C 246.733 123.607 249.267 123.607 250.830 125.170 C 252.393 126.733 252.393 129.267 250.830 130.830 Z"),
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
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
