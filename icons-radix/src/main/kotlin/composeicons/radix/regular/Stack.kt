package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = radixIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.838 8.277c.22-.076 .47 .011 .593 .219 .122 .208 .077 .468-.095 .624l-.082 .061L7.754 12.431c-.157 .092-.351 .092-.508 0L1.746 9.181 1.664 9.12C1.492 8.964 1.447 8.704 1.569 8.496c.123-.208 .373-.294 .593-.219l.092 .042 5.246 3.1L12.746 8.319l.092-.042ZM7.306 1.789c.144-.061 .311-.051 .448 .03l5.5 3.25c.152 .09 .246 .254 .246 .431 0 .177-.094 .341-.246 .431L7.754 9.181c-.157 .092-.351 .092-.508 0L1.746 5.931C1.594 5.841 1.5 5.677 1.5 5.5c0-.177 .094-.341 .246-.431L7.246 1.819l.06-.03ZM2.982 5.5 7.5 8.169 12.017 5.5 7.5 2.83 2.982 5.5Z"),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
