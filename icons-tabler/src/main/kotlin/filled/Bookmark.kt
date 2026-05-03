package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bookmark: ImageVector
    get() {
        if (_bookmark != null) return _bookmark!!
        _bookmark = tablerFilledIcon(
            name = "Bookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 2.000 C 16.761 2.000 19.000 4.239 19.000 7.000 L 19.000 21.000 C 19.000 21.369 18.797 21.708 18.472 21.882 C 18.147 22.056 17.752 22.037 17.445 21.832 L 12.000 18.202 L 6.556 21.832 C 6.266 22.026 5.895 22.055 5.579 21.908 C 5.262 21.761 5.045 21.459 5.006 21.112 L 5.000 21.000 L 5.000 7.000 C 5.000 4.239 7.239 2.000 10.000 2.000 L 14.000 2.000 Z"),
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
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
