package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = phosphorThinIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 68.0f),
                    PathNode.CurveTo(108.11775f, 68.0f, 92.0f, 84.11775f, 92.0f, 104.0f),
                    PathNode.CurveTo(92.0f, 123.88225f, 108.11775f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(147.88223f, 140.0f, 164.0f, 123.88225f, 164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 84.11775f, 147.88223f, 68.0f, 128.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 132.0f),
                    PathNode.CurveTo(112.536026f, 132.0f, 100.0f, 119.463974f, 100.0f, 104.0f),
                    PathNode.CurveTo(100.0f, 88.536026f, 112.536026f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(143.46397f, 76.0f, 156.0f, 88.536026f, 156.0f, 104.0f),
                    PathNode.CurveTo(156.0f, 119.463974f, 143.46397f, 132.0f, 128.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(81.62865f, 20.049604f, 44.049603f, 57.628643f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 134.42f, 58.17f, 166.79f, 85.0f, 197.62f),
                    PathNode.CurveTo(97.13759f, 211.6454f, 110.798325f, 224.27646f, 125.73f, 235.28f),
                    PathNode.CurveTo(127.10559f, 236.24051f, 128.93442f, 236.24051f, 130.31f, 235.28f),
                    PathNode.CurveTo(145.22768f, 224.27414f, 158.87492f, 211.64314f, 171.0f, 197.62f),
                    PathNode.CurveTo(197.81f, 166.79f, 212.0f, 134.42f, 212.0f, 104.0f),
                    PathNode.CurveTo(211.9504f, 57.628643f, 174.37135f, 20.049604f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.1f, 192.23f),
                    PathNode.CurveTo(153.92444f, 205.02884f, 141.49582f, 216.67691f, 128.0f, 227.0f),
                    PathNode.CurveTo(114.50225f, 216.6643f, 102.07356f, 205.00278f, 90.9f, 192.19f),
                    PathNode.CurveTo(73.15f, 171.8f, 52.0f, 139.9f, 52.0f, 104.0f),
                    PathNode.CurveTo(52.0f, 62.02636f, 86.02636f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(169.97365f, 28.0f, 204.0f, 62.02636f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 139.9f, 182.85f, 171.8f, 165.1f, 192.23f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
