package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterJ: ImageVector
    get() {
        if (_squareLetterJ != null) return _squareLetterJ!!
        _squareLetterJ = tablerFilledIcon(
            name = "SquareLetterJ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM14 7h-4C9.448 7 9 7.448 9 8l.007 .117c.059 .503 .486 .883 .993 .883h3v5c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 14c0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-6C15 7.448 14.552 7 14 7"),
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
        return _squareLetterJ!!
    }

private var _squareLetterJ: ImageVector? = null
