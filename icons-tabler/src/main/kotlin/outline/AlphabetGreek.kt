package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetGreek: ImageVector
    get() {
        if (_alphabetGreek != null) return _alphabetGreek!!
        _alphabetGreek = tablerOutlineIcon(
            name = "AlphabetGreek",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 10.000 L 10.000 17.000"),
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
        pathData = parseSvgPathData("M 5.000 12.000 C 5.000 10.895 5.895 10.000 7.000 10.000 L 8.000 10.000 C 9.105 10.000 10.000 10.895 10.000 12.000 L 10.000 15.000 C 10.000 16.105 9.105 17.000 8.000 17.000 L 7.000 17.000 C 5.895 17.000 5.000 16.105 5.000 15.000 L 5.000 12.000"),
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
        pathData = parseSvgPathData("M 14.000 20.000 L 14.000 9.000 C 14.000 7.895 14.895 7.000 16.000 7.000 L 17.000 7.000 C 18.105 7.000 19.000 7.895 19.000 9.000 L 19.000 10.000 C 19.000 11.105 18.105 12.000 17.000 12.000 C 18.105 12.000 19.000 12.895 19.000 14.000 L 19.000 15.000 C 19.000 16.105 18.105 17.000 17.000 17.000"),
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
        return _alphabetGreek!!
    }

private var _alphabetGreek: ImageVector? = null
