package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pig: ImageVector
    get() {
        if (_pig != null) return _pig!!
        _pig = tablerFilledIcon(
            name = "Pig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.999 2.000 C 16.264 2.000 16.519 2.105 16.707 2.293 C 16.895 2.480 17.000 2.735 17.000 3.000 L 17.000 6.255 L 17.026 6.273 C 17.956 6.927 18.712 7.798 19.230 8.810 L 19.322 9.000 L 19.998 9.000 C 21.045 9.000 21.915 9.806 21.993 10.850 L 21.998 11.000 L 21.998 13.000 C 21.998 14.105 21.103 15.000 19.998 15.000 L 19.322 15.000 L 19.218 15.213 C 18.925 15.780 18.556 16.304 18.121 16.771 L 17.998 16.896 L 17.998 18.500 C 17.998 19.817 16.976 20.909 15.662 20.995 L 15.500 21.000 C 14.340 21.000 13.365 20.210 13.082 19.140 L 13.050 18.999 L 9.000 19.000 L 8.950 18.998 L 8.918 19.139 C 8.644 20.178 7.736 20.925 6.664 20.995 L 6.500 21.000 C 5.119 21.000 4.000 19.881 4.000 18.500 L 4.000 16.898 L 3.944 16.843 C 2.140 14.959 1.532 12.229 2.368 9.758 L 2.460 9.502 C 3.496 6.791 6.097 5.000 8.999 5.000 L 11.195 5.000 L 15.445 2.168 C 15.576 2.081 15.725 2.026 15.881 2.007 ZM 15.000 10.000 C 14.493 10.000 14.066 10.380 14.007 10.883 L 14.000 11.010 C 14.001 11.539 14.413 11.976 14.941 12.007 C 15.470 12.038 15.931 11.652 15.993 11.127 L 16.000 11.000 C 16.000 10.448 15.552 10.000 15.000 10.000"),
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
        return _pig!!
    }

private var _pig: ImageVector? = null
