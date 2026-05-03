package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorLightIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 194.0f),
                    PathNode.LineTo(230.0f, 194.0f),
                    PathNode.LineTo(230.0f, 98.67f),
                    PathNode.CurveTo(230.00806f, 93.98231f, 227.66948f, 89.60167f, 223.77f, 87.0f),
                    PathNode.LineTo(135.77f, 28.34f),
                    PathNode.CurveTo(131.06549f, 25.201206f, 124.93452f, 25.201206f, 120.23f, 28.34f),
                    PathNode.LineTo(32.23f, 87.0f),
                    PathNode.CurveTo(28.330532f, 89.60167f, 25.991938f, 93.98231f, 26.0f, 98.67f),
                    PathNode.LineTo(26.0f, 194.0f),
                    PathNode.LineTo(16.0f, 194.0f),
                    PathNode.CurveTo(12.686292f, 194.0f, 10.0f, 196.6863f, 10.0f, 200.0f),
                    PathNode.CurveTo(10.0f, 203.3137f, 12.686292f, 206.0f, 16.0f, 206.0f),
                    PathNode.LineTo(240.0f, 206.0f),
                    PathNode.CurveTo(243.3137f, 206.0f, 246.0f, 203.3137f, 246.0f, 200.0f),
                    PathNode.CurveTo(246.0f, 196.6863f, 243.3137f, 194.0f, 240.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 98.67f),
                    PathNode.CurveTo(37.99789f, 97.99932f, 38.33209f, 97.37223f, 38.89f, 97.0f),
                    PathNode.LineTo(126.89f, 38.33f),
                    PathNode.CurveTo(127.56207f, 37.8816f, 128.43793f, 37.8816f, 129.11f, 38.33f),
                    PathNode.LineTo(217.11f, 97.0f),
                    PathNode.CurveTo(217.66496f, 97.37026f, 217.99876f, 97.99286f, 218.0f, 98.66f),
                    PathNode.LineTo(218.0f, 194.0f),
                    PathNode.LineTo(190.0f, 194.0f),
                    PathNode.LineTo(190.0f, 136.0f),
                    PathNode.CurveTo(190.0f, 132.6863f, 187.3137f, 130.0f, 184.0f, 130.0f),
                    PathNode.LineTo(72.0f, 130.0f),
                    PathNode.CurveTo(68.686295f, 130.0f, 66.0f, 132.6863f, 66.0f, 136.0f),
                    PathNode.LineTo(66.0f, 194.0f),
                    PathNode.LineTo(38.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 142.0f),
                    PathNode.LineTo(178.0f, 162.0f),
                    PathNode.LineTo(134.0f, 162.0f),
                    PathNode.LineTo(134.0f, 142.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 162.0f),
                    PathNode.LineTo(78.0f, 162.0f),
                    PathNode.LineTo(78.0f, 142.0f),
                    PathNode.LineTo(122.0f, 142.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.0f, 174.0f),
                    PathNode.LineTo(122.0f, 174.0f),
                    PathNode.LineTo(122.0f, 194.0f),
                    PathNode.LineTo(78.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 174.0f),
                    PathNode.LineTo(178.0f, 174.0f),
                    PathNode.LineTo(178.0f, 194.0f),
                    PathNode.LineTo(134.0f, 194.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _garage!!
    }

private var _garage: ImageVector? = null
