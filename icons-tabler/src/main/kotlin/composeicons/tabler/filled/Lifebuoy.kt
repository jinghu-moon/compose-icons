package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = tablerFilledIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.757 16.172l3.571 3.571c-3.683 3.008-8.973 3.008-12.656 0L9.242 16.172c.818 .54 1.777 .828 2.758 .828 1.02 0 1.967-.305 2.757-.828M4.257 5.672 7.828 9.242C7.288 10.06 7 11.019 7 12c0 1.02 .305 1.967 .828 2.757L4.258 18.329C2.798 16.543 2 14.307 2 12l.005-.324C2.076 9.481 2.867 7.371 4.257 5.671M22 12c0 2.343-.82 4.57-2.257 6.328L16.172 14.758c.54-.818 .828-1.777 .828-2.758 0-1.02-.305-1.967-.828-2.757L19.743 5.673C21.202 7.459 22 9.694 22 12M17 3.34q.707 .41 1.33 .918L14.757 7.828C13.939 7.288 12.98 7 12 7c-1.02 0-1.967 .305-2.757 .828L5.67 4.258C8.889 1.627 13.4 1.261 17 3.34"),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
