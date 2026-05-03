package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Stars: ImageVector
    get() {
        if (_stars != null) return _stars!!
        _stars = tablerOutlineIcon(
            name = "Stars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.800 19.817 L 15.628 20.955 C 15.497 21.023 15.338 21.012 15.218 20.925 C 15.097 20.838 15.036 20.691 15.060 20.545 L 15.475 18.134 L 13.718 16.427 C 13.611 16.324 13.572 16.168 13.619 16.027 C 13.665 15.885 13.788 15.782 13.935 15.762 L 16.363 15.410 L 17.449 13.217 C 17.515 13.084 17.651 13.000 17.800 13.000 C 17.949 13.000 18.085 13.084 18.151 13.217 L 19.237 15.410 L 21.665 15.762 C 21.812 15.783 21.934 15.886 21.980 16.027 C 22.026 16.168 21.988 16.323 21.882 16.427 L 20.125 18.134 L 20.539 20.544 C 20.564 20.691 20.504 20.839 20.384 20.926 C 20.263 21.014 20.103 21.025 19.972 20.955 L 17.800 19.817"),
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
        pathData = parseSvgPathData("M 6.200 19.817 L 4.028 20.955 C 3.897 21.023 3.738 21.012 3.618 20.925 C 3.497 20.838 3.436 20.691 3.460 20.545 L 3.875 18.134 L 2.118 16.427 C 2.011 16.324 1.972 16.168 2.019 16.027 C 2.065 15.885 2.188 15.782 2.335 15.762 L 4.763 15.410 L 5.849 13.217 C 5.915 13.084 6.051 13.000 6.200 13.000 C 6.349 13.000 6.485 13.084 6.551 13.217 L 7.637 15.410 L 10.065 15.762 C 10.212 15.783 10.334 15.886 10.380 16.027 C 10.426 16.168 10.388 16.323 10.282 16.427 L 8.525 18.134 L 8.939 20.544 C 8.964 20.691 8.904 20.839 8.784 20.926 C 8.663 21.014 8.503 21.025 8.372 20.955 L 6.200 19.817"),
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
        pathData = parseSvgPathData("M 12.000 9.817 L 9.828 10.955 C 9.697 11.023 9.538 11.012 9.418 10.925 C 9.297 10.838 9.236 10.691 9.260 10.545 L 9.675 8.134 L 7.918 6.427 C 7.811 6.324 7.772 6.168 7.819 6.027 C 7.865 5.885 7.988 5.782 8.135 5.762 L 10.563 5.410 L 11.649 3.217 C 11.715 3.084 11.851 3.000 12.000 3.000 C 12.149 3.000 12.285 3.084 12.351 3.217 L 13.437 5.410 L 15.865 5.762 C 16.012 5.783 16.134 5.886 16.180 6.027 C 16.226 6.168 16.188 6.323 16.082 6.427 L 14.325 8.134 L 14.739 10.544 C 14.764 10.691 14.704 10.839 14.584 10.926 C 14.463 11.014 14.303 11.025 14.172 10.955 L 12.000 9.817"),
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
        return _stars!!
    }

private var _stars: ImageVector? = null
