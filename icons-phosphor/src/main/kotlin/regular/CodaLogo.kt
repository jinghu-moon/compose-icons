package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorRegularIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 88.0f),
                    PathNode.CurveTo(183.61243f, 87.93188f, 191.08464f, 90.04894f, 197.53f, 94.1f),
                    PathNode.CurveTo(201.2226f, 96.46397f, 205.91052f, 96.625854f, 209.7574f, 94.522255f),
                    PathNode.CurveTo(213.6043f, 92.418655f, 215.99767f, 88.384476f, 216.0f, 84.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 39.163445f, 208.83656f, 32.0f, 200.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(47.163445f, 32.0f, 40.0f, 39.163445f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 216.83656f, 47.163445f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(208.83656f, 224.0f, 216.0f, 216.83656f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 172.0f),
                    PathNode.CurveTo(215.99434f, 167.62354f, 213.60657f, 163.59721f, 209.76901f, 161.49326f),
                    PathNode.CurveTo(205.93147f, 159.38925f, 201.25284f, 159.54129f, 197.56f, 161.89f),
                    PathNode.CurveTo(190.31f, 166.54f, 184.15f, 168.3f, 176.32f, 168.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(153.90862f, 168.0f, 136.0f, 150.09138f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 105.90861f, 153.90862f, 88.0f, 176.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 128.0f),
                    PathNode.CurveTo(120.03825f, 158.84969f, 144.99054f, 183.87347f, 175.84f, 184.0f),
                    PathNode.CurveTo(184.19981f, 184.41573f, 192.52444f, 182.65501f, 200.0f, 178.89f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.LineTo(200.0f, 77.23f),
                    PathNode.CurveTo(182.61337f, 69.16085f, 162.31587f, 70.49197f, 146.13197f, 80.76267f),
                    PathNode.CurveTo(129.94807f, 91.03339f, 120.101524f, 108.83242f, 120.0f, 128.0f),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
