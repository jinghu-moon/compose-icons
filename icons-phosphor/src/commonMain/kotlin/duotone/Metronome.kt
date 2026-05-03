package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorDuotoneIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(53.445553f, 216.00255f, 51.043472f, 214.78506f, 49.535267f, 212.72339f),
                    PathNode.CurveTo(48.02706f, 210.66171f, 47.594086f, 208.00375f, 48.37f, 205.57f),
                    PathNode.LineTo(60.37f, 168.0f),
                    PathNode.LineTo(195.66f, 168.0f),
                    PathNode.LineTo(207.66f, 205.57f),
                    PathNode.CurveTo(208.43756f, 208.0088f, 208.00111f, 210.67244f, 206.48592f, 212.73555f),
                    PathNode.CurveTo(204.9707f, 214.79869f, 202.55972f, 216.01216f, 200.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(187.14f, 114.84f),
                    PathNode.LineTo(213.92f, 85.38f),
                    PathNode.CurveTo(216.82726f, 82.10284f, 216.55795f, 77.0969f, 213.31587f, 74.15056f),
                    PathNode.CurveTo(210.0738f, 71.204216f, 205.065f, 71.41348f, 202.08f, 74.62f),
                    PathNode.LineTo(181.53f, 97.22f),
                    PathNode.LineTo(164.33f, 43.15f),
                    PathNode.CurveTo(162.23389f, 36.496937f, 156.05542f, 31.97956f, 149.08f, 32.0f),
                    PathNode.LineTo(106.91f, 32.0f),
                    PathNode.CurveTo(99.93458f, 31.97956f, 93.7561f, 36.496937f, 91.66f, 43.15f),
                    PathNode.LineTo(40.75f, 203.15f),
                    PathNode.CurveTo(39.202633f, 208.01454f, 40.069324f, 213.32547f, 43.082928f, 217.4457f),
                    PathNode.CurveTo(46.09653f, 221.56593f, 50.89528f, 224.00089f, 56.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(205.10472f, 224.00089f, 209.90347f, 221.56593f, 212.91707f, 217.4457f),
                    PathNode.CurveTo(215.93068f, 213.32547f, 216.79736f, 208.01454f, 215.25f, 203.15f),
                    PathNode.Close,
                    PathNode.MoveTo(184.72f, 160.0f),
                    PathNode.LineTo(146.08f, 160.0f),
                    PathNode.LineTo(174.7f, 128.52f),
                    PathNode.Close,
                    PathNode.MoveTo(106.91f, 48.0f),
                    PathNode.LineTo(149.08f, 48.0f),
                    PathNode.LineTo(169.08f, 110.9f),
                    PathNode.LineTo(124.46f, 160.0f),
                    PathNode.LineTo(71.27f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 208.0f),
                    PathNode.LineTo(66.18f, 176.0f),
                    PathNode.LineTo(189.81f, 176.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _metronome!!
    }

private var _metronome: ImageVector? = null
