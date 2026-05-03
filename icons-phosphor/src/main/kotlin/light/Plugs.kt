package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Plugs: ImageVector
    get() {
        if (_plugs != null) return _plugs!!
        _plugs = phosphorLightIcon(
            name = "Plugs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.240 139.760 C 145.897 137.420 142.103 137.420 139.760 139.760 L 120.000 159.510 L 96.490 136.000 L 116.240 116.240 C 118.443 113.876 118.378 110.192 116.093 107.907 C 113.808 105.622 110.124 105.557 107.760 107.760 L 88.000 127.510 L 68.240 107.760 C 65.876 105.557 62.192 105.622 59.907 107.907 C 57.622 110.192 57.557 113.876 59.760 116.240 L 67.510 124.000 L 42.790 148.730 C 31.079 160.445 31.079 179.435 42.790 191.150 L 49.570 197.940 L 19.760 227.760 C 18.155 229.256 17.494 231.508 18.037 233.634 C 18.580 235.760 20.240 237.420 22.366 237.963 C 24.492 238.506 26.744 237.845 28.240 236.240 L 58.060 206.430 L 64.850 213.210 C 76.565 224.921 95.555 224.921 107.270 213.210 L 132.000 188.490 L 139.760 196.240 C 142.124 198.443 145.808 198.378 148.093 196.093 C 150.378 193.808 150.443 190.124 148.240 187.760 L 128.490 168.000 L 148.240 148.240 C 150.580 145.897 150.580 142.103 148.240 139.760 ZM 98.790 204.760 C 95.414 208.137 90.835 210.034 86.060 210.034 C 81.285 210.034 76.706 208.137 73.330 204.760 L 51.270 182.670 C 47.893 179.294 45.996 174.715 45.996 169.940 C 45.996 165.165 47.893 160.586 51.270 157.210 L 76.000 132.490 L 123.510 180.000 ZM 236.240 19.760 C 233.897 17.420 230.103 17.420 227.760 19.760 L 197.940 49.570 L 191.150 42.790 C 179.435 31.079 160.445 31.079 148.730 42.790 L 124.000 67.510 L 116.240 59.760 C 113.876 57.557 110.192 57.622 107.907 59.907 C 105.622 62.192 105.557 65.876 107.760 68.240 L 187.760 148.240 C 190.124 150.443 193.808 150.378 196.093 148.093 C 198.378 145.808 198.443 142.124 196.240 139.760 L 188.490 132.000 L 213.210 107.270 C 224.921 95.555 224.921 76.565 213.210 64.850 L 206.430 58.060 L 236.240 28.240 C 238.580 25.897 238.580 22.103 236.240 19.760 ZM 204.730 98.760 L 180.000 123.510 L 132.490 76.000 L 157.210 51.270 C 160.586 47.893 165.165 45.996 169.940 45.996 C 174.715 45.996 179.294 47.893 182.670 51.270 L 204.730 73.330 C 208.107 76.706 210.004 81.285 210.004 86.060 C 210.004 90.835 208.107 95.414 204.730 98.790 Z"),
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
        return _plugs!!
    }

private var _plugs: ImageVector? = null
