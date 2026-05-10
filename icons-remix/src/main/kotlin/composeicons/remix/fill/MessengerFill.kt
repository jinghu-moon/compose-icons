package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MessengerFill: ImageVector
    get() {
        if (_messengerFill != null) return _messengerFill!!
        _messengerFill = remixIcon(
            name = "MessengerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 2c5.634 0 10 4.127 10 9.7 0 5.574-4.366 9.7-10 9.7-.978 .002-1.951-.127-2.895-.385-.177-.049-.366-.035-.534 .04l-1.985 .876c-.244 .108-.525 .087-.75-.055-.225-.142-.365-.387-.373-.653L5.41 19.444c-.007-.219-.105-.425-.268-.57C3.196 17.135 2.001 14.616 2.001 11.7 2.001 6.127 6.367 2 12.001 2ZM5.996 14.536c-.282 .448 .268 .951 .689 .632L9.84 12.774c.214-.161 .509-.161 .723 0l2.337 1.75c.335 .251 .76 .351 1.172 .275 .412-.076 .774-.321 .997-.675L18.006 9.464c.282-.448-.268-.951-.689-.632l-3.155 2.395c-.214 .161-.509 .161-.722 0L11.102 9.476c-.335-.251-.76-.351-1.172-.275-.412 .076-.773 .321-.997 .675L5.996 14.536Z"),
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
        return _messengerFill!!
    }

private var _messengerFill: ImageVector? = null
