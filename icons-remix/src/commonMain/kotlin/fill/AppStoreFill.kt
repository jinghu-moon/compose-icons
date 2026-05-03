package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AppStoreFill: ImageVector
    get() {
        if (_appStoreFill != null) return _appStoreFill!!
        _appStoreFill = remixIcon(
            name = "AppStoreFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 8.823 15.343 C 8.428 14.866 7.937 14.696 7.344 14.834 L 7.194 14.875 L 6.605 15.891 C 6.379 16.286 6.512 16.790 6.907 17.016 C 7.269 17.223 7.723 17.129 7.970 16.807 L 8.032 16.714 L 8.823 15.343 ZM 13.210 8.661 C 12.722 9.065 12.230 10.258 12.919 11.448 L 15.960 16.714 C 16.190 17.109 16.690 17.242 17.085 17.016 C 17.447 16.805 17.589 16.368 17.436 15.992 L 17.387 15.891 L 16.585 14.500 L 17.774 14.500 C 18.230 14.500 18.597 14.133 18.597 13.677 C 18.597 13.257 18.284 12.912 17.878 12.861 L 17.774 12.855 L 15.633 12.855 L 13.440 9.057 L 13.210 8.661 ZM 13.488 5.617 C 13.126 5.410 12.672 5.505 12.425 5.826 L 12.363 5.919 L 11.996 6.552 L 11.637 5.919 C 11.407 5.524 10.907 5.391 10.512 5.617 C 10.150 5.828 10.008 6.265 10.161 6.641 L 10.210 6.742 L 11.048 8.198 L 8.363 12.851 L 6.266 12.851 C 5.810 12.851 5.444 13.218 5.444 13.673 C 5.444 14.094 5.756 14.439 6.163 14.490 L 6.266 14.496 L 13.746 14.496 C 14.087 13.856 13.685 12.947 12.936 12.858 L 12.814 12.851 L 10.262 12.851 L 13.790 6.742 C 14.016 6.347 13.883 5.843 13.488 5.617 Z"),
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
        return _appStoreFill!!
    }

private var _appStoreFill: ImageVector? = null
