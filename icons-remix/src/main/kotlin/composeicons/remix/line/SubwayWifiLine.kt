package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SubwayWifiLine: ImageVector
    get() {
        if (_subwayWifiLine != null) return _subwayWifiLine!!
        _subwayWifiLine = remixIcon(
            name = "SubwayWifiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 18c0 1.105-.895 2-2 2h-1.8L19 21.5v.5h-14v-.5L6.8 20h-1.8C3.895 20 3 19.105 3 18v-11C3 4.791 4.791 3 7 3h6v8h8v7ZM19 13h-14v5h14v-5ZM7.5 14C8.328 14 9 14.672 9 15.5 9 16.328 8.328 17 7.5 17 6.672 17 6 16.328 6 15.5 6 14.672 6.672 14 7.5 14ZM16.5 14c.828 0 1.5 .672 1.5 1.5C18 16.328 17.328 17 16.5 17 15.672 17 15 16.328 15 15.5 15 14.672 15.672 14 16.5 14ZM11 5h-4C5.946 5 5.082 5.816 5.005 6.851L5 7v4h6v-6ZM18.5 1C20.985 1 23 3.015 23 5.5 23 7.985 20.985 10 18.5 10 16.015 10 14 7.985 14 5.5 14 3.015 16.015 1 18.5 1ZM18.5 6.167c-.491 0-.941 .177-1.288 .47l-.126 .115 1.414 1.414L19.913 6.752c-.362-.361-.861-.585-1.413-.585ZM18.5 3.5c-1.203 0-2.3 .455-3.128 1.203l-.173 .165 .944 .942c.603-.603 1.437-.976 2.357-.976 .844 0 1.614 .314 2.201 .83l.156 .146 .943-.943C20.955 4.022 19.788 3.5 18.5 3.5Z"),
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
        return _subwayWifiLine!!
    }

private var _subwayWifiLine: ImageVector? = null
