package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mesh: ImageVector
    get() {
        if (_mesh != null) return _mesh!!
        _mesh = tablerOutlineIcon(
            name = "Mesh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 9.0f),
                    PathNode.LineTo(21.0f, 9.0f)
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
                    PathNode.MoveTo(3.0f, 15.0f),
                    PathNode.LineTo(21.0f, 15.0f)
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
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.CurveTo(8.485f, 4.445f, 11.5f, 7.312f, 11.5f, 12.0f),
                    PathNode.CurveTo(11.5f, 12.663f, 11.43f, 16.848f, 8.0f, 20.0f)
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
                    PathNode.MoveTo(15.0f, 4.0f),
                    PathNode.CurveTo(16.314518f, 6.461755f, 17.00277f, 9.209268f, 17.004f, 12.0f),
                    PathNode.CurveTo(17.004f, 13.51f, 16.803f, 16.628f, 15.0f, 20.0f)
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
                    PathNode.MoveTo(18.778f, 20.0f),
                    PathNode.LineTo(5.222f, 20.0f),
                    PathNode.CurveTo(4.632527f, 20.000532f, 4.067043f, 19.7666f, 3.650222f, 19.349777f),
                    PathNode.CurveTo(3.233401f, 18.932957f, 2.999469f, 18.367474f, 3.0f, 17.778f),
                    PathNode.LineTo(3.0f, 6.222f),
                    PathNode.CurveTo(3.0f, 4.995f, 3.995f, 4.0f, 5.222f, 4.0f),
                    PathNode.LineTo(18.778f, 4.0f),
                    PathNode.CurveTo(20.005f, 4.0f, 21.0f, 4.995f, 21.0f, 6.222f),
                    PathNode.LineTo(21.0f, 17.778f),
                    PathNode.CurveTo(21.000532f, 18.367474f, 20.7666f, 18.932957f, 20.349777f, 19.349777f),
                    PathNode.CurveTo(19.932957f, 19.7666f, 19.367474f, 20.000532f, 18.778f, 20.0f)
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
        return _mesh!!
    }

private var _mesh: ImageVector? = null
