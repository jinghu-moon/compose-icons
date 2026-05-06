package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MessengerLine: ImageVector
    get() {
        if (_messengerLine != null) return _messengerLine!!
        _messengerLine = remixIcon(
            name = "MessengerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.765 19.225c.589-.26 1.25-.309 1.868-.139 .77 .21 1.565 .316 2.368 .314 4.585 0 8-3.286 8-7.7C20.001 7.287 16.586 4 12.001 4 7.416 4 4.001 7.287 4.001 11.7c0 2.27 .896 4.272 2.466 5.676 .575 .509 .916 1.232 .942 2.006l.356-.157ZM12.001 2c5.634 0 10 4.127 10 9.7 0 5.574-4.366 9.7-10 9.7-.978 .002-1.951-.127-2.895-.385-.177-.049-.366-.035-.534 .04l-1.985 .876c-.244 .108-.525 .087-.75-.055-.225-.142-.365-.387-.373-.653L5.41 19.444c-.007-.219-.105-.425-.268-.57C3.196 17.135 2.001 14.616 2.001 11.7 2.001 6.127 6.367 2 12.001 2ZM5.996 14.536 8.933 9.877c.223-.354 .585-.599 .997-.675 .412-.076 .837 .024 1.172 .275l2.337 1.75c.214 .161 .509 .161 .722 0L17.317 8.832c.421-.319 .971 .184 .689 .632l-2.938 4.66c-.223 .354-.585 .599-.997 .675-.412 .076-.837-.024-1.172-.275L10.563 12.774c-.214-.161-.509-.161-.723 0L6.685 15.168c-.421 .319-.971-.184-.689-.632Z"),
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
        return _messengerLine!!
    }

private var _messengerLine: ImageVector? = null
