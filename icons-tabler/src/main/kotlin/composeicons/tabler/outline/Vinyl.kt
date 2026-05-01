package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Vinyl: ImageVector
    get() {
        if (_vinyl != null) return _vinyl!!
        _vinyl = tablerOutlineIcon(
            name = "Vinyl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 3.937f),
                    PathNode.CurveTo(12.398212f, 2.150013f, 8.04806f, 2.968845f, 5.342478f, 5.943071f),
                    PathNode.CurveTo(2.636896f, 8.917297f, 2.23231f, 13.325316f, 4.351275f, 16.74236f),
                    PathNode.CurveTo(6.47024f, 20.1594f, 10.598656f, 21.756432f, 14.465558f, 20.654951f),
                    PathNode.CurveTo(18.33246f, 19.55347f, 20.999668f, 16.02072f, 21.0f, 12.0f)
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
                    PathNode.MoveTo(11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 12.552285f, 11.447715f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(12.552285f, 13.0f, 13.0f, 12.552285f, 13.0f, 12.0f),
                    PathNode.CurveTo(13.0f, 11.447715f, 12.552285f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(11.447715f, 11.0f, 11.0f, 11.447715f, 11.0f, 12.0f)
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
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(19.0f, 4.552285f, 19.447716f, 5.0f, 20.0f, 5.0f),
                    PathNode.CurveTo(20.552284f, 5.0f, 21.0f, 4.552285f, 21.0f, 4.0f),
                    PathNode.CurveTo(21.0f, 3.447715f, 20.552284f, 3.0f, 20.0f, 3.0f),
                    PathNode.CurveTo(19.447716f, 3.0f, 19.0f, 3.447715f, 19.0f, 4.0f)
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
                    PathNode.MoveTo(20.0f, 4.0f),
                    PathNode.LineTo(16.5f, 14.0f),
                    PathNode.LineTo(14.0f, 16.0f)
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
        return _vinyl!!
    }

private var _vinyl: ImageVector? = null
