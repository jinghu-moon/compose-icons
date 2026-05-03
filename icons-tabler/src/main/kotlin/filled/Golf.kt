package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = tablerFilledIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 3.000 C 11.000 2.644 11.190 2.314 11.498 2.135 C 11.806 1.957 12.187 1.955 12.496 2.132 L 19.496 6.132 C 19.807 6.310 19.999 6.641 19.999 7.000 C 19.999 7.359 19.807 7.690 19.496 7.868 L 13.000 11.580 L 13.000 18.000 C 13.000 18.507 12.620 18.934 12.117 18.993 L 12.000 19.000 C 11.448 19.000 11.000 18.552 11.000 18.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 14.135 17.168 C 14.268 16.939 14.487 16.771 14.743 16.703 C 15.000 16.635 15.273 16.672 15.502 16.805 C 16.418 17.337 17.000 18.096 17.000 19.000 C 17.000 20.840 14.681 22.000 12.000 22.000 C 9.319 22.000 7.000 20.840 7.000 19.000 C 7.000 18.089 7.577 17.340 8.498 16.805 C 8.976 16.528 9.588 16.690 9.865 17.168 C 10.142 17.646 9.980 18.258 9.502 18.535 C 9.137 18.747 9.000 18.925 9.000 19.000 C 9.000 19.086 9.179 19.296 9.622 19.518 C 10.222 19.818 11.078 20.000 12.000 20.000 C 12.922 20.000 13.777 19.818 14.378 19.518 C 14.821 19.296 15.000 19.086 15.000 19.000 C 15.000 18.930 14.858 18.744 14.498 18.535 C 14.269 18.402 14.101 18.183 14.033 17.927 C 13.965 17.670 14.002 17.397 14.135 17.168"),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
