package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tie: ImageVector
    get() {
        if (_tie != null) return _tie!!
        _tie = tablerOutlineIcon(
            name = "Tie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 22.000 L 16.000 18.000 L 13.500 7.000 L 14.493 4.351 C 14.608 4.044 14.565 3.700 14.379 3.431 C 14.192 3.161 13.885 3.000 13.557 3.000 L 10.443 3.000 C 10.115 3.000 9.808 3.161 9.621 3.431 C 9.435 3.700 9.392 4.044 9.507 4.351 L 10.500 7.000 L 8.000 18.000 L 12.000 22.000"),
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
                pathData = parseSvgPathData("M 10.500 7.000 L 13.500 7.000 L 18.500 12.500"),
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
        return _tie!!
    }

private var _tie: ImageVector? = null
