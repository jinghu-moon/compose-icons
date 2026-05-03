package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorThinIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.460 214.000 C 210.940 185.440 184.460 165.940 153.780 158.910 C 183.845 146.592 200.996 114.727 194.719 82.849 C 188.442 50.971 160.490 27.986 128.000 27.986 C 95.510 27.986 67.558 50.971 61.281 82.849 C 55.004 114.727 72.155 146.592 102.220 158.910 C 71.580 165.910 45.060 185.440 28.540 214.000 C 27.546 215.899 28.227 218.244 30.083 219.317 C 31.938 220.390 34.310 219.809 35.460 218.000 C 55.000 184.190 89.620 164.000 128.000 164.000 C 166.380 164.000 201.000 184.190 220.540 218.000 C 221.254 219.236 222.572 219.999 224.000 220.000 C 224.703 220.002 225.394 219.816 226.000 219.460 C 227.909 218.354 228.562 215.911 227.460 214.000 ZM 68.000 96.000 C 68.000 62.863 94.863 36.000 128.000 36.000 C 161.137 36.000 188.000 62.863 188.000 96.000 C 188.000 129.137 161.137 156.000 128.000 156.000 C 94.879 155.961 68.039 129.121 68.000 96.000 Z"),
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
