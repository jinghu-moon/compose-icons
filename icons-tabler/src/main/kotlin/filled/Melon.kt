package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Melon: ImageVector
    get() {
        if (_melon != null) return _melon!!
        _melon = tablerFilledIcon(
            name = "Melon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.770 2.620 C 16.966 2.433 17.229 2.333 17.500 2.343 C 17.770 2.354 18.025 2.473 18.206 2.675 C 20.009 4.689 21.004 7.298 21.000 10.001 C 21.000 16.075 16.075 21.000 10.001 21.000 C 7.129 21.004 4.370 19.881 2.317 17.873 C 2.123 17.684 2.014 17.423 2.016 17.152 C 2.018 16.881 2.129 16.622 2.325 16.435 L 6.668 12.282 C 7.043 11.923 7.631 11.912 8.020 12.255 C 9.189 13.286 10.953 13.251 12.079 12.173 C 13.205 11.096 13.319 9.335 12.340 8.122 C 12.014 7.717 12.053 7.131 12.428 6.772 Z"),
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
        return _melon!!
    }

private var _melon: ImageVector? = null
