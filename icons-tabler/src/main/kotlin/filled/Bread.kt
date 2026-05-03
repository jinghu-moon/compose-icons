package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = tablerFilledIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 3.000 C 19.541 3.000 20.946 3.886 21.609 5.277 C 22.273 6.669 22.079 8.318 21.109 9.516 L 20.999 9.642 L 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 9.644 L 2.884 9.508 C 2.067 8.493 1.795 7.144 2.156 5.892 L 2.223 5.682 C 2.755 4.157 4.153 3.102 5.824 3.005 L 17.903 3.006 Z"),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
