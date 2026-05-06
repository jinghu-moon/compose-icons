package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = tablerFilledIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 18c0 1.589-1.238 2.902-2.824 2.995L18 21h-1c-1.589 0-2.902-1.238-2.995-2.824L14 18v-3c-0-1.589 1.238-2.902 2.824-2.995L17 12h1c.351 0 .688 .06 1 .171v-.171C19.002 8.179 15.94 5.063 12.12 4.998 8.3 4.932 5.133 7.942 5.004 11.76L5 12v.17c.25-.088 .516-.144 .791-.163L6 12h1c1.589-0 2.902 1.238 2.995 2.824L10 15v3c0 1.589-1.238 2.902-2.824 2.995L7 21h-1C4.411 21 3.098 19.762 3.005 18.176L3 18v-6C3.002 7.082 6.95 3.077 11.867 3.004c4.917-.072 8.982 3.815 9.129 8.731L21 12v6Z"),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
