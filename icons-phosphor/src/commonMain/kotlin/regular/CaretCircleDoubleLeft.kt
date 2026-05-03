package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorRegularIcon(
            name = "CaretCircleDoubleLeft",
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
                    PathNode.MoveTo(173.66f, 101.66f),
                    PathNode.LineTo(147.31f, 128.0f),
                    PathNode.LineTo(173.66f, 154.34f),
                    PathNode.CurveTo(176.78593f, 157.46593f, 176.78593f, 162.53407f, 173.66f, 165.66f),
                    PathNode.CurveTo(170.53407f, 168.78593f, 165.46593f, 168.78593f, 162.34f, 165.66f),
                    PathNode.LineTo(130.34f, 133.66f),
                    PathNode.CurveTo(128.83778f, 132.15945f, 127.993706f, 130.12328f, 127.993706f, 128.0f),
                    PathNode.CurveTo(127.993706f, 125.876724f, 128.83778f, 123.840546f, 130.34f, 122.34f),
                    PathNode.LineTo(162.34f, 90.34f),
                    PathNode.CurveTo(165.46593f, 87.214066f, 170.53407f, 87.214066f, 173.66f, 90.34f),
                    PathNode.CurveTo(176.78593f, 93.465935f, 176.78593f, 98.534065f, 173.66f, 101.66f),
                    PathNode.Close,
                    PathNode.MoveTo(117.66f, 101.66f),
                    PathNode.LineTo(91.31f, 128.0f),
                    PathNode.LineTo(117.66f, 154.34f),
                    PathNode.CurveTo(120.785934f, 157.46593f, 120.785934f, 162.53407f, 117.66f, 165.66f),
                    PathNode.CurveTo(114.534065f, 168.78593f, 109.465935f, 168.78593f, 106.34f, 165.66f),
                    PathNode.LineTo(74.34f, 133.66f),
                    PathNode.CurveTo(72.83778f, 132.15945f, 71.993706f, 130.12328f, 71.993706f, 128.0f),
                    PathNode.CurveTo(71.993706f, 125.876724f, 72.83778f, 123.840546f, 74.34f, 122.34f),
                    PathNode.LineTo(106.34f, 90.34f),
                    PathNode.CurveTo(109.465935f, 87.214066f, 114.534065f, 87.214066f, 117.66f, 90.34f),
                    PathNode.CurveTo(120.785934f, 93.465935f, 120.785934f, 98.534065f, 117.66f, 101.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _caretCircleDoubleLeft!!
    }

private var _caretCircleDoubleLeft: ImageVector? = null
