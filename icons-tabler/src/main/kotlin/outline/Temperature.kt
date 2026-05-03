package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Temperature: ImageVector
    get() {
        if (_temperature != null) return _temperature!!
        _temperature = tablerOutlineIcon(
            name = "Temperature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 13.500 C 8.432 14.405 7.668 16.251 8.136 17.999 C 8.605 19.748 10.190 20.964 12.000 20.964 C 13.810 20.964 15.395 19.748 15.864 17.999 C 16.332 16.251 15.568 14.405 14.000 13.500 L 14.000 5.000 C 14.000 3.895 13.105 3.000 12.000 3.000 C 10.895 3.000 10.000 3.895 10.000 5.000 L 10.000 13.500"),
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
                pathData = parseSvgPathData("M 10.000 9.000 L 14.000 9.000"),
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
        return _temperature!!
    }

private var _temperature: ImageVector? = null
