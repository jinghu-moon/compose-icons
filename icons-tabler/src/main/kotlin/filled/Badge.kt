package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Badge: ImageVector
    get() {
        if (_badge != null) return _badge!!
        _badge = tablerFilledIcon(
            name = "Badge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.486 3.143 L 12.000 5.833 L 7.514 3.143 C 7.205 2.958 6.821 2.953 6.507 3.131 C 6.194 3.308 6.000 3.640 6.000 4.000 L 6.000 17.000 C 6.000 17.351 6.185 17.676 6.486 17.857 L 11.486 20.857 C 11.802 21.047 12.198 21.047 12.514 20.857 L 17.514 17.857 C 17.815 17.676 18.000 17.351 18.000 17.000 L 18.000 4.000 C 18.000 3.640 17.806 3.308 17.493 3.131 C 17.179 2.953 16.795 2.958 16.486 3.143 Z"),
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
        return _badge!!
    }

private var _badge: ImageVector? = null
