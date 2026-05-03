package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PanoramaVerticalOff: ImageVector
    get() {
        if (_panoramaVerticalOff != null) return _panoramaVerticalOff!!
        _panoramaVerticalOff = tablerOutlineIcon(
            name = "PanoramaVerticalOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 3.000 L 17.530 3.000 C 18.223 3.000 18.710 3.691 18.465 4.338 C 17.367 7.236 16.892 10.133 17.040 13.030M 17.868 17.877 C 18.040 18.469 18.238 19.062 18.463 19.655 C 18.575 19.961 18.532 20.303 18.346 20.570 C 18.160 20.838 17.855 20.999 17.529 21.000 L 6.529 21.000 C 5.837 21.000 5.321 20.308 5.567 19.660 C 7.264 15.174 7.470 10.687 6.186 6.200"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _panoramaVerticalOff!!
    }

private var _panoramaVerticalOff: ImageVector? = null
