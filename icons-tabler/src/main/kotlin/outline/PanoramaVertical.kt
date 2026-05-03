package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PanoramaVertical: ImageVector
    get() {
        if (_panoramaVertical != null) return _panoramaVertical!!
        _panoramaVertical = tablerOutlineIcon(
            name = "PanoramaVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.463 4.338 C 16.531 9.444 16.531 14.549 18.463 19.655 C 18.575 19.961 18.532 20.303 18.346 20.570 C 18.160 20.838 17.855 20.999 17.529 21.000 L 6.529 21.000 C 5.837 21.000 5.321 20.308 5.567 19.660 C 7.499 14.553 7.499 9.446 5.567 4.339 C 5.321 3.691 5.810 3.000 6.502 3.000 L 17.530 3.000 C 18.223 3.000 18.710 3.691 18.465 4.338 L 18.463 4.338"),
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
        return _panoramaVertical!!
    }

private var _panoramaVertical: ImageVector? = null
