package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ThickArrowRight: ImageVector
    get() {
        if (_thickArrowRight != null) return _thickArrowRight!!
        _thickArrowRight = radixIcon(
            name = "ThickArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 7.5c0 .161-.078 .313-.209 .407L6.791 12.907c-.152 .109-.353 .123-.52 .037C6.105 12.859 6 12.687 6 12.5v-2.5h-2.5C3.224 10 3 9.776 3 9.5v-4c0-.276 .224-.5 .5-.5h2.5v-2.5c0-.187 .105-.359 .271-.444 .167-.086 .367-.072 .52 .037l7 5 .088 .081c.077 .09 .121 .205 .121 .326ZM7 3.473v2.027c0 .276-.224 .5-.5 .5h-2.5v3h2.5c.276 0 .5 .224 .5 .5v2.027L12.64 7.5 7 3.473Z"),
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
        return _thickArrowRight!!
    }

private var _thickArrowRight: ImageVector? = null
