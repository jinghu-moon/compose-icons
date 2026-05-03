package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BankFill: ImageVector
    get() {
        if (_bankFill != null) return _bankFill!!
        _bankFill = remixIcon(
            name = "BankFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 20.000 L 22.000 20.000 L 22.000 22.000 L 2.000 22.000 L 2.000 20.000 ZM 4.000 12.000 L 6.000 12.000 L 6.000 19.000 L 4.000 19.000 L 4.000 12.000 ZM 9.000 12.000 L 11.000 12.000 L 11.000 19.000 L 9.000 19.000 L 9.000 12.000 ZM 13.000 12.000 L 15.000 12.000 L 15.000 19.000 L 13.000 19.000 L 13.000 12.000 ZM 18.000 12.000 L 20.000 12.000 L 20.000 19.000 L 18.000 19.000 L 18.000 12.000 ZM 2.000 7.000 L 12.000 2.000 L 22.000 7.000 L 22.000 11.000 L 2.000 11.000 L 2.000 7.000 ZM 12.000 8.000 C 12.552 8.000 13.000 7.552 13.000 7.000 C 13.000 6.448 12.552 6.000 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000 C 11.000 7.552 11.448 8.000 12.000 8.000 Z"),
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
        return _bankFill!!
    }

private var _bankFill: ImageVector? = null
