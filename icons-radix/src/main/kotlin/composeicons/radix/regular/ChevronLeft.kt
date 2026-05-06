package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ChevronLeft: ImageVector
    get() {
        if (_chevronLeft != null) return _chevronLeft!!
        _chevronLeft = radixIcon(
            name = "ChevronLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.212 3.092c.19-.134 .454-.122 .63 .043 .176 .165 .207 .429 .085 .627l-.062 .08L5.436 7.5l3.43 3.658 .062 .08c.122 .198 .091 .462-.085 .627-.176 .165-.44 .177-.63 .043l-.077-.066L4.385 7.842c-.18-.192-.18-.491 0-.684l3.75-4 .077-.066Z"),
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
        return _chevronLeft!!
    }

private var _chevronLeft: ImageVector? = null
