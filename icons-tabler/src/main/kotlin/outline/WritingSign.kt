package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WritingSign: ImageVector
    get() {
        if (_writingSign != null) return _writingSign!!
        _writingSign = tablerOutlineIcon(
            name = "WritingSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 19.000 C 6.333 17.000 8.000 15.000 8.000 13.000 C 8.000 10.000 7.000 10.000 6.000 10.000 C 5.000 10.000 3.968 11.085 4.000 13.000 C 4.034 15.048 5.658 15.877 6.500 17.000 C 8.000 19.000 9.000 19.500 10.000 18.000 C 10.667 17.000 11.167 16.167 11.500 15.500 C 12.500 17.833 13.833 19.000 15.500 19.000 L 18.000 19.000"),
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
        pathData = parseSvgPathData("M 20.000 17.000 L 20.000 5.000 C 20.000 3.879 19.121 3.000 18.000 3.000 C 16.879 3.000 16.000 3.879 16.000 5.000 L 16.000 17.000 L 18.000 19.000 L 20.000 17.000"),
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
        pathData = parseSvgPathData("M 16.000 7.000 L 20.000 7.000"),
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
        return _writingSign!!
    }

private var _writingSign: ImageVector? = null
