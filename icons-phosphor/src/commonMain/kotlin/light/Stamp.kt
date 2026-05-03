package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorLightIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 224.0f),
                    PathNode.CurveTo(222.0f, 227.3137f, 219.3137f, 230.0f, 216.0f, 230.0f),
                    PathNode.LineTo(40.0f, 230.0f),
                    PathNode.CurveTo(36.68629f, 230.0f, 34.0f, 227.3137f, 34.0f, 224.0f),
                    PathNode.CurveTo(34.0f, 220.6863f, 36.68629f, 218.0f, 40.0f, 218.0f),
                    PathNode.LineTo(216.0f, 218.0f),
                    PathNode.CurveTo(219.3137f, 218.0f, 222.0f, 220.6863f, 222.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 144.0f),
                    PathNode.LineTo(222.0f, 184.0f),
                    PathNode.CurveTo(222.0f, 191.73198f, 215.73198f, 198.0f, 208.0f, 198.0f),
                    PathNode.LineTo(48.0f, 198.0f),
                    PathNode.CurveTo(40.268013f, 198.0f, 34.0f, 191.73198f, 34.0f, 184.0f),
                    PathNode.LineTo(34.0f, 144.0f),
                    PathNode.CurveTo(34.0f, 136.26802f, 40.268013f, 130.0f, 48.0f, 130.0f),
                    PathNode.LineTo(106.9f, 130.0f),
                    PathNode.LineTo(90.68f, 54.29f),
                    PathNode.CurveTo(88.7808f, 45.43314f, 90.9851f, 36.19235f, 96.677734f, 29.146442f),
                    PathNode.CurveTo(102.37038f, 22.100536f, 110.9418f, 18.003983f, 120.0f, 18.0f),
                    PathNode.LineTo(136.0f, 18.0f),
                    PathNode.CurveTo(145.05995f, 18.000963f, 153.6342f, 22.096235f, 159.32912f, 29.142555f),
                    PathNode.CurveTo(165.02405f, 36.188873f, 167.22957f, 45.431427f, 165.33f, 54.29f),
                    PathNode.LineTo(149.1f, 130.0f),
                    PathNode.LineTo(208.0f, 130.0f),
                    PathNode.CurveTo(215.73198f, 130.0f, 222.0f, 136.26802f, 222.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(119.17f, 130.0f),
                    PathNode.LineTo(136.83f, 130.0f),
                    PathNode.LineTo(153.59f, 51.77f),
                    PathNode.CurveTo(154.72806f, 46.456814f, 153.40508f, 40.913864f, 149.99011f, 36.687386f),
                    PathNode.CurveTo(146.57515f, 32.460903f, 141.4337f, 30.00325f, 136.0f, 30.0f),
                    PathNode.LineTo(120.0f, 30.0f),
                    PathNode.CurveTo(114.564545f, 30.000233f, 109.420265f, 32.456604f, 106.00303f, 36.6835f),
                    PathNode.CurveTo(102.585785f, 40.91039f, 101.26157f, 46.4551f, 102.4f, 51.77f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 144.0f),
                    PathNode.CurveTo(210.0f, 142.89543f, 209.10457f, 142.0f, 208.0f, 142.0f),
                    PathNode.LineTo(48.0f, 142.0f),
                    PathNode.CurveTo(46.89543f, 142.0f, 46.0f, 142.89543f, 46.0f, 144.0f),
                    PathNode.LineTo(46.0f, 184.0f),
                    PathNode.CurveTo(46.0f, 185.10457f, 46.89543f, 186.0f, 48.0f, 186.0f),
                    PathNode.LineTo(208.0f, 186.0f),
                    PathNode.CurveTo(209.10457f, 186.0f, 210.0f, 185.10457f, 210.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _stamp!!
    }

private var _stamp: ImageVector? = null
