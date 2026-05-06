package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Layers: ImageVector
    get() {
        if (_layers != null) return _layers!!
        _layers = radixIcon(
            name = "Layers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.838 10.277c.22-.076 .47 .011 .593 .219 .122 .208 .077 .468-.095 .624l-.082 .061L7.754 14.431c-.157 .092-.351 .092-.508 0L1.746 11.181l-.082-.061c-.172-.156-.217-.416-.095-.624 .123-.208 .373-.294 .593-.219l.092 .042 5.246 3.1 5.246-3.1 .092-.042ZM12.838 7.277c.22-.076 .47 .011 .593 .219 .122 .208 .077 .468-.095 .624l-.082 .061L7.754 11.431c-.157 .092-.351 .092-.508 0L1.746 8.181 1.664 8.12C1.492 7.964 1.447 7.704 1.569 7.496c.123-.208 .373-.294 .593-.219l.092 .042 5.246 3.1L12.746 7.319l.092-.042ZM7.306 .789c.144-.061 .311-.051 .448 .03l5.5 3.25c.152 .09 .246 .254 .246 .431 0 .177-.094 .341-.246 .431L7.754 8.181c-.157 .092-.351 .092-.508 0L1.746 4.931C1.594 4.841 1.5 4.677 1.5 4.5c0-.177 .094-.341 .246-.431L7.246 .819 7.306 .789ZM2.982 4.5 7.5 7.169 12.017 4.5 7.5 1.83 2.982 4.5Z"),
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
        return _layers!!
    }

private var _layers: ImageVector? = null
