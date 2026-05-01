package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Beach: ImageVector
    get() {
        if (_beach != null) return _beach!!
        _beach = tablerOutlineIcon(
            name = "Beach",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.553f, 16.75f),
                    PathNode.CurveTo(14.624137f, 13.821469f, 9.875863f, 13.821469f, 6.947f, 16.75f)
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
                    PathNode.MoveTo(18.0f, 3.804f),
                    PathNode.CurveTo(15.130318f, 2.147224f, 11.460902f, 3.130391f, 9.804f, 6.0f),
                    PathNode.LineTo(20.196f, 12.0f),
                    PathNode.CurveTo(21.852776f, 9.130318f, 20.86961f, 5.460902f, 18.0f, 3.804f)
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
                    PathNode.MoveTo(16.732f, 10.0f),
                    PathNode.CurveTo(18.39f, 7.13f, 18.957f, 4.356f, 18.0f, 3.804f),
                    PathNode.CurveTo(17.043f, 3.252f, 14.925f, 5.13f, 13.268f, 8.0f)
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
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.LineTo(12.0f, 14.196f)
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
                    PathNode.MoveTo(3.0f, 19.25f),
                    PathNode.CurveTo(3.311293f, 19.095224f, 3.652494f, 19.009924f, 4.0f, 19.0f),
                    PathNode.CurveTo(4.790712f, 18.983437f, 5.538824f, 19.357492f, 6.0f, 20.0f),
                    PathNode.CurveTo(6.461177f, 20.642508f, 7.209288f, 21.016563f, 8.0f, 21.0f),
                    PathNode.CurveTo(8.790711f, 21.016563f, 9.538824f, 20.642508f, 10.0f, 20.0f),
                    PathNode.CurveTo(10.461176f, 19.357492f, 11.209289f, 18.983437f, 12.0f, 19.0f),
                    PathNode.CurveTo(12.790711f, 18.983437f, 13.538824f, 19.357492f, 14.0f, 20.0f),
                    PathNode.CurveTo(14.461176f, 20.642508f, 15.209289f, 21.016563f, 16.0f, 21.0f),
                    PathNode.CurveTo(16.790712f, 21.016563f, 17.538824f, 20.642508f, 18.0f, 20.0f),
                    PathNode.CurveTo(18.461176f, 19.357492f, 19.209288f, 18.983437f, 20.0f, 19.0f),
                    PathNode.CurveTo(20.347506f, 19.009924f, 20.688707f, 19.095224f, 21.0f, 19.25f)
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
        return _beach!!
    }

private var _beach: ImageVector? = null
