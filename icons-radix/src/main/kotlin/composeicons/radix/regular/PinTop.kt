package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PinTop: ImageVector
    get() {
        if (_pinTop != null) return _pinTop!!
        _pinTop = radixIcon(
            name = "PinTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.252 4.124c.15-.099 .346-.099 .496 0l.07 .058 3.25 3.25c.175 .176 .176 .461 0 .637-.176 .176-.461 .175-.637 0L7.95 5.587v7.913c-0 .248-.202 .45-.45 .45-.248 0-.45-.202-.45-.45v-7.913L4.569 8.069l-.07 .058c-.175 .115-.413 .096-.566-.058C3.778 7.915 3.759 7.677 3.874 7.502l.058-.07L7.182 4.182l.07-.058ZM13.5 1.05c.248 0 .45 .202 .45 .45-0 .248-.202 .45-.45 .45h-12c-.248 0-.45-.202-.45-.45 0-.249 .202-.45 .45-.45h12Z"),
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
        return _pinTop!!
    }

private var _pinTop: ImageVector? = null
