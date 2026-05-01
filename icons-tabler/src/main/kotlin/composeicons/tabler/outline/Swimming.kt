package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Swimming: ImageVector
    get() {
        if (_swimming != null) return _swimming!!
        _swimming = tablerOutlineIcon(
            name = "Swimming",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.CurveTo(15.0f, 9.552285f, 15.447715f, 10.0f, 16.0f, 10.0f),
                    PathNode.CurveTo(16.552284f, 10.0f, 17.0f, 9.552285f, 17.0f, 9.0f),
                    PathNode.CurveTo(17.0f, 8.447715f, 16.552284f, 8.0f, 16.0f, 8.0f),
                    PathNode.CurveTo(15.447715f, 8.0f, 15.0f, 8.447715f, 15.0f, 9.0f)
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
                    PathNode.MoveTo(6.0f, 11.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.LineTo(13.5f, 12.0f),
                    PathNode.LineTo(12.0f, 14.0f)
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
                    PathNode.MoveTo(3.0f, 16.75f),
                    PathNode.CurveTo(3.311293f, 16.904776f, 3.652494f, 16.990076f, 4.0f, 17.0f),
                    PathNode.CurveTo(4.790712f, 17.016563f, 5.538824f, 16.642508f, 6.0f, 16.0f),
                    PathNode.CurveTo(6.461177f, 15.357492f, 7.209288f, 14.983437f, 8.0f, 15.0f),
                    PathNode.CurveTo(8.790711f, 14.983437f, 9.538824f, 15.357492f, 10.0f, 16.0f),
                    PathNode.CurveTo(10.461176f, 16.642508f, 11.209289f, 17.016563f, 12.0f, 17.0f),
                    PathNode.CurveTo(12.790711f, 17.016563f, 13.538824f, 16.642508f, 14.0f, 16.0f),
                    PathNode.CurveTo(14.461176f, 15.357492f, 15.209289f, 14.983437f, 16.0f, 15.0f),
                    PathNode.CurveTo(16.790712f, 14.983437f, 17.538824f, 15.357492f, 18.0f, 16.0f),
                    PathNode.CurveTo(18.461176f, 16.642508f, 19.209288f, 17.016563f, 20.0f, 17.0f),
                    PathNode.CurveTo(20.347506f, 16.990076f, 20.688707f, 16.904776f, 21.0f, 16.75f)
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
        return _swimming!!
    }

private var _swimming: ImageVector? = null
