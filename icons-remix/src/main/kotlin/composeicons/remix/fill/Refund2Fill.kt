package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Refund2Fill: ImageVector
    get() {
        if (_refund2Fill != null) return _refund2Fill!!
        _refund2Fill = remixIcon(
            name = "Refund2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C9.578 22 7.354 21.136 5.622 19.698l-.244-.209 .901-1.902C7.732 19.076 9.761 20 12.005 20c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8C7.67 4 4.14 7.448 4.009 11.751L4.005 12h2.5L3.799 17.716C2.668 16.096 2.005 14.125 2.005 12 2.005 6.477 6.482 2 12.005 2ZM13.005 6v2h2.5v2h-5.5c-.276 0-.5 .224-.5 .5 0 .245 .177 .45 .41 .492l.09 .008h4c1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5h-1v2h-2v-2h-2.5v-2h5.5c.276 0 .5-.224 .5-.5 0-.245-.177-.45-.41-.492L14.005 13h-4C8.624 13 7.505 11.881 7.505 10.5 7.505 9.119 8.624 8 10.005 8h1v-2h2Z"),
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
        return _refund2Fill!!
    }

private var _refund2Fill: ImageVector? = null
