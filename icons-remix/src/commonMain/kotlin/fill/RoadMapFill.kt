package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RoadMapFill: ImageVector
    get() {
        if (_roadMapFill != null) return _roadMapFill!!
        _roadMapFill = remixIcon(
            name = "RoadMapFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.950 11.950 C 18.735 10.165 19.354 7.656 18.808 5.368 L 21.303 4.299 C 21.557 4.190 21.851 4.307 21.960 4.561 C 21.986 4.624 22.000 4.691 22.000 4.758 L 22.000 19.000 L 15.000 22.000 L 9.000 19.000 L 2.697 21.701 C 2.443 21.810 2.149 21.692 2.040 21.439 C 2.014 21.376 2.000 21.309 2.000 21.242 L 2.000 7.000 L 5.129 5.659 C 4.700 7.866 5.341 10.240 7.050 11.950 L 12.000 16.899 L 16.950 11.950 ZM 15.535 10.535 L 12.000 14.071 L 8.464 10.535 C 6.512 8.583 6.512 5.417 8.464 3.464 C 10.417 1.512 13.583 1.512 15.535 3.464 C 17.488 5.417 17.488 8.583 15.535 10.535 Z"),
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
        return _roadMapFill!!
    }

private var _roadMapFill: ImageVector? = null
