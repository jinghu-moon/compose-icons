package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ThickArrowUp: ImageVector
    get() {
        if (_thickArrowUp != null) return _thickArrowUp!!
        _thickArrowUp = radixIcon(
            name = "ThickArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 1c.161 0 .313 .078 .407 .209l5 7c.109 .152 .123 .353 .037 .52C12.859 8.895 12.687 9 12.5 9h-2.5v2.5c0 .276-.224 .5-.5 .5h-4c-.276 0-.5-.224-.5-.5v-2.5h-2.5C2.313 9 2.141 8.895 2.056 8.729c-.086-.167-.072-.367 .037-.52l5-7 .081-.088C7.264 1.044 7.379 1 7.5 1ZM3.473 8h2.027c.276 0 .5 .224 .5 .5v2.5h3v-2.5C9 8.224 9.224 8 9.5 8h2.027L7.5 2.36 3.473 8Z"),
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
        return _thickArrowUp!!
    }

private var _thickArrowUp: ImageVector? = null
