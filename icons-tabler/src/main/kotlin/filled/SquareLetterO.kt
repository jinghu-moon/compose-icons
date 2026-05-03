package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterO: ImageVector
    get() {
        if (_squareLetterO != null) return _squareLetterO!!
        _squareLetterO = tablerFilledIcon(
            name = "SquareLetterO",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 12.000 7.000 C 10.343 7.000 9.000 8.343 9.000 10.000 L 9.000 14.000 C 9.000 15.657 10.343 17.000 12.000 17.000 C 13.657 17.000 15.000 15.657 15.000 14.000 L 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000M 12.000 9.000 C 12.552 9.000 13.000 9.448 13.000 10.000 L 13.000 14.000 C 13.000 14.552 12.552 15.000 12.000 15.000 C 11.448 15.000 11.000 14.552 11.000 14.000 L 11.000 10.000 C 11.000 9.448 11.448 9.000 12.000 9.000"),
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
        return _squareLetterO!!
    }

private var _squareLetterO: ImageVector? = null
