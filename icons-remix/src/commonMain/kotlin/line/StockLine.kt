package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StockLine: ImageVector
    get() {
        if (_stockLine != null) return _stockLine!!
        _stockLine = remixIcon(
            name = "StockLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.005 5.003 L 11.005 5.003 L 11.005 14.003 L 8.005 14.003 L 8.005 17.003 L 6.005 17.003 L 6.005 14.003 L 3.005 14.003 L 3.005 5.003 L 6.005 5.003 L 6.005 2.003 L 8.005 2.003 L 8.005 5.003 ZM 5.005 7.003 L 5.005 12.003 L 9.005 12.003 L 9.005 7.003 L 5.005 7.003 ZM 18.005 10.003 L 21.005 10.003 L 21.005 19.003 L 18.005 19.003 L 18.005 22.003 L 16.005 22.003 L 16.005 19.003 L 13.005 19.003 L 13.005 10.003 L 16.005 10.003 L 16.005 7.003 L 18.005 7.003 L 18.005 10.003 ZM 15.005 12.003 L 15.005 17.003 L 19.005 17.003 L 19.005 12.003 L 15.005 12.003 Z"),
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
        return _stockLine!!
    }

private var _stockLine: ImageVector? = null
