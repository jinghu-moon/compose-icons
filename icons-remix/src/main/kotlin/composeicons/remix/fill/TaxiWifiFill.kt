package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TaxiWifiFill: ImageVector
    get() {
        if (_taxiWifiFill != null) return _taxiWifiFill!!
        _taxiWifiFill = remixIcon(
            name = "TaxiWifiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3v4h-5.681L4.175 12h17.825v9c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-1h-14v1c0 .552-.448 1-1 1h-1C2.448 22 2 21.552 2 21v-9L4.481 6.212C4.796 5.477 5.519 5 6.319 5h2.681v-2h3ZM6.5 14C5.672 14 5 14.672 5 15.5 5 16.328 5.672 17 6.5 17 7.328 17 8 16.328 8 15.5 8 14.672 7.328 14 6.5 14ZM17.5 14C16.672 14 16 14.672 16 15.5c0 .828 .672 1.5 1.5 1.5C18.328 17 19 16.328 19 15.5 19 14.672 18.328 14 17.5 14ZM18.5 1C20.985 1 23 3.015 23 5.5 23 7.985 20.985 10 18.5 10 16.015 10 14 7.985 14 5.5 14 3.015 16.015 1 18.5 1ZM18.5 6.167c-.491 0-.941 .177-1.288 .47l-.126 .115 1.414 1.414L19.913 6.752c-.362-.361-.861-.585-1.413-.585ZM18.5 3.5c-1.203 0-2.3 .455-3.128 1.203l-.173 .165 .944 .942c.603-.603 1.437-.976 2.357-.976 .844 0 1.614 .314 2.201 .83l.156 .146 .943-.943C20.955 4.022 19.788 3.5 18.5 3.5Z"),
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
        return _taxiWifiFill!!
    }

private var _taxiWifiFill: ImageVector? = null
