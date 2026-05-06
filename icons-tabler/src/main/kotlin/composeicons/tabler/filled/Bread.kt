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
                pathData = parseSvgPathData("M18 3c1.541 0 2.946 .886 3.609 2.277 .664 1.391 .469 3.04-.5 4.239l-.11 .126L21 18c0 1.589-1.238 2.902-2.824 2.995L18 21h-12C4.343 21 3 19.657 3 18v-8.356L2.884 9.508C2.067 8.493 1.795 7.144 2.156 5.892l.067-.21C2.755 4.157 4.153 3.102 5.824 3.005l12.079 .001Z"),
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
