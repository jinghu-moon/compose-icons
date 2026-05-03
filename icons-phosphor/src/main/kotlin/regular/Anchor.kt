package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorRegularIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 136.000 C 211.582 136.000 208.000 139.582 208.000 144.000 C 208.000 168.690 194.230 173.640 169.900 180.280 C 158.540 183.380 145.780 186.880 136.000 194.620 L 136.000 128.000 L 168.000 128.000 C 172.418 128.000 176.000 124.418 176.000 120.000 C 176.000 115.582 172.418 112.000 168.000 112.000 L 136.000 112.000 L 136.000 87.000 C 151.602 82.971 161.775 67.970 159.745 51.984 C 157.714 35.998 144.114 24.016 128.000 24.016 C 111.886 24.016 98.285 35.998 96.255 51.984 C 94.225 67.970 104.398 82.971 120.000 87.000 L 120.000 112.000 L 88.000 112.000 C 83.582 112.000 80.000 115.582 80.000 120.000 C 80.000 124.418 83.582 128.000 88.000 128.000 L 120.000 128.000 L 120.000 194.620 C 110.220 186.880 97.460 183.380 86.100 180.280 C 61.770 173.640 48.000 168.690 48.000 144.000 C 48.000 139.582 44.418 136.000 40.000 136.000 C 35.582 136.000 32.000 139.582 32.000 144.000 C 32.000 182.110 59.670 189.660 81.900 195.720 C 106.230 202.360 120.000 207.310 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 C 136.000 207.310 149.770 202.360 174.100 195.720 C 196.330 189.660 224.000 182.110 224.000 144.000 C 224.000 139.582 220.418 136.000 216.000 136.000 ZM 112.000 56.000 C 112.000 47.163 119.163 40.000 128.000 40.000 C 136.837 40.000 144.000 47.163 144.000 56.000 C 144.000 64.837 136.837 72.000 128.000 72.000 C 119.163 72.000 112.000 64.837 112.000 56.000 Z"),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
