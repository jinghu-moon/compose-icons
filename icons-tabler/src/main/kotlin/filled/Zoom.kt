package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Zoom: ImageVector
    get() {
        if (_zoom != null) return _zoom!!
        _zoom = tablerFilledIcon(
            name = "Zoom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 3.072 C 15.925 4.184 17.301 6.047 17.798 8.214 C 18.294 10.381 17.866 12.657 16.617 14.496 L 21.561 19.439 C 22.133 20.003 22.160 20.916 21.622 21.512 C 21.084 22.108 20.172 22.175 19.553 21.664 L 19.439 21.561 L 14.496 16.617 C 12.088 18.253 8.980 18.451 6.383 17.135 C 3.787 15.818 2.110 13.195 2.006 10.285 L 2.000 10.000 L 2.005 9.715 C 2.105 6.910 3.668 4.362 6.124 3.002 C 8.580 1.642 11.569 1.668 14.000 3.072 Z"),
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
        return _zoom!!
    }

private var _zoom: ImageVector? = null
