package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ManualGearbox: ImageVector
    get() {
        if (_manualGearbox != null) return _manualGearbox!!
        _manualGearbox = tablerFilledIcon(
            name = "ManualGearbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 3.000 C 20.462 2.999 21.711 4.052 21.958 5.493 C 22.206 6.933 21.378 8.343 20.000 8.829 L 20.000 10.000 C 20.000 11.657 18.657 13.000 17.000 13.000 L 13.000 13.000 L 13.000 15.171 C 14.439 15.679 15.268 17.187 14.925 18.674 C 14.583 20.162 13.178 21.155 11.662 20.983 C 10.145 20.810 9.000 19.526 9.000 18.000 L 9.005 17.824 C 9.075 16.618 9.861 15.573 11.000 15.170 L 11.000 13.000 L 6.000 13.000 L 6.000 15.171 C 7.439 15.679 8.268 17.187 7.925 18.674 C 7.583 20.162 6.178 21.155 4.662 20.983 C 3.145 20.810 2.000 19.526 2.000 18.000 L 2.005 17.824 C 2.075 16.618 2.861 15.573 4.000 15.170 L 4.000 8.829 C 2.801 8.405 2.000 7.272 2.000 6.000 L 2.005 5.824 C 2.094 4.324 3.279 3.120 4.778 3.009 C 6.277 2.898 7.626 3.913 7.936 5.384 C 8.245 6.855 7.418 8.327 6.001 8.829 L 6.000 11.000 L 11.000 11.000 L 11.000 8.830 C 9.801 8.406 8.999 7.272 9.000 6.000 L 9.005 5.824 C 9.094 4.324 10.279 3.120 11.778 3.009 C 13.277 2.898 14.626 3.913 14.936 5.384 C 15.245 6.855 14.418 8.327 13.001 8.829 L 13.000 11.000 L 17.000 11.000 C 17.552 11.000 18.000 10.552 18.000 10.000 L 18.000 8.830 C 16.801 8.406 15.999 7.272 16.000 6.000 L 16.005 5.824 C 16.098 4.238 17.411 3.000 19.000 3.000"),
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
        return _manualGearbox!!
    }

private var _manualGearbox: ImageVector? = null
