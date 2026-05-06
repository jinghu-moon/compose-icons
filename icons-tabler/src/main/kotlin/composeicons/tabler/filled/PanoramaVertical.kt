package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PanoramaVertical: ImageVector
    get() {
        if (_panoramaVertical != null) return _panoramaVertical!!
        _panoramaVertical = tablerFilledIcon(
            name = "PanoramaVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.53 2c1.39 0 2.364 1.389 1.87 2.692l-.013 .026-.156 .431c-1.623 4.572-1.622 9.123 .003 13.703l.168 .458c.225 .613 .137 1.297-.236 1.833-.373 .536-.984 .856-1.637 .857h-11C5.143 22 4.135 20.614 4.632 19.306 6.477 14.427 6.477 9.572 4.632 4.694 4.137 3.39 5.112 2 6.502 2Z"),
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
        return _panoramaVertical!!
    }

private var _panoramaVertical: ImageVector? = null
