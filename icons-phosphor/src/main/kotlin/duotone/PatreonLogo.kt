package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorDuotoneIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 93.16f),
                    PathNode.CurveTo(224.0f, 142.16f, 175.83f, 142.16f, 151.75f, 158.5f),
                    PathNode.CurveTo(121.88f, 178.76f, 119.64f, 232.0f, 87.52f, 232.0f),
                    PathNode.CurveTo(55.4f, 232.0f, 25.78f, 107.0f, 71.52f, 60.49f),
                    PathNode.CurveTo(119.64f, 11.49f, 224.0f, 27.82f, 224.0f, 93.16f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(187.37f, 32.0f),
                    PathNode.CurveTo(168.58f, 24.32f, 146.23f, 22.08f, 124.44f, 25.7f),
                    PathNode.CurveTo(101.0f, 29.6f, 80.71f, 39.7f, 65.76f, 54.9f),
                    PathNode.CurveTo(54.64f, 66.22f, 41.14f, 88.25f, 40.06f, 128.9f),
                    PathNode.CurveTo(39.36f, 155.39f, 44.45f, 184.34f, 53.67f, 206.35f),
                    PathNode.CurveTo(62.89f, 228.36f, 74.61f, 240.0f, 87.52f, 240.0f),
                    PathNode.CurveTo(110.46f, 240.0f, 120.75f, 219.92f, 130.69f, 200.5f),
                    PathNode.CurveTo(137.69f, 186.9f, 144.85f, 172.84f, 156.24f, 165.12f),
                    PathNode.CurveTo(162.1f, 161.12f, 170.04f, 158.12f, 178.45f, 154.84f),
                    PathNode.CurveTo(202.31f, 145.64f, 232.0f, 134.18f, 232.0f, 93.17f),
                    PathNode.CurveTo(232.0f, 65.9f, 215.73f, 43.6f, 187.37f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.69f, 139.91f),
                    PathNode.CurveTo(163.41f, 143.49f, 154.64f, 146.91f, 147.26f, 151.91f),
                    PathNode.CurveTo(132.48f, 161.91f, 123.96f, 178.57f, 116.45f, 193.24f),
                    PathNode.CurveTo(106.67f, 212.3f, 100.05f, 224.0f, 87.52f, 224.0f),
                    PathNode.CurveTo(83.0f, 224.0f, 75.34f, 216.63f, 68.43f, 200.15f),
                    PathNode.CurveTo(60.04f, 180.15f, 55.43f, 153.66f, 56.06f, 129.32f),
                    PathNode.CurveTo(56.79f, 101.66f, 64.29f, 79.21f, 77.17f, 66.11f),
                    PathNode.CurveTo(95.23f, 47.74f, 120.79f, 40.0f, 144.57f, 40.0f),
                    PathNode.CurveTo(157.1358f, 39.888638f, 169.6068f, 42.183247f, 181.31f, 46.76f),
                    PathNode.CurveTo(194.31f, 52.06f, 216.0f, 65.14f, 216.0f, 93.13f),
                    PathNode.CurveTo(216.0f, 123.21f, 195.93f, 131.0f, 172.69f, 139.91f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
