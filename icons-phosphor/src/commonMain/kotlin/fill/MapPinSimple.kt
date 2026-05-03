package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) return _mapPinSimple!!
        _mapPinSimple = phosphorFillIcon(
            name = "MapPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 127.42f),
                    PathNode.LineTo(136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 236.41827f, 132.41827f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(123.58172f, 240.0f, 120.0f, 236.41827f, 120.0f, 232.0f),
                    PathNode.LineTo(120.0f, 127.42f),
                    PathNode.CurveTo(90.92939f, 123.22402f, 70.04039f, 97.28053f, 72.143776f, 67.98408f),
                    PathNode.CurveTo(74.24717f, 38.687626f, 98.62813f, 15.994374f, 128.0f, 15.994374f),
                    PathNode.CurveTo(157.37187f, 15.994374f, 181.75284f, 38.687626f, 183.85622f, 67.98408f),
                    PathNode.CurveTo(185.95961f, 97.28053f, 165.07062f, 123.22402f, 136.0f, 127.42f),
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
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
