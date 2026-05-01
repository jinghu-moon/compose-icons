package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorThinIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(92.87f, 20.0f, 44.0f, 86.52f, 44.0f, 152.0f),
                    PathNode.CurveTo(44.0f, 198.39192f, 81.60808f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(174.39192f, 236.0f, 212.0f, 198.39192f, 212.0f, 152.0f),
                    PathNode.CurveTo(212.0f, 86.52f, 163.13f, 20.0f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 228.0f),
                    PathNode.CurveTo(86.04464f, 227.9559f, 52.044098f, 193.95538f, 52.0f, 152.0f),
                    PathNode.CurveTo(52.0f, 123.54f, 62.0f, 92.27f, 79.33f, 66.22f),
                    PathNode.CurveTo(94.81f, 43.0f, 113.91f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(139.39f, 28.0f, 154.05f, 37.8f, 167.42f, 53.82f),
                    PathNode.LineTo(125.0f, 101.34f),
                    PathNode.CurveTo(124.069374f, 102.382996f, 123.75072f, 103.836136f, 124.15949f, 105.17284f),
                    PathNode.CurveTo(124.568275f, 106.50956f, 125.64519f, 107.53592f, 127.0f, 107.88f),
                    PathNode.LineTo(155.3f, 114.96f),
                    PathNode.LineTo(148.05f, 151.22f),
                    PathNode.CurveTo(147.62106f, 153.38458f, 149.0261f, 155.48764f, 151.19f, 155.92f),
                    PathNode.CurveTo(151.4461f, 155.9763f, 151.7078f, 156.00314f, 151.97f, 156.0f),
                    PathNode.CurveTo(153.87723f, 155.99847f, 155.5181f, 154.65062f, 155.89f, 152.78f),
                    PathNode.LineTo(163.89f, 112.78f),
                    PathNode.CurveTo(164.3059f, 110.688675f, 163.00821f, 108.63877f, 160.94f, 108.12f),
                    PathNode.LineTo(135.36f, 101.72f),
                    PathNode.LineTo(172.44f, 60.2f),
                    PathNode.QuadTo(174.6f, 63.11f, 176.67f, 66.2f),
                    PathNode.CurveTo(194.0f, 92.27f, 204.0f, 123.54f, 204.0f, 152.0f),
                    PathNode.CurveTo(203.9559f, 193.95538f, 169.95538f, 227.9559f, 128.0f, 228.0f),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
