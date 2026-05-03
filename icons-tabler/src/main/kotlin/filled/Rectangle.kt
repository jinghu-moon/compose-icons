package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Rectangle: ImageVector
    get() {
        if (_rectangle != null) return _rectangle!!
        _rectangle = tablerFilledIcon(
            name = "Rectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 4.000 L 5.000 4.000 C 3.343 4.000 2.000 5.343 2.000 7.000 L 2.000 17.000 C 2.000 18.657 3.343 20.000 5.000 20.000 L 19.000 20.000 C 20.657 20.000 22.000 18.657 22.000 17.000 L 22.000 7.000 C 22.000 5.343 20.657 4.000 19.000 4.000 Z"),
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
        return _rectangle!!
    }

private var _rectangle: ImageVector? = null
