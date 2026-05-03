package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigUp: ImageVector
    get() {
        if (_arrowBigUp != null) return _arrowBigUp!!
        _arrowBigUp = tablerOutlineIcon(
            name = "ArrowBigUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 20.000 L 9.000 12.000 L 5.414 12.000 C 5.010 12.000 4.645 11.756 4.490 11.383 C 4.336 11.009 4.421 10.579 4.707 10.293 L 11.293 3.707 C 11.684 3.317 12.316 3.317 12.707 3.707 L 19.293 10.293 C 19.579 10.579 19.664 11.009 19.510 11.383 C 19.355 11.756 18.990 12.000 18.586 12.000 L 15.000 12.000 L 15.000 20.000 C 15.000 20.552 14.552 21.000 14.000 21.000 L 10.000 21.000 C 9.448 21.000 9.000 20.552 9.000 20.000"),
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
        return _arrowBigUp!!
    }

private var _arrowBigUp: ImageVector? = null
