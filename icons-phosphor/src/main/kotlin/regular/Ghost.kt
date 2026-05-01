package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorRegularIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 116.0f),
                    PathNode.CurveTo(112.0f, 122.62742f, 106.62742f, 128.0f, 100.0f, 128.0f),
                    PathNode.CurveTo(93.37258f, 128.0f, 88.0f, 122.62742f, 88.0f, 116.0f),
                    PathNode.CurveTo(88.0f, 109.37258f, 93.37258f, 104.0f, 100.0f, 104.0f),
                    PathNode.CurveTo(106.62742f, 104.0f, 112.0f, 109.37258f, 112.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 104.0f),
                    PathNode.CurveTo(149.37259f, 104.0f, 144.0f, 109.37258f, 144.0f, 116.0f),
                    PathNode.CurveTo(144.0f, 122.62742f, 149.37259f, 128.0f, 156.0f, 128.0f),
                    PathNode.CurveTo(162.62741f, 128.0f, 168.0f, 122.62742f, 168.0f, 116.0f),
                    PathNode.CurveTo(168.0f, 109.37258f, 162.62741f, 104.0f, 156.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 120.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.00066f, 219.09238f, 222.21901f, 221.9082f, 219.42421f, 223.23183f),
                    PathNode.CurveTo(216.62943f, 224.55545f, 213.32207f, 224.1498f, 210.93f, 222.19f),
                    PathNode.LineTo(186.67f, 202.34f),
                    PathNode.LineTo(162.4f, 222.19f),
                    PathNode.CurveTo(159.45338f, 224.60014f, 155.2166f, 224.60014f, 152.27f, 222.19f),
                    PathNode.LineTo(128.0f, 202.34f),
                    PathNode.LineTo(103.73f, 222.19f),
                    PathNode.CurveTo(100.7834f, 224.60014f, 96.5466f, 224.60014f, 93.6f, 222.19f),
                    PathNode.LineTo(69.33f, 202.34f),
                    PathNode.LineTo(45.07f, 222.19f),
                    PathNode.CurveTo(42.677925f, 224.1498f, 39.37057f, 224.55545f, 36.575783f, 223.23183f),
                    PathNode.CurveTo(33.781f, 221.9082f, 31.999344f, 219.09238f, 32.0f, 216.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.CurveTo(32.0f, 66.98067f, 74.98067f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(181.01933f, 24.0f, 224.0f, 66.98067f, 224.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 120.0f),
                    PathNode.CurveTo(208.0f, 75.81722f, 172.18279f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(83.81722f, 40.0f, 48.0f, 75.81722f, 48.0f, 120.0f),
                    PathNode.LineTo(48.0f, 199.12f),
                    PathNode.LineTo(64.27f, 185.81f),
                    PathNode.CurveTo(67.2166f, 183.39986f, 71.4534f, 183.39986f, 74.4f, 185.81f),
                    PathNode.LineTo(98.67f, 205.66f),
                    PathNode.LineTo(122.93f, 185.81f),
                    PathNode.CurveTo(125.87841f, 183.39441f, 130.1216f, 183.39441f, 133.07f, 185.81f),
                    PathNode.LineTo(157.33f, 205.66f),
                    PathNode.LineTo(181.6f, 185.81f),
                    PathNode.CurveTo(184.54662f, 183.39986f, 188.7834f, 183.39986f, 191.73f, 185.81f),
                    PathNode.LineTo(208.0f, 199.12f),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
