package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LapTimer: ImageVector
    get() {
        if (_lapTimer != null) return _lapTimer!!
        _lapTimer = radixIcon(
            name = "LapTimer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 0c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-1v1.121c1.098 .085 2.118 .447 2.991 1.017 .02-.028 .041-.055 .066-.08l1-1 .099-.08c.243-.16 .573-.133 .786 .08 .213 .213 .24 .544 .08 .786l-.08 .099-.977 .976c1.192 1.162 1.934 2.785 1.934 4.582-0 3.534-2.865 6.399-6.399 6.399C3.966 14.899 1.1 12.034 1.1 8.5 1.1 5.134 3.7 2.376 7 2.121v-1.121h-1C5.724 1 5.5 .776 5.5 .5 5.5 .224 5.724 0 6 0h3ZM7.5 3.1C4.518 3.1 2.1 5.518 2.1 8.5c0 2.982 2.418 5.399 5.4 5.399 2.982-0 5.399-2.417 5.399-5.399C12.9 5.518 10.482 3.1 7.5 3.1ZM7.5 8.5l3.111 3.111c-.796 .796-1.896 1.288-3.111 1.288C5.07 12.899 3.1 10.93 3.1 8.5 3.1 6.07 5.07 4.1 7.5 4.1v4.4Z"),
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
        return _lapTimer!!
    }

private var _lapTimer: ImageVector? = null
