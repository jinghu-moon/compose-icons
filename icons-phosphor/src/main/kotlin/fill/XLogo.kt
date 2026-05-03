package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorFillIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 215.000 219.850 C 213.597 222.405 210.915 223.995 208.000 224.000 L 160.000 224.000 C 157.264 223.999 154.717 222.600 153.250 220.290 L 112.760 156.660 L 53.920 221.380 C 50.935 224.587 45.926 224.796 42.684 221.849 C 39.442 218.903 39.173 213.897 42.080 210.620 L 103.850 142.620 L 41.250 44.300 C 39.680 41.836 39.577 38.712 40.983 36.151 C 42.388 33.590 45.078 31.999 48.000 32.000 L 96.000 32.000 C 98.736 32.001 101.283 33.400 102.750 35.710 L 143.240 99.340 L 202.080 34.620 C 205.065 31.413 210.074 31.204 213.316 34.151 C 216.558 37.097 216.827 42.103 213.920 45.380 L 152.150 113.330 L 214.750 211.710 C 216.311 214.175 216.407 217.294 215.000 219.850 Z"),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
