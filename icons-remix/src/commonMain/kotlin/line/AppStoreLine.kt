package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AppStoreLine: ImageVector
    get() {
        if (_appStoreLine != null) return _appStoreLine!!
        _appStoreLine = remixIcon(
            name = "AppStoreLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 8.823 15.343 L 8.032 16.714 C 7.806 17.109 7.302 17.242 6.907 17.016 C 6.512 16.790 6.379 16.286 6.605 15.891 L 7.194 14.875 C 7.855 14.669 8.395 14.827 8.823 15.343 ZM 13.210 8.661 L 15.633 12.855 L 17.774 12.855 C 18.230 12.855 18.597 13.222 18.597 13.677 C 18.597 14.133 18.230 14.500 17.774 14.500 L 16.585 14.500 L 17.387 15.891 C 17.613 16.286 17.480 16.786 17.085 17.016 C 16.690 17.242 16.190 17.109 15.960 16.714 L 12.919 11.448 C 12.230 10.258 12.722 9.065 13.210 8.661 ZM 13.488 5.617 C 13.883 5.843 14.016 6.347 13.790 6.742 L 10.262 12.851 L 12.814 12.851 C 13.641 12.851 14.105 13.823 13.746 14.496 L 6.266 14.496 C 5.810 14.496 5.444 14.129 5.444 13.673 C 5.444 13.218 5.810 12.851 6.266 12.851 L 8.363 12.851 L 11.048 8.198 L 10.210 6.742 C 9.984 6.347 10.117 5.847 10.512 5.617 C 10.907 5.391 11.407 5.524 11.637 5.919 L 11.996 6.552 L 12.363 5.919 C 12.589 5.524 13.093 5.391 13.488 5.617 Z"),
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
        return _appStoreLine!!
    }

private var _appStoreLine: ImageVector? = null
