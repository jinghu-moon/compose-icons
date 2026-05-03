package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = phosphorLightIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.000 96.000 C 238.000 99.314 235.314 102.000 232.000 102.000 L 214.000 102.000 L 214.000 120.000 C 214.000 123.314 211.314 126.000 208.000 126.000 C 204.686 126.000 202.000 123.314 202.000 120.000 L 202.000 102.000 L 184.000 102.000 C 180.686 102.000 178.000 99.314 178.000 96.000 C 178.000 92.686 180.686 90.000 184.000 90.000 L 202.000 90.000 L 202.000 72.000 C 202.000 68.686 204.686 66.000 208.000 66.000 C 211.314 66.000 214.000 68.686 214.000 72.000 L 214.000 90.000 L 232.000 90.000 C 235.314 90.000 238.000 92.686 238.000 96.000 ZM 144.000 54.000 L 154.000 54.000 L 154.000 64.000 C 154.000 67.314 156.686 70.000 160.000 70.000 C 163.314 70.000 166.000 67.314 166.000 64.000 L 166.000 54.000 L 176.000 54.000 C 179.314 54.000 182.000 51.314 182.000 48.000 C 182.000 44.686 179.314 42.000 176.000 42.000 L 166.000 42.000 L 166.000 32.000 C 166.000 28.686 163.314 26.000 160.000 26.000 C 156.686 26.000 154.000 28.686 154.000 32.000 L 154.000 42.000 L 144.000 42.000 C 140.686 42.000 138.000 44.686 138.000 48.000 C 138.000 51.314 140.686 54.000 144.000 54.000 ZM 215.250 154.280 C 216.672 155.936 217.081 158.234 216.320 160.280 C 201.355 201.149 160.292 226.401 117.068 221.316 C 73.843 216.230 39.762 182.138 34.691 138.912 C 29.620 95.686 54.886 54.631 95.760 39.680 C 97.793 38.940 100.067 39.352 101.711 40.758 C 103.355 42.164 104.115 44.347 103.700 46.470 C 98.493 72.894 105.379 100.262 122.471 121.076 C 139.562 141.889 165.068 153.967 192.000 154.000 C 197.885 154.002 203.755 153.433 209.530 152.300 C 211.654 151.879 213.840 152.636 215.250 154.280 ZM 200.880 165.620 Q 196.460 166.000 192.000 166.000 C 135.694 165.934 90.066 120.306 90.000 64.000 Q 90.000 59.550 90.380 55.120 C 58.929 71.380 41.467 105.990 47.074 140.948 C 52.682 175.907 80.093 203.318 115.052 208.926 C 150.010 214.533 184.620 197.071 200.880 165.620 Z"),
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
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
