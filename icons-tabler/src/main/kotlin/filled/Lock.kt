package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lock: ImageVector
    get() {
        if (_lock != null) return _lock!!
        _lock = tablerFilledIcon(
            name = "Lock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 14.761 2.000 17.000 4.239 17.000 7.000 L 17.000 10.000 C 18.657 10.000 20.000 11.343 20.000 13.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 13.000 C 4.000 11.343 5.343 10.000 7.000 10.000 L 7.000 7.000 C 7.000 4.239 9.239 2.000 12.000 2.000M 12.000 14.000 C 10.953 14.000 10.083 14.806 10.005 15.850 L 10.000 16.000 C 10.000 17.105 10.895 18.000 12.000 18.000 C 13.105 18.000 14.000 17.105 14.000 16.000 C 14.000 14.895 13.105 14.000 12.000 14.000M 12.000 4.000 C 10.343 4.000 9.000 5.343 9.000 7.000 L 9.000 10.000 L 15.000 10.000 L 15.000 7.000 C 15.000 5.343 13.657 4.000 12.000 4.000"),
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
        return _lock!!
    }

private var _lock: ImageVector? = null
