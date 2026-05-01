package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorRegularIcon(
            name = "CaretCircleDoubleRight",
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
                    PathNode.MoveTo(125.66f, 122.34f),
                    PathNode.CurveTo(127.16222f, 123.840546f, 128.00629f, 125.876724f, 128.00629f, 128.0f),
                    PathNode.CurveTo(128.00629f, 130.12328f, 127.16222f, 132.15945f, 125.66f, 133.66f),
                    PathNode.LineTo(93.66f, 165.66f),
                    PathNode.CurveTo(90.534065f, 168.78593f, 85.465935f, 168.78593f, 82.34f, 165.66f),
                    PathNode.CurveTo(79.214066f, 162.53407f, 79.214066f, 157.46593f, 82.34f, 154.34f),
                    PathNode.LineTo(108.69f, 128.0f),
                    PathNode.LineTo(82.34f, 101.66f),
                    PathNode.CurveTo(79.214066f, 98.534065f, 79.214066f, 93.465935f, 82.34f, 90.34f),
                    PathNode.CurveTo(85.465935f, 87.214066f, 90.534065f, 87.214066f, 93.66f, 90.34f),
                    PathNode.Close,
                    PathNode.MoveTo(181.66f, 122.34f),
                    PathNode.CurveTo(183.16223f, 123.840546f, 184.00629f, 125.876724f, 184.00629f, 128.0f),
                    PathNode.CurveTo(184.00629f, 130.12328f, 183.16223f, 132.15945f, 181.66f, 133.66f),
                    PathNode.LineTo(149.66f, 165.66f),
                    PathNode.CurveTo(146.53407f, 168.78593f, 141.46593f, 168.78593f, 138.34f, 165.66f),
                    PathNode.CurveTo(135.21407f, 162.53407f, 135.21407f, 157.46593f, 138.34f, 154.34f),
                    PathNode.LineTo(164.69f, 128.0f),
                    PathNode.LineTo(138.34f, 101.66f),
                    PathNode.CurveTo(135.21407f, 98.534065f, 135.21407f, 93.465935f, 138.34f, 90.34f),
                    PathNode.CurveTo(141.46593f, 87.214066f, 146.53407f, 87.214066f, 149.66f, 90.34f),
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
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null
