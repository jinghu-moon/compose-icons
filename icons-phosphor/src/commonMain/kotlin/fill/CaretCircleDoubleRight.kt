package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorFillIcon(
            name = "CaretCircleDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.57f, 54.42f),
                    PathNode.CurveTo(160.945f, 13.83465f, 95.1143f, 13.856077f, 54.515736f, 54.467865f),
                    PathNode.CurveTo(13.917165f, 95.07965f, 13.917165f, 160.91035f, 54.515736f, 201.52214f),
                    PathNode.CurveTo(95.1143f, 242.13393f, 160.945f, 242.15535f, 201.57f, 201.57f),
                    PathNode.CurveTo(242.13863f, 160.90845f, 242.13863f, 95.08155f, 201.57f, 54.42f),
                    PathNode.Close,
                    PathNode.MoveTo(125.66f, 133.66f),
                    PathNode.LineTo(93.66f, 165.66f),
                    PathNode.CurveTo(90.534065f, 168.78593f, 85.465935f, 168.78593f, 82.34f, 165.66f),
                    PathNode.CurveTo(79.214066f, 162.53407f, 79.214066f, 157.46593f, 82.34f, 154.34f),
                    PathNode.LineTo(108.68f, 128.0f),
                    PathNode.LineTo(82.32f, 101.64f),
                    PathNode.CurveTo(79.19407f, 98.51407f, 79.19407f, 93.44593f, 82.32f, 90.32f),
                    PathNode.CurveTo(85.44593f, 87.19407f, 90.51407f, 87.19407f, 93.64f, 90.32f),
                    PathNode.LineTo(125.64f, 122.32f),
                    PathNode.CurveTo(127.151f, 123.81869f, 128.00258f, 125.85766f, 128.00633f, 127.98585f),
                    PathNode.CurveTo(128.01009f, 130.11403f, 127.1657f, 132.15599f, 125.66f, 133.66f),
                    PathNode.Close,
                    PathNode.MoveTo(181.66f, 133.66f),
                    PathNode.LineTo(149.66f, 165.66f),
                    PathNode.CurveTo(146.53407f, 168.78593f, 141.46593f, 168.78593f, 138.34f, 165.66f),
                    PathNode.CurveTo(135.21407f, 162.53407f, 135.21407f, 157.46593f, 138.34f, 154.34f),
                    PathNode.LineTo(164.71f, 128.0f),
                    PathNode.LineTo(138.35f, 101.64f),
                    PathNode.CurveTo(135.22408f, 98.51407f, 135.22408f, 93.44593f, 138.35f, 90.32f),
                    PathNode.CurveTo(141.47594f, 87.19407f, 146.54407f, 87.19407f, 149.67f, 90.32f),
                    PathNode.LineTo(181.67f, 122.32f),
                    PathNode.CurveTo(183.17969f, 123.820015f, 184.02945f, 125.85974f, 184.03133f, 127.98792f),
                    PathNode.CurveTo(184.0332f, 130.1161f, 183.18703f, 132.15732f, 181.68f, 133.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null
