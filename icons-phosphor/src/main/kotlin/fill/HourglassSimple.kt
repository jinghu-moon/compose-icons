package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) return _hourglassSimple!!
        _hourglassSimple = phosphorFillIcon(
            name = "HourglassSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.31f, 196.69f),
                    PathNode.CurveTo(215.88284f, 201.26584f, 217.25029f, 208.14508f, 214.77507f, 214.12193f),
                    PathNode.CurveTo(212.29987f, 220.09877f, 206.46909f, 223.99701f, 200.0f, 224.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(49.529087f, 224.00104f, 43.694614f, 220.1043f, 41.216843f, 214.12656f),
                    PathNode.CurveTo(38.739067f, 208.14882f, 40.105873f, 201.26712f, 44.68f, 196.69f),
                    PathNode.CurveTo(44.725803f, 196.64922f, 44.76921f, 196.6058f, 44.81f, 196.56f),
                    PathNode.LineTo(116.43f, 128.0f),
                    PathNode.LineTo(44.82f, 59.44f),
                    PathNode.CurveTo(44.77921f, 59.394196f, 44.735806f, 59.35079f, 44.69f, 59.31f),
                    PathNode.CurveTo(40.11716f, 54.73416f, 38.749718f, 47.854897f, 41.224922f, 41.878067f),
                    PathNode.CurveTo(43.700134f, 35.901237f, 49.530907f, 32.003f, 56.0f, 32.0f),
                    PathNode.LineTo(200.0f, 32.0f),
                    PathNode.CurveTo(206.47092f, 31.998955f, 212.30539f, 35.895706f, 214.78316f, 41.873447f),
                    PathNode.CurveTo(217.26093f, 47.851185f, 215.89412f, 54.732876f, 211.32f, 59.31f),
                    PathNode.CurveTo(211.2742f, 59.35079f, 211.23079f, 59.394196f, 211.19f, 59.44f),
                    PathNode.LineTo(139.57f, 128.0f),
                    PathNode.LineTo(211.18f, 196.56f),
                    PathNode.CurveTo(211.2208f, 196.6058f, 211.26419f, 196.64922f, 211.31f, 196.69f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _hourglassSimple!!
    }

private var _hourglassSimple: ImageVector? = null
