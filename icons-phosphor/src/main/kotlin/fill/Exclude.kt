package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Exclude: ImageVector
    get() {
        if (_exclude != null) return _exclude!!
        _exclude = phosphorFillIcon(
            name = "Exclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 160.0f),
                    PathNode.CurveTo(239.97502f, 201.31587f, 208.4926f, 235.81645f, 167.35153f, 239.61313f),
                    PathNode.CurveTo(126.21047f, 243.40982f, 88.945786f, 215.25351f, 81.36f, 174.64f),
                    PathNode.CurveTo(107.28139f, 179.46132f, 133.9139f, 171.20099f, 152.55745f, 152.55745f),
                    PathNode.CurveTo(171.20099f, 133.9139f, 179.46132f, 107.28139f, 174.64f, 81.36f),
                    PathNode.CurveTo(212.5226f, 88.4116f, 239.99565f, 121.46668f, 240.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.CurveTo(164.91133f, 80.004616f, 169.81186f, 80.459854f, 174.64f, 81.36f),
                    PathNode.CurveTo(167.2525f, 41.64174f, 131.41165f, 13.664274f, 91.08808f, 16.139156f),
                    PathNode.CurveTo(50.764507f, 18.614038f, 18.614038f, 50.764507f, 16.139156f, 91.08808f),
                    PathNode.CurveTo(13.664274f, 131.41165f, 41.64174f, 167.2525f, 81.36f, 174.64f),
                    PathNode.CurveTo(77.00848f, 151.26273f, 83.281944f, 127.1612f, 98.47892f, 108.87227f),
                    PathNode.CurveTo(113.67589f, 90.583336f, 136.22116f, 80.002686f, 160.0f, 80.0f),
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
        return _exclude!!
    }

private var _exclude: ImageVector? = null
