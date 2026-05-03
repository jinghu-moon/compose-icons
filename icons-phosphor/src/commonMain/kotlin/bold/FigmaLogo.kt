package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = phosphorBoldIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.15f, 96.0f),
                    PathNode.CurveTo(211.25502f, 83.63244f, 215.4946f, 64.52433f, 208.8499f, 47.77483f),
                    PathNode.CurveTo(202.20518f, 31.025324f, 186.01936f, 20.020193f, 168.0f, 20.0f),
                    PathNode.LineTo(96.0f, 20.0f),
                    PathNode.CurveTo(77.98064f, 20.020193f, 61.79481f, 31.025324f, 55.15011f, 47.77483f),
                    PathNode.CurveTo(48.5054f, 64.52433f, 52.744987f, 83.63244f, 65.85f, 96.0f),
                    PathNode.CurveTo(56.801857f, 104.49545f, 51.77259f, 116.42395f, 52.006977f, 128.83308f),
                    PathNode.CurveTo(52.241364f, 141.24222f, 57.7175f, 152.97229f, 67.08f, 161.12f),
                    PathNode.CurveTo(51.136223f, 176.1453f, 47.38913f, 200.05948f, 57.973007f, 219.24138f),
                    PathNode.CurveTo(68.556885f, 238.42328f, 90.78574f, 248.00487f, 111.99834f, 242.52863f),
                    PathNode.CurveTo(133.21094f, 237.05238f, 148.02391f, 217.90807f, 148.0f, 196.0f),
                    PathNode.LineTo(148.0f, 167.17f),
                    PathNode.CurveTo(167.48274f, 177.01471f, 191.2377f, 171.08711f, 203.81131f, 153.24338f),
                    PathNode.CurveTo(216.38493f, 135.39961f, 213.97531f, 111.03513f, 198.15f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 64.0f),
                    PathNode.CurveTo(188.0f, 75.04569f, 179.0457f, 84.0f, 168.0f, 84.0f),
                    PathNode.LineTo(148.0f, 84.0f),
                    PathNode.LineTo(148.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.CurveTo(179.0457f, 44.0f, 188.0f, 52.954304f, 188.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 64.0f),
                    PathNode.CurveTo(76.0f, 52.954304f, 84.95431f, 44.0f, 96.0f, 44.0f),
                    PathNode.LineTo(124.0f, 44.0f),
                    PathNode.LineTo(124.0f, 84.0f),
                    PathNode.LineTo(96.0f, 84.0f),
                    PathNode.CurveTo(84.95431f, 84.0f, 76.0f, 75.04569f, 76.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 148.0f),
                    PathNode.CurveTo(84.95431f, 148.0f, 76.0f, 139.0457f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 116.95431f, 84.95431f, 108.0f, 96.0f, 108.0f),
                    PathNode.LineTo(124.0f, 108.0f),
                    PathNode.LineTo(124.0f, 148.0f),
                    PathNode.LineTo(96.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 196.0f),
                    PathNode.CurveTo(124.0f, 209.25484f, 113.25484f, 220.0f, 100.0f, 220.0f),
                    PathNode.CurveTo(86.74516f, 220.0f, 76.0f, 209.25484f, 76.0f, 196.0f),
                    PathNode.CurveTo(76.0f, 182.74516f, 86.74516f, 172.0f, 100.0f, 172.0f),
                    PathNode.LineTo(124.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 148.0f),
                    PathNode.CurveTo(156.9543f, 148.0f, 148.0f, 139.0457f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 116.95431f, 156.9543f, 108.0f, 168.0f, 108.0f),
                    PathNode.CurveTo(179.0457f, 108.0f, 188.0f, 116.95431f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 139.0457f, 179.0457f, 148.0f, 168.0f, 148.0f),
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
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
