package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.User6Line: ImageVector
    get() {
        if (_user6Line != null) return _user6Line!!
        _user6Line = remixIcon(
            name = "User6Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 17.000 C 15.662 17.000 18.865 18.575 20.607 20.925 L 18.765 21.796 C 17.347 20.116 14.847 19.000 12.000 19.000 C 9.152 19.000 6.653 20.116 5.235 21.796 L 3.394 20.924 C 5.136 18.575 8.338 17.000 12.000 17.000 ZM 12.000 2.000 C 14.761 2.000 17.000 4.239 17.000 7.000 L 17.000 10.000 C 17.000 12.689 14.878 14.882 12.217 14.995 L 12.000 15.000 C 9.238 15.000 7.000 12.761 7.000 10.000 L 7.000 7.000 C 7.000 4.311 9.122 2.118 11.783 2.005 L 12.000 2.000 ZM 12.000 4.000 C 10.402 4.000 9.096 5.249 9.005 6.824 L 9.000 7.000 L 9.000 10.000 C 9.000 11.657 10.343 13.000 12.000 13.000 C 13.598 13.000 14.904 11.751 14.995 10.176 L 15.000 10.000 L 15.000 7.000 C 15.000 5.343 13.657 4.000 12.000 4.000 Z"),
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
        return _user6Line!!
    }

private var _user6Line: ImageVector? = null
