package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorFillIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 150.09138f, 153.90862f, 168.0f, 176.0f, 168.0f),
                    PathNode.LineTo(176.32f, 168.0f),
                    PathNode.CurveTo(184.15f, 168.3f, 190.32f, 166.54f, 197.56f, 161.89f),
                    PathNode.CurveTo(201.25284f, 159.54129f, 205.93147f, 159.38925f, 209.76901f, 161.49326f),
                    PathNode.CurveTo(213.60657f, 163.59721f, 215.99434f, 167.62354f, 216.0f, 172.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(216.0f, 216.83656f, 208.83656f, 224.0f, 200.0f, 224.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(47.163445f, 224.0f, 40.0f, 216.83656f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(40.0f, 39.163445f, 47.163445f, 32.0f, 56.0f, 32.0f),
                    PathNode.LineTo(200.0f, 32.0f),
                    PathNode.CurveTo(208.83656f, 32.0f, 216.0f, 39.163445f, 216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 84.0f),
                    PathNode.CurveTo(215.99767f, 88.384476f, 213.6043f, 92.418655f, 209.7574f, 94.522255f),
                    PathNode.CurveTo(205.91052f, 96.625854f, 201.2226f, 96.46397f, 197.53f, 94.1f),
                    PathNode.CurveTo(185.16199f, 86.38068f, 169.58553f, 85.956856f, 156.81606f, 92.99221f),
                    PathNode.CurveTo(144.04657f, 100.02756f, 136.0827f, 113.420944f, 136.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
