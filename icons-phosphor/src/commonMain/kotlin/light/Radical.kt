package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorLightIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 80.0f),
                    PathNode.LineTo(246.0f, 104.0f),
                    PathNode.CurveTo(246.0f, 107.313705f, 243.3137f, 110.0f, 240.0f, 110.0f),
                    PathNode.CurveTo(236.6863f, 110.0f, 234.0f, 107.313705f, 234.0f, 104.0f),
                    PathNode.LineTo(234.0f, 86.0f),
                    PathNode.LineTo(132.16f, 86.0f),
                    PathNode.LineTo(85.62f, 210.11f),
                    PathNode.CurveTo(84.743324f, 212.45465f, 82.50318f, 214.00867f, 80.0f, 214.00867f),
                    PathNode.CurveTo(77.49682f, 214.00867f, 75.256676f, 212.45465f, 74.38f, 210.11f),
                    PathNode.LineTo(26.38f, 82.11f),
                    PathNode.CurveTo(25.21468f, 79.00616f, 26.78616f, 75.54532f, 29.89f, 74.38f),
                    PathNode.CurveTo(32.99384f, 73.21467f, 36.454678f, 74.78616f, 37.62f, 77.89f),
                    PathNode.LineTo(80.0f, 190.91f),
                    PathNode.LineTo(122.38f, 77.91f),
                    PathNode.CurveTo(123.252945f, 75.56089f, 125.49394f, 74.00176f, 128.0f, 74.0f),
                    PathNode.LineTo(240.0f, 74.0f),
                    PathNode.CurveTo(243.3137f, 74.0f, 246.0f, 76.686295f, 246.0f, 80.0f),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
