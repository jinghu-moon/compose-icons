package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorRegularIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(151.16344f, 40.0f, 144.0f, 47.163445f, 144.0f, 56.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.CurveTo(144.0f, 152.83656f, 136.83656f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(119.163445f, 160.0f, 112.0f, 152.83656f, 112.0f, 144.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(112.0f, 47.163445f, 104.836555f, 40.0f, 96.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(47.163445f, 40.0f, 40.0f, 47.163445f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 192.60106f, 79.39894f, 232.0f, 128.0f, 232.0f),
                    PathNode.LineTo(128.67f, 232.0f),
                    PathNode.CurveTo(176.82f, 231.64f, 216.0f, 191.71f, 216.0f, 143.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 47.163445f, 208.83656f, 40.0f, 200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 56.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.55f, 216.0f),
                    PathNode.CurveTo(109.3593f, 216.1466f, 90.9042f, 208.62567f, 77.282394f, 195.10713f),
                    PathNode.CurveTo(63.660583f, 181.5886f, 55.99944f, 163.19127f, 56.0f, 144.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.CurveTo(96.0f, 161.67311f, 110.32689f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(145.67311f, 176.0f, 160.0f, 161.67311f, 160.0f, 144.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.LineTo(200.0f, 143.0f),
                    PathNode.CurveTo(200.0f, 183.0f, 168.0f, 215.71f, 128.55f, 216.0f),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
