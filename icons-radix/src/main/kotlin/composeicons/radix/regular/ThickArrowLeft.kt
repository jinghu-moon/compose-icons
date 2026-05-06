package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ThickArrowLeft: ImageVector
    get() {
        if (_thickArrowLeft != null) return _thickArrowLeft!!
        _thickArrowLeft = radixIcon(
            name = "ThickArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 7.5c0 .161 .078 .313 .209 .407l7 5c.152 .109 .353 .123 .52 .037C8.895 12.859 9 12.687 9 12.5v-2.5h2.5c.276 0 .5-.224 .5-.5v-4c0-.276-.224-.5-.5-.5h-2.5v-2.5C9 2.313 8.895 2.141 8.729 2.056c-.167-.086-.367-.072-.52 .037l-7 5-.088 .081C1.044 7.264 1 7.379 1 7.5ZM8 3.473v2.027c0 .276 .224 .5 .5 .5h2.5v3h-2.5C8.224 9 8 9.224 8 9.5v2.027L2.36 7.5 8 3.473Z"),
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
        return _thickArrowLeft!!
    }

private var _thickArrowLeft: ImageVector? = null
