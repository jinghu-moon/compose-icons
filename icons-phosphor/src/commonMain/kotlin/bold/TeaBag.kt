package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorBoldIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 156.0f),
                    PathNode.CurveTo(217.37259f, 156.0f, 212.0f, 150.62741f, 212.0f, 144.0f),
                    PathNode.LineTo(212.0f, 64.0f),
                    PathNode.CurveTo(212.0f, 30.862917f, 185.13708f, 4.0f, 152.0f, 4.0f),
                    PathNode.CurveTo(118.862915f, 4.0f, 92.0f, 30.862917f, 92.0f, 64.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.LineTo(76.53f, 68.0f),
                    PathNode.CurveTo(69.50993f, 68.01969f, 63.008766f, 71.70052f, 59.38f, 77.71f),
                    PathNode.LineTo(38.85f, 111.92f),
                    PathNode.CurveTo(36.986557f, 115.03265f, 36.001637f, 118.592186f, 36.0f, 122.22f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(152.0f, 236.0f),
                    PathNode.CurveTo(163.0457f, 236.0f, 172.0f, 227.0457f, 172.0f, 216.0f),
                    PathNode.LineTo(172.0f, 122.22f),
                    PathNode.CurveTo(172.00006f, 118.595116f, 171.01495f, 115.038345f, 169.15f, 111.93f),
                    PathNode.LineTo(148.62f, 77.71f),
                    PathNode.CurveTo(144.99123f, 71.70052f, 138.49007f, 68.01969f, 131.47f, 68.0f),
                    PathNode.LineTo(116.0f, 68.0f),
                    PathNode.LineTo(116.0f, 64.0f),
                    PathNode.CurveTo(116.0f, 44.11775f, 132.11775f, 28.0f, 152.0f, 28.0f),
                    PathNode.CurveTo(171.88223f, 28.0f, 188.0f, 44.11775f, 188.0f, 64.0f),
                    PathNode.LineTo(188.0f, 144.0f),
                    PathNode.CurveTo(188.0f, 163.88223f, 204.11777f, 180.0f, 224.0f, 180.0f),
                    PathNode.CurveTo(230.62741f, 180.0f, 236.0f, 174.62741f, 236.0f, 168.0f),
                    PathNode.CurveTo(236.0f, 161.37259f, 230.62741f, 156.0f, 224.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(129.21f, 92.0f),
                    PathNode.LineTo(148.0f, 123.32f),
                    PathNode.LineTo(148.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 123.32f),
                    PathNode.LineTo(78.79f, 92.0f),
                    PathNode.LineTo(92.0f, 92.0f),
                    PathNode.LineTo(92.0f, 136.0f),
                    PathNode.CurveTo(92.0f, 142.62741f, 97.37258f, 148.0f, 104.0f, 148.0f),
                    PathNode.CurveTo(110.62742f, 148.0f, 116.0f, 142.62741f, 116.0f, 136.0f),
                    PathNode.LineTo(116.0f, 92.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
