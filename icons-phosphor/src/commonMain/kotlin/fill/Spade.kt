package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorFillIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 136.0f),
                    PathNode.CurveTo(231.99329f, 155.88022f, 221.44714f, 174.26662f, 204.29025f, 184.30977f),
                    PathNode.CurveTo(187.13338f, 194.35292f, 165.938f, 194.5471f, 148.6f, 184.82f),
                    PathNode.LineTo(159.66f, 221.7f),
                    PathNode.CurveTo(160.387f, 224.12192f, 159.92615f, 226.74496f, 158.41714f, 228.77403f),
                    PathNode.CurveTo(156.90816f, 230.8031f, 154.52867f, 231.99928f, 152.0f, 232.0f),
                    PathNode.LineTo(104.0f, 232.0f),
                    PathNode.CurveTo(101.47132f, 231.99928f, 99.09185f, 230.8031f, 97.582855f, 228.77403f),
                    PathNode.CurveTo(96.07385f, 226.74496f, 95.61301f, 224.12192f, 96.34f, 221.7f),
                    PathNode.LineTo(107.4f, 184.82f),
                    PathNode.CurveTo(90.06199f, 194.5471f, 68.86663f, 194.35292f, 51.70975f, 184.30977f),
                    PathNode.CurveTo(34.552876f, 174.26662f, 24.006716f, 155.88022f, 24.0f, 136.0f),
                    PathNode.CurveTo(24.0f, 104.0f, 41.65f, 73.16f, 75.0f, 46.73f),
                    PathNode.CurveTo(90.3113f, 34.655006f, 107.07107f, 24.540026f, 124.89f, 16.62f),
                    PathNode.CurveTo(126.85944f, 15.789904f, 129.08057f, 15.789904f, 131.05f, 16.62f),
                    PathNode.CurveTo(148.88986f, 24.535608f, 165.67001f, 34.65073f, 181.0f, 46.73f),
                    PathNode.CurveTo(214.35f, 73.16f, 232.0f, 104.0f, 232.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _spade!!
    }

private var _spade: ImageVector? = null
