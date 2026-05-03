package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour10: ImageVector
    get() {
        if (_clockHour10 != null) return _clockHour10!!
        _clockHour10 = tablerFilledIcon(
            name = "ClockHour10",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 11.599 12.916 L 11.651 12.937 L 11.731 12.963 L 11.811 12.982 L 11.883 12.993 L 12.000 13.000 L 12.076 12.997 L 12.211 12.977 L 12.293 12.957 L 12.396 12.918 L 12.469 12.883 L 12.547 12.837 L 12.607 12.795 L 12.687 12.726 L 12.770 12.638 L 12.832 12.555 L 12.885 12.465 L 12.916 12.401 L 12.948 12.320 L 12.978 12.211 L 12.993 12.117 L 13.000 12.000 L 13.000 7.000 C 13.000 6.448 12.552 6.000 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000 L 11.000 10.131 L 9.555 9.168 C 9.133 8.886 8.567 8.965 8.238 9.352 L 8.168 9.445 C 8.021 9.666 7.967 9.936 8.019 10.196 C 8.071 10.456 8.224 10.685 8.445 10.832 L 11.483 12.856 Z"),
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
        return _clockHour10!!
    }

private var _clockHour10: ImageVector? = null
