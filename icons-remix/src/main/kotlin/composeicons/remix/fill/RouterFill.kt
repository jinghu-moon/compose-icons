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
                pathData = parseSvgPathData("M11 14v-3h2v3h5c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-12c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1h5ZM2.511 8.837C3.834 4.864 7.583 2 12 2c4.418 0 8.166 2.864 9.489 6.837l-1.898 .633C18.533 6.291 15.534 4 12 4 8.466 4 5.467 6.291 4.409 9.469L2.511 8.837ZM6.306 10.102C7.101 7.719 9.35 6 12 6c2.651 0 4.899 1.719 5.694 4.102l-1.898 .633C15.267 9.146 13.767 8 12 8 10.233 8 8.734 9.146 8.204 10.735L6.306 10.102Z"),
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
