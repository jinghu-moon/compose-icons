package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Checkbox: ImageVector
    get() {
        if (_checkbox != null) return _checkbox!!
        _checkbox = radixIcon(
            name = "Checkbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.102 2.005C12.607 2.056 13 2.482 13 3v9l-.005 .102c-.048 .47-.422 .845-.893 .893L12 13h-9l-.103-.005c-.47-.048-.845-.422-.893-.893L2 12v-9c0-.518 .393-.944 .897-.995L3 2h9l.102 .005ZM3 12h9v-9h-9v9ZM9.525 4.945c.156-.227 .468-.285 .695-.129 .227 .156 .285 .468 .129 .695L7.091 10.261c-.089 .129-.233 .21-.39 .217-.156 .007-.308-.06-.408-.181L4.428 8.048 4.371 7.964c-.11-.205-.064-.466 .122-.62 .186-.154 .451-.151 .632-.006l.072 .071L6.64 9.147 9.525 4.945Z"),
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
        return _checkbox!!
    }

private var _checkbox: ImageVector? = null
