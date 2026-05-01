package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleUp: ImageVector
    get() {
        if (_caretCircleUp != null) return _caretCircleUp!!
        _caretCircleUp = phosphorFillIcon(
            name = "CaretCircleUp",
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
                    PathNode.MoveTo(173.66f, 149.66f),
                    PathNode.CurveTo(172.15945f, 151.16223f, 170.12328f, 152.00629f, 168.0f, 152.00629f),
                    PathNode.CurveTo(165.87672f, 152.00629f, 163.84055f, 151.16223f, 162.34f, 149.66f),
                    PathNode.LineTo(128.0f, 115.31f),
                    PathNode.LineTo(93.66f, 149.66f),
                    PathNode.CurveTo(90.534065f, 152.78593f, 85.465935f, 152.78593f, 82.34f, 149.66f),
                    PathNode.CurveTo(79.214066f, 146.53407f, 79.214066f, 141.46593f, 82.34f, 138.34f),
                    PathNode.LineTo(122.34f, 98.34f),
                    PathNode.CurveTo(123.840546f, 96.83778f, 125.876724f, 95.993706f, 128.0f, 95.993706f),
                    PathNode.CurveTo(130.12328f, 95.993706f, 132.15945f, 96.83778f, 133.66f, 98.34f),
                    PathNode.LineTo(173.66f, 138.34f),
                    PathNode.CurveTo(175.16223f, 139.84055f, 176.00629f, 141.87672f, 176.00629f, 144.0f),
                    PathNode.CurveTo(176.00629f, 146.12328f, 175.16223f, 148.15945f, 173.66f, 149.66f),
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
        return _caretCircleUp!!
    }

private var _caretCircleUp: ImageVector? = null
