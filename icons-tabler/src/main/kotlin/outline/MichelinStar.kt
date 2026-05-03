package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MichelinStar: ImageVector
    get() {
        if (_michelinStar != null) return _michelinStar!!
        _michelinStar = tablerOutlineIcon(
            name = "MichelinStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.792 17.063 C 14.792 17.400 14.849 17.681 14.849 17.963 C 14.849 19.763 13.611 21.000 11.867 21.000 C 10.067 21.000 8.887 19.762 8.887 17.794 L 8.887 17.063 C 7.930 17.738 7.311 17.963 6.467 17.963 C 4.949 17.963 3.542 16.500 3.542 14.869 C 3.542 13.688 4.386 12.675 5.624 12.113 L 5.904 12.000 C 4.330 11.213 3.542 10.312 3.542 9.075 C 3.542 7.388 4.836 5.981 6.467 5.981 C 7.142 5.981 7.987 6.319 8.605 6.769 L 8.886 6.881 C 8.886 6.544 8.830 6.262 8.830 6.037 C 8.830 4.237 10.067 3.000 11.810 3.000 C 13.610 3.000 14.791 4.237 14.791 6.206 L 14.791 6.600 L 14.735 6.881 C 15.691 6.206 16.310 5.981 17.154 5.981 C 18.673 5.981 20.079 7.444 20.079 9.075 C 20.079 10.256 19.235 11.269 17.998 11.831 L 17.716 12.000 C 19.291 12.787 20.079 13.688 20.079 14.925 C 20.079 16.613 18.785 18.019 17.154 18.019 C 16.479 18.019 15.579 17.738 15.016 17.231 L 14.791 17.062 L 14.792 17.063"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _michelinStar!!
    }

private var _michelinStar: ImageVector? = null
