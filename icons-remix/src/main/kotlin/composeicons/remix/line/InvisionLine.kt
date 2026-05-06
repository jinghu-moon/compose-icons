package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InvisionLine: ImageVector
    get() {
        if (_invisionLine != null) return _invisionLine!!
        _invisionLine = remixIcon(
            name = "InvisionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.001 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1ZM5.001 5v14h14v-14h-14ZM6.989 14.065l.77-3.271h-1.192L6.928 9.403h2.867L8.664 14.075c-.075 .299-.106 .546-.106 .719 0 .299 .141 .386 .362 .438 .135 .031 1.207 .01 1.791-1.341l.743-3.097h-1.207l.362-1.39h2.581l-.332 1.578c.453-.879 1.358-1.715 2.249-1.715 .951 0 1.736 .705 1.736 2.055 0 .345-.045 .721-.166 1.145l-.483 1.805c-.045 .189-.076 .346-.076 .487 0 .314 .121 .471 .347 .471 .226 0 .513-.173 .845-1.13l.664 .267c-.392 1.429-1.102 2.025-1.992 2.025-1.041 0-1.539-.643-1.539-1.523 0-.251 .03-.518 .106-.785l.498-1.853c.06-.204 .075-.392 .075-.565 0-.597-.347-.958-.906-.958-.709 0-1.177 .53-1.419 1.55l-.966 4.031h-1.69l.303-1.267c-.497 .849-1.187 1.375-2.038 1.375-1.026 0-1.509-.615-1.509-1.542 0-.235 .03-.523 .091-.79ZM8.626 8.625C8.005 8.625 7.501 8.121 7.501 7.5c0-.621 .504-1.125 1.125-1.125 .621 0 1.125 .504 1.125 1.125 0 .621-.504 1.125-1.125 1.125Z"),
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
        return _invisionLine!!
    }

private var _invisionLine: ImageVector? = null
