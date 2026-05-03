package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Variable: ImageVector
    get() {
        if (_variable != null) return _variable!!
        _variable = tablerOutlineIcon(
            name = "Variable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 4.000 C 2.500 9.000 2.500 14.000 5.000 20.000M 19.000 4.000 C 21.500 9.000 21.500 14.000 19.000 20.000M 9.000 9.000 L 10.000 9.000 C 11.000 9.000 11.000 10.000 12.016 12.527 C 13.000 15.000 13.000 16.000 14.000 16.000 L 15.000 16.000"),
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
                pathData = parseSvgPathData("M 8.000 16.000 C 9.500 16.000 11.000 14.000 12.000 12.500 C 13.000 11.000 14.500 9.000 16.000 9.000"),
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
        return _variable!!
    }

private var _variable: ImageVector? = null
