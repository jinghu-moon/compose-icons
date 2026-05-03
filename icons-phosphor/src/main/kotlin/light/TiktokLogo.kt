package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorLightIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 74.000 C 196.399 73.967 174.033 51.601 174.000 24.000 C 174.000 20.686 171.314 18.000 168.000 18.000 L 128.000 18.000 C 124.686 18.000 122.000 20.686 122.000 24.000 L 122.000 156.000 C 121.993 166.898 114.008 176.149 103.228 177.748 C 92.447 179.347 82.121 172.813 78.951 162.385 C 75.781 151.958 80.723 140.781 90.570 136.110 C 92.664 135.117 93.999 133.007 94.000 130.690 L 94.000 88.000 C 93.998 86.235 93.219 84.560 91.871 83.422 C 90.522 82.283 88.740 81.796 87.000 82.090 C 52.200 88.280 26.000 120.050 26.000 156.000 C 26.000 196.869 59.131 230.000 100.000 230.000 C 140.869 230.000 174.000 196.869 174.000 156.000 L 174.000 112.930 C 189.256 121.537 206.484 126.040 224.000 126.000 C 227.314 126.000 230.000 123.314 230.000 120.000 L 230.000 80.000 C 230.000 76.686 227.314 74.000 224.000 74.000 ZM 218.000 113.800 C 201.237 112.729 185.118 106.944 171.500 97.110 C 169.670 95.796 167.257 95.617 165.254 96.649 C 163.251 97.680 161.994 99.747 162.000 102.000 L 162.000 156.000 C 162.000 190.242 134.242 218.000 100.000 218.000 C 65.758 218.000 38.000 190.242 38.000 156.000 C 38.000 128.280 56.470 103.520 82.000 95.620 L 82.000 127.150 C 68.127 135.807 62.382 153.114 68.324 168.349 C 74.266 183.584 90.212 192.431 106.283 189.409 C 122.354 186.387 133.997 172.353 134.000 156.000 L 134.000 30.000 L 162.290 30.000 C 165.192 59.482 188.518 82.808 218.000 85.710 Z"),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
