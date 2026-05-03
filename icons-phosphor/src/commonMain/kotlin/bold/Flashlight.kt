package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = phosphorBoldIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 12.0f),
                    PathNode.LineTo(72.0f, 12.0f),
                    PathNode.CurveTo(60.954304f, 12.0f, 52.0f, 20.954306f, 52.0f, 32.0f),
                    PathNode.LineTo(52.0f, 77.33f),
                    PathNode.CurveTo(52.0086f, 81.656006f, 53.41127f, 85.86404f, 56.0f, 89.33f),
                    PathNode.LineTo(76.0f, 116.0f),
                    PathNode.LineTo(76.0f, 224.0f),
                    PathNode.CurveTo(76.0f, 235.0457f, 84.95431f, 244.0f, 96.0f, 244.0f),
                    PathNode.LineTo(160.0f, 244.0f),
                    PathNode.CurveTo(171.0457f, 244.0f, 180.0f, 235.0457f, 180.0f, 224.0f),
                    PathNode.LineTo(180.0f, 116.0f),
                    PathNode.LineTo(200.0f, 89.33f),
                    PathNode.CurveTo(202.58873f, 85.86404f, 203.99141f, 81.656006f, 204.0f, 77.33f),
                    PathNode.LineTo(204.0f, 32.0f),
                    PathNode.CurveTo(204.0f, 20.954306f, 195.0457f, 12.0f, 184.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 36.0f),
                    PathNode.LineTo(180.0f, 52.0f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.LineTo(76.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 102.67f),
                    PathNode.CurveTo(157.41127f, 106.13596f, 156.00859f, 110.343994f, 156.0f, 114.67f),
                    PathNode.LineTo(156.0f, 220.0f),
                    PathNode.LineTo(100.0f, 220.0f),
                    PathNode.LineTo(100.0f, 114.67f),
                    PathNode.CurveTo(99.9914f, 110.343994f, 98.58872f, 106.13596f, 96.0f, 102.67f),
                    PathNode.LineTo(76.0f, 76.0f),
                    PathNode.LineTo(180.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 120.0f),
                    PathNode.LineTo(140.0f, 152.0f),
                    PathNode.CurveTo(140.0f, 158.62741f, 134.62741f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(121.37258f, 164.0f, 116.0f, 158.62741f, 116.0f, 152.0f),
                    PathNode.LineTo(116.0f, 120.0f),
                    PathNode.CurveTo(116.0f, 113.37258f, 121.37258f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(134.62741f, 108.0f, 140.0f, 113.37258f, 140.0f, 120.0f),
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
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
