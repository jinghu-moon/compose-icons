package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LabelImportant: ImageVector
    get() {
        if (_labelImportant != null) return _labelImportant!!
        _labelImportant = tablerOutlineIcon(
            name = "LabelImportant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.520 7.000 L 4.000 7.000 L 8.000 12.000 L 4.000 17.000 L 16.520 17.000 C 16.823 17.000 17.110 16.862 17.300 16.625 L 21.000 12.000 L 17.300 7.375 C 17.110 7.138 16.823 7.000 16.520 7.000"),
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
        return _labelImportant!!
    }

private var _labelImportant: ImageVector? = null
