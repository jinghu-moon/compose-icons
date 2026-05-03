package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SkewY: ImageVector
    get() {
        if (_skewY != null) return _skewY!!
        _skewY = tablerOutlineIcon(
            name = "SkewY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.326 19.000 L 19.674 19.000 C 19.988 19.000 20.284 18.853 20.473 18.602 C 20.662 18.352 20.722 18.027 20.636 17.725 L 17.207 5.725 C 17.084 5.296 16.692 5.000 16.246 5.000 L 7.754 5.000 C 7.308 5.000 6.916 5.296 6.793 5.725 L 3.364 17.725 C 3.278 18.027 3.338 18.352 3.527 18.602 C 3.716 18.853 4.012 19.000 4.326 19.000"),
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
        return _skewY!!
    }

private var _skewY: ImageVector? = null
