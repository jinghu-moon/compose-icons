package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Label: ImageVector
    get() {
        if (_label != null) return _label!!
        _label = tablerOutlineIcon(
            name = "Label",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.520 7.000 L 6.000 7.000 C 4.895 7.000 4.000 7.895 4.000 9.000 L 4.000 15.000 C 4.000 16.105 4.895 17.000 6.000 17.000 L 16.520 17.000 C 16.823 17.000 17.110 16.862 17.300 16.625 L 21.000 12.000 L 17.300 7.375 C 17.110 7.138 16.823 7.000 16.520 7.000"),
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
        return _label!!
    }

private var _label: ImageVector? = null
