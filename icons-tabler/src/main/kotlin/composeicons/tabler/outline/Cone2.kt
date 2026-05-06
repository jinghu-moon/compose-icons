package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cone2: ImageVector
    get() {
        if (_cone2 != null) return _cone2!!
        _cone2 = tablerOutlineIcon(
            name = "Cone2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 5.002v.5L12.87 20.492c-.178 .313-.51 .507-.87 .507-.36 0-.692-.194-.87-.507L3 5.503v-.5C3 3.344 7.03 2 12 2c4.97 0 9 1.344 9 3.002"),
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
        return _cone2!!
    }

private var _cone2: ImageVector? = null
