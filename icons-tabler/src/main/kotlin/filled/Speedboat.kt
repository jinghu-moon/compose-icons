package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Speedboat: ImageVector
    get() {
        if (_speedboat != null) return _speedboat!!
        _speedboat = tablerFilledIcon(
            name = "Speedboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 7.000 C 14.334 7.000 14.646 7.167 14.832 7.445 L 16.534 10.000 L 22.000 10.000 C 22.369 10.000 22.708 10.203 22.882 10.528 C 23.056 10.853 23.037 11.247 22.833 11.554 L 19.733 16.214 C 18.991 17.330 17.740 18.001 16.400 18.000 L 2.000 18.000 C 1.672 18.000 1.365 17.839 1.178 17.569 C 0.992 17.300 0.949 16.956 1.064 16.649 L 2.564 12.649 C 2.710 12.259 3.083 12.000 3.500 12.000 L 5.256 12.000 L 6.156 9.000 L 6.000 9.000 C 5.493 9.000 5.066 8.620 5.007 8.117 L 5.000 8.000 C 5.000 7.448 5.448 7.000 6.000 7.000 ZM 7.343 12.000 L 9.230 12.000 C 9.613 12.000 9.992 11.926 10.350 11.781 L 13.907 10.363 Q 14.093 10.288 14.284 10.228 L 13.464 9.000 L 8.244 9.000 Z"),
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
        return _speedboat!!
    }

private var _speedboat: ImageVector? = null
