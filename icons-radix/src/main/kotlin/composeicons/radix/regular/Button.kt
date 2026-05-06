package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Button: ImageVector
    get() {
        if (_button != null) return _button!!
        _button = radixIcon(
            name = "Button",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.204 4.011C14.213 4.113 15 4.964 15 6v3l-.011 .204c-.095 .942-.844 1.69-1.785 1.785L13 11h-11l-.204-.011C.854 10.894 .106 10.146 .011 9.204L0 9v-3C0 4.964 .787 4.113 1.796 4.011L2 4h11l.204 .011ZM2 5c-.518 0-.944 .393-.995 .897L1 6v3c0 .552 .448 1 1 1h11c.552 0 1-.448 1-1v-3c0-.518-.393-.944-.898-.995L13 5h-11ZM4.5 6.75c.414 0 .75 .336 .75 .75 0 .414-.336 .75-.75 .75-.414 0-.75-.336-.75-.75 0-.414 .336-.75 .75-.75ZM7.5 6.75c.414 0 .75 .336 .75 .75 0 .414-.336 .75-.75 .75-.414 0-.75-.336-.75-.75 0-.414 .336-.75 .75-.75ZM10.5 6.75c.414 0 .75 .336 .75 .75 0 .414-.336 .75-.75 .75-.414 0-.75-.336-.75-.75 0-.414 .336-.75 .75-.75Z"),
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
        return _button!!
    }

private var _button: ImageVector? = null
