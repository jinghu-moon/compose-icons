package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowGuide: ImageVector
    get() {
        if (_arrowGuide != null) return _arrowGuide!!
        _arrowGuide = tablerFilledIcon(
            name = "ArrowGuide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.707 3.293 L 21.707 6.293 Q 21.761 6.346 21.804 6.405 L 21.875 6.515 L 21.929 6.629 L 21.964 6.734 L 21.994 6.882 L 22.000 7.000 L 21.997 7.075 L 21.980 7.201 L 21.950 7.312 L 21.906 7.423 L 21.854 7.521 L 21.787 7.617 L 21.707 7.707 L 18.707 10.707 C 18.315 11.086 17.691 11.081 17.305 10.695 C 16.919 10.309 16.914 9.685 17.293 9.293 L 18.585 8.000 L 14.000 8.000 C 13.448 8.000 13.000 8.448 13.000 9.000 L 13.000 17.000 C 13.000 18.657 11.657 20.000 10.000 20.000 L 7.829 20.000 C 7.340 21.376 5.933 22.200 4.494 21.954 C 3.055 21.707 2.002 20.460 2.000 19.000 L 2.005 18.824 C 2.087 17.397 3.164 16.226 4.580 16.025 C 5.995 15.825 7.355 16.651 7.830 18.000 L 10.000 18.000 C 10.552 18.000 11.000 17.552 11.000 17.000 L 11.000 9.000 C 11.000 7.343 12.343 6.000 14.000 6.000 L 18.585 6.000 L 17.293 4.707 C 16.937 4.351 16.901 3.785 17.210 3.387 L 17.293 3.293 C 17.684 2.903 18.316 2.903 18.707 3.293"),
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
        return _arrowGuide!!
    }

private var _arrowGuide: ImageVector? = null
