package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorDuotoneIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 196.41827f, 228.41827f, 200.0f, 224.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(27.581722f, 200.0f, 24.0f, 196.41827f, 24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 59.581722f, 27.581722f, 56.0f, 32.0f, 56.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(228.41827f, 56.0f, 232.0f, 59.581722f, 232.0f, 64.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.93f, 151.71f),
                    PathNode.CurveTo(119.99129f, 153.54785f, 120.27882f, 155.7321f, 119.7293f, 157.78198f),
                    PathNode.CurveTo(119.17979f, 159.83188f, 117.838264f, 161.57942f, 116.0f, 162.64f),
                    PathNode.CurveTo(99.18899f, 172.34698f, 77.835106f, 168.58246f, 65.356895f, 153.71202f),
                    PathNode.CurveTo(52.87869f, 138.84158f, 52.87869f, 117.15842f, 65.356895f, 102.28798f),
                    PathNode.CurveTo(77.835106f, 87.417534f, 99.18899f, 83.653015f, 116.0f, 93.36f),
                    PathNode.CurveTo(118.555855f, 94.74786f, 120.157166f, 97.41348f, 120.18211f, 100.32174f),
                    PathNode.CurveTo(120.20706f, 103.229996f, 118.65172f, 105.92269f, 116.12005f, 107.3542f),
                    PathNode.CurveTo(113.58837f, 108.78571f, 110.47925f, 108.7305f, 108.0f, 107.21f),
                    PathNode.CurveTo(97.91309f, 101.392365f, 85.10546f, 103.654655f, 77.62196f, 112.57585f),
                    PathNode.CurveTo(70.138466f, 121.49705f, 70.138466f, 134.50294f, 77.62196f, 143.42415f),
                    PathNode.CurveTo(85.10546f, 152.34537f, 97.91309f, 154.60764f, 108.0f, 148.79f),
                    PathNode.CurveTo(111.82459f, 146.57826f, 116.718f, 147.88556f, 118.93f, 151.71f),
                    PathNode.Close,
                    PathNode.MoveTo(198.93f, 151.71f),
                    PathNode.CurveTo(199.99129f, 153.54785f, 200.27881f, 155.7321f, 199.7293f, 157.78198f),
                    PathNode.CurveTo(199.17978f, 159.83188f, 197.83827f, 161.57942f, 196.0f, 162.64f),
                    PathNode.CurveTo(179.18898f, 172.34698f, 157.83511f, 168.58246f, 145.3569f, 153.71202f),
                    PathNode.CurveTo(132.8787f, 138.84158f, 132.8787f, 117.15842f, 145.3569f, 102.28798f),
                    PathNode.CurveTo(157.83511f, 87.417534f, 179.18898f, 83.653015f, 196.0f, 93.36f),
                    PathNode.CurveTo(198.55586f, 94.74786f, 200.15717f, 97.41348f, 200.18211f, 100.32174f),
                    PathNode.CurveTo(200.20706f, 103.229996f, 198.65172f, 105.92269f, 196.12004f, 107.3542f),
                    PathNode.CurveTo(193.58838f, 108.78571f, 190.47925f, 108.7305f, 188.0f, 107.21f),
                    PathNode.CurveTo(177.9131f, 101.392365f, 165.10545f, 103.654655f, 157.62196f, 112.57585f),
                    PathNode.CurveTo(150.13847f, 121.49705f, 150.13847f, 134.50294f, 157.62196f, 143.42415f),
                    PathNode.CurveTo(165.10545f, 152.34537f, 177.9131f, 154.60764f, 188.0f, 148.79f),
                    PathNode.CurveTo(191.82462f, 146.57826f, 196.718f, 147.88556f, 198.93f, 151.71f),
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
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
