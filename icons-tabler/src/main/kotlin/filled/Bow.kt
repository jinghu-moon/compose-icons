package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bow: ImageVector
    get() {
        if (_bow != null) return _bow!!
        _bow = tablerFilledIcon(
            name = "Bow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 2.000 L 21.081 2.003 L 21.201 2.020 L 21.312 2.050 L 21.423 2.094 L 21.521 2.146 L 21.617 2.213 L 21.707 2.293 Q 21.761 2.346 21.804 2.405 L 21.875 2.515 L 21.906 2.577 L 21.940 2.658 L 21.964 2.734 L 21.994 2.882 L 22.000 3.000 L 22.000 7.000 C 22.000 7.552 21.552 8.000 21.000 8.000 C 20.448 8.000 20.000 7.552 20.000 7.000 L 20.000 5.414 L 17.930 7.484 C 19.231 9.108 20.000 11.190 20.000 13.500 C 20.000 16.203 18.953 18.962 17.207 20.707 C 16.816 21.097 16.184 21.097 15.793 20.707 L 10.250 15.165 L 7.000 18.414 L 7.000 21.000 C 7.000 21.552 6.552 22.000 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 19.000 L 3.000 19.000 C 2.493 19.000 2.066 18.620 2.007 18.117 L 2.000 18.000 C 2.000 17.448 2.448 17.000 3.000 17.000 L 5.584 17.000 L 8.835 13.750 L 3.293 8.207 C 2.903 7.817 2.903 7.186 3.291 6.795 C 5.036 5.040 7.780 4.000 10.500 4.000 C 12.810 4.000 14.893 4.768 16.515 6.070 L 18.584 4.000 L 17.000 4.000 C 16.493 4.000 16.066 3.620 16.007 3.117 L 16.000 3.000 C 16.000 2.448 16.448 2.000 17.000 2.000 ZM 16.505 8.910 L 12.415 13.000 L 17.010 17.594 C 17.610 16.416 17.946 15.121 17.995 13.799 L 18.000 13.500 C 18.000 11.746 17.450 10.164 16.505 8.910M 10.500 6.000 C 9.060 6.000 7.610 6.360 6.402 6.987 L 11.000 11.585 L 15.090 7.495 C 13.836 6.550 12.254 6.000 10.500 6.000"),
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
        return _bow!!
    }

private var _bow: ImageVector? = null
