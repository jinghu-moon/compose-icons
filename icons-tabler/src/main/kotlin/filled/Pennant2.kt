package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pennant2: ImageVector
    get() {
        if (_pennant2 != null) return _pennant2!!
        _pennant2 = tablerFilledIcon(
            name = "Pennant2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 2.000 C 14.507 2.000 14.934 2.380 14.993 2.883 L 15.000 3.000 L 15.000 20.000 L 16.000 20.000 C 16.529 20.001 16.966 20.413 16.997 20.941 C 17.028 21.470 16.642 21.931 16.117 21.993 L 16.000 22.000 L 12.000 22.000 C 11.471 21.999 11.034 21.587 11.003 21.059 C 10.972 20.530 11.358 20.069 11.883 20.007 L 12.000 20.000 L 13.000 20.000 L 13.000 12.649 L 4.594 8.914 C 3.842 8.579 3.804 7.549 4.481 7.144 L 4.594 7.086 L 13.000 3.350 L 13.000 3.000 C 13.000 2.448 13.448 2.000 14.000 2.000 Z"),
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
        return _pennant2!!
    }

private var _pennant2: ImageVector? = null
