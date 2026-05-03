package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) return _bellSimpleRinging!!
        _bellSimpleRinging = phosphorThinIcon(
            name = "BellSimpleRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 224.000 C 164.000 226.209 162.209 228.000 160.000 228.000 L 96.000 228.000 C 93.791 228.000 92.000 226.209 92.000 224.000 C 92.000 221.791 93.791 220.000 96.000 220.000 L 160.000 220.000 C 162.209 220.000 164.000 221.791 164.000 224.000 ZM 223.840 62.160 C 215.175 45.215 202.160 30.879 186.130 20.620 C 184.921 19.773 183.344 19.660 182.027 20.326 C 180.710 20.993 179.867 22.330 179.835 23.806 C 179.802 25.282 180.584 26.655 181.870 27.380 C 196.695 36.885 208.728 50.158 216.740 65.840 C 217.427 67.166 218.796 67.999 220.290 68.000 C 220.931 68.002 221.562 67.847 222.130 67.550 C 224.090 66.533 224.855 64.121 223.840 62.160 ZM 39.260 65.840 C 47.272 50.158 59.305 36.885 74.130 27.380 C 75.876 26.156 76.355 23.777 75.218 21.972 C 74.081 20.168 71.728 19.573 69.870 20.620 C 53.840 30.879 40.825 45.215 32.160 62.160 C 31.145 64.121 31.910 66.533 33.870 67.550 C 34.438 67.847 35.069 68.002 35.710 68.000 C 37.204 67.999 38.573 67.166 39.260 65.840 ZM 218.360 178.000 C 220.501 181.708 220.504 186.275 218.368 189.986 C 216.232 193.697 212.281 195.988 208.000 196.000 L 48.000 196.000 C 43.719 195.988 39.768 193.697 37.632 189.986 C 35.496 186.275 35.499 181.708 37.640 178.000 C 47.170 161.560 52.000 139.370 52.000 112.000 C 52.000 70.026 86.026 36.000 128.000 36.000 C 169.974 36.000 204.000 70.026 204.000 112.000 C 204.000 139.360 208.830 161.550 218.360 178.000 ZM 211.440 182.000 C 201.190 164.340 196.000 140.790 196.000 112.000 C 196.000 74.445 165.555 44.000 128.000 44.000 C 90.445 44.000 60.000 74.445 60.000 112.000 C 60.000 140.800 54.810 164.340 44.560 182.000 C 43.845 183.238 43.845 184.762 44.560 186.000 C 45.253 187.247 46.573 188.015 48.000 188.000 L 208.000 188.000 C 209.423 188.011 210.739 187.244 211.430 186.000 C 212.148 184.764 212.151 183.239 211.440 182.000 Z"),
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
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
