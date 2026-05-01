package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorThinIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 88.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.02199f, 70.1827f, 214.85118f, 52.745167f, 205.12f, 37.82f),
                    PathNode.CurveTo(204.38286f, 36.68597f, 203.12256f, 36.001266f, 201.77f, 36.0f),
                    PathNode.LineTo(54.23f, 36.0f),
                    PathNode.CurveTo(52.877445f, 36.001266f, 51.61714f, 36.68597f, 50.88f, 37.82f),
                    PathNode.CurveTo(41.148815f, 52.745167f, 35.97802f, 70.1827f, 36.0f, 88.0f),
                    PathNode.LineTo(36.0f, 88.0f),
                    PathNode.CurveTo(36.057865f, 137.23077f, 74.818214f, 177.71333f, 124.0f, 179.91f),
                    PathNode.LineTo(124.0f, 220.0f),
                    PathNode.LineTo(88.0f, 220.0f),
                    PathNode.CurveTo(85.79086f, 220.0f, 84.0f, 221.79086f, 84.0f, 224.0f),
                    PathNode.CurveTo(84.0f, 226.20914f, 85.79086f, 228.0f, 88.0f, 228.0f),
                    PathNode.LineTo(168.0f, 228.0f),
                    PathNode.CurveTo(170.20914f, 228.0f, 172.0f, 226.20914f, 172.0f, 224.0f),
                    PathNode.CurveTo(172.0f, 221.79086f, 170.20914f, 220.0f, 168.0f, 220.0f),
                    PathNode.LineTo(132.0f, 220.0f),
                    PathNode.LineTo(132.0f, 179.91f),
                    PathNode.CurveTo(181.18178f, 177.71333f, 219.94214f, 137.23077f, 220.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.43f, 44.0f),
                    PathNode.LineTo(199.57f, 44.0f),
                    PathNode.CurveTo(207.00592f, 56.07119f, 211.24577f, 69.83697f, 211.89f, 84.0f),
                    PathNode.LineTo(44.11f, 84.0f),
                    PathNode.CurveTo(44.75422f, 69.83697f, 48.99408f, 56.07119f, 56.43f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(83.18534f, 171.94672f, 46.28475f, 136.76141f, 44.1f, 92.0f),
                    PathNode.LineTo(211.9f, 92.0f),
                    PathNode.CurveTo(209.71524f, 136.76141f, 172.81467f, 171.94672f, 128.0f, 172.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandy!!
    }

private var _brandy: ImageVector? = null
