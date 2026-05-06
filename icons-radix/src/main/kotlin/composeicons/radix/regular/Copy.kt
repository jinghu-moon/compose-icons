package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = radixIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 4v-1.5c0-.276-.224-.5-.5-.5h-7C2.224 2 2 2.224 2 2.5v7c0 .276 .224 .5 .5 .5h1.5v-4.5C4 4.672 4.672 4 5.5 4h4.5ZM5.5 5C5.224 5 5 5.224 5 5.5v7c0 .276 .224 .5 .5 .5h7c.276 0 .5-.224 .5-.5v-7c0-.276-.224-.5-.5-.5h-7ZM12.5 4c.828 0 1.5 .672 1.5 1.5v7C14 13.328 13.328 14 12.5 14h-7C4.672 14 4 13.328 4 12.5v-1.5h-1.5C1.672 11 1 10.328 1 9.5v-7C1 1.672 1.672 1 2.5 1h7c.828 0 1.5 .672 1.5 1.5v1.5h1.5Z"),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
