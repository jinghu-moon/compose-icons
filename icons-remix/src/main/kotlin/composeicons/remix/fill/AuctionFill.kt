package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AuctionFill: ImageVector
    get() {
        if (_auctionFill != null) return _auctionFill!!
        _auctionFill = remixIcon(
            name = "AuctionFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.005 20.003v2h-12v-2h12ZM14.591 .689l7.778 7.778L20.955 9.881 19.894 9.528l-2.475 2.475 5.657 5.657-1.414 1.414L16.005 13.417l-2.404 2.404 .283 1.131-1.414 1.414L4.691 10.589 6.105 9.174l1.131 .283L13.53 3.164 13.177 2.103 14.591 .689Z"),
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
        return _auctionFill!!
    }

private var _auctionFill: ImageVector? = null
