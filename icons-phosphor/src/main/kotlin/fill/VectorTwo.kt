package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorFillIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.660 197.660 L 197.660 229.660 C 195.372 231.951 191.929 232.636 188.938 231.397 C 185.947 230.158 183.997 227.238 184.000 224.000 L 184.000 200.000 L 80.000 200.000 C 75.582 200.000 72.000 196.418 72.000 192.000 L 72.000 80.000 L 48.000 80.000 C 44.762 80.003 41.842 78.053 40.603 75.062 C 39.364 72.071 40.049 68.628 42.340 66.340 L 74.340 34.340 C 75.841 32.838 77.877 31.994 80.000 31.994 C 82.123 31.994 84.159 32.838 85.660 34.340 L 117.660 66.340 C 119.951 68.628 120.636 72.071 119.397 75.062 C 118.158 78.053 115.238 80.003 112.000 80.000 L 88.000 80.000 L 88.000 184.000 L 184.000 184.000 L 184.000 160.000 C 183.997 156.762 185.947 153.842 188.938 152.603 C 191.929 151.364 195.372 152.049 197.660 154.340 L 229.660 186.340 C 231.162 187.841 232.006 189.877 232.006 192.000 C 232.006 194.123 231.162 196.159 229.660 197.660 Z"),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
