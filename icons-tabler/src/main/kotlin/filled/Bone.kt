package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = tablerFilledIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 2.000 C 16.836 2.000 18.436 3.249 18.881 5.030 L 18.897 5.102 L 18.977 5.121 C 20.314 5.458 21.383 6.459 21.807 7.771 L 21.864 7.964 C 22.282 9.523 21.722 11.182 20.444 12.168 C 19.165 13.154 17.419 13.275 16.017 12.474 L 15.970 12.445 L 12.445 15.970 L 12.487 16.040 C 13.127 17.179 13.171 18.559 12.604 19.736 L 12.502 19.933 C 11.642 21.493 9.853 22.296 8.116 21.902 C 6.656 21.570 5.504 20.449 5.134 18.998 L 5.111 18.903 L 4.973 18.870 C 3.607 18.506 2.535 17.448 2.153 16.087 L 2.103 15.888 C 1.754 14.345 2.346 12.742 3.615 11.797 C 4.884 10.852 6.590 10.743 7.968 11.520 L 8.036 11.560 L 11.560 8.036 L 11.524 7.975 C 10.955 6.970 10.849 5.769 11.231 4.680 L 11.310 4.475 C 11.929 2.980 13.387 2.005 15.005 2.005 L 14.866 2.009 L 14.886 2.006 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bone!!
    }

private var _bone: ImageVector? = null
