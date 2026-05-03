package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NavigationFill: ImageVector
    get() {
        if (_navigationFill != null) return _navigationFill!!
        _navigationFill = remixIcon(
            name = "NavigationFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.899 2.300 L 21.705 8.568 C 21.967 8.656 22.109 8.939 22.021 9.201 C 21.975 9.340 21.869 9.452 21.733 9.507 L 13.000 13.000 L 8.575 21.850 C 8.452 22.097 8.151 22.198 7.904 22.074 C 7.779 22.011 7.686 21.899 7.647 21.764 L 2.261 2.912 C 2.185 2.646 2.338 2.369 2.604 2.293 C 2.701 2.266 2.804 2.268 2.899 2.300 Z"),
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
        return _navigationFill!!
    }

private var _navigationFill: ImageVector? = null
