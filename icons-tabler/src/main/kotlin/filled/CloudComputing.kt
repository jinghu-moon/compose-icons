package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CloudComputing: ImageVector
    get() {
        if (_cloudComputing != null) return _cloudComputing!!
        _cloudComputing = tablerFilledIcon(
            name = "CloudComputing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 20.000 C 9.000 21.105 8.105 22.000 7.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 C 2.000 20.448 2.448 20.000 3.000 20.000 L 7.000 20.000 L 7.000 17.003 L 6.657 17.004 C 6.618 17.004 6.579 17.002 6.540 16.997 L 6.435 16.996 C 3.495 16.886 1.118 14.597 1.005 11.733 L 1.000 11.517 C 1.000 8.770 3.080 6.507 5.784 6.100 L 5.898 6.084 L 5.968 5.903 C 6.631 4.283 8.024 2.997 9.797 2.385 L 10.041 2.305 C 12.235 1.638 14.655 2.081 16.401 3.481 C 17.786 4.589 18.588 6.167 18.651 7.821 L 18.655 8.033 L 18.746 8.036 C 21.046 8.143 22.889 9.997 22.996 12.306 L 23.000 12.517 C 23.000 14.995 21.003 17.004 18.535 17.004 L 17.000 17.004 L 17.000 20.000 L 21.000 20.000 C 21.552 20.000 22.000 20.448 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 17.000 22.000 C 15.895 22.000 15.000 21.105 15.000 20.000 L 15.000 17.003 L 13.000 17.003 L 13.000 21.000 C 13.000 21.552 12.552 22.000 12.000 22.000 C 11.448 22.000 11.000 21.552 11.000 21.000 L 11.000 17.003 L 9.000 17.003 Z"),
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
        return _cloudComputing!!
    }

private var _cloudComputing: ImageVector? = null
