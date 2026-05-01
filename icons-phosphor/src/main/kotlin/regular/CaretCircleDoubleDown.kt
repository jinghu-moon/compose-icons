package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) return _caretCircleDoubleDown!!
        _caretCircleDoubleDown = phosphorRegularIcon(
            name = "CaretCircleDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.54f, 54.46f),
                    PathNode.CurveTo(160.92497f, 13.84498f, 95.07501f, 13.84498f, 54.46f, 54.46f),
                    PathNode.CurveTo(13.84498f, 95.07501f, 13.84498f, 160.92497f, 54.46f, 201.54f),
                    PathNode.CurveTo(95.07501f, 242.15501f, 160.92497f, 242.15501f, 201.54f, 201.54f),
                    PathNode.CurveTo(242.15501f, 160.92497f, 242.15501f, 95.07501f, 201.54f, 54.46f),
                    PathNode.Close,
                    PathNode.MoveTo(190.23f, 190.23f),
                    PathNode.CurveTo(155.86252f, 224.59238f, 100.14637f, 224.58965f, 65.78227f, 190.22386f),
                    PathNode.CurveTo(31.418184f, 155.85808f, 31.418184f, 100.14192f, 65.78227f, 65.77614f),
                    PathNode.CurveTo(100.14637f, 31.41035f, 155.86252f, 31.407602f, 190.23f, 65.77f),
                    PathNode.CurveTo(224.54164f, 100.162285f, 224.54164f, 155.8377f, 190.23f, 190.23f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 82.34f),
                    PathNode.CurveTo(167.16223f, 83.840546f, 168.00629f, 85.876724f, 168.00629f, 88.0f),
                    PathNode.CurveTo(168.00629f, 90.123276f, 167.16223f, 92.159454f, 165.66f, 93.66f),
                    PathNode.LineTo(133.66f, 125.66f),
                    PathNode.CurveTo(132.15945f, 127.16222f, 130.12328f, 128.00629f, 128.0f, 128.00629f),
                    PathNode.CurveTo(125.876724f, 128.00629f, 123.840546f, 127.16222f, 122.34f, 125.66f),
                    PathNode.LineTo(90.34f, 93.66f),
                    PathNode.CurveTo(87.214066f, 90.534065f, 87.214066f, 85.465935f, 90.34f, 82.34f),
                    PathNode.CurveTo(93.465935f, 79.214066f, 98.534065f, 79.214066f, 101.66f, 82.34f),
                    PathNode.LineTo(128.0f, 108.69f),
                    PathNode.LineTo(154.34f, 82.34f),
                    PathNode.CurveTo(155.84055f, 80.83778f, 157.87672f, 79.993706f, 160.0f, 79.993706f),
                    PathNode.CurveTo(162.12328f, 79.993706f, 164.15945f, 80.83778f, 165.66f, 82.34f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 138.34f),
                    PathNode.CurveTo(167.16223f, 139.84055f, 168.00629f, 141.87672f, 168.00629f, 144.0f),
                    PathNode.CurveTo(168.00629f, 146.12328f, 167.16223f, 148.15945f, 165.66f, 149.66f),
                    PathNode.LineTo(133.66f, 181.66f),
                    PathNode.CurveTo(132.15945f, 183.16223f, 130.12328f, 184.00629f, 128.0f, 184.00629f),
                    PathNode.CurveTo(125.876724f, 184.00629f, 123.840546f, 183.16223f, 122.34f, 181.66f),
                    PathNode.LineTo(90.34f, 149.66f),
                    PathNode.CurveTo(87.214066f, 146.53407f, 87.214066f, 141.46593f, 90.34f, 138.34f),
                    PathNode.CurveTo(93.465935f, 135.21407f, 98.534065f, 135.21407f, 101.66f, 138.34f),
                    PathNode.LineTo(128.0f, 164.69f),
                    PathNode.LineTo(154.34f, 138.34f),
                    PathNode.CurveTo(155.84055f, 136.83777f, 157.87672f, 135.99371f, 160.0f, 135.99371f),
                    PathNode.CurveTo(162.12328f, 135.99371f, 164.15945f, 136.83777f, 165.66f, 138.34f),
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
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
