package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BucketDroplet: ImageVector
    get() {
        if (_bucketDroplet != null) return _bucketDroplet!!
        _bucketDroplet = tablerOutlineIcon(
            name = "BucketDroplet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 16.0f),
                    PathNode.LineTo(6.465f, 17.638f),
                    PathNode.CurveTo(7.192968f, 18.420593f, 7.176961f, 19.63725f, 6.428655f, 20.400421f),
                    PathNode.CurveTo(5.680351f, 21.16359f, 4.464242f, 21.203522f, 3.667484f, 20.491085f),
                    PathNode.CurveTo(2.870726f, 19.77865f, 2.774939f, 18.565662f, 3.45f, 17.737f),
                    PathNode.LineTo(5.0f, 16.0f)
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
                    PathNode.MoveTo(13.737f, 9.737f),
                    PathNode.CurveTo(16.036f, 7.437f, 16.967f, 4.642f, 15.818f, 3.492f),
                    PathNode.CurveTo(14.668f, 2.342f, 11.873f, 3.275f, 9.574f, 5.574f),
                    PathNode.CurveTo(7.274f, 7.873f, 6.343f, 10.669f, 7.492f, 11.818f),
                    PathNode.CurveTo(8.642f, 12.968f, 11.438f, 12.036f, 13.737f, 9.737f)
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
                    PathNode.MoveTo(7.492f, 11.818f),
                    PathNode.CurveTo(7.854f, 12.18f, 8.26f, 12.494f, 8.7f, 12.752f),
                    PathNode.LineTo(15.595f, 16.799f),
                    PathNode.CurveTo(16.673f, 17.356f, 17.85f, 16.724f, 19.287f, 15.287f),
                    PathNode.CurveTo(20.724f, 13.85f, 21.357f, 12.673f, 20.799f, 11.595f),
                    PathNode.CurveTo(20.427f, 10.877f, 19.079f, 8.578f, 16.752f, 4.7f),
                    PathNode.CurveTo(16.493248f, 4.259291f, 16.179386f, 3.853354f, 15.818f, 3.492f)
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
        return _bucketDroplet!!
    }

private var _bucketDroplet: ImageVector? = null
