package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wiper: ImageVector
    get() {
        if (_wiper != null) return _wiper!!
        _wiper = tablerOutlineIcon(
            name = "Wiper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 18.0f),
                    PathNode.CurveTo(11.0f, 18.552284f, 11.447715f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(12.552285f, 19.0f, 13.0f, 18.552284f, 13.0f, 18.0f),
                    PathNode.CurveTo(13.0f, 17.447716f, 12.552285f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(11.447715f, 17.0f, 11.0f, 17.447716f, 11.0f, 18.0f)
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
                    PathNode.MoveTo(3.0f, 9.0f),
                    PathNode.LineTo(8.5f, 14.5f),
                    PathNode.CurveTo(10.444218f, 12.594286f, 13.555782f, 12.594286f, 15.5f, 14.5f),
                    PathNode.LineTo(21.0f, 9.0f),
                    PathNode.CurveTo(18.722004f, 6.416995f, 15.444007f, 4.937254f, 12.0f, 4.937254f),
                    PathNode.CurveTo(8.555993f, 4.937254f, 5.277997f, 6.416995f, 3.0f, 9.0f)
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
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.LineTo(9.8f, 5.2f)
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
        return _wiper!!
    }

private var _wiper: ImageVector? = null
