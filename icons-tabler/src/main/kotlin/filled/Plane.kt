package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Plane: ImageVector
    get() {
        if (_plane != null) return _plane!!
        _plane = tablerFilledIcon(
            name = "Plane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.868 2.504 L 16.580 9.000 L 20.000 9.000 C 21.657 9.000 23.000 10.343 23.000 12.000 C 23.000 13.657 21.657 15.000 20.000 15.000 L 16.580 15.000 L 12.868 21.496 C 12.690 21.808 12.359 22.000 12.000 22.000 L 9.000 22.000 C 8.686 22.000 8.390 21.853 8.201 21.602 C 8.012 21.352 7.952 21.027 8.038 20.725 L 9.674 15.000 L 7.414 15.000 L 5.707 16.707 C 5.520 16.895 5.265 17.000 5.000 17.000 L 2.000 17.000 C 1.654 17.000 1.332 16.820 1.150 16.526 C 0.968 16.231 0.951 15.863 1.106 15.553 L 2.882 12.000 L 1.106 8.447 C 0.951 8.137 0.968 7.769 1.150 7.474 C 1.332 7.180 1.654 7.000 2.000 7.000 L 5.000 7.000 C 5.265 7.000 5.520 7.105 5.707 7.293 L 7.414 9.000 L 9.674 9.000 L 8.038 3.275 C 7.952 2.973 8.012 2.648 8.201 2.398 C 8.390 2.147 8.686 2.000 9.000 2.000 L 12.000 2.000 C 12.359 2.000 12.690 2.192 12.868 2.504"),
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
        return _plane!!
    }

private var _plane: ImageVector? = null
