package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = tablerOutlineIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 11.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(4.0f, 19.552284f, 4.447716f, 20.0f, 5.0f, 20.0f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 4.447716f, 4.447716f, 4.0f, 5.0f, 4.0f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.MoveTo(11.0f, 4.0f),
                    PathNode.LineTo(13.0f, 4.0f),
                    PathNode.MoveTo(18.0f, 4.0f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.CurveTo(19.552284f, 4.0f, 20.0f, 4.447716f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.MoveTo(20.0f, 11.0f),
                    PathNode.LineTo(20.0f, 13.0f),
                    PathNode.MoveTo(20.0f, 18.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 19.552284f, 19.552284f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f)
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
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.CurveTo(11.552285f, 12.0f, 12.0f, 12.447715f, 12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 20.0f)
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
        return _resize!!
    }

private var _resize: ImageVector? = null
