package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RouterFill: ImageVector
    get() {
        if (_routerFill != null) return _routerFill!!
        _routerFill = remixIcon(
            name = "RouterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 14.000 L 11.000 11.000 L 13.000 11.000 L 13.000 14.000 L 18.000 14.000 C 18.552 14.000 19.000 14.448 19.000 15.000 L 19.000 21.000 C 19.000 21.552 18.552 22.000 18.000 22.000 L 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 15.000 C 5.000 14.448 5.448 14.000 6.000 14.000 L 11.000 14.000 ZM 2.511 8.837 C 3.834 4.864 7.583 2.000 12.000 2.000 C 16.418 2.000 20.166 4.864 21.490 8.837 L 19.592 9.469 C 18.533 6.291 15.534 4.000 12.000 4.000 C 8.466 4.000 5.467 6.291 4.409 9.469 L 2.511 8.837 ZM 6.306 10.102 C 7.101 7.719 9.350 6.000 12.000 6.000 C 14.651 6.000 16.900 7.719 17.694 10.102 L 15.796 10.735 C 15.267 9.146 13.767 8.000 12.000 8.000 C 10.233 8.000 8.734 9.146 8.204 10.735 L 6.306 10.102 Z"),
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
        return _routerFill!!
    }

private var _routerFill: ImageVector? = null
