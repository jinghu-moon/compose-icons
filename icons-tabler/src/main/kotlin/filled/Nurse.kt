package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Nurse: ImageVector
    get() {
        if (_nurse != null) return _nurse!!
        _nurse = tablerFilledIcon(
            name = "Nurse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.002 4.000 C 14.868 4.000 18.702 5.365 21.534 7.155 C 21.879 7.373 22.057 7.778 21.984 8.179 L 19.984 19.179 C 19.897 19.654 19.483 20.000 19.000 20.000 L 5.000 20.000 C 4.517 20.000 4.103 19.654 4.016 19.179 L 2.016 8.179 C 1.943 7.778 2.121 7.373 2.466 7.155 C 5.300 5.363 9.190 3.995 12.002 4.000M 12.000 9.000 C 11.448 9.000 11.000 9.448 11.000 10.000 L 11.000 11.000 L 10.000 11.000 C 9.493 11.000 9.066 11.380 9.007 11.883 L 9.000 12.000 C 9.000 12.552 9.448 13.000 10.000 13.000 L 11.000 13.000 L 11.000 14.000 C 11.000 14.507 11.380 14.934 11.883 14.993 L 12.000 15.000 C 12.552 15.000 13.000 14.552 13.000 14.000 L 13.000 13.000 L 14.000 13.000 C 14.507 13.000 14.934 12.620 14.993 12.117 L 15.000 12.000 C 15.000 11.448 14.552 11.000 14.000 11.000 L 13.000 11.000 L 13.000 10.000 C 13.000 9.493 12.620 9.066 12.117 9.007 Z"),
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
        return _nurse!!
    }

private var _nurse: ImageVector? = null
