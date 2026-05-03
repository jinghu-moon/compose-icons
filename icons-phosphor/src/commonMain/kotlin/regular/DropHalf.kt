package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorRegularIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 47.75f),
                    PathNode.CurveTo(161.6478f, 33.484356f, 147.74547f, 20.638535f, 132.55f, 9.45f),
                    PathNode.CurveTo(129.79443f, 7.519659f, 126.12557f, 7.519659f, 123.37f, 9.45f),
                    PathNode.CurveTo(108.202515f, 20.643194f, 94.327194f, 33.48885f, 82.0f, 47.75f),
                    PathNode.CurveTo(54.51f, 79.32f, 40.0f, 112.6f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 192.60106f, 79.39894f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(176.60106f, 232.0f, 216.0f, 192.60106f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.CurveTo(199.9983f, 146.67323f, 199.84473f, 149.3442f, 199.54f, 152.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(199.64f, 136.0f),
                    PathNode.QuadTo(200.0f, 140.0f, 200.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(183.39f, 88.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.LineTo(172.89f, 72.0f),
                    PathNode.CurveTo(176.67783f, 77.13879f, 180.18303f, 82.48003f, 183.39f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 200.0f),
                    PathNode.LineTo(173.19f, 200.0f),
                    PathNode.CurveTo(162.53514f, 208.63097f, 149.62799f, 214.02428f, 136.0f, 215.54f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 184.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.LineTo(195.87f, 168.0f),
                    PathNode.CurveTo(193.87881f, 173.64516f, 191.1914f, 179.01996f, 187.87f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.LineTo(191.39f, 104.0f),
                    PathNode.CurveTo(193.59056f, 109.19476f, 195.412f, 114.54208f, 196.84f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(159.89f, 56.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 32.6f),
                    PathNode.CurveTo(144.46248f, 39.873543f, 152.44267f, 47.690056f, 159.89f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 94.0f, 98.26f, 51.29f, 120.0f, 32.6f),
                    PathNode.LineTo(120.0f, 215.54f),
                    PathNode.CurveTo(83.58154f, 211.4317f, 56.043575f, 180.64941f, 56.0f, 144.0f),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
