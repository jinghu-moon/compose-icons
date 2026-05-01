package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorThinIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 64.0f),
                    PathNode.CurveTo(220.0015f, 49.055603f, 208.26657f, 36.744045f, 193.33928f, 36.029236f),
                    PathNode.CurveTo(178.41199f, 35.314426f, 165.55434f, 46.448345f, 164.12785f, 61.324505f),
                    PathNode.CurveTo(162.70135f, 76.20066f, 173.20888f, 89.57509f, 188.0f, 91.71f),
                    PathNode.LineTo(188.0f, 112.0f),
                    PathNode.CurveTo(188.0f, 118.62742f, 182.62741f, 124.0f, 176.0f, 124.0f),
                    PathNode.LineTo(80.0f, 124.0f),
                    PathNode.CurveTo(73.37258f, 124.0f, 68.0f, 118.62742f, 68.0f, 112.0f),
                    PathNode.LineTo(68.0f, 91.71f),
                    PathNode.CurveTo(82.53531f, 89.61201f, 92.979805f, 76.64027f, 91.92811f, 61.99204f),
                    PathNode.CurveTo(90.87642f, 47.34381f, 78.685936f, 35.99719f, 64.0f, 35.99719f),
                    PathNode.CurveTo(49.314064f, 35.99719f, 37.123585f, 47.34381f, 36.071888f, 61.99204f),
                    PathNode.CurveTo(35.020195f, 76.64027f, 45.464695f, 89.61201f, 60.0f, 91.71f),
                    PathNode.LineTo(60.0f, 112.0f),
                    PathNode.CurveTo(60.0f, 123.04569f, 68.95431f, 132.0f, 80.0f, 132.0f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.LineTo(124.0f, 164.29f),
                    PathNode.CurveTo(109.46469f, 166.38799f, 99.020195f, 179.35973f, 100.07189f, 194.00797f),
                    PathNode.CurveTo(101.12358f, 208.65619f, 113.314064f, 220.0028f, 128.0f, 220.0028f),
                    PathNode.CurveTo(142.68594f, 220.0028f, 154.87642f, 208.65619f, 155.92812f, 194.00797f),
                    PathNode.CurveTo(156.97981f, 179.35973f, 146.53531f, 166.38799f, 132.0f, 164.29f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(176.0f, 132.0f),
                    PathNode.CurveTo(187.0457f, 132.0f, 196.0f, 123.04569f, 196.0f, 112.0f),
                    PathNode.LineTo(196.0f, 91.71f),
                    PathNode.CurveTo(209.77498f, 89.72175f, 219.9986f, 77.91772f, 220.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 52.954304f, 52.954304f, 44.0f, 64.0f, 44.0f),
                    PathNode.CurveTo(75.04569f, 44.0f, 84.0f, 52.954304f, 84.0f, 64.0f),
                    PathNode.CurveTo(84.0f, 75.04569f, 75.04569f, 84.0f, 64.0f, 84.0f),
                    PathNode.CurveTo(52.954304f, 84.0f, 44.0f, 75.04569f, 44.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 192.0f),
                    PathNode.CurveTo(148.0f, 203.0457f, 139.0457f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(116.95431f, 212.0f, 108.0f, 203.0457f, 108.0f, 192.0f),
                    PathNode.CurveTo(108.0f, 180.9543f, 116.95431f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(139.0457f, 172.0f, 148.0f, 180.9543f, 148.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 84.0f),
                    PathNode.CurveTo(180.9543f, 84.0f, 172.0f, 75.04569f, 172.0f, 64.0f),
                    PathNode.CurveTo(172.0f, 52.954304f, 180.9543f, 44.0f, 192.0f, 44.0f),
                    PathNode.CurveTo(203.0457f, 44.0f, 212.0f, 52.954304f, 212.0f, 64.0f),
                    PathNode.CurveTo(212.0f, 75.04569f, 203.0457f, 84.0f, 192.0f, 84.0f),
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
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
