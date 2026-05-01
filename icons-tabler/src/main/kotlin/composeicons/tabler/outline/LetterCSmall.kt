package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterCSmall: ImageVector
    get() {
        if (_letterCSmall != null) return _letterCSmall!!
        _letterCSmall = tablerOutlineIcon(
            name = "LetterCSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.CurveTo(14.0f, 8.895431f, 13.104569f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(10.895431f, 8.0f, 10.0f, 8.895431f, 10.0f, 10.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.CurveTo(10.0f, 15.104569f, 10.895431f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(13.104569f, 16.0f, 14.0f, 15.104569f, 14.0f, 14.0f)
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
        return _letterCSmall!!
    }

private var _letterCSmall: ImageVector? = null
