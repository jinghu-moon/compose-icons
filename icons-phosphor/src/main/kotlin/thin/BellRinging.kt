package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) return _bellRinging!!
        _bellRinging = phosphorThinIcon(
            name = "BellRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.130 67.550 C 221.562 67.847 220.931 68.002 220.290 68.000 C 218.796 67.999 217.427 67.166 216.740 65.840 C 208.728 50.158 196.695 36.885 181.870 27.380 C 180.584 26.655 179.802 25.282 179.835 23.806 C 179.867 22.330 180.710 20.993 182.027 20.326 C 183.344 19.660 184.921 19.773 186.130 20.620 C 202.160 30.879 215.175 45.215 223.840 62.160 C 224.855 64.121 224.090 66.533 222.130 67.550 ZM 39.260 65.840 C 47.272 50.158 59.305 36.885 74.130 27.380 C 75.876 26.156 76.355 23.777 75.218 21.972 C 74.081 20.168 71.728 19.573 69.870 20.620 C 53.840 30.879 40.825 45.215 32.160 62.160 C 31.145 64.121 31.910 66.533 33.870 67.550 C 34.438 67.847 35.069 68.002 35.710 68.000 C 37.204 67.999 38.573 67.166 39.260 65.840 ZM 218.360 178.000 C 220.501 181.708 220.504 186.275 218.368 189.986 C 216.232 193.697 212.281 195.988 208.000 196.000 L 163.770 196.000 C 161.704 214.193 146.310 227.937 128.000 227.937 C 109.690 227.937 94.296 214.193 92.230 196.000 L 48.000 196.000 C 43.719 195.988 39.768 193.697 37.632 189.986 C 35.496 186.275 35.499 181.708 37.640 178.000 C 47.170 161.560 52.000 139.370 52.000 112.000 C 52.000 70.026 86.026 36.000 128.000 36.000 C 169.974 36.000 204.000 70.026 204.000 112.000 C 204.000 139.360 208.830 161.550 218.360 178.000 ZM 155.710 196.000 L 100.290 196.000 C 102.287 209.767 114.089 219.981 128.000 219.981 C 141.911 219.981 153.713 209.767 155.710 196.000 ZM 211.440 182.000 C 201.190 164.340 196.000 140.790 196.000 112.000 C 196.000 74.445 165.555 44.000 128.000 44.000 C 90.445 44.000 60.000 74.445 60.000 112.000 C 60.000 140.800 54.810 164.340 44.560 182.000 C 43.845 183.238 43.845 184.762 44.560 186.000 C 45.253 187.247 46.573 188.015 48.000 188.000 L 208.000 188.000 C 209.423 188.011 210.739 187.244 211.430 186.000 C 212.148 184.764 212.151 183.239 211.440 182.000 Z"),
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
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
