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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 9.000 L 21.000 13.000 C 21.000 17.971 16.971 22.000 12.000 22.000 C 7.029 22.000 3.000 17.971 3.000 13.000 L 3.000 9.000 L 10.000 9.000 L 10.000 13.000 C 10.000 14.105 10.895 15.000 12.000 15.000 C 13.105 15.000 14.000 14.105 14.000 13.000 L 14.000 9.000 ZM 18.000 2.000 C 19.657 2.000 21.000 3.343 21.000 5.000 L 21.000 7.000 L 14.000 7.000 L 14.000 5.000 C 14.000 3.343 15.343 2.000 17.000 2.000 ZM 7.000 2.000 C 8.657 2.000 10.000 3.343 10.000 5.000 L 10.000 7.000 L 3.000 7.000 L 3.000 5.000 C 3.000 3.343 4.343 2.000 6.000 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _magnet!!
    }

private var _magnet: ImageVector? = null
