package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PrinterCloudFill: ImageVector
    get() {
        if (_printerCloudFill != null) return _printerCloudFill!!
        _printerCloudFill = remixIcon(
            name = "PrinterCloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 2h10c.552 0 1 .448 1 1v3h-12v-3C6 2.448 6.448 2 7 2ZM22 9C22 8.448 21.552 8 21 8h-18C2.448 8 2 8.448 2 9v10c0 .552 .448 1 1 1h2v-5h7.194c.243-.891 .716-1.688 1.417-2.389C14.685 11.537 15.981 11 17.5 11c1.519 0 2.815 .537 3.889 1.611 .228 .228 .431 .466 .611 .713v-4.324ZM8 10v2h-3v-2h3ZM21 16.5C21 14.567 19.433 13 17.5 13 15.567 13 14 14.567 14 16.5l.003 .103C12.847 16.928 12 17.99 12 19.25c0 1.462 1.142 2.658 2.583 2.745l.167 .005h5.5l.167-.005C21.858 21.908 23 20.712 23 19.25c0-1.26-.847-2.322-2.001-2.647L21 16.5ZM7 17h3.562c-.375 .686-.562 1.436-.562 2.25 0 1.032 .29 1.949 .872 2.75h-3.872v-5Z"),
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
        return _printerCloudFill!!
    }

private var _printerCloudFill: ImageVector? = null
