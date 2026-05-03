package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Teapot: ImageVector
    get() {
        if (_teapot != null) return _teapot!!
        _teapot = tablerOutlineIcon(
            name = "Teapot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.290 3.000 L 13.710 3.000 C 14.729 3.000 15.586 3.767 15.698 4.780 L 17.253 18.780 C 17.316 19.345 17.134 19.911 16.755 20.334 C 16.376 20.758 15.834 21.000 15.265 21.000 L 8.735 21.000 C 8.166 21.000 7.624 20.758 7.245 20.334 C 6.866 19.911 6.684 19.345 6.747 18.780 L 8.302 4.780 C 8.414 3.767 9.271 3.000 10.290 3.000"),
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
                pathData = parseSvgPathData("M 7.470 12.500 L 3.213 7.481 C 2.986 7.213 2.935 6.838 3.083 6.519 C 3.232 6.201 3.552 5.998 3.903 6.000 L 16.993 6.000 C 17.790 5.998 18.555 6.313 19.119 6.876 C 19.683 7.439 20.000 8.203 20.000 9.000 L 20.000 12.000 C 20.000 13.657 18.654 15.000 16.993 15.000"),
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
                pathData = parseSvgPathData("M 7.000 17.000 L 17.000 17.000"),
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
        return _teapot!!
    }

private var _teapot: ImageVector? = null
