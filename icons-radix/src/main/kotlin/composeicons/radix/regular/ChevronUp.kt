package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ChevronUp: ImageVector
    get() {
        if (_chevronUp != null) return _chevronUp!!
        _chevronUp = radixIcon(
            name = "ChevronUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.158 8.865c.201 .189 .518 .178 .707-.023 .189-.201 .178-.518-.023-.707L7.842 4.385c-.192-.18-.491-.18-.684 0l-4 3.75-.066 .077c-.134 .19-.122 .454 .043 .63 .165 .176 .429 .207 .627 .085l.08-.062L7.5 5.436l3.658 3.429Z"),
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
        return _chevronUp!!
    }

private var _chevronUp: ImageVector? = null
