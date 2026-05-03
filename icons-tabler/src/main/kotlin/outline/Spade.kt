package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = tablerOutlineIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 L 16.919 7.500 C 17.529 8.087 18.096 8.677 18.622 9.271 C 20.355 11.240 20.465 14.156 18.886 16.250 C 17.706 17.810 15.548 18.170 14.000 17.000 L 14.000 18.000 L 15.000 21.000 L 9.000 21.000 L 10.000 18.000 L 10.000 17.000 C 8.460 18.070 6.265 17.772 5.114 16.250 C 3.535 14.156 3.645 11.240 5.378 9.271 C 5.922 8.658 6.490 8.068 7.081 7.500 C 8.717 5.996 10.357 4.496 12.000 3.000"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
