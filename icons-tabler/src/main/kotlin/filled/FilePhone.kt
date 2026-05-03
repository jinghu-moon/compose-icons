package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FilePhone: ImageVector
    get() {
        if (_filePhone != null) return _filePhone!!
        _filePhone = tablerFilledIcon(
            name = "FilePhone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 9.500 9.500 C 8.672 9.500 8.000 10.172 8.000 11.000 L 8.000 12.000 C 8.000 15.314 10.686 18.000 14.000 18.000 L 15.000 18.000 C 15.828 18.000 16.500 17.328 16.500 16.500 C 16.500 15.672 15.828 15.000 15.000 15.000 L 14.000 15.000 L 13.856 15.007 C 13.392 15.052 12.975 15.309 12.728 15.704 L 12.686 15.778 L 12.664 15.771 C 11.527 15.367 10.633 14.473 10.229 13.336 L 10.221 13.313 L 10.296 13.272 C 10.734 12.998 11.000 12.517 11.000 12.000 L 11.000 11.000 C 11.000 10.172 10.328 9.500 9.500 9.500M 14.999 2.999 L 19.000 7.000 L 15.000 7.000 Z"),
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
        return _filePhone!!
    }

private var _filePhone: ImageVector? = null
