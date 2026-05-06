package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BusWifiFill: ImageVector
    get() {
        if (_busWifiFill != null) return _busWifiFill!!
        _busWifiFill = remixIcon(
            name = "BusWifiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3v2h-7v9h14v-2h2v8h-1v1c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-1h-10v1c0 .552-.448 1-1 1h-1C4.448 22 4 21.552 4 21v-1h-1v-8h-1v-4h1v-3C3 3.895 3.895 3 5 3h7ZM9 16h-4v2h4v-2ZM19 16h-4v2h4v-2ZM18.5 1C20.985 1 23 3.015 23 5.5 23 7.985 20.985 10 18.5 10 16.015 10 14 7.985 14 5.5 14 3.015 16.015 1 18.5 1ZM18.5 6.167c-.491 0-.941 .177-1.288 .47l-.126 .115 1.414 1.414L19.913 6.752c-.362-.361-.861-.585-1.413-.585ZM18.5 3.5c-1.203 0-2.3 .455-3.128 1.203l-.173 .165 .944 .942c.603-.603 1.437-.976 2.357-.976 .844 0 1.614 .314 2.201 .83l.156 .146 .943-.943C20.955 4.022 19.788 3.5 18.5 3.5Z"),
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
        return _busWifiFill!!
    }

private var _busWifiFill: ImageVector? = null
