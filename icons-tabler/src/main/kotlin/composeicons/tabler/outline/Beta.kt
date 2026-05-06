package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Beta: ImageVector
    get() {
        if (_beta != null) return _beta!!
        _beta = tablerOutlineIcon(
            name = "Beta",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 22v-14C8 5.791 9.791 4 12 4h.5C14.433 4 16 5.567 16 7.5 16 9.433 14.433 11 12.5 11h-.5 .5C14.985 11 17 13.015 17 15.5 17 17.985 14.985 20 12.5 20 10.015 20 8 17.985 8 15.5v-.5"),
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
        return _beta!!
    }

private var _beta: ImageVector? = null
