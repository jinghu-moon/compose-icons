package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Leaf2: ImageVector
    get() {
        if (_leaf2 != null) return _leaf2!!
        _leaf2 = tablerOutlineIcon(
            name = "Leaf2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 21.000 C 5.500 16.500 7.500 13.000 12.000 11.000"),
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
                pathData = parseSvgPathData("M 7.500 15.000 Q 4.000 15.000 3.000 9.000 C 4.161 8.894 5.332 9.031 6.438 9.402 C 6.412 9.138 6.395 8.874 6.386 8.609 C 6.386 5.003 9.590 3.000 9.590 3.000 C 9.590 3.000 11.593 4.252 12.432 6.557 Q 15.000 5.000 19.000 5.000 Q 19.396 8.775 17.443 11.568 C 19.748 12.407 21.000 14.410 21.000 14.410 C 21.000 14.410 18.000 17.000 14.000 17.000 C 14.000 18.000 14.000 18.000 14.500 20.000 Q 8.500 20.000 7.500 15.000"),
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
        return _leaf2!!
    }

private var _leaf2: ImageVector? = null
