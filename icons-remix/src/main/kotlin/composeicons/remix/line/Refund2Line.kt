package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Refund2Line: ImageVector
    get() {
        if (_refund2Line != null) return _refund2Line!!
        _refund2Line = remixIcon(
            name = "Refund2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.676 4.257C9.604 1.038 15.409 1.262 19.076 4.929c3.905 3.905 3.905 10.237 0 14.142-3.905 3.905-10.237 3.905-14.142 0C2.409 16.547 1.517 13.008 2.256 9.767l.077-.313 1.934 .509c-.698 2.66-.004 5.609 2.081 7.694 3.124 3.124 8.189 3.124 11.314 0 3.124-3.124 3.124-8.19 0-11.314C14.844 3.526 10.448 3.249 7.32 5.514l-.221 .166L8.116 6.697 3.52 7.757 4.58 3.161 5.676 4.257ZM13.005 6v2h2.5v2h-5.5c-.276 0-.5 .224-.5 .5 0 .245 .177 .45 .41 .492l.09 .008h4c1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5h-1v2h-2v-2h-2.5v-2h5.5c.276 0 .5-.224 .5-.5 0-.245-.177-.45-.41-.492L14.005 13h-4C8.624 13 7.505 11.881 7.505 10.5 7.505 9.119 8.624 8 10.005 8h1v-2h2Z"),
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
        return _refund2Line!!
    }

private var _refund2Line: ImageVector? = null
