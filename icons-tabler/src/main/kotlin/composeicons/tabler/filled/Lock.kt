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
                pathData = parseSvgPathData("M12 2c2.761 0 5 2.239 5 5v3c1.657 0 3 1.343 3 3v6c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-6C4 11.343 5.343 10 7 10v-3C7 4.239 9.239 2 12 2M12 14c-1.047-0-1.917 .806-1.995 1.85L10 16c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2M12 4C10.343 4 9 5.343 9 7v3h6v-3C15 5.343 13.657 4 12 4"),
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
