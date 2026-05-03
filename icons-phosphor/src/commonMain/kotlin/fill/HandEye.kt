package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandEye: ImageVector
    get() {
        if (_handEye != null) return _handEye!!
        _handEye = phosphorFillIcon(
            name = "HandEye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 180.0f),
                    PathNode.CurveTo(144.0f, 188.83656f, 136.83656f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(119.163445f, 196.0f, 112.0f, 188.83656f, 112.0f, 180.0f),
                    PathNode.CurveTo(112.0f, 171.16344f, 119.163445f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(136.83656f, 164.0f, 144.0f, 171.16344f, 144.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 104.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 200.60106f, 176.60106f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(79.39894f, 240.0f, 40.0f, 200.60106f, 40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(40.0f, 55.163445f, 47.163445f, 48.0f, 56.0f, 48.0f),
                    PathNode.CurveTo(64.836555f, 48.0f, 72.0f, 55.163445f, 72.0f, 64.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.CurveTo(72.0f, 124.41828f, 75.58172f, 128.0f, 80.0f, 128.0f),
                    PathNode.CurveTo(84.41828f, 128.0f, 88.0f, 124.41828f, 88.0f, 120.0f),
                    PathNode.LineTo(88.0f, 32.0f),
                    PathNode.CurveTo(88.0f, 23.163445f, 95.163445f, 16.0f, 104.0f, 16.0f),
                    PathNode.CurveTo(112.836555f, 16.0f, 120.0f, 23.163445f, 120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.CurveTo(120.0f, 116.41828f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(132.41827f, 120.0f, 136.0f, 116.41828f, 136.0f, 112.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.CurveTo(136.0f, 39.163445f, 143.16344f, 32.0f, 152.0f, 32.0f),
                    PathNode.CurveTo(160.83656f, 32.0f, 168.0f, 39.163445f, 168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 132.41827f, 171.58173f, 136.0f, 176.0f, 136.0f),
                    PathNode.CurveTo(180.41827f, 136.0f, 184.0f, 132.41827f, 184.0f, 128.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 95.163445f, 191.16344f, 88.0f, 200.0f, 88.0f),
                    PathNode.CurveTo(208.83656f, 88.0f, 216.0f, 95.163445f, 216.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.58f, 178.21f),
                    PathNode.CurveTo(178.88f, 176.81f, 162.08f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(93.92f, 144.0f, 77.12f, 176.81f, 76.42f, 178.21f),
                    PathNode.CurveTo(75.85618f, 179.33673f, 75.85618f, 180.66327f, 76.42f, 181.79f),
                    PathNode.CurveTo(77.12f, 183.19f, 93.92f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(162.08f, 216.0f, 178.88f, 183.19f, 179.58f, 181.79f),
                    PathNode.CurveTo(180.14381f, 180.66327f, 180.14381f, 179.33673f, 179.58f, 178.21f),
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
        return _handEye!!
    }

private var _handEye: ImageVector? = null
