package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BankCardFill: ImageVector
    get() {
        if (_bankCardFill != null) return _bankCardFill!!
        _bankCardFill = remixIcon(
            name = "BankCardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.005 10.000 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 10.000 L 22.005 10.000 ZM 22.005 8.000 L 2.005 8.000 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 8.000 ZM 15.005 16.000 L 15.005 18.000 L 19.005 18.000 L 19.005 16.000 L 15.005 16.000 Z"),
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
        return _bankCardFill!!
    }

private var _bankCardFill: ImageVector? = null
