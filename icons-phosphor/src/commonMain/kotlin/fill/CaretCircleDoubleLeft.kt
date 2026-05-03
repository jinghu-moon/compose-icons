package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorFillIcon(
            name = "CaretCircleDoubleLeft",
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
                    PathNode.MoveTo(117.65f, 154.35f),
                    PathNode.CurveTo(120.77593f, 157.47594f, 120.77593f, 162.54407f, 117.65f, 165.67f),
                    PathNode.CurveTo(114.52407f, 168.79593f, 109.45593f, 168.79593f, 106.33f, 165.67f),
                    PathNode.LineTo(74.33f, 133.67f),
                    PathNode.CurveTo(72.82778f, 132.16945f, 71.9837f, 130.13327f, 71.9837f, 128.01f),
                    PathNode.CurveTo(71.9837f, 125.88673f, 72.82778f, 123.85055f, 74.33f, 122.35f),
                    PathNode.LineTo(106.33f, 90.35f),
                    PathNode.CurveTo(109.45593f, 87.22407f, 114.52407f, 87.22407f, 117.65f, 90.35f),
                    PathNode.CurveTo(120.77593f, 93.47593f, 120.77593f, 98.54407f, 117.65f, 101.67f),
                    PathNode.LineTo(91.29f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.65f, 154.35f),
                    PathNode.CurveTo(176.77592f, 157.47594f, 176.77592f, 162.54407f, 173.65f, 165.67f),
                    PathNode.CurveTo(170.52406f, 168.79593f, 165.45593f, 168.79593f, 162.33f, 165.67f),
                    PathNode.LineTo(130.33f, 133.67f),
                    PathNode.CurveTo(128.82779f, 132.16945f, 127.9837f, 130.13327f, 127.9837f, 128.01f),
                    PathNode.CurveTo(127.9837f, 125.88673f, 128.82779f, 123.85055f, 130.33f, 122.35f),
                    PathNode.LineTo(162.33f, 90.35f),
                    PathNode.CurveTo(165.45593f, 87.22407f, 170.52406f, 87.22407f, 173.65f, 90.35f),
                    PathNode.CurveTo(176.77592f, 93.47593f, 176.77592f, 98.54407f, 173.65f, 101.67f),
                    PathNode.LineTo(147.32f, 128.0f),
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
        return _caretCircleDoubleLeft!!
    }

private var _caretCircleDoubleLeft: ImageVector? = null
