package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) return _mapPinSimple!!
        _mapPinSimple = phosphorBoldIcon(
            name = "MapPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 72.0f),
                    PathNode.CurveTo(187.99883f, 40.425198f, 163.5264f, 14.254147f, 132.02264f, 12.137245f),
                    PathNode.CurveTo(100.51888f, 10.020343f, 72.76514f, 32.682045f, 68.53969f, 63.97284f),
                    PathNode.CurveTo(64.31424f, 95.26363f, 85.06314f, 124.47504f, 116.0f, 130.79f),
                    PathNode.LineTo(116.0f, 232.0f),
                    PathNode.CurveTo(116.0f, 238.62741f, 121.37258f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(134.62741f, 244.0f, 140.0f, 238.62741f, 140.0f, 232.0f),
                    PathNode.LineTo(140.0f, 130.79f),
                    PathNode.CurveTo(167.91714f, 125.05588f, 187.96625f, 100.49993f, 188.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 108.0f),
                    PathNode.CurveTo(108.11775f, 108.0f, 92.0f, 91.88225f, 92.0f, 72.0f),
                    PathNode.CurveTo(92.0f, 52.11775f, 108.11775f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(147.88223f, 36.0f, 164.0f, 52.11775f, 164.0f, 72.0f),
                    PathNode.CurveTo(164.0f, 91.88225f, 147.88223f, 108.0f, 128.0f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
