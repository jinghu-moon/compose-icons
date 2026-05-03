package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterP: ImageVector
    get() {
        if (_squareLetterP != null) return _squareLetterP!!
        _squareLetterP = tablerFilledIcon(
            name = "SquareLetterP",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 12.000 7.000 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 L 10.117 16.993 C 10.620 16.934 11.000 16.507 11.000 16.000 L 11.000 13.000 L 12.000 13.000 C 13.657 13.000 15.000 11.657 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000M 12.000 9.000 C 12.552 9.000 13.000 9.448 13.000 10.000 C 13.000 10.552 12.552 11.000 12.000 11.000 L 11.000 11.000 L 11.000 9.000 Z"),
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
        return _squareLetterP!!
    }

private var _squareLetterP: ImageVector? = null
