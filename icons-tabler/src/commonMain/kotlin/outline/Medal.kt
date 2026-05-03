package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = tablerOutlineIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.LineTo(12.0f, 7.0f),
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.MoveTo(16.0f, 4.0f),
                    PathNode.LineTo(16.0f, 10.0f)
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
                    PathNode.MoveTo(12.0f, 18.5f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.LineTo(9.5f, 16.5f),
                    PathNode.LineTo(7.5f, 14.5f),
                    PathNode.LineTo(10.5f, 14.0f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.LineTo(13.5f, 14.0f),
                    PathNode.LineTo(16.5f, 14.5f),
                    PathNode.LineTo(14.5f, 16.5f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.LineTo(12.0f, 18.5f)
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
        return _medal!!
    }

private var _medal: ImageVector? = null
