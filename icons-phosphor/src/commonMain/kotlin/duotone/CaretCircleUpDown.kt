package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretCircleUpDown: ImageVector
    get() {
        if (_caretCircleUpDown != null) return _caretCircleUpDown!!
        _caretCircleUpDown = phosphorDuotoneIcon(
            name = "CaretCircleUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 98.34f),
                    PathNode.CurveTo(168.78593f, 101.465935f, 168.78593f, 106.534065f, 165.66f, 109.66f),
                    PathNode.CurveTo(162.53407f, 112.785934f, 157.46593f, 112.785934f, 154.34f, 109.66f),
                    PathNode.LineTo(128.0f, 83.31f),
                    PathNode.LineTo(101.66f, 109.66f),
                    PathNode.CurveTo(98.534065f, 112.785934f, 93.465935f, 112.785934f, 90.34f, 109.66f),
                    PathNode.CurveTo(87.214066f, 106.534065f, 87.214066f, 101.465935f, 90.34f, 98.34f),
                    PathNode.LineTo(122.34f, 66.34f),
                    PathNode.CurveTo(123.840546f, 64.83778f, 125.876724f, 63.993706f, 128.0f, 63.993706f),
                    PathNode.CurveTo(130.12328f, 63.993706f, 132.15945f, 64.83778f, 133.66f, 66.34f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 146.34f),
                    PathNode.CurveTo(167.16223f, 147.84055f, 168.00629f, 149.87672f, 168.00629f, 152.0f),
                    PathNode.CurveTo(168.00629f, 154.12328f, 167.16223f, 156.15945f, 165.66f, 157.66f),
                    PathNode.LineTo(133.66f, 189.66f),
                    PathNode.CurveTo(132.15945f, 191.16223f, 130.12328f, 192.00629f, 128.0f, 192.00629f),
                    PathNode.CurveTo(125.876724f, 192.00629f, 123.840546f, 191.16223f, 122.34f, 189.66f),
                    PathNode.LineTo(90.34f, 157.66f),
                    PathNode.CurveTo(87.214066f, 154.53407f, 87.214066f, 149.46593f, 90.34f, 146.34f),
                    PathNode.CurveTo(93.465935f, 143.21407f, 98.534065f, 143.21407f, 101.66f, 146.34f),
                    PathNode.LineTo(128.0f, 172.69f),
                    PathNode.LineTo(154.34f, 146.34f),
                    PathNode.CurveTo(155.84055f, 144.83777f, 157.87672f, 143.99371f, 160.0f, 143.99371f),
                    PathNode.CurveTo(162.12328f, 143.99371f, 164.15945f, 144.83777f, 165.66f, 146.34f),
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
        return _caretCircleUpDown!!
    }

private var _caretCircleUpDown: ImageVector? = null
