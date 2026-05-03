package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FilePower: ImageVector
    get() {
        if (_filePower != null) return _filePower!!
        _filePower = tablerFilledIcon(
            name = "FilePower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 12.555 11.168 C 12.334 11.021 12.064 10.967 11.804 11.019 C 11.544 11.071 11.315 11.224 11.168 11.445 L 9.168 14.445 L 9.111 14.542 C 8.951 14.852 8.965 15.223 9.146 15.521 C 9.328 15.818 9.651 16.000 10.000 16.000 L 12.130 16.000 L 11.168 17.445 C 10.861 17.905 10.985 18.525 11.445 18.832 C 11.905 19.139 12.525 19.015 12.832 18.555 L 14.832 15.555 L 14.889 15.458 C 15.049 15.148 15.035 14.777 14.854 14.479 C 14.672 14.182 14.349 14.000 14.000 14.000 L 11.868 14.000 L 12.832 12.555 C 12.979 12.334 13.033 12.064 12.981 11.804 C 12.929 11.544 12.776 11.315 12.555 11.168"),
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
        pathData = parseSvgPathData("M 19.000 7.000 L 15.000 7.000 L 14.999 2.999 Z"),
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
        return _filePower!!
    }

private var _filePower: ImageVector? = null
