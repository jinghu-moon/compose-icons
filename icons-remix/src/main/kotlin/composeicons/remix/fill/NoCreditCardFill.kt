package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NoCreditCardFill: ImageVector
    get() {
        if (_noCreditCardFill != null) return _noCreditCardFill!!
        _noCreditCardFill = remixIcon(
            name = "NoCreditCardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.586 21l1.607 1.607 1.414-1.414L2.808 1.393 1.394 2.808l.726 .726C2.046 3.673 2.005 3.832 2.005 4v3h3.581l4 4h-7.581v9c0 .552 .448 1 1 1h16.581ZM22.005 11v6.762L15.243 11h6.762ZM22.005 7h-10.762L7.243 3h13.762c.552 0 1 .448 1 1v3Z"),
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
        return _noCreditCardFill!!
    }

private var _noCreditCardFill: ImageVector? = null
