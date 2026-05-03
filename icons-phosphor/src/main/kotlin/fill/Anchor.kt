package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorFillIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 144.000 C 224.000 182.110 196.330 189.660 174.100 195.720 C 149.770 202.360 136.000 207.310 136.000 232.000 C 136.000 236.418 132.418 240.000 128.000 240.000 C 123.582 240.000 120.000 236.418 120.000 232.000 C 120.000 207.310 106.230 202.360 81.900 195.720 C 59.670 189.660 32.000 182.110 32.000 144.000 C 32.000 139.582 35.582 136.000 40.000 136.000 C 44.418 136.000 48.000 139.582 48.000 144.000 C 48.000 168.690 61.770 173.640 86.100 180.280 C 97.460 183.380 110.220 186.880 120.000 194.620 L 120.000 128.000 L 88.000 128.000 C 83.582 128.000 80.000 124.418 80.000 120.000 C 80.000 115.582 83.582 112.000 88.000 112.000 L 120.000 112.000 L 120.000 82.830 C 106.677 78.858 98.286 65.712 100.293 51.955 C 102.300 38.198 114.097 27.997 128.000 27.997 C 141.903 27.997 153.700 38.198 155.707 51.955 C 157.714 65.712 149.323 78.858 136.000 82.830 L 136.000 112.000 L 168.000 112.000 C 172.418 112.000 176.000 115.582 176.000 120.000 C 176.000 124.418 172.418 128.000 168.000 128.000 L 136.000 128.000 L 136.000 194.620 C 145.780 186.880 158.540 183.380 169.900 180.280 C 194.230 173.640 208.000 168.690 208.000 144.000 C 208.000 139.582 211.582 136.000 216.000 136.000 C 220.418 136.000 224.000 139.582 224.000 144.000 Z"),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
