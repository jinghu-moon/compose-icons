package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PinLeft: ImageVector
    get() {
        if (_pinLeft != null) return _pinLeft!!
        _pinLeft = radixIcon(
            name = "PinLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.124 7.748c-.099-.15-.099-.346 0-.496l.058-.07L8.432 3.931c.176-.175 .461-.176 .637 0 .176 .176 .175 .461 0 .637L6.587 7.05h7.913c.248 0 .45 .202 .45 .45 0 .248-.202 .45-.45 .45h-7.913l2.481 2.481 .058 .07c.115 .175 .096 .413-.058 .566-.154 .154-.392 .173-.566 .058l-.07-.058L5.182 7.818 5.124 7.748ZM2.05 1.5c0-.248 .202-.45 .45-.45 .248 0 .45 .202 .45 .45v12c0 .248-.202 .45-.45 .45-.249 0-.45-.202-.45-.45v-12Z"),
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
        return _pinLeft!!
    }

private var _pinLeft: ImageVector? = null
