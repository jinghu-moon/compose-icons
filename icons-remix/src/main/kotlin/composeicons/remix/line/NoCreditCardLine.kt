package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NoCreditCardLine: ImageVector
    get() {
        if (_noCreditCardLine != null) return _noCreditCardLine!!
        _noCreditCardLine = remixIcon(
            name = "NoCreditCardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.586 21l1.607 1.607 1.414-1.414L2.808 1.393 1.394 2.808l.726 .726C2.046 3.673 2.005 3.832 2.005 4v16c0 .552 .448 1 1 1h16.581ZM17.586 19h-13.581v-7h6.581l7 7ZM6.586 8h-2.581v-2.581L6.586 8ZM22.005 4v13.762l-2-2v-3.762h-3.762l-4-4h7.762v-3h-10.762l-2-2h13.762c.552 0 1 .448 1 1Z"),
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
        return _noCreditCardLine!!
    }

private var _noCreditCardLine: ImageVector? = null
