package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorRegularIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.920 212.000 C 215.690 185.670 192.220 166.790 164.830 157.840 C 192.678 141.262 206.018 108.121 197.421 76.874 C 188.824 45.626 160.409 23.973 128.000 23.973 C 95.591 23.973 67.176 45.626 58.579 76.874 C 49.982 108.121 63.322 141.262 91.170 157.840 C 63.780 166.780 40.310 185.660 25.080 212.000 C 23.560 214.479 23.504 217.588 24.936 220.120 C 26.367 222.652 29.060 224.207 31.968 224.182 C 34.877 224.157 37.542 222.556 38.930 220.000 C 57.770 187.440 91.070 168.000 128.000 168.000 C 164.930 168.000 198.230 187.440 217.070 220.000 C 218.458 222.556 221.123 224.157 224.032 224.182 C 226.940 224.207 229.633 222.652 231.064 220.120 C 232.496 217.588 232.440 214.479 230.920 212.000 ZM 72.000 96.000 C 72.000 65.072 97.072 40.000 128.000 40.000 C 158.928 40.000 184.000 65.072 184.000 96.000 C 184.000 126.928 158.928 152.000 128.000 152.000 C 97.086 151.967 72.033 126.914 72.000 96.000 Z"),
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
        return _user!!
    }

private var _user: ImageVector? = null
