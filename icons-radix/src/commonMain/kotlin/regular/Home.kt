package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Home: ImageVector
    get() {
        if (_home != null) return _home!!
        _home = radixIcon(
            name = "Home",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.173 0.147 C 7.404 -0.004 7.716 0.021 7.921 0.222 L 14.671 6.862 L 14.748 6.955 C 14.904 7.187 14.881 7.504 14.678 7.710 C 14.474 7.917 14.158 7.945 13.924 7.793 L 13.829 7.717 L 13.000 6.901 L 13.000 12.500 C 13.000 12.776 12.776 13.000 12.500 13.000 L 2.500 13.000 C 2.224 13.000 2.000 12.776 2.000 12.500 L 2.000 6.901 L 1.171 7.717 C 0.935 7.950 0.554 7.947 0.322 7.710 C 0.090 7.474 0.093 7.094 0.329 6.862 L 7.079 0.222 L 7.173 0.147 ZM 3.000 5.917 L 3.000 12.000 L 6.000 12.000 L 6.000 8.500 L 6.010 8.400 C 6.056 8.172 6.258 8.001 6.500 8.000 L 9.500 8.000 L 9.600 8.010 C 9.828 8.057 10.000 8.259 10.000 8.500 L 10.000 12.000 L 12.000 12.000 L 12.000 5.917 L 7.500 1.491 L 3.000 5.917 ZM 7.000 12.000 L 9.000 12.000 L 9.000 9.000 L 7.000 9.000 L 7.000 12.000 Z"),
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
        return _home!!
    }

private var _home: ImageVector? = null
