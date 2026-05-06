package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) return _chevronRight!!
        _chevronRight = radixIcon(
            name = "ChevronRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.159 11.865c.201 .189 .518 .178 .707-.023L10.616 7.842c.18-.192 .18-.491 0-.684l-3.75-4L6.789 3.092c-.19-.134-.454-.122-.63 .043-.176 .165-.207 .429-.085 .627l.062 .08L9.564 7.5 6.135 11.158c-.189 .201-.178 .518 .023 .707Z"),
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
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
