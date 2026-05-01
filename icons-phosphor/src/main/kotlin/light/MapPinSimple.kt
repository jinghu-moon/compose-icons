package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) return _mapPinSimple!!
        _mapPinSimple = phosphorLightIcon(
            name = "MapPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.0f, 72.0f),
                    PathNode.CurveTo(182.00304f, 42.955585f, 159.03177f, 19.11141f, 130.00743f, 18.031694f),
                    PathNode.CurveTo(100.98309f, 16.951979f, 76.30375f, 39.023537f, 74.148834f, 67.9879f),
                    PathNode.CurveTo(71.99392f, 96.95226f, 93.13543f, 122.432846f, 122.0f, 125.66f),
                    PathNode.LineTo(122.0f, 232.0f),
                    PathNode.CurveTo(122.0f, 235.3137f, 124.686295f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(131.3137f, 238.0f, 134.0f, 235.3137f, 134.0f, 232.0f),
                    PathNode.LineTo(134.0f, 125.66f),
                    PathNode.CurveTo(161.3135f, 122.57425f, 181.96533f, 99.48724f, 182.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 114.0f),
                    PathNode.CurveTo(104.80404f, 114.0f, 86.0f, 95.19596f, 86.0f, 72.0f),
                    PathNode.CurveTo(86.0f, 48.80404f, 104.80404f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(151.19595f, 30.0f, 170.0f, 48.80404f, 170.0f, 72.0f),
                    PathNode.CurveTo(170.0f, 95.19596f, 151.19595f, 114.0f, 128.0f, 114.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
