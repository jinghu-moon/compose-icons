package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.JewelryLine: ImageVector
    get() {
        if (_jewelryLine != null) return _jewelryLine!!
        _jewelryLine = remixIcon(
            name = "JewelryLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 2.900 C 9.000 2.437 9.319 2.035 9.769 1.927 C 11.165 1.596 12.834 1.601 14.231 1.927 C 14.677 2.033 15.000 2.442 15.000 2.900 L 15.000 5.038 C 15.000 5.329 15.169 5.594 15.432 5.717 L 21.126 8.385 C 21.871 8.734 22.196 9.618 21.854 10.367 L 17.381 20.152 C 17.144 20.669 16.628 21.000 16.060 21.000 L 7.941 21.000 C 7.373 21.000 6.856 20.669 6.620 20.152 L 2.147 10.367 C 1.805 9.618 2.129 8.734 2.875 8.385 L 8.569 5.717 C 8.832 5.594 9.000 5.329 9.000 5.038 L 9.000 2.900 ZM 11.000 3.780 L 11.000 5.038 C 11.000 6.105 10.383 7.075 9.417 7.528 L 8.436 7.987 C 9.142 9.889 10.570 11.000 12.000 11.000 C 13.430 11.000 14.859 9.889 15.564 7.987 L 14.584 7.528 C 13.617 7.075 13.000 6.105 13.000 5.038 L 13.000 3.780 C 12.737 3.761 12.404 3.747 12.000 3.747 C 11.597 3.747 11.264 3.761 11.000 3.780 ZM 11.319 12.954 C 9.167 12.658 7.475 10.979 6.623 8.837 L 4.172 9.985 L 8.293 19.000 L 15.708 19.000 L 19.829 9.985 L 17.378 8.837 C 16.526 10.979 14.833 12.658 12.682 12.954 L 14.189 15.064 C 14.375 15.325 14.375 15.675 14.189 15.936 L 12.204 18.715 C 12.104 18.855 11.897 18.855 11.797 18.715 L 9.812 15.936 C 9.625 15.675 9.625 15.325 9.812 15.064 L 11.319 12.954 Z"),
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
        return _jewelryLine!!
    }

private var _jewelryLine: ImageVector? = null
