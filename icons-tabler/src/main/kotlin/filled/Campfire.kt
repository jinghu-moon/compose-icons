package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = tablerFilledIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.757 16.030 C 20.270 15.903 20.794 16.197 20.952 16.701 C 21.110 17.206 20.848 17.747 20.354 17.935 L 20.243 17.970 L 4.243 21.970 C 3.730 22.097 3.206 21.803 3.048 21.299 C 2.890 20.794 3.152 20.253 3.646 20.065 L 3.757 20.030 L 19.757 16.030 Z"),
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
        pathData = parseSvgPathData("M 3.030 16.757 C 3.153 16.265 3.625 15.943 4.128 16.008 L 4.243 16.030 L 20.243 20.030 C 20.757 20.158 21.081 20.665 20.983 21.185 C 20.885 21.706 20.398 22.060 19.873 21.992 L 19.757 21.970 L 3.757 17.970 C 3.221 17.836 2.896 17.293 3.030 16.757 Z"),
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
        pathData = parseSvgPathData("M 13.553 2.106 C 9.379 4.192 7.000 7.464 7.000 11.000 C 7.000 13.761 9.239 16.000 12.000 16.000 C 14.761 16.000 17.000 13.761 17.000 11.000 C 17.000 9.953 16.812 9.192 16.394 8.295 L 16.225 7.950 L 15.895 7.303 C 15.274 6.063 15.000 4.965 15.000 3.000 C 15.000 2.654 14.820 2.332 14.526 2.150 C 14.231 1.968 13.863 1.951 13.553 2.106 Z"),
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
        return _campfire!!
    }

private var _campfire: ImageVector? = null
