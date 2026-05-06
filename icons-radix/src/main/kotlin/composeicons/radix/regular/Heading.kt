package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Heading: ImageVector
    get() {
        if (_heading != null) return _heading!!
        _heading = radixIcon(
            name = "Heading",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.345 2.06c.205 .042 .359 .223 .359 .44-0 .217-.155 .398-.359 .44l-.091 .01h-1.205v4.1h4.9v-4.1h-1.195c-.248 0-.45-.202-.45-.45 0-.249 .202-.45 .45-.45h3.5l.091 .01c.205 .042 .359 .223 .359 .44-0 .217-.155 .398-.359 .44l-.091 .01h-1.205v9.1h1.205l.091 .01c.205 .042 .359 .223 .359 .44-0 .217-.155 .398-.359 .44l-.091 .01h-3.5c-.248 0-.45-.202-.45-.45 0-.248 .202-.45 .45-.45h1.195v-4.1h-4.9v4.1h1.205l.091 .01c.205 .042 .359 .223 .359 .44-0 .217-.155 .398-.359 .44l-.091 .01h-3.5c-.248 0-.45-.202-.45-.45 0-.248 .202-.45 .45-.45h1.195v-9.1h-1.195c-.248 0-.45-.202-.45-.45 0-.249 .202-.45 .45-.45h3.5l.091 .01Z"),
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
        return _heading!!
    }

private var _heading: ImageVector? = null
