package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EaseInOutControlPoints: ImageVector
    get() {
        if (_easeInOutControlPoints != null) return _easeInOutControlPoints!!
        _easeInOutControlPoints = tablerFilledIcon(
            name = "EaseInOutControlPoints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 17.000 C 20.526 17.000 21.808 18.145 21.980 19.661 C 22.152 21.177 21.160 22.581 19.673 22.923 C 18.187 23.266 16.680 22.438 16.171 21.000 L 15.000 21.000 C 14.448 21.000 14.000 20.552 14.000 20.000 C 14.000 19.448 14.448 19.000 15.000 19.000 L 16.170 19.000 C 16.594 17.801 17.728 16.999 19.000 17.000M 5.000 1.000 C 6.306 1.000 7.418 1.835 7.830 3.000 L 9.000 3.000 C 9.552 3.000 10.000 3.448 10.000 4.000 C 10.000 4.552 9.552 5.000 9.000 5.000 L 7.829 5.000 C 7.321 6.439 5.813 7.268 4.326 6.925 C 2.838 6.583 1.845 5.178 2.017 3.662 C 2.190 2.145 3.474 1.000 5.000 1.000M 14.000 3.000 C 14.552 3.000 15.000 3.448 15.000 4.000 C 15.000 4.552 14.552 5.000 14.000 5.000 L 12.000 5.000 C 11.448 5.000 11.000 4.552 11.000 4.000 C 11.000 3.448 11.448 3.000 12.000 3.000 ZM 12.000 19.000 C 12.552 19.000 13.000 19.448 13.000 20.000 C 13.000 20.552 12.552 21.000 12.000 21.000 L 10.000 21.000 C 9.448 21.000 9.000 20.552 9.000 20.000 C 9.000 19.448 9.448 19.000 10.000 19.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 C 22.000 4.552 21.552 5.000 21.000 5.000 C 18.170 5.000 16.400 6.845 12.848 12.530 C 8.901 18.845 6.836 21.000 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 C 2.000 19.448 2.448 19.000 3.000 19.000 C 5.830 19.000 7.600 17.155 11.152 11.470 C 15.099 5.155 17.164 3.000 21.000 3.000"),
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
        return _easeInOutControlPoints!!
    }

private var _easeInOutControlPoints: ImageVector? = null
