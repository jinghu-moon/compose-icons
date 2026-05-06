package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PrinterCloudLine: ImageVector
    get() {
        if (_printerCloudLine != null) return _printerCloudLine!!
        _printerCloudLine = remixIcon(
            name = "PrinterCloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c.552 0 1 .448 1 1v4h3c.552 0 1 .448 1 1v5.324c-.18-.248-.383-.486-.611-.713-.428-.428-.891-.77-1.389-1.028v-2.583h-16v8h2v-1c0-.552 .448-1 1-1h5.194c-.026 .093-.048 .188-.069 .283-.43 .285-.811 .642-1.142 1.074-.16 .208-.3 .422-.42 .643h-2.562v3h2.054c.109 .732 .381 1.399 .817 2h-3.872C6.448 22 6 21.552 6 21v-2h-3C2.448 19 2 18.552 2 18v-10C2 7.448 2.448 7 3 7h3v-4C6 2.448 6.448 2 7 2h10ZM16 4h-8v3h8v-3ZM8 10v2h-3v-2h3ZM21 16.5C21 14.567 19.433 13 17.5 13 15.567 13 14 14.567 14 16.5l.003 .103C12.847 16.928 12 17.99 12 19.25c0 1.462 1.142 2.658 2.583 2.745l.167 .005h5.5l.167-.005C21.858 21.908 23 20.712 23 19.25c0-1.26-.847-2.322-2.001-2.647L21 16.5ZM16.007 16.355C16.08 15.595 16.72 15 17.5 15c.78 0 1.42 .595 1.493 1.355l.007 .145v1.62c.696 .199 1.177 .334 1.444 .406 .4 .107 .638 .518 .53 .918-.089 .333-.39 .554-.719 .556h-5.511c-.329-.002-.63-.223-.719-.556-.107-.4 .13-.811 .53-.918 .237-.064 .644-.177 1.22-.342L16 18.12v-1.62l.007-.145Z"),
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
        return _printerCloudLine!!
    }

private var _printerCloudLine: ImageVector? = null
