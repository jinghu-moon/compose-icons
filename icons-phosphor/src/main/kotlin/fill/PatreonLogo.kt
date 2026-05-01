package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorFillIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 93.17f),
                    PathNode.CurveTo(232.0f, 134.17f, 202.31f, 145.64f, 178.45f, 154.84f),
                    PathNode.CurveTo(170.04f, 158.08f, 162.1f, 161.14f, 156.24f, 165.12f),
                    PathNode.CurveTo(144.85f, 172.84f, 137.65f, 186.9f, 130.69f, 200.5f),
                    PathNode.CurveTo(120.75f, 219.92f, 110.46f, 240.0f, 87.52f, 240.0f),
                    PathNode.CurveTo(74.61f, 240.0f, 62.91f, 228.36f, 53.67f, 206.34f),
                    PathNode.CurveTo(44.43f, 184.32f, 39.36f, 155.34f, 40.06f, 128.89f),
                    PathNode.CurveTo(41.14f, 88.24f, 54.64f, 66.21f, 65.76f, 54.89f),
                    PathNode.CurveTo(80.71f, 39.69f, 101.0f, 29.59f, 124.44f, 25.69f),
                    PathNode.CurveTo(146.23f, 22.07f, 168.58f, 24.31f, 187.37f, 31.99f),
                    PathNode.CurveTo(215.73f, 43.6f, 232.0f, 65.9f, 232.0f, 93.17f),
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
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
