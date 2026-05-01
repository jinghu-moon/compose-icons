package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorDuotoneIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 208.0f, 128.0f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(128.0f, 232.0f, 40.0f, 208.0f, 40.0f, 112.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 51.581722f, 43.581722f, 48.0f, 48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(212.41827f, 48.0f, 216.0f, 51.581722f, 216.0f, 56.0f),
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
                    PathNode.MoveTo(80.57f, 117.0f),
                    PathNode.CurveTo(81.362885f, 115.0272f, 82.90847f, 113.45118f, 84.86544f, 112.61999f),
                    PathNode.CurveTo(86.8224f, 111.78878f, 89.02975f, 111.770805f, 91.0f, 112.57f),
                    PathNode.LineTo(120.0f, 124.18f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 91.58172f, 123.58172f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(132.41827f, 88.0f, 136.0f, 91.58172f, 136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 124.18f),
                    PathNode.LineTo(165.0f, 112.57f),
                    PathNode.CurveTo(169.10347f, 110.91315f, 173.77315f, 112.89652f, 175.43f, 117.0f),
                    PathNode.CurveTo(177.08685f, 121.10348f, 175.10347f, 125.77315f, 171.0f, 127.43f),
                    PathNode.LineTo(140.69f, 139.55f),
                    PathNode.LineTo(158.4f, 163.2f),
                    PathNode.CurveTo(161.05096f, 166.73462f, 160.33463f, 171.74904f, 156.8f, 174.4f),
                    PathNode.CurveTo(153.26538f, 177.05096f, 148.25096f, 176.33463f, 145.6f, 172.8f),
                    PathNode.LineTo(128.0f, 149.33f),
                    PathNode.LineTo(110.4f, 172.8f),
                    PathNode.CurveTo(107.74903f, 176.33463f, 102.73462f, 177.05096f, 99.2f, 174.4f),
                    PathNode.CurveTo(95.665375f, 171.74904f, 94.949036f, 166.73462f, 97.6f, 163.2f),
                    PathNode.LineTo(115.34f, 139.55f),
                    PathNode.LineTo(85.0f, 127.43f),
                    PathNode.CurveTo(83.0272f, 126.637115f, 81.45118f, 125.09153f, 80.61999f, 123.13456f),
                    PathNode.CurveTo(79.78878f, 121.1776f, 79.770805f, 118.97025f, 80.57f, 117.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 164.72f, 198.48f, 196.67f, 177.07f, 214.19f),
                    PathNode.CurveTo(154.01f, 233.05f, 131.07f, 239.46f, 130.07f, 239.72f),
                    PathNode.CurveTo(128.69499f, 240.09406f, 127.24502f, 240.09406f, 125.87f, 239.72f),
                    PathNode.CurveTo(124.87f, 239.46f, 101.96f, 233.05f, 78.87f, 214.19f),
                    PathNode.CurveTo(57.52f, 196.67f, 32.0f, 164.72f, 32.0f, 112.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 47.163445f, 39.163445f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(216.83656f, 40.0f, 224.0f, 47.163445f, 224.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 56.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.CurveTo(48.0f, 149.3f, 61.82f, 179.51f, 89.07f, 201.81f),
                    PathNode.CurveTo(100.67249f, 211.29903f, 113.84856f, 218.68074f, 128.0f, 223.62f),
                    PathNode.CurveTo(142.33904f, 218.59311f, 155.6798f, 211.07814f, 167.41f, 201.42f),
                    PathNode.CurveTo(194.34f, 179.16f, 208.0f, 149.07f, 208.0f, 112.0f),
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
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
