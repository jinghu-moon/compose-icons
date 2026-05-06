package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = tablerFilledIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.364 4.636c3.435 3.434 3.525 8.975 .203 12.519l-.203 .21-4.243 4.242c-1.117 1.116-2.909 1.176-4.097 .135l-.144-.135L5.636 17.364C2.121 13.849 2.121 8.151 5.636 4.636c3.515-3.515 9.213-3.515 12.728 0ZM12 8C10.343 8 9 9.343 9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8"),
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
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
