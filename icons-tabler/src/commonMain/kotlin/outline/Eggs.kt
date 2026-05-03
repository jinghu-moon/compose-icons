package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Eggs: ImageVector
    get() {
        if (_eggs != null) return _eggs!!
        _eggs = tablerOutlineIcon(
            name = "Eggs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 22.0f),
                    PathNode.CurveTo(10.0f, 22.0f, 8.132f, 19.882f, 8.0f, 17.0f),
                    PathNode.CurveTo(8.0f, 14.0f, 10.0f, 12.0f, 13.0f, 12.0f),
                    PathNode.CurveTo(17.0f, 12.0f, 21.01f, 14.5f, 21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 19.5f, 17.0f, 22.0f, 13.0f, 22.0f)
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
                    PathNode.MoveTo(8.0f, 18.0f),
                    PathNode.CurveTo(4.97f, 17.804f, 3.0f, 15.691f, 3.0f, 12.62f),
                    PathNode.CurveTo(3.0f, 8.313f, 5.75f, 3.995f, 8.5f, 4.0f),
                    PathNode.CurveTo(11.114f, 4.0f, 13.748f, 7.915f, 14.0f, 12.0f)
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
        return _eggs!!
    }

private var _eggs: ImageVector? = null
