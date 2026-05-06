package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) return _chevronDown!!
        _chevronDown = radixIcon(
            name = "ChevronDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.158 6.135c.201-.189 .518-.178 .707 .023 .189 .201 .178 .518-.023 .707L7.842 10.616c-.192 .18-.491 .18-.684 0l-4-3.75L3.092 6.788c-.134-.19-.122-.454 .043-.63 .165-.176 .429-.207 .627-.085l.08 .062L7.5 9.564 11.158 6.135Z"),
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
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
