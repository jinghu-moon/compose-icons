package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorThinIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 160.000 C 172.002 180.508 159.950 199.101 141.229 207.474 C 122.508 215.846 100.615 212.433 85.330 198.760 C 83.673 197.285 83.525 194.747 85.000 193.090 C 86.475 191.433 89.013 191.285 90.670 192.760 C 108.203 208.438 134.965 207.556 151.427 190.756 C 167.888 173.957 168.227 147.182 152.196 129.972 C 136.166 112.761 109.434 111.201 91.510 126.430 C 90.218 127.519 88.381 127.678 86.920 126.828 C 85.460 125.978 84.691 124.301 85.000 122.640 L 100.090 47.220 C 100.461 45.353 102.097 44.006 104.000 44.000 L 168.000 44.000 C 170.209 44.000 172.000 45.791 172.000 48.000 C 172.000 50.209 170.209 52.000 168.000 52.000 L 107.280 52.000 L 94.770 114.530 C 110.877 105.593 130.509 105.843 146.383 115.189 C 162.256 124.534 172.000 141.580 172.000 160.000 Z"),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
