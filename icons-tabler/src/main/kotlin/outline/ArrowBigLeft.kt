package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigLeft: ImageVector
    get() {
        if (_arrowBigLeft != null) return _arrowBigLeft!!
        _arrowBigLeft = tablerOutlineIcon(
            name = "ArrowBigLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 15.000 L 12.000 15.000 L 12.000 18.586 C 12.000 18.990 11.756 19.355 11.383 19.510 C 11.009 19.664 10.579 19.579 10.293 19.293 L 3.707 12.707 C 3.317 12.316 3.317 11.684 3.707 11.293 L 10.293 4.707 C 10.579 4.421 11.009 4.336 11.383 4.490 C 11.756 4.645 12.000 5.010 12.000 5.414 L 12.000 9.000 L 20.000 9.000 C 20.552 9.000 21.000 9.448 21.000 10.000 L 21.000 14.000 C 21.000 14.552 20.552 15.000 20.000 15.000"),
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
        return _arrowBigLeft!!
    }

private var _arrowBigLeft: ImageVector? = null
