package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowMoveUp: ImageVector
    get() {
        if (_arrowMoveUp != null) return _arrowMoveUp!!
        _arrowMoveUp = tablerFilledIcon(
            name = "ArrowMoveUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.852 2.011 L 11.910 2.004 L 12.000 2.000 L 12.075 2.003 L 12.201 2.020 L 12.312 2.050 L 12.423 2.094 L 12.521 2.146 L 12.625 2.220 L 12.707 2.293 L 15.707 5.293 C 15.967 5.544 16.071 5.916 15.980 6.266 C 15.888 6.615 15.615 6.888 15.266 6.980 C 14.916 7.071 14.544 6.967 14.293 6.707 L 13.000 5.415 L 13.000 13.000 C 13.000 13.552 12.552 14.000 12.000 14.000 C 11.448 14.000 11.000 13.552 11.000 13.000 L 11.000 5.415 L 9.707 6.707 C 9.351 7.063 8.785 7.099 8.387 6.790 L 8.293 6.707 C 7.903 6.317 7.903 5.683 8.293 5.293 L 11.293 2.293 Q 11.346 2.239 11.405 2.196 L 11.515 2.125 L 11.629 2.071 L 11.734 2.036 Z"),
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
                pathData = parseSvgPathData("M 12.000 16.000 C 13.657 16.000 15.000 17.343 15.000 19.000 C 15.000 20.657 13.657 22.000 12.000 22.000 C 10.343 22.000 9.000 20.657 9.000 19.000 C 9.000 17.343 10.343 16.000 12.000 16.000"),
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
        return _arrowMoveUp!!
    }

private var _arrowMoveUp: ImageVector? = null
