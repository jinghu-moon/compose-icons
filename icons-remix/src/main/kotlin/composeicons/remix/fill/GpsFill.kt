package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GpsFill: ImageVector
    get() {
        if (_gpsFill != null) return _gpsFill!!
        _gpsFill = remixIcon(
            name = "GpsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 16l3 6h-6l3-6ZM9.373 16.255C7.949 15.374 7 13.798 7 12 7 9.239 9.239 7 12 7c2.761 0 5 2.239 5 5 0 1.798-.949 3.374-2.373 4.255L13.272 13.544C13.717 13.177 14 12.622 14 12c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 .622 .283 1.177 .728 1.544L9.373 16.255ZM7.132 20.737C4.07 19.027 2 15.755 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 3.755-2.07 7.027-5.132 8.737L15.525 18.049C17.603 16.835 19 14.581 19 12 19 8.134 15.866 5 12 5 8.134 5 5 8.134 5 12c0 2.581 1.397 4.835 3.475 6.049L7.132 20.737Z"),
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
        return _gpsFill!!
    }

private var _gpsFill: ImageVector? = null
