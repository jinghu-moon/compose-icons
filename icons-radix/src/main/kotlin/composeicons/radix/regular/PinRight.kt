package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PinRight: ImageVector
    get() {
        if (_pinRight != null) return _pinRight!!
        _pinRight = radixIcon(
            name = "PinRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.876 7.252c.099 .15 .099 .346 0 .496l-.058 .07L6.568 11.069c-.176 .175-.461 .176-.637 0-.176-.176-.175-.461 0-.637L8.413 7.95h-7.913C.251 7.95 .05 7.749 .05 7.5c0-.248 .202-.45 .45-.45h7.913L5.931 4.569 5.874 4.498c-.115-.175-.096-.413 .058-.566 .154-.154 .392-.173 .566-.058l.07 .058L9.818 7.182l.058 .07ZM12.95 13.5c-0 .248-.202 .45-.45 .45-.248-0-.45-.202-.45-.45v-12c0-.248 .202-.45 .45-.45 .248 0 .45 .202 .45 .45v12Z"),
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
        return _pinRight!!
    }

private var _pinRight: ImageVector? = null
