package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.User6Fill: ImageVector
    get() {
        if (_user6Fill != null) return _user6Fill!!
        _user6Fill = remixIcon(
            name = "User6Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 17.000 C 15.662 17.000 18.865 18.575 20.607 20.925 L 18.765 21.796 C 17.347 20.116 14.847 19.000 12.000 19.000 C 9.152 19.000 6.653 20.116 5.235 21.796 L 3.394 20.924 C 5.136 18.575 8.338 17.000 12.000 17.000 ZM 12.000 2.000 C 14.761 2.000 17.000 4.239 17.000 7.000 L 17.000 10.000 C 17.000 12.761 14.761 15.000 12.000 15.000 C 9.238 15.000 7.000 12.761 7.000 10.000 L 7.000 7.000 C 7.000 4.239 9.238 2.000 12.000 2.000 Z"),
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
        return _user6Fill!!
    }

private var _user6Fill: ImageVector? = null
