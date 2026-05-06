package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AllSides: ImageVector
    get() {
        if (_allSides != null) return _allSides!!
        _allSides = radixIcon(
            name = "AllSides",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 14.25 5.25 12h4.5L7.5 14.25ZM3 9.75 .75 7.5 3 5.25v4.5ZM14.25 7.5 12 9.75v-4.5l2.25 2.25ZM9.75 3h-4.5L7.5 .75 9.75 3Z"),
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
        return _allSides!!
    }

private var _allSides: ImageVector? = null
