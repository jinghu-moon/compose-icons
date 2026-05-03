package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Affiliate: ImageVector
    get() {
        if (_affiliate != null) return _affiliate!!
        _affiliate = tablerFilledIcon(
            name = "Affiliate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.500 3.000 C 19.505 3.000 20.412 3.603 20.803 4.529 C 21.193 5.455 20.991 6.525 20.290 7.245 C 19.588 7.965 18.524 8.194 17.588 7.828 L 13.032 12.383 C 13.781 13.468 14.113 14.787 13.968 16.097 L 16.592 16.884 C 17.357 15.981 18.651 15.739 19.692 16.303 C 20.732 16.868 21.234 18.085 20.894 19.219 C 20.553 20.353 19.464 21.093 18.285 20.991 C 17.105 20.890 16.159 19.975 16.017 18.800 L 13.394 18.012 C 12.254 20.236 9.757 21.412 7.316 20.874 C 4.875 20.336 3.104 18.220 3.004 15.722 L 3.000 15.500 L 3.004 15.279 C 3.083 13.297 4.224 11.512 5.988 10.606 L 5.200 7.982 C 4.011 7.839 3.090 6.873 3.006 5.678 L 3.000 5.500 L 3.005 5.336 C 3.079 4.202 3.910 3.260 5.026 3.045 C 6.142 2.830 7.263 3.394 7.754 4.420 C 8.245 5.445 7.983 6.672 7.116 7.407 L 7.903 10.032 C 9.213 9.887 10.532 10.219 11.617 10.968 L 16.172 6.412 C 16.078 6.173 16.022 5.920 16.005 5.664 L 16.000 5.500 L 16.005 5.336 C 16.091 4.022 17.183 3.000 18.500 3.000 Z"),
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
        return _affiliate!!
    }

private var _affiliate: ImageVector? = null
