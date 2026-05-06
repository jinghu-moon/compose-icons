package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = tablerFilledIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.172 2c.796 0 1.559 .316 2.121 .879l7.71 7.71c1.331 1.332 1.331 3.49 0 4.822l-5.592 5.592c-1.332 1.331-3.49 1.331-4.822 0L2.879 13.293C2.316 12.731 2 11.968 2 11.172v-5.172C2 3.791 3.791 2 6 2ZM7.5 5.5C6.453 5.5 5.583 6.306 5.505 7.35l-.005 .15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2"),
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
        return _tag!!
    }

private var _tag: ImageVector? = null
