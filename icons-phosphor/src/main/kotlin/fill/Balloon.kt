package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorFillIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 16.0f),
                    PathNode.CurveTo(79.42178f, 16.055109f, 40.055107f, 55.421787f, 40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 127.43f, 49.4f, 153.42f, 65.13f, 173.5f),
                    PathNode.CurveTo(77.21f, 188.91f, 91.63f, 199.5f, 107.04f, 204.59f),
                    PathNode.LineTo(96.65f, 228.85f),
                    PathNode.CurveTo(95.591515f, 231.32106f, 95.844864f, 234.15854f, 97.32439f, 236.40298f),
                    PathNode.CurveTo(98.80391f, 238.64743f, 101.31178f, 239.99875f, 104.0f, 240.0f),
                    PathNode.LineTo(152.0f, 240.0f),
                    PathNode.CurveTo(154.68822f, 239.99875f, 157.19609f, 238.64743f, 158.67561f, 236.40298f),
                    PathNode.CurveTo(160.15514f, 234.15854f, 160.4085f, 231.32106f, 159.35f, 228.85f),
                    PathNode.LineTo(149.0f, 204.59f),
                    PathNode.CurveTo(164.4f, 199.52f, 178.83f, 188.91f, 190.91f, 173.5f),
                    PathNode.CurveTo(206.6f, 153.42f, 216.0f, 127.43f, 216.0f, 104.0f),
                    PathNode.CurveTo(215.94489f, 55.421787f, 176.57822f, 16.055109f, 128.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.32f, 103.89f),
                    PathNode.CurveTo(176.88351f, 103.96087f, 176.44218f, 103.99764f, 176.0f, 104.0f),
                    PathNode.CurveTo(172.09505f, 103.99495f, 168.76431f, 101.17144f, 168.12f, 97.32f),
                    PathNode.CurveTo(165.09029f, 80.26851f, 151.74149f, 66.91971f, 134.69f, 63.89f),
                    PathNode.CurveTo(131.84935f, 63.441788f, 129.46783f, 61.503384f, 128.45229f, 58.812874f),
                    PathNode.CurveTo(127.43673f, 56.12236f, 127.94341f, 53.093784f, 129.7794f, 50.88034f),
                    PathNode.CurveTo(131.61539f, 48.666893f, 134.49814f, 47.6092f, 137.33f, 48.11f),
                    PathNode.CurveTo(161.08652f, 52.325268f, 179.68474f, 70.92349f, 183.9f, 94.68f),
                    PathNode.CurveTo(184.2498f, 96.774025f, 183.75288f, 98.92121f, 182.51872f, 100.64867f),
                    PathNode.CurveTo(181.28456f, 102.37613f, 179.41435f, 103.542175f, 177.32f, 103.89f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _balloon!!
    }

private var _balloon: ImageVector? = null
