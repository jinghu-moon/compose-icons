package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Registered: ImageVector
    get() {
        if (_registered != null) return _registered!!
        _registered = tablerFilledIcon(
            name = "Registered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 12.000 8.000 L 10.000 8.000 C 9.448 8.000 9.000 8.448 9.000 9.000 L 9.000 15.000 C 9.000 15.552 9.448 16.000 10.000 16.000 L 10.117 15.993 C 10.620 15.934 11.000 15.507 11.000 15.000 L 11.000 14.000 L 11.585 14.000 L 13.293 15.707 C 13.685 16.086 14.309 16.081 14.695 15.695 C 15.081 15.309 15.086 14.685 14.707 14.293 L 13.807 13.394 C 14.836 12.617 15.253 11.270 14.844 10.047 C 14.434 8.825 13.289 8.000 12.000 8.000M 12.000 10.000 C 12.552 10.000 13.000 10.448 13.000 11.000 C 13.000 11.552 12.552 12.000 12.000 12.000 L 11.000 12.000 L 11.000 10.000 Z"),
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
        return _registered!!
    }

private var _registered: ImageVector? = null
