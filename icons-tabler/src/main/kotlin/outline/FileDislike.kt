package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileDislike: ImageVector
    get() {
        if (_fileDislike != null) return _fileDislike!!
        _fileDislike = tablerOutlineIcon(
            name = "FileDislike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 15.000 C 3.000 14.448 3.448 14.000 4.000 14.000 L 5.000 14.000 C 5.552 14.000 6.000 14.448 6.000 15.000 L 6.000 18.000 C 6.000 18.552 5.552 19.000 5.000 19.000 L 4.000 19.000 C 3.448 19.000 3.000 18.552 3.000 18.000 L 3.000 15.000"),
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
                pathData = parseSvgPathData("M 6.000 15.000 C 6.000 14.448 6.448 14.000 7.000 14.000 L 10.756 14.000 C 11.198 14.000 11.587 14.290 11.714 14.713 L 12.914 17.713 C 13.004 18.016 13.047 18.343 12.858 18.597 C 12.670 18.851 12.316 19.000 12.000 19.000 L 10.000 19.000 L 10.000 21.467 C 10.000 21.952 9.682 22.379 9.219 22.519 C 8.755 22.660 8.254 22.480 7.985 22.077 L 6.000 19.000 L 6.000 15.000"),
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
                pathData = parseSvgPathData("M 5.000 11.000 L 5.000 5.000 C 5.000 3.895 5.895 3.000 7.000 3.000 L 14.000 3.000 L 19.000 8.000 L 19.000 19.000 C 19.000 20.105 18.105 21.000 17.000 21.000 L 14.500 21.000"),
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
        return _fileDislike!!
    }

private var _fileDislike: ImageVector? = null
