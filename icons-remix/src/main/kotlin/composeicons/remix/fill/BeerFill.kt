package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BeerFill: ImageVector
    get() {
        if (_beerFill != null) return _beerFill!!
        _beerFill = remixIcon(
            name = "BeerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 3c1.105 0 2 .895 2 2 0 .115-.01 .226-.028 .335l1.972 .331C12.981 5.448 13 5.226 13 5c0-.238-.021-.47-.06-.696C13.247 4.111 13.61 4 14 4c1.105 0 2 .895 2 2 0 .364-.097 .706-.267 1h-10.733C4.448 7 4 6.552 4 6 4 5.448 4.448 5 5 5c.2 0 .384 .058 .539 .157 .273 .175 .615 .207 .916 .085 .301-.122 .524-.383 .598-.699C7.259 3.658 8.054 3 9 3ZM10.516 1.297C10.049 1.106 9.537 1 9 1 7.501 1 6.196 1.824 5.511 3.043 5.345 3.015 5.174 3 5 3 3.343 3 2 4.343 2 6c0 .889 .386 1.687 1 2.236v11.764c0 1.105 .895 2 2 2h10c1.105 0 2-.895 2-2h2c1.105 0 2-.895 2-2v-7C21 9.895 20.105 9 19 9h-2v-.354C17.622 7.941 18 7.014 18 6 18 3.791 16.209 2 14 2c-.686 0-1.332 .173-1.896 .477-.419-.515-.964-.924-1.588-1.18ZM17 18v-7h2v7h-2ZM7 11h2v7h-2v-7ZM11 11h2v7h-2v-7Z"),
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
        return _beerFill!!
    }

private var _beerFill: ImageVector? = null
