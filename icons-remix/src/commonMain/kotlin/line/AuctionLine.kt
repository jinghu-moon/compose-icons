package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AuctionLine: ImageVector
    get() {
        if (_auctionLine != null) return _auctionLine!!
        _auctionLine = remixIcon(
            name = "AuctionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.005 20.003 L 14.005 22.003 L 2.005 22.003 L 2.005 20.003 L 14.005 20.003 ZM 14.591 0.689 L 22.369 8.467 L 20.955 9.881 L 19.894 9.528 L 17.419 12.003 L 23.076 17.660 L 21.662 19.074 L 16.005 13.417 L 13.601 15.821 L 13.884 16.952 L 12.469 18.367 L 4.691 10.589 L 6.105 9.174 L 7.237 9.457 L 13.530 3.164 L 13.177 2.103 L 14.591 0.689 ZM 15.298 4.225 L 8.227 11.296 L 11.762 14.831 L 18.833 7.760 L 15.298 4.225 Z"),
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
        return _auctionLine!!
    }

private var _auctionLine: ImageVector? = null
