package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowRightCircle: ImageVector
    get() {
        if (_arrowRightCircle != null) return _arrowRightCircle!!
        _arrowRightCircle = tablerFilledIcon(
            name = "ArrowRightCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 15.000 C 3.343 15.000 2.000 13.657 2.000 12.000 L 2.005 11.824 C 2.087 10.397 3.164 9.226 4.580 9.025 C 5.995 8.825 7.355 9.651 7.830 11.000 L 18.586 11.000 L 17.294 9.707 C 16.938 9.351 16.902 8.785 17.211 8.387 L 17.294 8.293 C 17.684 7.903 18.318 7.903 18.708 8.293 L 21.708 11.293 L 21.805 11.405 L 21.876 11.515 L 21.907 11.577 L 21.941 11.658 L 21.965 11.734 L 21.995 11.882 L 22.000 12.000 L 21.996 12.085 L 21.980 12.201 L 21.950 12.312 L 21.906 12.423 L 21.854 12.521 L 21.780 12.625 L 21.707 12.707 L 18.707 15.707 C 18.315 16.086 17.691 16.081 17.305 15.695 C 16.919 15.309 16.914 14.685 17.293 14.293 L 18.585 13.000 L 7.829 13.000 C 7.405 14.199 6.272 15.000 5.000 15.000"),
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
        return _arrowRightCircle!!
    }

private var _arrowRightCircle: ImageVector? = null
