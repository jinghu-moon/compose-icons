package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorLightIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 210.0f),
                    PathNode.LineTo(199.53f, 210.0f),
                    PathNode.CurveTo(214.0617f, 194.18927f, 222.087f, 173.47421f, 222.0f, 152.0f),
                    PathNode.CurveTo(221.94041f, 106.8591f, 187.02751f, 69.4281f, 142.0f, 66.23f),
                    PathNode.LineTo(142.0f, 32.0f),
                    PathNode.CurveTo(142.0f, 24.268015f, 135.73198f, 18.0f, 128.0f, 18.0f),
                    PathNode.LineTo(80.0f, 18.0f),
                    PathNode.CurveTo(72.26801f, 18.0f, 66.0f, 24.268015f, 66.0f, 32.0f),
                    PathNode.LineTo(66.0f, 136.0f),
                    PathNode.CurveTo(66.0f, 143.73198f, 72.26801f, 150.0f, 80.0f, 150.0f),
                    PathNode.LineTo(128.0f, 150.0f),
                    PathNode.CurveTo(135.73198f, 150.0f, 142.0f, 143.73198f, 142.0f, 136.0f),
                    PathNode.LineTo(142.0f, 78.26f),
                    PathNode.CurveTo(172.2901f, 80.71549f, 197.99968f, 101.44007f, 206.82878f, 130.5187f),
                    PathNode.CurveTo(215.65788f, 159.59735f, 205.81137f, 191.11777f, 182.0f, 210.0f),
                    PathNode.LineTo(32.0f, 210.0f),
                    PathNode.CurveTo(28.68629f, 210.0f, 26.0f, 212.6863f, 26.0f, 216.0f),
                    PathNode.CurveTo(26.0f, 219.3137f, 28.68629f, 222.0f, 32.0f, 222.0f),
                    PathNode.LineTo(224.0f, 222.0f),
                    PathNode.CurveTo(227.3137f, 222.0f, 230.0f, 219.3137f, 230.0f, 216.0f),
                    PathNode.CurveTo(230.0f, 212.6863f, 227.3137f, 210.0f, 224.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(130.0f, 136.0f),
                    PathNode.CurveTo(130.0f, 137.10457f, 129.10457f, 138.0f, 128.0f, 138.0f),
                    PathNode.LineTo(80.0f, 138.0f),
                    PathNode.CurveTo(78.89543f, 138.0f, 78.0f, 137.10457f, 78.0f, 136.0f),
                    PathNode.LineTo(78.0f, 32.0f),
                    PathNode.CurveTo(78.0f, 30.89543f, 78.89543f, 30.0f, 80.0f, 30.0f),
                    PathNode.LineTo(128.0f, 30.0f),
                    PathNode.CurveTo(129.10457f, 30.0f, 130.0f, 30.89543f, 130.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 182.0f),
                    PathNode.CurveTo(68.686295f, 182.0f, 66.0f, 179.3137f, 66.0f, 176.0f),
                    PathNode.CurveTo(66.0f, 172.6863f, 68.686295f, 170.0f, 72.0f, 170.0f),
                    PathNode.LineTo(136.0f, 170.0f),
                    PathNode.CurveTo(139.3137f, 170.0f, 142.0f, 172.6863f, 142.0f, 176.0f),
                    PathNode.CurveTo(142.0f, 179.3137f, 139.3137f, 182.0f, 136.0f, 182.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _microscope!!
    }

private var _microscope: ImageVector? = null
