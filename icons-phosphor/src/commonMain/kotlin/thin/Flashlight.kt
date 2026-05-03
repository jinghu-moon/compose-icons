package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = phosphorThinIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 20.0f),
                    PathNode.LineTo(72.0f, 20.0f),
                    PathNode.CurveTo(65.37258f, 20.0f, 60.0f, 25.372583f, 60.0f, 32.0f),
                    PathNode.LineTo(60.0f, 77.33f),
                    PathNode.CurveTo(60.00359f, 79.92586f, 60.845356f, 82.45116f, 62.4f, 84.53f),
                    PathNode.LineTo(83.2f, 112.27f),
                    PathNode.CurveTo(83.71929f, 112.96239f, 84.0f, 113.80452f, 84.0f, 114.67f),
                    PathNode.LineTo(84.0f, 224.0f),
                    PathNode.CurveTo(84.0f, 230.62741f, 89.37258f, 236.0f, 96.0f, 236.0f),
                    PathNode.LineTo(160.0f, 236.0f),
                    PathNode.CurveTo(166.62741f, 236.0f, 172.0f, 230.62741f, 172.0f, 224.0f),
                    PathNode.LineTo(172.0f, 114.67f),
                    PathNode.CurveTo(172.0f, 113.80452f, 172.28072f, 112.96239f, 172.8f, 112.27f),
                    PathNode.LineTo(193.6f, 84.53f),
                    PathNode.CurveTo(195.15463f, 82.45116f, 195.99641f, 79.92586f, 196.0f, 77.33f),
                    PathNode.LineTo(196.0f, 32.0f),
                    PathNode.CurveTo(196.0f, 25.372583f, 190.62741f, 20.0f, 184.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 28.0f),
                    PathNode.LineTo(184.0f, 28.0f),
                    PathNode.CurveTo(186.20914f, 28.0f, 188.0f, 29.790861f, 188.0f, 32.0f),
                    PathNode.LineTo(188.0f, 60.0f),
                    PathNode.LineTo(68.0f, 60.0f),
                    PathNode.LineTo(68.0f, 32.0f),
                    PathNode.CurveTo(68.0f, 29.790861f, 69.79086f, 28.0f, 72.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.2f, 79.73f),
                    PathNode.LineTo(166.4f, 107.47f),
                    PathNode.CurveTo(164.84537f, 109.54884f, 164.00359f, 112.07414f, 164.0f, 114.67f),
                    PathNode.LineTo(164.0f, 224.0f),
                    PathNode.CurveTo(164.0f, 226.20914f, 162.20914f, 228.0f, 160.0f, 228.0f),
                    PathNode.LineTo(96.0f, 228.0f),
                    PathNode.CurveTo(93.79086f, 228.0f, 92.0f, 226.20914f, 92.0f, 224.0f),
                    PathNode.LineTo(92.0f, 114.67f),
                    PathNode.CurveTo(91.996414f, 112.07414f, 91.15464f, 109.54884f, 89.6f, 107.47f),
                    PathNode.LineTo(68.8f, 79.73f),
                    PathNode.CurveTo(68.28071f, 79.03761f, 68.0f, 78.19548f, 68.0f, 77.33f),
                    PathNode.LineTo(68.0f, 68.0f),
                    PathNode.LineTo(188.0f, 68.0f),
                    PathNode.LineTo(188.0f, 77.33f),
                    PathNode.CurveTo(188.0f, 78.19548f, 187.71928f, 79.03761f, 187.2f, 79.73f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 120.0f),
                    PathNode.LineTo(132.0f, 152.0f),
                    PathNode.CurveTo(132.0f, 154.20914f, 130.20914f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(125.79086f, 156.0f, 124.0f, 154.20914f, 124.0f, 152.0f),
                    PathNode.LineTo(124.0f, 120.0f),
                    PathNode.CurveTo(124.0f, 117.79086f, 125.79086f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(130.20914f, 116.0f, 132.0f, 117.79086f, 132.0f, 120.0f),
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
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
