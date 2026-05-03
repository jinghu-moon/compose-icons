package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Percentage: ImageVector
    get() {
        if (_percentage != null) return _percentage!!
        _percentage = tablerOutlineIcon(
            name = "Percentage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 17.0f),
                    PathNode.CurveTo(16.0f, 17.552284f, 16.447716f, 18.0f, 17.0f, 18.0f),
                    PathNode.CurveTo(17.552284f, 18.0f, 18.0f, 17.552284f, 18.0f, 17.0f),
                    PathNode.CurveTo(18.0f, 16.447716f, 17.552284f, 16.0f, 17.0f, 16.0f),
                    PathNode.CurveTo(16.447716f, 16.0f, 16.0f, 16.447716f, 16.0f, 17.0f)
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
                    PathNode.MoveTo(6.0f, 7.0f),
                    PathNode.CurveTo(6.0f, 7.552285f, 6.447716f, 8.0f, 7.0f, 8.0f),
                    PathNode.CurveTo(7.552285f, 8.0f, 8.0f, 7.552285f, 8.0f, 7.0f),
                    PathNode.CurveTo(8.0f, 6.447716f, 7.552285f, 6.0f, 7.0f, 6.0f),
                    PathNode.CurveTo(6.447716f, 6.0f, 6.0f, 6.447716f, 6.0f, 7.0f)
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
                    PathNode.MoveTo(6.0f, 18.0f),
                    PathNode.LineTo(18.0f, 6.0f)
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
        return _percentage!!
    }

private var _percentage: ImageVector? = null
