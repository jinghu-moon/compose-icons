package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleLeft: ImageVector
    get() {
        if (_caretCircleLeft != null) return _caretCircleLeft!!
        _caretCircleLeft = phosphorFillIcon(
            name = "CaretCircleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.66f, 162.34f),
                    PathNode.CurveTo(152.78593f, 165.46593f, 152.78593f, 170.53407f, 149.66f, 173.66f),
                    PathNode.CurveTo(146.53407f, 176.78593f, 141.46593f, 176.78593f, 138.34f, 173.66f),
                    PathNode.LineTo(98.34f, 133.66f),
                    PathNode.CurveTo(96.83778f, 132.15945f, 95.993706f, 130.12328f, 95.993706f, 128.0f),
                    PathNode.CurveTo(95.993706f, 125.876724f, 96.83778f, 123.840546f, 98.34f, 122.34f),
                    PathNode.LineTo(138.34f, 82.34f),
                    PathNode.CurveTo(141.46593f, 79.214066f, 146.53407f, 79.214066f, 149.66f, 82.34f),
                    PathNode.CurveTo(152.78593f, 85.465935f, 152.78593f, 90.534065f, 149.66f, 93.66f),
                    PathNode.LineTo(115.31f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _caretCircleLeft!!
    }

private var _caretCircleLeft: ImageVector? = null
