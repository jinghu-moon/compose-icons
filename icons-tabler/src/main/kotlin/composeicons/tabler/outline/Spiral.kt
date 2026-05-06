package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = tablerOutlineIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 12.057c.137 .296 .349 .552 .614 .743 1.06 .713 2.472 .112 3.043-.919 .839-1.513-.022-3.368-1.525-4.08-2-.95-4.371 .154-5.24 2.086-1.095 2.432 .29 5.248 2.71 6.246 2.931 1.208 6.283-.418 7.438-3.255C18.4 9.535 16.483 5.744 13.144 4.468 9.289 2.994 4.944 5.148 3.508 8.89c-1.63 4.253 .823 9.024 5.082 10.576 4.778 1.74 10.118-.941 11.833-5.59 .336-.902 .531-1.851 .577-2.813"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _spiral!!
    }

private var _spiral: ImageVector? = null
