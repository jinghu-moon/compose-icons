package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterC: ImageVector
    get() {
        if (_squareLetterC != null) return _squareLetterC!!
        _squareLetterC = tablerFilledIcon(
            name = "SquareLetterC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 12.000 7.000 C 10.343 7.000 9.000 8.343 9.000 10.000 L 9.000 14.000 C 9.000 15.657 10.343 17.000 12.000 17.000 C 13.657 17.000 15.000 15.657 15.000 14.000 C 14.999 13.471 14.587 13.034 14.059 13.003 C 13.530 12.972 13.069 13.358 13.007 13.883 L 13.000 14.000 C 13.000 14.552 12.552 15.000 12.000 15.000 C 11.448 15.000 11.000 14.552 11.000 14.000 L 11.000 10.000 C 11.001 9.471 11.413 9.034 11.941 9.003 C 12.470 8.972 12.931 9.358 12.993 9.883 L 13.000 10.000 C 13.000 10.552 13.448 11.000 14.000 11.000 C 14.552 11.000 15.000 10.552 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000"),
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
        return _squareLetterC!!
    }

private var _squareLetterC: ImageVector? = null
