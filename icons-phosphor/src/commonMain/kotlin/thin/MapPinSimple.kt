package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) return _mapPinSimple!!
        _mapPinSimple = phosphorThinIcon(
            name = "MapPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 72.0f),
                    PathNode.CurveTo(180.00864f, 43.798973f, 157.53671f, 20.73097f, 129.34512f, 20.001474f),
                    PathNode.CurveTo(101.15353f, 19.27198f, 77.51865f, 41.146908f, 76.06877f, 69.31064f),
                    PathNode.CurveTo(74.6189f, 97.47437f, 95.88253f, 121.66069f, 124.0f, 123.83f),
                    PathNode.LineTo(124.0f, 232.0f),
                    PathNode.CurveTo(124.0f, 234.20914f, 125.79086f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(130.20914f, 236.0f, 132.0f, 234.20914f, 132.0f, 232.0f),
                    PathNode.LineTo(132.0f, 123.83f),
                    PathNode.CurveTo(159.06946f, 121.71735f, 179.96754f, 99.15176f, 180.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(103.69947f, 116.0f, 84.0f, 96.30053f, 84.0f, 72.0f),
                    PathNode.CurveTo(84.0f, 47.69947f, 103.69947f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(152.30052f, 28.0f, 172.0f, 47.69947f, 172.0f, 72.0f),
                    PathNode.CurveTo(171.97244f, 96.28911f, 152.28911f, 115.97244f, 128.0f, 116.0f),
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
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
