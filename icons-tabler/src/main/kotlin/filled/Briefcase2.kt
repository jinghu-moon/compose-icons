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
                pathData = parseSvgPathData("M 14.000 2.000 C 15.657 2.000 17.000 3.343 17.000 5.000 L 17.000 6.000 L 19.000 6.000 C 20.657 6.000 22.000 7.343 22.000 9.000 L 22.000 18.000 C 22.000 19.657 20.657 21.000 19.000 21.000 L 5.000 21.000 C 3.343 21.000 2.000 19.657 2.000 18.000 L 2.000 9.000 C 2.000 7.343 3.343 6.000 5.000 6.000 L 7.000 6.000 L 7.000 5.000 C 7.000 3.343 8.343 2.000 10.000 2.000 ZM 14.000 4.000 L 10.000 4.000 C 9.448 4.000 9.000 4.448 9.000 5.000 L 9.000 6.000 L 15.000 6.000 L 15.000 5.000 C 15.000 4.448 14.552 4.000 14.000 4.000"),
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
