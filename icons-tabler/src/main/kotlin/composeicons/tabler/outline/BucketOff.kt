package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BucketOff: ImageVector
    get() {
        if (_bucketOff != null) return _bucketOff!!
        _bucketOff = tablerOutlineIcon(
            name = "BucketOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.029f, 5.036f),
                    PathNode.CurveTo(4.374f, 5.616f, 4.0f, 6.286f, 4.0f, 7.0f),
                    PathNode.CurveTo(4.0f, 9.033f, 7.033f, 10.712f, 10.96f, 10.967f),
                    PathNode.MoveTo(14.748f, 10.757f),
                    PathNode.CurveTo(17.812f, 10.198f, 20.0f, 8.728f, 20.0f, 7.0f),
                    PathNode.CurveTo(20.0f, 4.79f, 16.418f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.395f, 3.0f, 8.9f, 3.236f, 7.648f, 3.643f)
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
                    PathNode.MoveTo(4.0f, 7.0f),
                    PathNode.CurveTo(4.0f, 7.664f, 4.088f, 8.324001f, 4.263f, 8.965f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.CurveTo(7.5f, 20.5f, 9.239f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(14.761f, 21.0f, 16.5f, 20.5f, 17.0f, 19.0f),
                    PathNode.CurveTo(17.1f, 18.7f, 17.252f, 18.188f, 17.457f, 17.465f),
                    PathNode.MoveTo(18.319f, 14.319f),
                    PathNode.CurveTo(18.581f, 13.344f, 19.054f, 11.559f, 19.737f, 8.965f),
                    PathNode.CurveTo(19.911816f, 8.324641f, 20.000265f, 7.663792f, 20.0f, 7.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _bucketOff!!
    }

private var _bucketOff: ImageVector? = null
