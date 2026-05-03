package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CoinLine: ImageVector
    get() {
        if (_coinLine != null) return _coinLine!!
        _coinLine = remixIcon(
            name = "CoinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.005 4.003 C 18.080 4.003 23.005 6.689 23.005 10.003 L 23.005 14.003 C 23.005 17.316 18.080 20.003 12.005 20.003 C 6.038 20.003 1.181 17.412 1.010 14.180 L 1.005 14.003 L 1.005 10.003 C 1.005 6.689 5.930 4.003 12.005 4.003 ZM 12.005 16.003 C 8.284 16.003 4.995 14.995 3.005 13.453 L 3.005 14.003 C 3.005 15.885 6.888 18.003 12.005 18.003 C 17.016 18.003 20.843 15.972 21.000 14.121 L 21.005 14.003 L 21.006 13.453 C 19.015 14.995 15.726 16.003 12.005 16.003 ZM 12.005 6.003 C 6.888 6.003 3.005 8.121 3.005 10.003 C 3.005 11.885 6.888 14.003 12.005 14.003 C 17.122 14.003 21.005 11.885 21.005 10.003 C 21.005 8.121 17.122 6.003 12.005 6.003 Z"),
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
        return _coinLine!!
    }

private var _coinLine: ImageVector? = null
