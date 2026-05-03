package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pennant: ImageVector
    get() {
        if (_pennant != null) return _pennant!!
        _pennant = tablerFilledIcon(
            name = "Pennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 2.000 C 10.507 2.000 10.934 2.380 10.993 2.883 L 11.000 3.000 L 11.000 3.350 L 19.406 7.086 C 20.158 7.421 20.196 8.451 19.519 8.856 L 19.406 8.914 L 11.000 12.649 L 11.000 20.000 L 12.000 20.000 C 12.529 20.001 12.966 20.413 12.997 20.941 C 13.028 21.470 12.642 21.931 12.117 21.993 L 12.000 22.000 L 8.000 22.000 C 7.471 21.999 7.034 21.587 7.003 21.059 C 6.972 20.530 7.358 20.069 7.883 20.007 L 8.000 20.000 L 9.000 20.000 L 9.000 3.000 C 9.000 2.448 9.448 2.000 10.000 2.000 Z"),
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
        return _pennant!!
    }

private var _pennant: ImageVector? = null
