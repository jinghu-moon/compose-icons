package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.XboxY: ImageVector
    get() {
        if (_xboxY != null) return _xboxY!!
        _xboxY = tablerFilledIcon(
            name = "XboxY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M15.6 7.2c-.442-.331-1.069-.242-1.4 .2L12 10.333 9.8 7.4C9.469 6.958 8.842 6.869 8.4 7.2c-.442 .331-.531 .958-.2 1.4l2.81 3.748L11 15.997c-.001 .265 .104 .52 .291 .708 .187 .188 .441 .294 .706 .295l.117-.006c.504-.058 .885-.484 .886-.991l.01-3.683L15.8 8.6c.331-.442 .242-1.069-.2-1.4"),
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
        return _xboxY!!
    }

private var _xboxY: ImageVector? = null
