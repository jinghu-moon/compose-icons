package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorThinIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.77f, 124.0f),
                    PathNode.CurveTo(163.02013f, 117.247475f, 160.36322f, 110.848015f, 156.11f, 105.55f),
                    PathNode.LineTo(195.79f, 65.87f),
                    PathNode.CurveTo(210.44017f, 81.79172f, 218.98438f, 102.38353f, 219.91f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 143.46397f, 143.46397f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(112.536026f, 156.0f, 100.0f, 143.46397f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 112.536026f, 112.536026f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(143.46397f, 100.0f, 156.0f, 112.536026f, 156.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(86.84155f, 220.03015f, 50.67073f, 192.71956f, 39.430107f, 153.12578f),
                    PathNode.CurveTo(28.189487f, 113.532f, 44.614304f, 71.28957f, 79.648834f, 49.68863f),
                    PathNode.CurveTo(114.68336f, 28.087685f, 159.80246f, 32.38448f, 190.13f, 60.21f),
                    PathNode.LineTo(150.45f, 99.89f),
                    PathNode.CurveTo(137.61288f, 89.642136f, 119.46691f, 89.38312f, 106.34252f, 99.26041f),
                    PathNode.CurveTo(93.21814f, 109.137695f, 88.44386f, 126.646255f, 94.737686f, 141.81853f),
                    PathNode.CurveTo(101.03152f, 156.99081f, 116.797226f, 165.9789f, 133.05946f, 163.66591f),
                    PathNode.CurveTo(149.3217f, 161.3529f, 161.95613f, 148.32545f, 163.77f, 132.0f),
                    PathNode.LineTo(219.91f, 132.0f),
                    PathNode.CurveTo(217.71333f, 181.18178f, 177.23077f, 219.94214f, 128.0f, 220.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _disc!!
    }

private var _disc: ImageVector? = null
