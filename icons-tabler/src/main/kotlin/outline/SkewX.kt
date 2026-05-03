package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SkewX: ImageVector
    get() {
        if (_skewX != null) return _skewX!!
        _skewX = tablerOutlineIcon(
            name = "SkewX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 5.205 L 4.000 18.795 C 4.000 19.092 4.132 19.374 4.361 19.564 C 4.590 19.754 4.892 19.833 5.184 19.778 L 19.184 17.153 C 19.657 17.064 20.000 16.651 20.000 16.170 L 20.000 7.830 C 20.000 7.349 19.657 6.936 19.184 6.847 L 5.184 4.222 C 4.892 4.167 4.590 4.246 4.361 4.436 C 4.132 4.626 4.000 4.908 4.000 5.205"),
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
        return _skewX!!
    }

private var _skewX: ImageVector? = null
