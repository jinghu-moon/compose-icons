package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMcdonalds: ImageVector
    get() {
        if (_brandMcdonalds != null) return _brandMcdonalds!!
        _brandMcdonalds = tablerOutlineIcon(
            name = "BrandMcdonalds",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 20.0f),
                    PathNode.CurveTo(20.0f, 16.048f, 19.034f, 4.0f, 15.962f, 4.0f),
                    PathNode.CurveTo(12.89f, 4.0f, 12.0f, 13.087f, 12.0f, 18.756f),
                    PathNode.CurveTo(12.0f, 13.087f, 11.104f, 4.0f, 8.038f, 4.0f),
                    PathNode.CurveTo(4.973f, 4.0f, 4.0f, 16.048f, 4.0f, 20.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandMcdonalds!!
    }

private var _brandMcdonalds: ImageVector? = null
