package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Map2Line: ImageVector
    get() {
        if (_map2Line != null) return _map2Line!!
        _map2Line = remixIcon(
            name = "Map2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 5.000 L 9.000 2.000 L 15.000 5.000 L 21.303 2.299 C 21.557 2.190 21.851 2.307 21.960 2.561 C 21.986 2.624 22.000 2.691 22.000 2.758 L 22.000 19.000 L 15.000 22.000 L 9.000 19.000 L 2.697 21.701 C 2.443 21.810 2.149 21.692 2.040 21.439 C 2.014 21.376 2.000 21.309 2.000 21.242 L 2.000 5.000 ZM 16.000 19.396 L 20.000 17.681 L 20.000 5.033 L 16.000 6.747 L 16.000 19.396 ZM 14.000 19.264 L 14.000 6.736 L 10.000 4.736 L 10.000 17.264 L 14.000 19.264 ZM 8.000 17.253 L 8.000 4.605 L 4.000 6.319 L 4.000 18.967 L 8.000 17.253 Z"),
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
        return _map2Line!!
    }

private var _map2Line: ImageVector? = null
