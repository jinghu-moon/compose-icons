package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorFillIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(173.79f, 51.48f),
                    PathNode.CurveTo(161.35413f, 38.374966f, 147.35994f, 26.842436f, 132.12f, 17.14f),
                    PathNode.CurveTo(129.58453f, 15.616695f, 126.41546f, 15.616695f, 123.88f, 17.14f),
                    PathNode.CurveTo(108.640076f, 26.842436f, 94.645874f, 38.374966f, 82.21f, 51.48f),
                    PathNode.CurveTo(54.59f, 80.48f, 40.0f, 112.47f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 192.60106f, 79.39894f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(176.60106f, 232.0f, 216.0f, 192.60106f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 112.47f, 201.41f, 80.48f, 173.79f, 51.48f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 184.0f),
                    PathNode.CurveTo(96.0f, 156.33f, 118.53f, 136.72f, 128.0f, 129.7f),
                    PathNode.CurveTo(137.48f, 136.7f, 160.0f, 156.33f, 160.0f, 184.0f),
                    PathNode.CurveTo(160.0f, 201.67311f, 145.67311f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(110.32689f, 216.0f, 96.0f, 201.67311f, 96.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _flame!!
    }

private var _flame: ImageVector? = null
