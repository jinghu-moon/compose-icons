package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorFillIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.000 208.000 C 56.001 210.164 55.125 212.236 53.573 213.743 C 52.020 215.251 49.923 216.065 47.760 216.000 C 43.407 215.726 40.012 212.122 40.000 207.760 C 39.875 203.527 36.473 200.125 32.240 200.000 C 27.878 199.988 24.274 196.593 24.000 192.240 C 23.935 190.077 24.749 187.980 26.257 186.427 C 27.764 184.875 29.836 183.999 32.000 184.000 C 45.255 184.000 56.000 194.745 56.000 208.000 ZM 32.000 152.000 C 29.761 151.993 27.621 152.924 26.100 154.568 C 24.580 156.212 23.818 158.418 24.000 160.650 C 24.425 164.866 28.003 168.058 32.240 168.000 C 54.144 168.131 71.869 185.856 72.000 207.760 C 71.943 212.001 75.140 215.580 79.360 216.000 C 81.590 216.179 83.794 215.416 85.435 213.896 C 87.077 212.376 88.007 210.237 88.000 208.000 C 87.967 177.086 62.914 152.033 32.000 152.000 ZM 32.000 120.000 C 29.770 119.994 27.639 120.918 26.120 122.551 C 24.601 124.184 23.833 126.376 24.000 128.600 C 24.425 132.848 28.032 136.063 32.300 136.000 C 71.805 136.208 103.781 168.175 104.000 207.680 C 103.937 211.948 107.152 215.555 111.400 215.980 C 113.624 216.147 115.816 215.379 117.449 213.860 C 119.082 212.341 120.006 210.210 120.000 207.980 C 119.934 159.410 80.570 120.055 32.000 120.000 ZM 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 100.080 C 23.999 101.167 24.441 102.208 25.224 102.963 C 26.007 103.717 27.063 104.121 28.150 104.080 C 57.039 103.042 85.059 114.063 105.500 134.503 C 125.942 154.942 136.965 182.961 135.930 211.850 C 135.889 212.937 136.293 213.993 137.047 214.776 C 137.802 215.559 138.843 216.001 139.930 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 Z"),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
