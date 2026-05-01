package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleUpDown: ImageVector
    get() {
        if (_caretCircleUpDown != null) return _caretCircleUpDown!!
        _caretCircleUpDown = phosphorFillIcon(
            name = "CaretCircleUpDown",
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
                    PathNode.MoveTo(165.66f, 157.66f),
                    PathNode.LineTo(133.66f, 189.66f),
                    PathNode.CurveTo(132.15945f, 191.16223f, 130.12328f, 192.00629f, 128.0f, 192.00629f),
                    PathNode.CurveTo(125.876724f, 192.00629f, 123.840546f, 191.16223f, 122.34f, 189.66f),
                    PathNode.LineTo(90.34f, 157.66f),
                    PathNode.CurveTo(87.214066f, 154.53407f, 87.214066f, 149.46593f, 90.34f, 146.34f),
                    PathNode.CurveTo(93.465935f, 143.21407f, 98.534065f, 143.21407f, 101.66f, 146.34f),
                    PathNode.LineTo(128.0f, 172.69f),
                    PathNode.LineTo(154.34f, 146.34f),
                    PathNode.CurveTo(157.46593f, 143.21407f, 162.53407f, 143.21407f, 165.66f, 146.34f),
                    PathNode.CurveTo(168.78593f, 149.46593f, 168.78593f, 154.53407f, 165.66f, 157.66f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 109.66f),
                    PathNode.CurveTo(164.15945f, 111.16222f, 162.12328f, 112.006294f, 160.0f, 112.006294f),
                    PathNode.CurveTo(157.87672f, 112.006294f, 155.84055f, 111.16222f, 154.34f, 109.66f),
                    PathNode.LineTo(128.0f, 83.31f),
                    PathNode.LineTo(101.66f, 109.66f),
                    PathNode.CurveTo(98.534065f, 112.785934f, 93.465935f, 112.785934f, 90.34f, 109.66f),
                    PathNode.CurveTo(87.214066f, 106.534065f, 87.214066f, 101.465935f, 90.34f, 98.34f),
                    PathNode.LineTo(122.34f, 66.34f),
                    PathNode.CurveTo(123.840546f, 64.83778f, 125.876724f, 63.993706f, 128.0f, 63.993706f),
                    PathNode.CurveTo(130.12328f, 63.993706f, 132.15945f, 64.83778f, 133.66f, 66.34f),
                    PathNode.LineTo(165.66f, 98.34f),
                    PathNode.CurveTo(167.16223f, 99.840546f, 168.00629f, 101.876724f, 168.00629f, 104.0f),
                    PathNode.CurveTo(168.00629f, 106.123276f, 167.16223f, 108.159454f, 165.66f, 109.66f),
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
        return _caretCircleUpDown!!
    }

private var _caretCircleUpDown: ImageVector? = null
