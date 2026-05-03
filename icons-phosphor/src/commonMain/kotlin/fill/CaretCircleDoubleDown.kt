package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) return _caretCircleDoubleDown!!
        _caretCircleDoubleDown = phosphorFillIcon(
            name = "CaretCircleDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.57f, 54.43f),
                    PathNode.CurveTo(166.46446f, 19.253021f, 111.39613f, 13.779817f, 70.053345f, 41.35865f),
                    PathNode.CurveTo(28.71056f, 68.937485f, 12.612713f, 121.88403f, 31.607752f, 167.80795f),
                    PathNode.CurveTo(50.60279f, 213.73187f, 99.3981f, 239.83734f, 148.1429f, 230.15417f),
                    PathNode.CurveTo(196.88768f, 220.47101f, 232.00012f, 177.69727f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.99774f, 100.41492f, 221.05421f, 73.95696f, 201.57f, 54.43f),
                    PathNode.Close,
                    PathNode.MoveTo(165.67f, 149.67f),
                    PathNode.LineTo(133.67f, 181.67f),
                    PathNode.CurveTo(132.16945f, 183.17221f, 130.13327f, 184.0163f, 128.01f, 184.0163f),
                    PathNode.CurveTo(125.88673f, 184.0163f, 123.85055f, 183.17221f, 122.35f, 181.67f),
                    PathNode.LineTo(90.35f, 149.67f),
                    PathNode.CurveTo(87.22407f, 146.54407f, 87.22407f, 141.47594f, 90.35f, 138.35f),
                    PathNode.CurveTo(93.47593f, 135.22408f, 98.54407f, 135.22408f, 101.67f, 138.35f),
                    PathNode.LineTo(128.0f, 164.71f),
                    PathNode.LineTo(154.35f, 138.35f),
                    PathNode.CurveTo(157.47594f, 135.22408f, 162.54407f, 135.22408f, 165.67f, 138.35f),
                    PathNode.CurveTo(168.79593f, 141.47594f, 168.79593f, 146.54407f, 165.67f, 149.67f),
                    PathNode.Close,
                    PathNode.MoveTo(165.67f, 93.67f),
                    PathNode.LineTo(133.67f, 125.67f),
                    PathNode.CurveTo(132.16945f, 127.17222f, 130.13327f, 128.0163f, 128.01f, 128.0163f),
                    PathNode.CurveTo(125.88673f, 128.0163f, 123.85055f, 127.17222f, 122.35f, 125.67f),
                    PathNode.LineTo(90.35f, 93.67f),
                    PathNode.CurveTo(87.22407f, 90.54407f, 87.22407f, 85.47593f, 90.35f, 82.35f),
                    PathNode.CurveTo(93.47593f, 79.22407f, 98.54407f, 79.22407f, 101.67f, 82.35f),
                    PathNode.LineTo(128.0f, 108.68f),
                    PathNode.LineTo(154.35f, 82.32f),
                    PathNode.CurveTo(157.47594f, 79.19407f, 162.54407f, 79.19407f, 165.67f, 82.32f),
                    PathNode.CurveTo(168.79593f, 85.44593f, 168.79593f, 90.51407f, 165.67f, 93.64f),
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
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
