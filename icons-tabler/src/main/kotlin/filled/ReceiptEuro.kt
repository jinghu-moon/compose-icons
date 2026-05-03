package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ReceiptEuro: ImageVector
    get() {
        if (_receiptEuro != null) return _receiptEuro!!
        _receiptEuro = tablerFilledIcon(
            name = "ReceiptEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 L 20.000 21.000 C 20.000 21.369 19.797 21.708 19.472 21.882 C 19.147 22.056 18.752 22.037 18.445 21.832 L 16.127 20.287 L 14.707 21.707 C 14.351 22.063 13.785 22.099 13.387 21.790 L 13.293 21.707 L 12.000 20.415 L 10.707 21.707 C 10.351 22.063 9.785 22.099 9.387 21.790 L 9.293 21.707 L 7.872 20.287 L 5.555 21.832 C 5.265 22.026 4.894 22.055 4.578 21.908 C 4.261 21.761 4.044 21.459 4.005 21.112 L 4.000 21.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 ZM 13.125 6.000 C 11.079 6.000 9.457 7.746 9.082 10.000 L 9.000 10.000 C 8.448 10.000 8.000 10.448 8.000 11.000 C 8.000 11.552 8.448 12.000 9.000 12.000 L 9.082 12.000 C 9.458 14.254 11.079 16.000 13.125 16.000 C 14.231 16.000 15.178 15.535 15.832 14.555 C 16.139 14.095 16.015 13.475 15.555 13.168 C 15.095 12.861 14.475 12.985 14.168 13.445 C 13.901 13.846 13.588 14.000 13.125 14.000 C 12.243 14.000 11.425 13.186 11.123 12.001 L 13.000 12.000 C 13.552 12.000 14.000 11.552 14.000 11.000 C 14.000 10.448 13.552 10.000 13.000 10.000 L 11.123 10.000 C 11.424 8.814 12.243 8.000 13.125 8.000 C 13.587 8.000 13.901 8.154 14.168 8.555 C 14.475 9.015 15.095 9.139 15.555 8.832 C 16.015 8.525 16.139 7.905 15.832 7.445 C 15.178 6.465 14.232 6.000 13.125 6.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _receiptEuro!!
    }

private var _receiptEuro: ImageVector? = null
