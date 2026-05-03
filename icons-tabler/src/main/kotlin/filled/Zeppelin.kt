package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Zeppelin: ImageVector
    get() {
        if (_zeppelin != null) return _zeppelin!!
        _zeppelin = tablerFilledIcon(
            name = "Zeppelin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.500 3.000 C 18.687 3.000 23.000 6.044 23.000 10.000 C 23.000 13.017 20.492 15.503 17.000 16.514 L 17.000 20.000 C 17.000 20.552 16.552 21.000 16.000 21.000 L 10.000 21.000 C 9.448 21.000 9.000 20.552 9.000 20.000 L 9.000 15.954 C 8.081 15.548 7.192 15.076 6.340 14.543 L 6.210 14.461 L 4.640 15.769 C 4.357 16.005 3.968 16.066 3.627 15.929 C 3.286 15.792 3.047 15.478 3.006 15.113 L 3.000 15.000 L 3.000 12.149 L 2.690 11.899 C 2.461 11.712 2.234 11.522 2.008 11.331 L 1.338 10.749 C 1.123 10.559 1.001 10.286 1.001 10.000 C 1.001 9.714 1.123 9.441 1.338 9.251 C 1.781 8.859 2.231 8.475 2.689 8.100 L 3.000 7.850 L 3.000 5.000 C 3.000 4.632 3.201 4.294 3.525 4.119 C 3.849 3.944 4.243 3.962 4.550 4.164 L 4.640 4.232 L 6.210 5.539 L 6.338 5.459 C 8.842 3.906 11.122 3.081 13.191 3.006 ZM 11.001 16.657 L 11.000 19.000 L 15.000 19.000 L 15.001 16.914 Q 14.266 17.000 13.500 17.000 C 12.783 16.996 12.068 16.911 11.370 16.748 Z"),
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
        return _zeppelin!!
    }

private var _zeppelin: ImageVector? = null
