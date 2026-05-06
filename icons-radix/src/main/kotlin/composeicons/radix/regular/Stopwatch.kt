package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) return _stopwatch!!
        _stopwatch = radixIcon(
            name = "Stopwatch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 0c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-1v1.121c1.099 .085 2.119 .447 2.992 1.017 .02-.027 .041-.054 .065-.079l.469 .469c.001 .001 .002 .001 .003 .002l-.029-.029-.442-.441 .801-.801c.244-.244 .64-.244 .884 0 .244 .244 .244 .641 0 .885l-.776 .775c1.192 1.162 1.934 2.785 1.934 4.582-0 3.534-2.865 6.399-6.399 6.399C3.966 14.899 1.1 12.034 1.1 8.5 1.1 5.134 3.7 2.376 7 2.121v-1.121h-1C5.724 1 5.5 .776 5.5 .5 5.5 .224 5.724 0 6 0h3ZM7.5 3.1C4.518 3.1 2.1 5.518 2.1 8.5c0 2.982 2.418 5.399 5.4 5.399 2.982-0 5.399-2.417 5.399-5.399C12.9 5.518 10.482 3.1 7.5 3.1ZM7.5 4c.276 0 .5 .224 .5 .5v5c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-5C7 4.224 7.224 4 7.5 4Z"),
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
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
