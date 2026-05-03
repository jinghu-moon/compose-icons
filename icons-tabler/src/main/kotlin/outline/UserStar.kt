package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserStar: ImageVector
    get() {
        if (_userStar != null) return _userStar!!
        _userStar = tablerOutlineIcon(
            name = "UserStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 7.000 C 8.000 9.209 9.791 11.000 12.000 11.000 C 14.209 11.000 16.000 9.209 16.000 7.000 C 16.000 4.791 14.209 3.000 12.000 3.000 C 9.791 3.000 8.000 4.791 8.000 7.000"),
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
        pathData = parseSvgPathData("M 6.000 21.000 L 6.000 19.000 C 6.000 16.791 7.791 15.000 10.000 15.000 L 10.500 15.000"),
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
        pathData = parseSvgPathData("M 17.800 20.817 L 15.628 21.955 C 15.497 22.023 15.338 22.012 15.218 21.925 C 15.097 21.838 15.036 21.691 15.060 21.545 L 15.475 19.134 L 13.718 17.427 C 13.611 17.324 13.572 17.168 13.619 17.027 C 13.665 16.885 13.788 16.782 13.935 16.762 L 16.363 16.410 L 17.449 14.217 C 17.515 14.084 17.651 14.000 17.800 14.000 C 17.949 14.000 18.085 14.084 18.151 14.217 L 19.237 16.410 L 21.665 16.762 C 21.812 16.783 21.934 16.886 21.980 17.027 C 22.026 17.168 21.988 17.323 21.882 17.427 L 20.125 19.134 L 20.539 21.544 C 20.564 21.691 20.504 21.839 20.384 21.926 C 20.263 22.014 20.103 22.025 19.972 21.955 L 17.800 20.817"),
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
        return _userStar!!
    }

private var _userStar: ImageVector? = null
