package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.JewishStar: ImageVector
    get() {
        if (_jewishStar != null) return _jewishStar!!
        _jewishStar = tablerFilledIcon(
            name = "JewishStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.433 6.000 L 3.000 6.000 L 2.886 6.006 C 2.548 6.045 2.254 6.253 2.103 6.557 C 1.953 6.862 1.968 7.223 2.143 7.514 L 4.833 12.000 L 2.143 16.486 L 2.089 16.586 C 1.948 16.896 1.974 17.256 2.159 17.542 C 2.343 17.828 2.660 18.000 3.000 18.000 L 8.434 18.000 L 11.143 22.514 L 11.217 22.622 C 11.421 22.879 11.738 23.019 12.065 22.997 C 12.392 22.976 12.688 22.795 12.857 22.514 L 15.565 18.000 L 21.000 18.000 L 21.114 17.994 C 21.452 17.955 21.746 17.747 21.897 17.443 C 22.047 17.138 22.032 16.777 21.857 16.486 L 19.166 12.000 L 21.857 7.514 L 21.911 7.414 C 22.052 7.104 22.026 6.744 21.841 6.458 C 21.657 6.172 21.340 6.000 21.000 6.000 L 15.566 6.000 L 12.857 1.486 C 12.676 1.185 12.351 1.001 12.000 1.001 C 11.649 1.001 11.324 1.185 11.143 1.486 L 8.433 6.000 Z"),
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
        return _jewishStar!!
    }

private var _jewishStar: ImageVector? = null
