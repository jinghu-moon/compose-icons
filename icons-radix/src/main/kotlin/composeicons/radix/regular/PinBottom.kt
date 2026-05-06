package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PinBottom: ImageVector
    get() {
        if (_pinBottom != null) return _pinBottom!!
        _pinBottom = radixIcon(
            name = "PinBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.748 10.876c-.15 .099-.346 .099-.496 0l-.07-.058L3.931 7.568c-.175-.176-.176-.461 0-.637 .176-.176 .461-.175 .637 0L7.05 9.413v-7.913c0-.248 .202-.45 .45-.45 .248 0 .45 .202 .45 .45v7.913L10.431 6.931l.07-.058c.175-.115 .413-.096 .566 .058 .154 .154 .173 .392 .058 .566l-.058 .07L7.818 10.818l-.07 .058ZM1.5 13.95c-.248-0-.45-.202-.45-.45 0-.248 .202-.45 .45-.45h12c.248 0 .45 .202 .45 .45 0 .248-.202 .45-.45 .45h-12Z"),
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
        return _pinBottom!!
    }

private var _pinBottom: ImageVector? = null
