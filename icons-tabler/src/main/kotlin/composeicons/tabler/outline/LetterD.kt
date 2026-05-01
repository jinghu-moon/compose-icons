package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterD: ImageVector
    get() {
        if (_letterD != null) return _letterD!!
        _letterD = tablerOutlineIcon(
            name = "LetterD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 4.0f),
                    PathNode.LineTo(13.0f, 4.0f),
                    PathNode.CurveTo(15.761424f, 4.0f, 18.0f, 6.238577f, 18.0f, 9.0f),
                    PathNode.LineTo(18.0f, 15.0f),
                    PathNode.CurveTo(18.0f, 17.761423f, 15.761424f, 20.0f, 13.0f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.LineTo(7.0f, 4.0f)
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
        return _letterD!!
    }

private var _letterD: ImageVector? = null
