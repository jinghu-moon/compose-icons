package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EggFried: ImageVector
    get() {
        if (_eggFried != null) return _eggFried!!
        _eggFried = tablerFilledIcon(
            name = "EggFried",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.001 1.996 Q 14.061 1.996 14.118 2.003 L 14.273 2.006 C 15.910 2.080 17.446 2.821 18.523 4.056 L 18.699 4.266 C 19.603 5.403 20.063 6.829 19.995 8.280 L 19.977 8.524 L 20.083 8.584 C 21.175 9.250 21.882 10.397 21.987 11.671 L 21.998 11.875 C 22.036 13.085 21.524 14.247 20.606 15.036 L 20.521 15.105 L 20.604 15.265 C 21.032 16.153 21.117 17.167 20.843 18.113 L 20.778 18.317 C 20.353 19.539 19.362 20.480 18.120 20.842 C 16.877 21.204 15.537 20.943 14.521 20.141 L 14.406 20.045 L 14.314 20.145 C 13.248 21.229 11.811 21.867 10.292 21.932 L 10.035 21.938 C 8.079 21.938 6.246 20.986 5.123 19.385 C 3.999 17.785 3.726 15.737 4.391 13.898 L 4.425 13.809 L 4.270 13.689 C 2.101 11.948 1.413 8.945 2.608 6.433 L 2.713 6.222 C 4.086 3.604 7.161 2.376 9.959 3.328 L 10.147 3.396 L 10.220 3.336 C 11.216 2.528 12.444 2.061 13.725 2.002 ZM 12.000 9.000 C 10.402 9.000 9.084 10.254 9.004 11.850 L 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000"),
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
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
