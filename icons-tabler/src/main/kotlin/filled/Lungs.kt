package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lungs: ImageVector
    get() {
        if (_lungs != null) return _lungs!!
        _lungs = tablerFilledIcon(
            name = "Lungs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 12.552 3.000 13.000 3.448 13.000 4.000 L 13.000 9.000 C 13.000 9.715 13.381 10.375 14.000 10.732 L 14.000 7.257 C 14.000 6.015 14.995 5.000 16.233 5.000 C 16.605 5.000 16.971 5.094 17.355 5.307 L 17.535 5.424 C 19.230 6.654 20.295 8.459 21.308 11.764 Q 21.982 13.968 22.000 16.824 C 22.016 19.019 20.343 20.848 18.157 20.992 L 17.920 21.000 C 15.750 21.000 14.000 19.213 14.000 17.020 L 14.000 12.874 C 13.278 12.687 12.622 12.302 12.107 11.762 L 12.000 11.644 L 11.893 11.762 C 11.378 12.302 10.723 12.687 10.001 12.874 L 10.000 17.020 C 10.000 19.213 8.250 21.000 6.081 21.000 L 5.813 20.990 C 3.658 20.848 1.986 19.019 2.002 16.825 Q 2.020 13.967 2.694 11.765 C 3.705 8.458 4.770 6.653 6.516 5.390 L 6.704 5.273 C 7.030 5.093 7.396 5.000 7.768 5.000 C 9.005 5.000 10.000 6.015 10.000 7.257 L 10.001 10.732 C 10.619 10.374 11.000 9.714 11.000 9.000 L 11.000 4.000 C 11.000 3.448 11.448 3.000 12.000 3.000"),
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
        return _lungs!!
    }

private var _lungs: ImageVector? = null
