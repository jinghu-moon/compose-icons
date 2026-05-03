package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Horseshoe: ImageVector
    get() {
        if (_horseshoe != null) return _horseshoe!!
        _horseshoe = tablerOutlineIcon(
            name = "Horseshoe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 17.0f),
                    PathNode.CurveTo(19.5f, 15.758f, 21.0f, 15.0f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 9.0f, 20.0f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(4.0f, 3.0f, 3.0f, 9.0f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 15.0f, 4.495f, 15.749f, 5.0f, 17.0f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.LineTo(7.406f, 19.853f),
                    PathNode.CurveTo(8.656f, 19.139f, 9.184f, 17.773f, 8.609f, 16.49f),
                    PathNode.CurveTo(7.531f, 14.083f, 7.0f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(17.0f, 8.0f, 16.469f, 14.083f, 15.39f, 16.49f),
                    PathNode.CurveTo(14.816f, 17.774f, 15.345f, 19.139f, 16.594f, 19.853f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.LineTo(19.0f, 17.0f)
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
        return _horseshoe!!
    }

private var _horseshoe: ImageVector? = null
