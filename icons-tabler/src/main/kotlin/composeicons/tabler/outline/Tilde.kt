package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = tablerOutlineIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 10.343f, 5.592f, 9.0f, 7.556f, 9.0f),
                    PathNode.CurveTo(9.519f, 9.0f, 10.666f, 10.5f, 12.0f, 12.0f),
                    PathNode.CurveTo(13.333f, 13.5f, 14.48f, 15.0f, 16.444f, 15.0f),
                    PathNode.CurveTo(18.408f, 15.0f, 20.0f, 13.657f, 20.0f, 12.0f)
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
