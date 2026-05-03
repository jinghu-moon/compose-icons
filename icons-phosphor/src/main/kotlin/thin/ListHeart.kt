package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorThinIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 61.791 220.000 64.000 C 220.000 66.209 218.209 68.000 216.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 66.209 36.000 64.000 ZM 40.000 132.000 L 104.000 132.000 C 106.209 132.000 108.000 130.209 108.000 128.000 C 108.000 125.791 106.209 124.000 104.000 124.000 L 40.000 124.000 C 37.791 124.000 36.000 125.791 36.000 128.000 C 36.000 130.209 37.791 132.000 40.000 132.000 ZM 120.000 188.000 L 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 120.000 196.000 C 122.209 196.000 124.000 194.209 124.000 192.000 C 124.000 189.791 122.209 188.000 120.000 188.000 ZM 244.000 144.000 C 244.000 158.510 235.440 173.000 218.560 187.070 C 210.898 193.417 202.597 198.950 193.790 203.580 C 192.663 204.144 191.337 204.144 190.210 203.580 C 181.403 198.950 173.102 193.417 165.440 187.070 C 148.560 173.000 140.000 158.510 140.000 144.000 C 140.005 131.420 148.400 120.389 160.523 117.029 C 172.645 113.670 185.520 118.807 192.000 129.590 C 198.480 118.807 211.355 113.670 223.477 117.029 C 235.600 120.389 243.995 131.420 244.000 144.000 ZM 236.000 144.000 C 236.000 132.954 227.046 124.000 216.000 124.000 C 204.954 124.000 196.000 132.954 196.000 144.000 C 196.000 146.209 194.209 148.000 192.000 148.000 C 189.791 148.000 188.000 146.209 188.000 144.000 C 188.000 132.954 179.046 124.000 168.000 124.000 C 156.954 124.000 148.000 132.954 148.000 144.000 C 148.000 169.800 183.540 190.830 192.000 195.470 C 200.460 190.830 236.000 169.800 236.000 144.000 Z"),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
