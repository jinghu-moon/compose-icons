package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Hourglass: ImageVector
    get() {
        if (_hourglass != null) return _hourglass!!
        _hourglass = tablerFilledIcon(
            name = "Hourglass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.047-0 1.917 .806 1.995 1.85L19 4v2c.001 2.457-1.287 4.735-3.393 6 2.024 1.215 3.298 3.369 3.388 5.728L19 18v2c0 1.047-.806 1.917-1.85 1.995L17 22h-10C5.953 22 5.083 21.194 5.005 20.15L5 20v-2C4.999 15.543 6.287 13.265 8.393 12 6.369 10.785 5.095 8.631 5.005 6.272L5 6v-2C5 2.953 5.806 2.083 6.85 2.005L7 2h10Z"),
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
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
