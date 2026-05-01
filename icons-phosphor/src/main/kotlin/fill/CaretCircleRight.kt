package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleRight: ImageVector
    get() {
        if (_caretCircleRight != null) return _caretCircleRight!!
        _caretCircleRight = phosphorFillIcon(
            name = "CaretCircleRight",
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
                    PathNode.MoveTo(157.66f, 133.66f),
                    PathNode.LineTo(117.66f, 173.66f),
                    PathNode.CurveTo(114.534065f, 176.78593f, 109.465935f, 176.78593f, 106.34f, 173.66f),
                    PathNode.CurveTo(103.214066f, 170.53407f, 103.214066f, 165.46593f, 106.34f, 162.34f),
                    PathNode.LineTo(140.69f, 128.0f),
                    PathNode.LineTo(106.34f, 93.66f),
                    PathNode.CurveTo(103.214066f, 90.534065f, 103.214066f, 85.465935f, 106.34f, 82.34f),
                    PathNode.CurveTo(109.465935f, 79.214066f, 114.534065f, 79.214066f, 117.66f, 82.34f),
                    PathNode.LineTo(157.66f, 122.34f),
                    PathNode.CurveTo(159.16223f, 123.840546f, 160.00629f, 125.876724f, 160.00629f, 128.0f),
                    PathNode.CurveTo(160.00629f, 130.12328f, 159.16223f, 132.15945f, 157.66f, 133.66f),
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
        return _caretCircleRight!!
    }

private var _caretCircleRight: ImageVector? = null
