package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorLightIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.190 213.000 C 213.380 185.680 188.560 166.510 159.720 158.380 C 188.583 143.708 203.617 111.157 196.074 79.671 C 188.530 48.184 160.378 25.979 128.000 25.979 C 95.622 25.979 67.470 48.184 59.926 79.671 C 52.383 111.157 67.417 143.708 96.280 158.380 C 67.440 166.500 42.620 185.670 26.810 213.000 C 25.628 214.860 25.560 217.218 26.634 219.143 C 27.708 221.067 29.751 222.248 31.955 222.218 C 34.158 222.188 36.168 220.953 37.190 219.000 C 56.400 185.810 90.340 166.000 128.000 166.000 C 165.660 166.000 199.600 185.810 218.810 219.000 C 219.832 220.953 221.842 222.188 224.045 222.218 C 226.249 222.248 228.292 221.067 229.366 219.143 C 230.440 217.218 230.372 214.860 229.190 213.000 ZM 70.000 96.000 C 70.000 63.967 95.967 38.000 128.000 38.000 C 160.033 38.000 186.000 63.967 186.000 96.000 C 186.000 128.033 160.033 154.000 128.000 154.000 C 95.983 153.961 70.039 128.017 70.000 96.000 Z"),
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
        return _user!!
    }

private var _user: ImageVector? = null
