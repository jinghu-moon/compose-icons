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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.005 20.003 L 14.005 22.003 L 2.005 22.003 L 2.005 20.003 L 14.005 20.003 ZM 14.591 0.689 L 22.369 8.467 L 20.955 9.881 L 19.894 9.528 L 17.419 12.003 L 23.076 17.660 L 21.662 19.074 L 16.005 13.417 L 13.601 15.821 L 13.884 16.952 L 12.469 18.367 L 4.691 10.589 L 6.105 9.174 L 7.237 9.457 L 13.530 3.164 L 13.177 2.103 L 14.591 0.689 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _auctionFill!!
    }

private var _auctionFill: ImageVector? = null
