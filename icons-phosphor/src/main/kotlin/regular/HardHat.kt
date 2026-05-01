package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorRegularIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 152.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.CurveTo(223.8899f, 95.35184f, 198.28671f, 59.143333f, 160.0f, 45.49f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(160.0f, 31.163445f, 152.83656f, 24.0f, 144.0f, 24.0f),
                    PathNode.LineTo(112.0f, 24.0f),
                    PathNode.CurveTo(103.163445f, 24.0f, 96.0f, 31.163445f, 96.0f, 40.0f),
                    PathNode.LineTo(96.0f, 45.49f),
                    PathNode.CurveTo(57.71329f, 59.143333f, 32.110107f, 95.35184f, 32.0f, 136.0f),
                    PathNode.LineTo(32.0f, 152.0f),
                    PathNode.CurveTo(23.163445f, 152.0f, 16.0f, 159.16344f, 16.0f, 168.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 168.0f),
                    PathNode.CurveTo(240.0f, 159.16344f, 232.83656f, 152.0f, 224.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.LineTo(160.0f, 62.67f),
                    PathNode.CurveTo(189.09428f, 75.469406f, 207.91035f, 104.21488f, 208.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 40.0f),
                    PathNode.LineTo(144.0f, 152.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.LineTo(112.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 136.0f),
                    PathNode.CurveTo(48.08965f, 104.21488f, 66.90572f, 75.469406f, 96.0f, 62.67f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.LineTo(224.0f, 192.0f),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
