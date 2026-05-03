package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) return _windowsLogo!!
        _windowsLogo = phosphorLightIcon(
            name = "WindowsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 138.000 L 128.000 138.000 C 124.686 138.000 122.000 140.686 122.000 144.000 L 122.000 201.450 C 121.997 204.353 124.073 206.842 126.930 207.360 L 206.930 221.900 C 207.283 221.968 207.641 222.002 208.000 222.000 C 211.314 222.000 214.000 219.314 214.000 216.000 L 214.000 144.000 C 214.000 140.686 211.314 138.000 208.000 138.000 ZM 202.000 208.810 L 134.000 196.450 L 134.000 150.000 L 202.000 150.000 ZM 96.000 138.000 L 32.000 138.000 C 28.686 138.000 26.000 140.686 26.000 144.000 L 26.000 184.000 C 26.002 186.900 28.077 189.383 30.930 189.900 L 94.930 201.540 C 95.283 201.603 95.641 201.637 96.000 201.640 C 99.314 201.640 102.000 198.954 102.000 195.640 L 102.000 144.000 C 102.000 140.686 99.314 138.000 96.000 138.000 ZM 90.000 188.450 L 38.000 179.000 L 38.000 150.000 L 90.000 150.000 ZM 211.840 35.390 C 210.475 34.255 208.677 33.782 206.930 34.100 L 126.930 48.640 C 124.073 49.158 121.997 51.647 122.000 54.550 L 122.000 112.000 C 122.000 115.314 124.686 118.000 128.000 118.000 L 208.000 118.000 C 211.314 118.000 214.000 115.314 214.000 112.000 L 214.000 40.000 C 214.000 38.219 213.209 36.530 211.840 35.390 ZM 202.000 106.000 L 134.000 106.000 L 134.000 59.550 L 202.000 47.190 ZM 99.840 55.760 C 98.477 54.621 96.678 54.145 94.930 54.460 L 30.930 66.100 C 28.077 66.617 26.002 69.100 26.000 72.000 L 26.000 112.000 C 26.000 115.314 28.686 118.000 32.000 118.000 L 96.000 118.000 C 99.314 118.000 102.000 115.314 102.000 112.000 L 102.000 60.360 C 101.997 58.582 101.206 56.898 99.840 55.760 ZM 90.000 106.000 L 38.000 106.000 L 38.000 77.000 L 90.000 67.540 Z"),
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
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
