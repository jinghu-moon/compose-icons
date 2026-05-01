package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorRegularIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 176.0f),
                    PathNode.CurveTo(101.49033f, 176.0f, 80.0f, 154.50967f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 101.49033f, 101.49033f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(154.50967f, 80.0f, 176.0f, 101.49033f, 176.0f, 128.0f),
                    PathNode.CurveTo(175.97244f, 154.49825f, 154.49825f, 175.97244f, 128.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.21f, 77.47f),
                    PathNode.CurveTo(158.16856f, 70.402824f, 147.3849f, 65.91107f, 136.0f, 64.47f),
                    PathNode.LineTo(136.0f, 40.37f),
                    PathNode.CurveTo(153.75336f, 41.96928f, 170.59633f, 48.94649f, 184.28f, 60.37f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 64.52f),
                    PathNode.CurveTo(108.6151f, 65.961075f, 97.83144f, 70.45281f, 88.79f, 77.52f),
                    PathNode.LineTo(71.72f, 60.4f),
                    PathNode.CurveTo(85.40366f, 48.976494f, 102.24665f, 41.99928f, 120.0f, 40.4f),
                    PathNode.Close,
                    PathNode.MoveTo(77.47f, 88.79f),
                    PathNode.CurveTo(70.402824f, 97.83144f, 65.91107f, 108.6151f, 64.47f, 120.0f),
                    PathNode.LineTo(40.37f, 120.0f),
                    PathNode.CurveTo(41.96928f, 102.24665f, 48.94649f, 85.40366f, 60.37f, 71.72f),
                    PathNode.Close,
                    PathNode.MoveTo(64.52f, 136.0f),
                    PathNode.CurveTo(65.961075f, 147.3849f, 70.45281f, 158.16856f, 77.52f, 167.21f),
                    PathNode.LineTo(60.4f, 184.28f),
                    PathNode.CurveTo(48.976494f, 170.59633f, 41.99928f, 153.75336f, 40.4f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.79f, 178.53f),
                    PathNode.CurveTo(97.83686f, 185.57925f, 108.62007f, 190.05354f, 120.0f, 191.48f),
                    PathNode.LineTo(120.0f, 215.63f),
                    PathNode.CurveTo(102.24665f, 214.03072f, 85.40366f, 207.05351f, 71.72f, 195.63f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 191.48f),
                    PathNode.CurveTo(147.37993f, 190.05354f, 158.16315f, 185.57925f, 167.21f, 178.53f),
                    PathNode.LineTo(184.28f, 195.6f),
                    PathNode.CurveTo(170.59633f, 207.02351f, 153.75336f, 214.00072f, 136.0f, 215.6f),
                    PathNode.Close,
                    PathNode.MoveTo(178.53f, 167.21f),
                    PathNode.CurveTo(185.57925f, 158.16315f, 190.05354f, 147.37993f, 191.48f, 136.0f),
                    PathNode.LineTo(215.63f, 136.0f),
                    PathNode.CurveTo(214.03072f, 153.75336f, 207.05351f, 170.59633f, 195.63f, 184.28f),
                    PathNode.Close,
                    PathNode.MoveTo(191.48f, 120.0f),
                    PathNode.CurveTo(190.05354f, 108.62007f, 185.57925f, 97.83686f, 178.53f, 88.79f),
                    PathNode.LineTo(195.6f, 71.72f),
                    PathNode.CurveTo(207.02351f, 85.40366f, 214.00072f, 102.24665f, 215.6f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
