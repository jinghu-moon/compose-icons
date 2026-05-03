package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Weight: ImageVector
    get() {
        if (_weight != null) return _weight!!
        _weight = tablerOutlineIcon(
            name = "Weight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 6.000 C 9.000 7.657 10.343 9.000 12.000 9.000 C 13.657 9.000 15.000 7.657 15.000 6.000 C 15.000 4.343 13.657 3.000 12.000 3.000 C 10.343 3.000 9.000 4.343 9.000 6.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 6.835 9.000 L 17.165 9.000 C 17.648 9.000 18.062 9.346 18.149 9.821 L 19.786 18.821 C 19.839 19.113 19.760 19.413 19.570 19.641 C 19.380 19.868 19.099 20.000 18.802 20.000 L 5.198 20.000 C 4.901 20.000 4.620 19.868 4.430 19.641 C 4.240 19.413 4.161 19.113 4.214 18.821 L 5.851 9.821 C 5.938 9.346 6.352 9.000 6.835 9.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _weight!!
    }

private var _weight: ImageVector? = null
