package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mushroom: ImageVector
    get() {
        if (_mushroom != null) return _mushroom!!
        _mushroom = tablerFilledIcon(
            name = "Mushroom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 15.000 L 15.000 19.000 C 15.002 20.624 13.711 21.954 12.088 22.002 C 10.465 22.049 9.099 20.797 9.005 19.176 L 9.000 19.000 L 9.000 15.000 L 15.000 15.000 ZM 4.900 13.000 C 3.908 13.000 3.083 12.237 3.006 11.248 L 3.000 11.100 C 3.000 6.077 7.027 2.000 12.000 2.000 C 16.973 2.000 21.000 6.077 21.000 11.100 C 21.000 12.092 20.237 12.917 19.248 12.994 L 19.100 13.000 L 4.900 13.000 Z"),
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
        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
