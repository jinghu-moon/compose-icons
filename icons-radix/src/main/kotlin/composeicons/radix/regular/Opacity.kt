package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Opacity: ImageVector
    get() {
        if (_opacity != null) return _opacity!!
        _opacity = radixIcon(
            name = "Opacity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 1.5C10.5 4.25 12 6.5 12 9c0 2.485-2.015 4.5-4.5 4.5C5.015 13.5 3 11.485 3 9 3 6.5 4.5 4.25 7.5 1.5ZM7.5 2.876C5.028 5.274 4 7.112 4 9c0 1.933 1.567 3.5 3.5 3.5C9.433 12.5 11 10.933 11 9 11 7.112 9.972 5.274 7.5 2.876Z"),
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
        return _opacity!!
    }

private var _opacity: ImageVector? = null
