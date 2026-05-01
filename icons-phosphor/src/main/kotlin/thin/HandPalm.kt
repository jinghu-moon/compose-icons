package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorThinIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 92.0f),
                    PathNode.CurveTo(182.09235f, 91.99565f, 176.39243f, 94.179436f, 172.0f, 98.13f),
                    PathNode.LineTo(172.0f, 60.0f),
                    PathNode.CurveTo(171.98987f, 50.523174f, 166.40402f, 41.939693f, 157.74327f, 38.092392f),
                    PathNode.CurveTo(149.08252f, 34.24509f, 138.9688f, 35.854465f, 131.93f, 42.2f),
                    PathNode.CurveTo(130.94621f, 29.345402f, 119.98241f, 19.564508f, 107.0993f, 20.04833f),
                    PathNode.CurveTo(94.216194f, 20.532152f, 84.01688f, 31.107822f, 84.0f, 44.0f),
                    PathNode.LineTo(84.0f, 58.13f),
                    PathNode.CurveTo(76.948135f, 51.822617f, 66.84873f, 50.246723f, 58.2105f, 54.10585f),
                    PathNode.CurveTo(49.572273f, 57.96498f, 44.00731f, 66.53893f, 44.0f, 76.0f),
                    PathNode.LineTo(44.0f, 152.0f),
                    PathNode.CurveTo(44.0f, 198.39192f, 81.60808f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(174.39192f, 236.0f, 212.0f, 198.39192f, 212.0f, 152.0f),
                    PathNode.LineTo(212.0f, 116.0f),
                    PathNode.CurveTo(212.0f, 102.74516f, 201.25484f, 92.0f, 188.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 152.0f),
                    PathNode.CurveTo(204.0f, 193.97365f, 169.97365f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(86.02636f, 228.0f, 52.0f, 193.97365f, 52.0f, 152.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.CurveTo(52.0f, 67.163445f, 59.163445f, 60.0f, 68.0f, 60.0f),
                    PathNode.CurveTo(76.836555f, 60.0f, 84.0f, 67.163445f, 84.0f, 76.0f),
                    PathNode.LineTo(84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 122.20914f, 85.79086f, 124.0f, 88.0f, 124.0f),
                    PathNode.CurveTo(90.20914f, 124.0f, 92.0f, 122.20914f, 92.0f, 120.0f),
                    PathNode.LineTo(92.0f, 44.0f),
                    PathNode.CurveTo(92.0f, 35.163445f, 99.163445f, 28.0f, 108.0f, 28.0f),
                    PathNode.CurveTo(116.836555f, 28.0f, 124.0f, 35.163445f, 124.0f, 44.0f),
                    PathNode.LineTo(124.0f, 112.0f),
                    PathNode.CurveTo(124.0f, 114.20914f, 125.79086f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(130.20914f, 116.0f, 132.0f, 114.20914f, 132.0f, 112.0f),
                    PathNode.LineTo(132.0f, 60.0f),
                    PathNode.CurveTo(132.0f, 51.163445f, 139.16344f, 44.0f, 148.0f, 44.0f),
                    PathNode.CurveTo(156.83656f, 44.0f, 164.0f, 51.163445f, 164.0f, 60.0f),
                    PathNode.LineTo(164.0f, 132.18f),
                    PathNode.CurveTo(141.35625f, 134.27545f, 124.02712f, 153.2595f, 124.0f, 176.0f),
                    PathNode.CurveTo(124.0f, 178.20914f, 125.79086f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(130.20914f, 180.0f, 132.0f, 178.20914f, 132.0f, 176.0f),
                    PathNode.CurveTo(132.0f, 156.11777f, 148.11777f, 140.0f, 168.0f, 140.0f),
                    PathNode.CurveTo(170.20914f, 140.0f, 172.0f, 138.20914f, 172.0f, 136.0f),
                    PathNode.LineTo(172.0f, 116.0f),
                    PathNode.CurveTo(172.0f, 107.163445f, 179.16344f, 100.0f, 188.0f, 100.0f),
                    PathNode.CurveTo(196.83656f, 100.0f, 204.0f, 107.163445f, 204.0f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
