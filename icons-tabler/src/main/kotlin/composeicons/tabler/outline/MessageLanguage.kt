package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageLanguage: ImageVector
    get() {
        if (_messageLanguage != null) return _messageLanguage!!
        _messageLanguage = tablerOutlineIcon(
            name = "MessageLanguage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 21.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.CurveTo(4.0f, 6.343146f, 5.343146f, 5.0f, 7.0f, 5.0f),
                    PathNode.LineTo(17.0f, 5.0f),
                    PathNode.CurveTo(18.656855f, 5.0f, 20.0f, 6.343146f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.CurveTo(20.0f, 15.656855f, 18.656855f, 17.0f, 17.0f, 17.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.LineTo(4.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.CurveTo(10.0f, 8.895431f, 10.895431f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(13.104569f, 8.0f, 14.0f, 8.895431f, 14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 14.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _messageLanguage!!
    }

private var _messageLanguage: ImageVector? = null
