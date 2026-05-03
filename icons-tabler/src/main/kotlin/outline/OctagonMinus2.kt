package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OctagonMinus2: ImageVector
    get() {
        if (_octagonMinus2 != null) return _octagonMinus2!!
        _octagonMinus2 = tablerOutlineIcon(
            name = "OctagonMinus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.039 21.734 L 12.802 21.835 C 12.290 22.055 11.710 22.055 11.198 21.835 L 5.623 19.446 C 5.142 19.240 4.759 18.857 4.553 18.376 L 2.165 12.802 C 1.946 12.290 1.946 11.710 2.165 11.198 L 4.554 5.623 C 4.760 5.143 5.143 4.760 5.624 4.553 L 11.198 2.165 C 11.710 1.946 12.290 1.946 12.802 2.165 L 18.377 4.554 C 18.857 4.760 19.240 5.143 19.447 5.624 L 21.835 11.198 C 22.055 11.710 22.055 12.290 21.835 12.802 L 20.895 14.998"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 16.000 19.000 L 22.000 19.000"),
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
        return _octagonMinus2!!
    }

private var _octagonMinus2: ImageVector? = null
