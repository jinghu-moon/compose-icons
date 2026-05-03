package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rotate: ImageVector
    get() {
        if (_rotate != null) return _rotate!!
        _rotate = tablerOutlineIcon(
            name = "Rotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.950 11.000 C 19.427 7.009 16.019 4.028 11.994 4.040 C 7.968 4.052 4.579 7.053 4.080 11.047 C 3.580 15.042 6.127 18.785 10.025 19.788 C 13.924 20.790 17.960 18.740 19.450 15.000M 19.950 20.000 L 19.950 15.000 L 14.950 15.000"),
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
        return _rotate!!
    }

private var _rotate: ImageVector? = null
