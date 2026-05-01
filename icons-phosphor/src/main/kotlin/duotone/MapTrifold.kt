package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorDuotoneIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 72.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.LineTo(96.0f, 184.0f),
                    PathNode.LineTo(96.0f, 40.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.92f, 49.69f),
                    PathNode.CurveTo(226.97821f, 48.176968f, 224.44797f, 47.64215f, 222.06f, 48.24f),
                    PathNode.LineTo(160.93f, 63.52f),
                    PathNode.LineTo(99.58f, 32.84f),
                    PathNode.CurveTo(97.87064f, 31.987396f, 95.91262f, 31.774569f, 94.06f, 32.24f),
                    PathNode.LineTo(30.06f, 48.24f),
                    PathNode.CurveTo(26.498962f, 49.13012f, 24.000557f, 52.3294f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.000374f, 202.46321f, 25.135454f, 204.78893f, 27.077065f, 206.30472f),
                    PathNode.CurveTo(29.018673f, 207.8205f, 31.550306f, 208.35733f, 33.94f, 207.76f),
                    PathNode.LineTo(95.07f, 192.48f),
                    PathNode.LineTo(156.42f, 223.16f),
                    PathNode.CurveTo(157.53375f, 223.70908f, 158.75826f, 223.99638f, 160.0f, 224.0f),
                    PathNode.CurveTo(160.65405f, 223.9996f, 161.30557f, 223.919f, 161.94f, 223.76f),
                    PathNode.LineTo(225.94f, 207.76f),
                    PathNode.CurveTo(229.50104f, 206.86987f, 231.99945f, 203.6706f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.00055f, 53.534424f, 230.86418f, 51.20633f, 228.92f, 49.69f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 52.94f),
                    PathNode.LineTo(152.0f, 76.94f),
                    PathNode.LineTo(152.0f, 203.06f),
                    PathNode.LineTo(104.0f, 179.06f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 62.25f),
                    PathNode.LineTo(88.0f, 50.25f),
                    PathNode.LineTo(88.0f, 177.75f),
                    PathNode.LineTo(40.0f, 189.75f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 193.75f),
                    PathNode.LineTo(168.0f, 205.75f),
                    PathNode.LineTo(168.0f, 78.25f),
                    PathNode.LineTo(216.0f, 66.25f),
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
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
