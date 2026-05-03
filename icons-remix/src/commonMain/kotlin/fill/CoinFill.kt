package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CoinFill: ImageVector
    get() {
        if (_coinFill != null) return _coinFill!!
        _coinFill = remixIcon(
            name = "CoinFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 23.005 12.003 L 23.005 14.003 C 23.005 17.316 18.080 20.003 12.005 20.003 C 6.038 20.003 1.181 17.412 1.010 14.180 L 1.005 14.003 L 1.005 12.003 C 1.005 15.316 5.930 18.003 12.005 18.003 C 18.080 18.003 23.005 15.316 23.005 12.003 ZM 12.005 4.003 C 18.080 4.003 23.005 6.689 23.005 10.003 C 23.005 13.316 18.080 16.003 12.005 16.003 C 5.930 16.003 1.005 13.316 1.005 10.003 C 1.005 6.689 5.930 4.003 12.005 4.003 Z"),
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
        return _coinFill!!
    }

private var _coinFill: ImageVector? = null
