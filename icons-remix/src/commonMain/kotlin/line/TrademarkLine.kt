package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TrademarkLine: ImageVector
    get() {
        if (_trademarkLine != null) return _trademarkLine!!
        _trademarkLine = remixIcon(
            name = "TrademarkLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 6.000 L 10.000 8.000 L 6.000 8.000 L 6.000 18.000 L 4.000 18.000 L 4.000 8.000 L 0.000 8.000 L 0.000 6.000 L 10.000 6.000 ZM 12.000 6.000 L 14.500 6.000 L 17.500 11.196 L 20.500 6.000 L 23.000 6.000 L 23.000 18.000 L 21.000 18.000 L 21.000 9.133 L 17.500 15.196 L 14.000 9.135 L 14.000 18.000 L 12.000 18.000 L 12.000 6.000 Z"),
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
        return _trademarkLine!!
    }

private var _trademarkLine: ImageVector? = null
