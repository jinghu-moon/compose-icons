package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDiscord: ImageVector
    get() {
        if (_brandDiscord != null) return _brandDiscord!!
        _brandDiscord = tablerOutlineIcon(
            name = "BrandDiscord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 12.552285f, 8.447715f, 13.0f, 9.0f, 13.0f),
                    PathNode.CurveTo(9.552285f, 13.0f, 10.0f, 12.552285f, 10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 11.447715f, 9.552285f, 11.0f, 9.0f, 11.0f),
                    PathNode.CurveTo(8.447715f, 11.0f, 8.0f, 11.447715f, 8.0f, 12.0f)
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
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 12.552285f, 14.447715f, 13.0f, 15.0f, 13.0f),
                    PathNode.CurveTo(15.552285f, 13.0f, 16.0f, 12.552285f, 16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 11.447715f, 15.552285f, 11.0f, 15.0f, 11.0f),
                    PathNode.CurveTo(14.447715f, 11.0f, 14.0f, 11.447715f, 14.0f, 12.0f)
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
                    PathNode.MoveTo(15.5f, 17.0f),
                    PathNode.CurveTo(15.5f, 18.0f, 17.0f, 20.0f, 17.5f, 20.0f),
                    PathNode.CurveTo(19.0f, 20.0f, 20.333f, 18.333f, 21.0f, 17.0f),
                    PathNode.CurveTo(21.667f, 15.333f, 21.5f, 11.167f, 19.5f, 5.5f),
                    PathNode.CurveTo(18.043f, 4.485f, 16.5f, 4.16f, 15.0f, 4.0f),
                    PathNode.LineTo(14.028f, 5.923f),
                    PathNode.CurveTo(12.686917f, 5.691497f, 11.316083f, 5.691497f, 9.975f, 5.923f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(7.5f, 4.16f, 5.957f, 4.485f, 4.5f, 5.5f),
                    PathNode.CurveTo(2.5f, 11.167f, 2.333f, 15.333f, 3.0f, 17.0f),
                    PathNode.CurveTo(3.667f, 18.333f, 5.0f, 20.0f, 6.5f, 20.0f),
                    PathNode.CurveTo(7.0f, 20.0f, 8.5f, 18.0f, 8.5f, 17.0f)
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
                    PathNode.MoveTo(7.0f, 16.5f),
                    PathNode.CurveTo(10.5f, 17.5f, 13.5f, 17.5f, 17.0f, 16.5f)
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
        return _brandDiscord!!
    }

private var _brandDiscord: ImageVector? = null
