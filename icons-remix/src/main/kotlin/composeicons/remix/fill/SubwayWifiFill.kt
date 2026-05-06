package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SubwayWifiFill: ImageVector
    get() {
        if (_subwayWifiFill != null) return _subwayWifiFill!!
        _subwayWifiFill = remixIcon(
            name = "SubwayWifiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 3v9h8v6c0 1.105-.895 2-2 2h-1.8L19 21.5v.5h-14v-.5L6.8 20h-1.8C3.895 20 3 19.105 3 18v-11C3 4.791 4.791 3 7 3h6ZM7.5 15C6.672 15 6 15.672 6 16.5 6 17.328 6.672 18 7.5 18 8.328 18 9 17.328 9 16.5 9 15.672 8.328 15 7.5 15ZM16.5 15C15.672 15 15 15.672 15 16.5c0 .828 .672 1.5 1.5 1.5C17.328 18 18 17.328 18 16.5 18 15.672 17.328 15 16.5 15ZM11 5h-4C5.946 5 5.082 5.816 5.005 6.851L5 7v5h6v-7ZM18.5 1C20.985 1 23 3.015 23 5.5 23 7.985 20.985 10 18.5 10 16.015 10 14 7.985 14 5.5 14 3.015 16.015 1 18.5 1ZM18.5 6.167c-.491 0-.941 .177-1.288 .47l-.126 .115 1.414 1.414L19.913 6.752c-.362-.361-.861-.585-1.413-.585ZM18.5 3.5c-1.203 0-2.3 .455-3.128 1.203l-.173 .165 .944 .942c.603-.603 1.437-.976 2.357-.976 .844 0 1.614 .314 2.201 .83l.156 .146 .943-.943C20.955 4.022 19.788 3.5 18.5 3.5Z"),
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
        return _subwayWifiFill!!
    }

private var _subwayWifiFill: ImageVector? = null
