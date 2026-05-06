package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = radixIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 10.75c.414 0 .75 .336 .75 .75-0 .414-.336 .75-.75 .75-.414-0-.75-.336-.75-.75 0-.414 .336-.75 .75-.75ZM7.483 2.25c.518 0 .931 .43 .911 .947L8.206 8.805c-.015 .378-.325 .677-.703 .677-.378 0-.689-.299-.703-.677L6.571 3.198c-.02-.517 .394-.947 .912-.947Z"),
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
        return _exclamationMark!!
    }

private var _exclamationMark: ImageVector? = null
