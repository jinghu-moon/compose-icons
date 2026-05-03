package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorDuotoneIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 56.000 L 224.000 192.000 L 80.000 192.000 L 80.000 40.000 L 208.000 40.000 C 216.837 40.000 224.000 47.163 224.000 56.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 229.660 197.660 L 197.660 229.660 C 194.534 232.786 189.466 232.786 186.340 229.660 C 183.214 226.534 183.214 221.466 186.340 218.340 L 204.690 200.000 L 80.000 200.000 C 75.582 200.000 72.000 196.418 72.000 192.000 L 72.000 59.310 L 53.660 77.660 C 50.534 80.786 45.466 80.786 42.340 77.660 C 39.214 74.534 39.214 69.466 42.340 66.340 L 74.340 34.340 C 75.841 32.838 77.877 31.994 80.000 31.994 C 82.123 31.994 84.159 32.838 85.660 34.340 L 117.660 66.340 C 120.786 69.466 120.786 74.534 117.660 77.660 C 114.534 80.786 109.466 80.786 106.340 77.660 L 88.000 59.310 L 88.000 184.000 L 204.690 184.000 L 186.340 165.660 C 183.214 162.534 183.214 157.466 186.340 154.340 C 189.466 151.214 194.534 151.214 197.660 154.340 L 229.660 186.340 C 231.162 187.841 232.006 189.877 232.006 192.000 C 232.006 194.123 231.162 196.159 229.660 197.660 Z"),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
