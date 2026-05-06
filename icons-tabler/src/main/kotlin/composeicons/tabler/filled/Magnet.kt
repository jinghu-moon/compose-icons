package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = tablerFilledIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 9v4c0 4.971-4.029 9-9 9C7.029 22 3 17.971 3 13v-4h7v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4ZM18 2c1.657 0 3 1.343 3 3v2h-7v-2C14 3.343 15.343 2 17 2ZM7 2c1.657 0 3 1.343 3 3v2h-7v-2C3 3.343 4.343 2 6 2Z"),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
