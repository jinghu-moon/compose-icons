package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileDelta: ImageVector
    get() {
        if (_fileDelta != null) return _fileDelta!!
        _fileDelta = tablerFilledIcon(
            name = "FileDelta",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 12.894 10.553 C 12.724 10.215 12.378 10.001 12.000 10.001 C 11.622 10.001 11.276 10.215 11.106 10.553 L 8.106 16.553 C 7.951 16.863 7.968 17.231 8.150 17.526 C 8.332 17.820 8.654 18.000 9.000 18.000 L 15.000 18.000 C 15.346 18.000 15.668 17.820 15.850 17.526 C 16.032 17.231 16.049 16.863 15.894 16.553 ZM 12.000 13.236 L 13.381 16.000 L 10.618 16.000 ZM 14.999 2.999 L 19.000 7.000 L 15.000 7.000 Z"),
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
        return _fileDelta!!
    }

private var _fileDelta: ImageVector? = null
