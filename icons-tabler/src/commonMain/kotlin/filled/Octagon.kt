package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = tablerFilledIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.3f, 2.0f),
                    PathNode.LineTo(8.7f, 2.0f),
                    PathNode.CurveTo(8.138f, 2.0f, 7.684f, 2.201f, 7.293f, 2.593f),
                    PathNode.LineTo(2.593f, 7.293f),
                    PathNode.CurveTo(2.206672f, 7.658021f, 1.991494f, 8.168571f, 2.0f, 8.7f),
                    PathNode.LineTo(2.0f, 15.3f),
                    PathNode.CurveTo(2.0f, 15.862f, 2.201f, 16.316f, 2.593f, 16.707f),
                    PathNode.LineTo(7.293f, 21.407f),
                    PathNode.CurveTo(7.684f, 21.799f, 8.138f, 22.0f, 8.7f, 22.0f),
                    PathNode.LineTo(15.3f, 22.0f),
                    PathNode.CurveTo(15.862f, 22.0f, 16.316f, 21.799f, 16.707f, 21.407f),
                    PathNode.LineTo(21.407f, 16.707f),
                    PathNode.CurveTo(21.799f, 16.316f, 22.0f, 15.862f, 22.0f, 15.3f),
                    PathNode.LineTo(22.0f, 8.7f),
                    PathNode.CurveTo(22.0f, 8.138f, 21.799f, 7.684f, 21.407f, 7.293f),
                    PathNode.LineTo(16.707f, 2.593f),
                    PathNode.CurveTo(16.34198f, 2.206672f, 15.831429f, 1.991494f, 15.3f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _octagon!!
    }

private var _octagon: ImageVector? = null
