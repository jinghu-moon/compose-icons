package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowMoveRight: ImageVector
    get() {
        if (_arrowMoveRight != null) return _arrowMoveRight!!
        _arrowMoveRight = tablerFilledIcon(
            name = "ArrowMoveRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.707 8.293 L 21.707 11.293 Q 21.761 11.346 21.804 11.405 L 21.875 11.515 L 21.929 11.629 L 21.964 11.734 L 21.994 11.882 L 22.000 12.000 L 21.997 12.075 L 21.980 12.201 L 21.950 12.312 L 21.906 12.423 L 21.854 12.521 L 21.780 12.625 L 21.707 12.707 L 18.707 15.707 C 18.315 16.086 17.691 16.081 17.305 15.695 C 16.919 15.309 16.914 14.685 17.293 14.293 L 18.585 13.000 L 11.000 13.000 C 10.448 13.000 10.000 12.552 10.000 12.000 C 10.000 11.448 10.448 11.000 11.000 11.000 L 18.585 11.000 L 17.293 9.707 C 16.937 9.351 16.901 8.785 17.210 8.387 L 17.293 8.293 C 17.684 7.903 18.316 7.903 18.707 8.293M 5.000 9.000 C 6.657 9.000 8.000 10.343 8.000 12.000 C 8.000 13.657 6.657 15.000 5.000 15.000 C 3.343 15.000 2.000 13.657 2.000 12.000 C 2.000 10.343 3.343 9.000 5.000 9.000"),
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
        return _arrowMoveRight!!
    }

private var _arrowMoveRight: ImageVector? = null
