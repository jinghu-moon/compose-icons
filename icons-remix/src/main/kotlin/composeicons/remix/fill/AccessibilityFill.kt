package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AccessibilityFill: ImageVector
    get() {
        if (_accessibilityFill != null) return _accessibilityFill!!
        _accessibilityFill = remixIcon(
            name = "AccessibilityFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22c5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10ZM13.5 7c0 .828-.672 1.5-1.5 1.5C11.172 8.5 10.5 7.828 10.5 7c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5ZM6.629 10.429 7.371 8.571c1.45 .572 3.072 .929 4.629 .929 1.559 0 3.173-.361 4.626-.928 .003-.001 .758 1.851 .733 1.861-1.077 .42-2.218 .714-3.359 .897 0 .87-.085 1.764 .317 2.567l1.578 3.155-1.789 .894L12.553 14.842c-.105-.209-.319-.342-.553-.342-.234 0-.448 .132-.553 .342L9.894 17.947 8.105 17.053 9.683 13.897c.402-.804 .317-1.697 .317-2.567C8.857 11.147 7.705 10.858 6.629 10.429Z"),
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
        return _accessibilityFill!!
    }

private var _accessibilityFill: ImageVector? = null
