package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Stretching: ImageVector
    get() {
        if (_stretching != null) return _stretching!!
        _stretching = tablerOutlineIcon(
            name = "Stretching",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 5.552285f, 15.447715f, 6.0f, 16.0f, 6.0f),
                    PathNode.CurveTo(16.552284f, 6.0f, 17.0f, 5.552285f, 17.0f, 5.0f),
                    PathNode.CurveTo(17.0f, 4.447716f, 16.552284f, 4.0f, 16.0f, 4.0f),
                    PathNode.CurveTo(15.447715f, 4.0f, 15.0f, 4.447716f, 15.0f, 5.0f)
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
                    PathNode.MoveTo(5.0f, 20.0f),
                    PathNode.LineTo(10.0f, 19.5f),
                    PathNode.LineTo(11.0f, 17.5f)
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
                    PathNode.MoveTo(18.0f, 20.0f),
                    PathNode.LineTo(18.0f, 15.0f),
                    PathNode.LineTo(12.5f, 15.0f),
                    PathNode.LineTo(15.0f, 8.5f),
                    PathNode.LineTo(9.5f, 9.5f),
                    PathNode.LineTo(11.0f, 11.5f)
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
        return _stretching!!
    }

private var _stretching: ImageVector? = null
