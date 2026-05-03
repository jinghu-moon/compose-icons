package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileStar: ImageVector
    get() {
        if (_fileStar != null) return _fileStar!!
        _fileStar = tablerOutlineIcon(
            name = "FileStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 3.000 L 14.000 7.000 C 14.000 7.552 14.448 8.000 15.000 8.000 L 19.000 8.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 17.000 21.000 L 7.000 21.000 C 5.895 21.000 5.000 20.105 5.000 19.000 L 5.000 5.000 C 5.000 3.895 5.895 3.000 7.000 3.000 L 14.000 3.000 L 19.000 8.000 L 19.000 19.000 C 19.000 20.105 18.105 21.000 17.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 11.800 16.817 L 9.628 17.955 C 9.497 18.023 9.338 18.012 9.218 17.925 C 9.097 17.838 9.036 17.691 9.060 17.545 L 9.475 15.134 L 7.718 13.427 C 7.611 13.324 7.572 13.168 7.619 13.027 C 7.665 12.885 7.788 12.782 7.935 12.762 L 10.363 12.410 L 11.449 10.217 C 11.515 10.084 11.651 10.000 11.800 10.000 C 11.949 10.000 12.085 10.084 12.151 10.217 L 13.237 12.410 L 15.665 12.762 C 15.812 12.783 15.934 12.886 15.980 13.027 C 16.026 13.168 15.988 13.323 15.882 13.427 L 14.125 15.134 L 14.539 17.544 C 14.564 17.691 14.504 17.839 14.384 17.926 C 14.263 18.014 14.103 18.025 13.972 17.955 L 11.800 16.817"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _fileStar!!
    }

private var _fileStar: ImageVector? = null
