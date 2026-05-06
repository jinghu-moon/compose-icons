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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 15v4c.002 1.624-1.289 2.954-2.912 3.002C10.465 22.049 9.099 20.797 9.005 19.176L9 19v-4h6ZM4.9 13C3.908 13 3.083 12.237 3.006 11.248L3 11.1C3 6.077 7.027 2 12 2c4.973 0 9 4.077 9 9.1-0 .992-.763 1.817-1.752 1.894L19.1 13h-14.2Z"),
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
        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
