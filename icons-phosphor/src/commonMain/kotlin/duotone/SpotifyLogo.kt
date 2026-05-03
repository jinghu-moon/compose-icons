package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorDuotoneIcon(
            name = "SpotifyLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
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
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(159.07f, 169.74f),
                    PathNode.CurveTo(157.0038f, 173.64386f, 152.16475f, 175.13452f, 148.26f, 173.07f),
                    PathNode.CurveTo(135.6093f, 166.26965f, 120.39071f, 166.26965f, 107.74f, 173.07f),
                    PathNode.CurveTo(103.850266f, 175.02556f, 99.11083f, 173.51163f, 97.075066f, 169.66325f),
                    PathNode.CurveTo(95.0393f, 165.8149f, 96.45466f, 161.0451f, 100.26f, 158.93f),
                    PathNode.CurveTo(117.6143f, 149.75081f, 138.3857f, 149.75081f, 155.74f, 158.93f),
                    PathNode.CurveTo(159.64386f, 160.9962f, 161.13452f, 165.83525f, 159.07f, 169.74f),
                    PathNode.Close,
                    PathNode.MoveTo(191.07f, 113.74f),
                    PathNode.CurveTo(190.07083f, 115.61312f, 188.3681f, 117.01229f, 186.3368f, 117.62937f),
                    PathNode.CurveTo(184.30551f, 118.246445f, 182.11224f, 118.03083f, 180.24f, 117.03f),
                    PathNode.CurveTo(147.61273f, 99.55418f, 108.407265f, 99.55418f, 75.78f, 117.03f),
                    PathNode.CurveTo(71.88087f, 119.112114f, 67.03211f, 117.63913f, 64.95f, 113.74f),
                    PathNode.CurveTo(62.867886f, 109.840866f, 64.340866f, 104.99211f, 68.24f, 102.91f),
                    PathNode.CurveTo(105.58101f, 82.92581f, 150.439f, 82.92581f, 187.78f, 102.91f),
                    PathNode.CurveTo(189.65672f, 103.9109f, 191.0576f, 105.61794f, 191.67308f, 107.653885f),
                    PathNode.CurveTo(192.28856f, 109.68983f, 192.06795f, 111.887054f, 191.06f, 113.76f),
                    PathNode.Close,
                    PathNode.MoveTo(175.07f, 141.74f),
                    PathNode.CurveTo(172.99297f, 145.6386f, 168.1492f, 147.11589f, 164.25f, 145.04f),
                    PathNode.CurveTo(141.59732f, 132.97066f, 114.42266f, 132.97066f, 91.77f, 145.04f),
                    PathNode.CurveTo(87.88287f, 147.02544f, 83.12175f, 145.52863f, 81.069984f, 141.6761f),
                    PathNode.CurveTo(79.01821f, 137.82358f, 80.433205f, 133.03749f, 84.25f, 130.92f),
                    PathNode.CurveTo(111.60044f, 116.33511f, 144.41956f, 116.33511f, 171.77f, 130.92f),
                    PathNode.CurveTo(173.64578f, 131.91917f, 175.04689f, 133.62367f, 175.66412f, 135.65738f),
                    PathNode.CurveTo(176.28137f, 137.69107f, 176.064f, 139.8868f, 175.06f, 141.76f),
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
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
