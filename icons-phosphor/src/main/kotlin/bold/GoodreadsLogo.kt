package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorBoldIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 20.000 C 177.373 20.000 172.000 25.373 172.000 32.000 L 172.000 36.220 C 151.823 19.030 123.490 15.144 99.429 26.268 C 75.369 37.391 59.975 61.493 60.000 88.000 L 60.000 112.000 C 59.975 138.507 75.369 162.609 99.429 173.732 C 123.490 184.856 151.823 180.970 172.000 163.780 L 172.000 168.000 C 171.972 192.289 152.289 211.972 128.000 212.000 C 113.000 212.000 97.710 204.420 89.840 193.130 C 86.046 187.696 78.564 186.366 73.130 190.160 C 67.696 193.954 66.366 201.436 70.160 206.870 C 82.500 224.560 105.210 236.000 128.000 236.000 C 165.539 235.961 195.961 205.539 196.000 168.000 L 196.000 32.000 C 196.000 25.373 190.627 20.000 184.000 20.000 ZM 128.000 156.000 C 103.711 155.972 84.028 136.289 84.000 112.000 L 84.000 88.000 C 84.000 63.699 103.699 44.000 128.000 44.000 C 152.301 44.000 172.000 63.699 172.000 88.000 L 172.000 112.000 C 171.972 136.289 152.289 155.972 128.000 156.000 Z"),
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
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
