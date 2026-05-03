package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareStar: ImageVector
    get() {
        if (_squareStar != null) return _squareStar!!
        _squareStar = lucideOutlineIcon(
            name = "SquareStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.035 7.690 C 11.171 7.274 11.561 6.995 11.998 7.000 C 12.436 7.006 12.819 7.295 12.944 7.714 L 13.681 9.166 C 13.826 9.452 14.101 9.651 14.418 9.701 L 16.052 9.957 C 16.484 9.959 16.865 10.237 16.999 10.647 C 17.133 11.058 16.988 11.508 16.640 11.763 L 15.468 12.931 C 15.240 13.158 15.135 13.480 15.186 13.797 L 15.445 15.410 C 15.591 15.825 15.449 16.287 15.095 16.548 C 14.740 16.809 14.257 16.807 13.904 16.544 L 12.439 15.794 C 12.153 15.647 11.813 15.647 11.527 15.794 L 10.062 16.544 C 9.709 16.805 9.228 16.805 8.874 16.545 C 8.521 16.285 8.379 15.825 8.523 15.411 L 8.781 13.798 C 8.832 13.481 8.727 13.159 8.499 12.932 L 7.343 11.779 C 6.983 11.530 6.827 11.075 6.958 10.657 C 7.090 10.240 7.477 9.956 7.915 9.957 L 9.548 9.701 C 9.865 9.651 10.140 9.452 10.285 9.166 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 5.000 3.000 L 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _squareStar!!
    }

private var _squareStar: ImageVector? = null
