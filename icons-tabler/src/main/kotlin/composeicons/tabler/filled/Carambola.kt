package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Carambola: ImageVector
    get() {
        if (_carambola != null) return _carambola!!
        _carambola = tablerFilledIcon(
            name = "Carambola",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.108 22.085c-1.266-.068-2.924-.859-5.071-2.355l-.04-.027-.037 .027C9.813 21.227 8.156 22.018 6.888 22.086l-.178 .005c-2.747 0-3.097-2.64-1.718-7.244l.054-.178-.1-.075C-1.11 9.956-.1 6.746 7.5 6.528l.202-.005 .115-.326C9.001 2.867 10.243 1.112 11.844 1.005L12 1c1.674 0 2.957 1.76 4.182 5.197l.114 .326 .204 .005c7.6 .218 8.61 3.428 2.553 8.065l-.102 .075 .055 .178c1.35 4.512 1.04 7.137-1.556 7.24l-.163 .003Z"),
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
        return _carambola!!
    }

private var _carambola: ImageVector? = null
