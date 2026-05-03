package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Soup: ImageVector
    get() {
        if (_soup != null) return _soup!!
        _soup = tablerOutlineIcon(
            name = "Soup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 11.0f),
                    PathNode.LineTo(20.0f, 11.0f),
                    PathNode.CurveTo(20.552284f, 11.0f, 21.0f, 11.447715f, 21.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.5f),
                    PathNode.CurveTo(21.0f, 14.0f, 18.483f, 18.073f, 17.0f, 19.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(17.0f, 20.552284f, 16.552284f, 21.0f, 16.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(7.447716f, 21.0f, 7.0f, 20.552284f, 7.0f, 20.0f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.CurveTo(5.313f, 17.946f, 3.0f, 14.0f, 3.0f, 12.5f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 11.447715f, 3.447715f, 11.0f, 4.0f, 11.0f)
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
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(11.357492f, 4.461177f, 10.983437f, 5.209288f, 11.0f, 6.0f),
                    PathNode.CurveTo(10.983437f, 6.790712f, 11.357492f, 7.538824f, 12.0f, 8.0f)
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
                    PathNode.MoveTo(16.0f, 4.0f),
                    PathNode.CurveTo(15.357492f, 4.461177f, 14.983437f, 5.209288f, 15.0f, 6.0f),
                    PathNode.CurveTo(14.983437f, 6.790712f, 15.357492f, 7.538824f, 16.0f, 8.0f)
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
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.CurveTo(7.357493f, 4.461177f, 6.983437f, 5.209288f, 7.0f, 6.0f),
                    PathNode.CurveTo(6.983437f, 6.790712f, 7.357493f, 7.538824f, 8.0f, 8.0f)
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
        return _soup!!
    }

private var _soup: ImageVector? = null
