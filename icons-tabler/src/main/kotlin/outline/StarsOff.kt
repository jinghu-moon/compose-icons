package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StarsOff: ImageVector
    get() {
        if (_starsOff != null) return _starsOff!!
        _starsOff = tablerOutlineIcon(
            name = "StarsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.373 13.371 L 17.449 13.217 C 17.515 13.084 17.651 13.000 17.800 13.000 C 17.949 13.000 18.085 13.084 18.151 13.217 L 19.058 15.048M 19.425 15.438 C 19.923 15.509 20.670 15.618 21.665 15.762 C 21.812 15.783 21.934 15.886 21.980 16.027 C 22.026 16.168 21.988 16.323 21.882 16.427 C 21.556 16.743 21.312 16.980 21.150 17.139M 20.539 20.544 C 20.564 20.691 20.504 20.839 20.384 20.926 C 20.263 21.014 20.103 21.025 19.972 20.955 L 17.800 19.817 L 15.628 20.955 C 15.497 21.023 15.338 21.012 15.218 20.925 C 15.097 20.838 15.036 20.691 15.060 20.545 L 15.475 18.134 L 13.718 16.427 C 13.611 16.324 13.572 16.168 13.619 16.027 C 13.665 15.885 13.788 15.782 13.935 15.762 L 15.536 15.530"),
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
        pathData = parseSvgPathData("M 9.557 5.556 L 10.557 5.410 L 11.643 3.217 C 11.709 3.084 11.845 3.000 11.994 3.000 C 12.143 3.000 12.279 3.084 12.345 3.217 L 13.431 5.410 L 15.859 5.762 C 16.006 5.783 16.128 5.886 16.174 6.027 C 16.220 6.168 16.182 6.323 16.076 6.427 L 14.319 8.134 L 14.733 10.544 C 14.744 10.607 14.739 10.671 14.719 10.731M 10.566 10.565 L 9.822 10.955 C 9.691 11.023 9.532 11.012 9.412 10.925 C 9.291 10.838 9.230 10.691 9.254 10.545 L 9.442 9.452"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _starsOff!!
    }

private var _starsOff: ImageVector? = null
