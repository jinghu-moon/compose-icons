package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorThinIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 64.0f),
                    PathNode.CurveTo(228.0015f, 49.055603f, 216.26657f, 36.744045f, 201.33928f, 36.029236f),
                    PathNode.CurveTo(186.41199f, 35.314426f, 173.55434f, 46.448345f, 172.12785f, 61.324505f),
                    PathNode.CurveTo(170.70135f, 76.20066f, 181.20888f, 89.57509f, 196.0f, 91.71f),
                    PathNode.LineTo(196.0f, 112.0f),
                    PathNode.CurveTo(196.0f, 118.62742f, 190.62741f, 124.0f, 184.0f, 124.0f),
                    PathNode.LineTo(96.0f, 124.0f),
                    PathNode.CurveTo(91.67154f, 123.99348f, 87.458855f, 125.397705f, 84.0f, 128.0f),
                    PathNode.LineTo(84.0f, 91.71f),
                    PathNode.CurveTo(98.53531f, 89.61201f, 108.979805f, 76.64027f, 107.92811f, 61.99204f),
                    PathNode.CurveTo(106.87642f, 47.34381f, 94.685936f, 35.99719f, 80.0f, 35.99719f),
                    PathNode.CurveTo(65.314064f, 35.99719f, 53.123585f, 47.34381f, 52.071888f, 61.99204f),
                    PathNode.CurveTo(51.020195f, 76.64027f, 61.464695f, 89.61201f, 76.0f, 91.71f),
                    PathNode.LineTo(76.0f, 164.29f),
                    PathNode.CurveTo(61.464695f, 166.38799f, 51.020195f, 179.35973f, 52.071888f, 194.00797f),
                    PathNode.CurveTo(53.123585f, 208.65619f, 65.314064f, 220.0028f, 80.0f, 220.0028f),
                    PathNode.CurveTo(94.685936f, 220.0028f, 106.87642f, 208.65619f, 107.92811f, 194.00797f),
                    PathNode.CurveTo(108.979805f, 179.35973f, 98.53531f, 166.38799f, 84.0f, 164.29f),
                    PathNode.LineTo(84.0f, 144.0f),
                    PathNode.CurveTo(84.0f, 137.37259f, 89.37258f, 132.0f, 96.0f, 132.0f),
                    PathNode.LineTo(184.0f, 132.0f),
                    PathNode.CurveTo(195.0457f, 132.0f, 204.0f, 123.04569f, 204.0f, 112.0f),
                    PathNode.LineTo(204.0f, 91.71f),
                    PathNode.CurveTo(217.77498f, 89.72175f, 227.9986f, 77.91772f, 228.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 64.0f),
                    PathNode.CurveTo(60.0f, 52.954304f, 68.95431f, 44.0f, 80.0f, 44.0f),
                    PathNode.CurveTo(91.04569f, 44.0f, 100.0f, 52.954304f, 100.0f, 64.0f),
                    PathNode.CurveTo(100.0f, 75.04569f, 91.04569f, 84.0f, 80.0f, 84.0f),
                    PathNode.CurveTo(68.95431f, 84.0f, 60.0f, 75.04569f, 60.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 192.0f),
                    PathNode.CurveTo(100.0f, 203.0457f, 91.04569f, 212.0f, 80.0f, 212.0f),
                    PathNode.CurveTo(68.95431f, 212.0f, 60.0f, 203.0457f, 60.0f, 192.0f),
                    PathNode.CurveTo(60.0f, 180.9543f, 68.95431f, 172.0f, 80.0f, 172.0f),
                    PathNode.CurveTo(91.04569f, 172.0f, 100.0f, 180.9543f, 100.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 84.0f),
                    PathNode.CurveTo(188.9543f, 84.0f, 180.0f, 75.04569f, 180.0f, 64.0f),
                    PathNode.CurveTo(180.0f, 52.954304f, 188.9543f, 44.0f, 200.0f, 44.0f),
                    PathNode.CurveTo(211.0457f, 44.0f, 220.0f, 52.954304f, 220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 75.04569f, 211.0457f, 84.0f, 200.0f, 84.0f),
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
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
