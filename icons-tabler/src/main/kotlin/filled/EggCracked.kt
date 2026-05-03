package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EggCracked: ImageVector
    get() {
        if (_eggCracked != null) return _eggCracked!!
        _eggCracked = tablerFilledIcon(
            name = "EggCracked",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.236 2.066 L 9.542 7.713 L 9.513 7.836 C 9.450 8.213 9.608 8.592 9.919 8.814 L 12.683 10.788 L 11.132 13.504 C 10.945 13.815 10.940 14.203 11.121 14.518 C 11.301 14.832 11.638 15.025 12.001 15.020 C 12.363 15.016 12.695 14.815 12.868 14.496 L 14.868 10.996 L 14.920 10.891 C 15.103 10.460 14.963 9.959 14.581 9.686 L 11.663 7.601 L 13.286 2.191 C 16.927 3.265 20.000 8.688 20.000 14.083 C 20.000 18.673 16.727 21.793 12.000 22.000 C 7.250 22.000 4.000 18.790 4.000 14.083 C 4.000 8.429 7.372 2.739 11.236 2.066"),
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
        return _eggCracked!!
    }

private var _eggCracked: ImageVector? = null
