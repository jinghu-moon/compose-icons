package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Circle: ImageVector
    get() {
        if (_circle != null) return _circle!!
        _circle = tablerFilledIcon(
            name = "Circle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 3.34C10.894 1.092 15.809 1.719 19.014 4.872c3.205 3.153 3.911 8.058 1.726 11.987-2.185 3.929-6.723 5.918-11.093 4.86C5.277 20.662 2.15 16.818 2.005 12.324L2 12l.005-.324C2.117 8.221 4.006 5.068 7 3.34Z"),
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
        return _circle!!
    }

private var _circle: ImageVector? = null
