package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorBoldIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 20.0f),
                    PathNode.LineTo(40.0f, 20.0f),
                    PathNode.CurveTo(28.954306f, 20.0f, 20.0f, 28.954306f, 20.0f, 40.0f),
                    PathNode.LineTo(20.0f, 216.0f),
                    PathNode.CurveTo(20.0f, 227.0457f, 28.954306f, 236.0f, 40.0f, 236.0f),
                    PathNode.LineTo(216.0f, 236.0f),
                    PathNode.CurveTo(227.0457f, 236.0f, 236.0f, 227.0457f, 236.0f, 216.0f),
                    PathNode.LineTo(236.0f, 40.0f),
                    PathNode.CurveTo(236.0f, 28.954306f, 227.0457f, 20.0f, 216.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 212.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(44.0f, 44.0f),
                    PathNode.LineTo(212.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 176.0f),
                    PathNode.LineTo(112.0f, 120.0f),
                    PathNode.CurveTo(112.00479f, 114.88821f, 115.247345f, 110.3406f, 120.07848f, 108.6701f),
                    PathNode.CurveTo(124.90962f, 106.9996f, 130.26868f, 108.572975f, 133.43f, 112.59f),
                    PathNode.CurveTo(145.82648f, 106.09228f, 160.71751f, 106.54652f, 172.69489f, 113.78774f),
                    PathNode.CurveTo(184.67226f, 121.02898f, 191.99364f, 134.00383f, 192.0f, 148.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 182.62741f, 186.62741f, 188.0f, 180.0f, 188.0f),
                    PathNode.CurveTo(173.37259f, 188.0f, 168.0f, 182.62741f, 168.0f, 176.0f),
                    PathNode.LineTo(168.0f, 148.0f),
                    PathNode.CurveTo(168.0f, 139.16344f, 160.83656f, 132.0f, 152.0f, 132.0f),
                    PathNode.CurveTo(143.16344f, 132.0f, 136.0f, 139.16344f, 136.0f, 148.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 182.62741f, 130.62741f, 188.0f, 124.0f, 188.0f),
                    PathNode.CurveTo(117.37258f, 188.0f, 112.0f, 182.62741f, 112.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.CurveTo(96.0f, 182.62741f, 90.62742f, 188.0f, 84.0f, 188.0f),
                    PathNode.CurveTo(77.37258f, 188.0f, 72.0f, 182.62741f, 72.0f, 176.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.CurveTo(72.0f, 113.37258f, 77.37258f, 108.0f, 84.0f, 108.0f),
                    PathNode.CurveTo(90.62742f, 108.0f, 96.0f, 113.37258f, 96.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 80.0f),
                    PathNode.CurveTo(68.0f, 71.163445f, 75.163445f, 64.0f, 84.0f, 64.0f),
                    PathNode.CurveTo(92.836555f, 64.0f, 100.0f, 71.163445f, 100.0f, 80.0f),
                    PathNode.CurveTo(100.0f, 88.836555f, 92.836555f, 96.0f, 84.0f, 96.0f),
                    PathNode.CurveTo(75.163445f, 96.0f, 68.0f, 88.836555f, 68.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
