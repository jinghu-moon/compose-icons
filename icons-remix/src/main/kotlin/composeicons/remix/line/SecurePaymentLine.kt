package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SecurePaymentLine: ImageVector
    get() {
        if (_securePaymentLine != null) return _securePaymentLine!!
        _securePaymentLine = remixIcon(
            name = "SecurePaymentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.005 2l7.298 2.281c.417 .13 .702 .517 .702 .954v1.765h2c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1l-3.22 .001c-.387 .51-.857 .961-1.4 1.331L11.005 22 5.625 18.332C3.986 17.214 3.005 15.358 3.005 13.374v-8.139c0-.437 .284-.824 .702-.954L11.005 2ZM11.005 4.094 5.005 5.97v7.404c0 1.245 .579 2.414 1.558 3.168l.188 .136 4.253 2.9L14.787 17h-4.782C9.453 17 9.005 16.552 9.005 16v-8c0-.552 .448-1 1-1h7v-1.03l-6-1.876ZM11.005 12v3h9v-3h-9ZM11.005 10h9v-1h-9v1Z"),
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
        return _securePaymentLine!!
    }

private var _securePaymentLine: ImageVector? = null
