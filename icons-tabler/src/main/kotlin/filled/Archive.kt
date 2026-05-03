package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = tablerFilledIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 5.000 C 2.000 3.895 2.895 3.000 4.000 3.000 L 20.000 3.000 C 21.105 3.000 22.000 3.895 22.000 5.000 C 22.000 6.105 21.105 7.000 20.000 7.000 L 4.000 7.000 C 2.895 7.000 2.000 6.105 2.000 5.000 Z"),
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
        pathData = parseSvgPathData("M 19.000 9.000 C 19.513 9.000 19.936 9.463 19.993 10.060 L 20.000 10.200 L 20.000 17.400 C 20.000 19.317 18.751 20.884 17.176 20.994 L 17.000 21.000 L 7.000 21.000 C 5.402 21.000 4.096 19.501 4.005 17.612 L 4.000 17.400 L 4.000 10.200 C 4.000 9.537 4.448 9.000 5.000 9.000 L 19.000 9.000 ZM 14.000 11.000 L 10.000 11.000 L 9.883 11.007 C 9.380 11.067 9.001 11.493 9.001 12.000 C 9.001 12.507 9.380 12.933 9.883 12.993 L 10.000 13.000 L 14.000 13.000 L 14.117 12.993 C 14.620 12.933 14.999 12.507 14.999 12.000 C 14.999 11.493 14.620 11.067 14.117 11.007 L 14.000 11.000 Z"),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
