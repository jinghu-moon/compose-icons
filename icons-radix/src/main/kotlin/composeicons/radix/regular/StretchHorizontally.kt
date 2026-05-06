package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.StretchHorizontally: ImageVector
    get() {
        if (_stretchHorizontally != null) return _stretchHorizontally!!
        _stretchHorizontally = radixIcon(
            name = "StretchHorizontally",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 9 1 13.5c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5L-0 1.5C0 1.224 .224 1 .5 1c.276 0 .5 .224 .5 .5v4.5h13v-4.5c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v12c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-4.5h-13Z"),
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
        return _stretchHorizontally!!
    }

private var _stretchHorizontally: ImageVector? = null
