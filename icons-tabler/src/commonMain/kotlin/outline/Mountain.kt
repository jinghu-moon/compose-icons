package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mountain: ImageVector
    get() {
        if (_mountain != null) return _mountain!!
        _mountain = tablerOutlineIcon(
            name = "Mountain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.LineTo(14.079f, 5.388f),
                    PathNode.CurveTo(13.698689f, 4.584269f, 12.889169f, 4.071747f, 12.0f, 4.071747f),
                    PathNode.CurveTo(11.110831f, 4.071747f, 10.301311f, 4.584269f, 9.921f, 5.388f),
                    PathNode.LineTo(3.0f, 20.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.5f, 11.0f),
                    PathNode.LineTo(9.5f, 13.5f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.LineTo(16.5f, 12.0f)
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
        return _mountain!!
    }

private var _mountain: ImageVector? = null
