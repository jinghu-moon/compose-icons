package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlertTriangleOff: ImageVector
    get() {
        if (_alertTriangleOff != null) return _alertTriangleOff!!
        _alertTriangleOff = tablerOutlineIcon(
            name = "AlertTriangleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.998f, 17.997f),
                    PathNode.CurveTo(21.984257f, 17.690075f, 21.89679f, 17.390972f, 21.743f, 17.125f),
                    PathNode.LineTo(13.637f, 3.591f),
                    PathNode.CurveTo(13.290141f, 3.018487f, 12.66939f, 2.66878f, 12.0f, 2.66878f),
                    PathNode.CurveTo(11.33061f, 2.66878f, 10.709859f, 3.018487f, 10.363f, 3.591f),
                    PathNode.LineTo(9.323f, 5.327f),
                    PathNode.MoveTo(7.83f, 7.82f),
                    PathNode.LineTo(2.257f, 17.124f),
                    PathNode.CurveTo(1.916961f, 17.712866f, 1.914885f, 18.437931f, 2.251546f, 19.028734f),
                    PathNode.CurveTo(2.588207f, 19.619537f, 3.213051f, 19.98736f, 3.893f, 19.995f),
                    PathNode.LineTo(20.0f, 19.995f)
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
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.01f, 16.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 8.0f)
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
        return _alertTriangleOff!!
    }

private var _alertTriangleOff: ImageVector? = null
