package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Shirt: ImageVector
    get() {
        if (_shirt != null) return _shirt!!
        _shirt = tablerFilledIcon(
            name = "Shirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.883 3.007 L 14.978 3.000 L 15.090 3.004 L 15.203 3.021 L 15.316 3.051 L 21.316 5.051 C 21.684 5.174 21.948 5.498 21.993 5.884 L 22.000 6.000 L 22.000 11.000 C 22.000 11.507 21.620 11.934 21.117 11.993 L 21.000 12.000 L 19.000 12.000 L 19.000 19.000 C 19.000 20.047 18.194 20.917 17.150 20.995 L 17.000 21.000 L 7.000 21.000 C 5.953 21.000 5.083 20.194 5.005 19.150 L 5.000 19.000 L 5.000 12.000 L 3.000 12.000 C 2.493 12.000 2.066 11.620 2.007 11.117 L 2.000 11.000 L 2.000 6.000 C 2.000 5.612 2.224 5.259 2.576 5.094 L 2.684 5.051 L 8.684 3.051 C 8.989 2.949 9.324 3.001 9.585 3.189 C 9.846 3.377 10.000 3.679 10.000 4.000 C 9.995 5.079 10.847 5.967 11.925 6.008 C 13.003 6.048 13.919 5.226 13.995 4.150 L 14.004 3.910 L 14.021 3.797 L 14.058 3.663 L 14.102 3.560 L 14.152 3.468 L 14.220 3.375 L 14.289 3.295 C 14.345 3.241 14.402 3.195 14.464 3.155 L 14.560 3.102 L 14.663 3.058 L 14.771 3.026 L 14.883 3.006 Z"),
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
        return _shirt!!
    }

private var _shirt: ImageVector? = null
