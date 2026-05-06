package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontFamily: ImageVector
    get() {
        if (_fontFamily != null) return _fontFamily!!
        _fontFamily = radixIcon(
            name = "FontFamily",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.499 2c.276 0 .501 .224 .501 .5 0 .276-.224 .5-.5 .5h-3.808l-.287 .854c-.216 .643-.511 1.517-.824 2.443C7.503 6.529 7.423 6.765 7.344 7h1.156C8.776 7 9 7.224 9 7.5 9 7.776 8.776 8 8.5 8h-1.496c-.437 1.285-.84 2.462-1.046 3.039-.322 .9-.751 1.447-1.291 1.739-.504 .273-1.025 .272-1.383 .271h-.034c-.304 0-.55-.246-.55-.55 0-.304 .246-.55 .55-.55 .392 0 .653-.01 .894-.14 .221-.119 .511-.396 .778-1.142C5.107 10.151 5.453 9.141 5.842 8h-1.342C4.224 8 4 7.776 4 7.5 4 7.224 4.224 7 4.5 7h1.682c.119-.352 .24-.707 .357-1.055 .313-.925 .607-1.799 .823-2.441L7.532 3h-2.532C4.151 3 3.5 3.651 3.5 4.5 3.5 4.776 3.276 5 3 5 2.724 5 2.5 4.776 2.5 4.5 2.5 3.099 3.599 2 5 2h7.499Z"),
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
        return _fontFamily!!
    }

private var _fontFamily: ImageVector? = null
