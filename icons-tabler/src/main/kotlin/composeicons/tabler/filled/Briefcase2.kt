package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Briefcase2: ImageVector
    get() {
        if (_briefcase2 != null) return _briefcase2!!
        _briefcase2 = tablerFilledIcon(
            name = "Briefcase2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 2c1.657 0 3 1.343 3 3v1h2c1.657 0 3 1.343 3 3v9c0 1.657-1.343 3-3 3h-14C3.343 21 2 19.657 2 18v-9C2 7.343 3.343 6 5 6h2v-1C7 3.343 8.343 2 10 2ZM14 4h-4C9.448 4 9 4.448 9 5v1h6v-1C15 4.448 14.552 4 14 4"),
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
        return _briefcase2!!
    }

private var _briefcase2: ImageVector? = null
