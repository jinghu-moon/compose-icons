package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AspectRatio: ImageVector
    get() {
        if (_aspectRatio != null) return _aspectRatio!!
        _aspectRatio = tablerFilledIcon(
            name = "AspectRatio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 4.000 L 5.000 4.000 C 3.343 4.000 2.000 5.343 2.000 7.000 L 2.000 17.000 C 2.000 18.657 3.343 20.000 5.000 20.000 L 19.000 20.000 C 20.657 20.000 22.000 18.657 22.000 17.000 L 22.000 7.000 C 22.000 5.343 20.657 4.000 19.000 4.000 ZM 9.000 7.000 C 9.529 7.001 9.966 7.413 9.997 7.941 C 10.028 8.470 9.642 8.931 9.117 8.993 L 9.000 9.000 L 7.000 9.000 L 7.000 11.000 C 7.000 11.507 6.620 11.934 6.117 11.993 L 6.000 12.000 C 5.493 12.000 5.066 11.620 5.007 11.117 L 5.000 11.000 L 5.000 8.000 C 5.000 7.493 5.380 7.066 5.883 7.007 L 6.000 7.000 L 9.000 7.000 ZM 18.000 12.000 C 18.507 12.000 18.934 12.380 18.993 12.883 L 19.000 13.000 L 19.000 16.000 C 19.000 16.507 18.620 16.934 18.117 16.993 L 18.000 17.000 L 15.000 17.000 C 14.471 16.999 14.034 16.587 14.003 16.059 C 13.972 15.530 14.358 15.069 14.883 15.007 L 15.000 15.000 L 17.000 15.000 L 17.000 13.000 C 17.000 12.493 17.380 12.066 17.883 12.007 L 18.000 12.000 Z"),
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
        return _aspectRatio!!
    }

private var _aspectRatio: ImageVector? = null
