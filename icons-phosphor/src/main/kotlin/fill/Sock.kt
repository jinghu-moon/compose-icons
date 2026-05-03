package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorFillIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 16.000 L 104.000 16.000 C 95.163 16.000 88.000 23.163 88.000 32.000 L 88.000 108.690 L 49.250 147.430 C 26.689 170.513 26.901 207.452 49.724 230.276 C 72.548 253.099 109.487 253.311 132.570 230.750 L 201.000 162.340 C 205.511 157.837 208.032 151.714 208.000 145.340 L 208.000 32.000 C 208.000 23.163 200.837 16.000 192.000 16.000 ZM 192.000 32.000 L 192.000 32.000 L 192.000 56.000 L 104.000 56.000 L 104.000 32.000 ZM 189.660 151.000 L 157.800 182.880 C 150.418 169.259 150.064 152.913 156.849 138.986 C 163.634 125.059 176.724 115.262 192.000 112.680 L 192.000 145.370 C 191.994 147.482 191.153 149.506 189.660 151.000 Z"),
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
        return _sock!!
    }

private var _sock: ImageVector? = null
