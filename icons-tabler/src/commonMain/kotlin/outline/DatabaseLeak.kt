package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseLeak: ImageVector
    get() {
        if (_databaseLeak != null) return _databaseLeak!!
        _databaseLeak = tablerOutlineIcon(
            name = "DatabaseLeak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 7.657f, 7.582f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(16.418f, 9.0f, 20.0f, 7.657f, 20.0f, 6.0f),
                    PathNode.CurveTo(20.0f, 4.343f, 16.418f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.582f, 3.0f, 4.0f, 4.343f, 4.0f, 6.0f)
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
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(4.0f, 19.657f, 7.582f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.418f, 21.0f, 20.0f, 19.657f, 20.0f, 18.0f),
                    PathNode.LineTo(20.0f, 6.0f)
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
                    PathNode.MoveTo(4.0f, 15.0f),
                    PathNode.CurveTo(4.790712f, 15.016563f, 5.538824f, 14.642508f, 6.0f, 14.0f),
                    PathNode.CurveTo(6.461177f, 13.357492f, 7.209288f, 12.983437f, 8.0f, 13.0f),
                    PathNode.CurveTo(8.790711f, 12.983437f, 9.538824f, 13.357492f, 10.0f, 14.0f),
                    PathNode.CurveTo(10.461176f, 14.642508f, 11.209289f, 15.016563f, 12.0f, 15.0f),
                    PathNode.CurveTo(12.790711f, 15.016563f, 13.538824f, 14.642508f, 14.0f, 14.0f),
                    PathNode.CurveTo(14.461176f, 13.357492f, 15.209289f, 12.983437f, 16.0f, 13.0f),
                    PathNode.CurveTo(16.790712f, 12.983437f, 17.538824f, 13.357492f, 18.0f, 14.0f),
                    PathNode.CurveTo(18.461176f, 14.642508f, 19.209288f, 15.016563f, 20.0f, 15.0f)
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
        return _databaseLeak!!
    }

private var _databaseLeak: ImageVector? = null
