package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PencilStar: ImageVector
    get() {
        if (_pencilStar != null) return _pencilStar!!
        _pencilStar = tablerOutlineIcon(
            name = "PencilStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.500 10.500 L 18.500 9.500 C 19.605 8.395 19.605 6.605 18.500 5.500 C 17.395 4.395 15.605 4.395 14.500 5.500 L 4.000 16.000 L 4.000 20.000 L 8.000 20.000 L 10.000 18.000"),
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
        pathData = parseSvgPathData("M 13.500 6.500 L 17.500 10.500"),
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
        return _pencilStar!!
    }

private var _pencilStar: ImageVector? = null
