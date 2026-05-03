package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BankCard2Line: ImageVector
    get() {
        if (_bankCard2Line != null) return _bankCard2Line!!
        _bankCard2Line = remixIcon(
            name = "BankCard2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 ZM 20.005 12.000 L 4.005 12.000 L 4.005 19.000 L 20.005 19.000 L 20.005 12.000 ZM 20.005 8.000 L 20.005 5.000 L 4.005 5.000 L 4.005 8.000 L 20.005 8.000 Z"),
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
        return _bankCard2Line!!
    }

private var _bankCard2Line: ImageVector? = null
