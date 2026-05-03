package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleUpDown: ImageVector
    get() {
        if (_caretCircleUpDown != null) return _caretCircleUpDown!!
        _caretCircleUpDown = phosphorBoldIcon(
            name = "CaretCircleUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.49f, 95.51f),
                    PathNode.CurveTo(173.18442f, 100.20442f, 173.18442f, 107.81558f, 168.49f, 112.51f),
                    PathNode.CurveTo(163.79558f, 117.20442f, 156.18442f, 117.20442f, 151.49f, 112.51f),
                    PathNode.LineTo(128.0f, 89.0f),
                    PathNode.LineTo(104.49f, 112.52f),
                    PathNode.CurveTo(99.79558f, 117.21442f, 92.18442f, 117.21442f, 87.49f, 112.52f),
                    PathNode.CurveTo(82.79558f, 107.82558f, 82.79558f, 100.214424f, 87.49f, 95.52f),
                    PathNode.LineTo(119.49f, 63.52f),
                    PathNode.CurveTo(121.74162f, 61.260548f, 124.80018f, 59.990536f, 127.99f, 59.990536f),
                    PathNode.CurveTo(131.17982f, 59.990536f, 134.23837f, 61.260548f, 136.49f, 63.52f),
                    PathNode.Close,
                    PathNode.MoveTo(168.49f, 143.51f),
                    PathNode.CurveTo(170.74945f, 145.76163f, 172.01947f, 148.82018f, 172.01947f, 152.01f),
                    PathNode.CurveTo(172.01947f, 155.19981f, 170.74945f, 158.25838f, 168.49f, 160.51f),
                    PathNode.LineTo(136.49f, 192.51f),
                    PathNode.CurveTo(134.23837f, 194.76945f, 131.17982f, 196.03946f, 127.99f, 196.03946f),
                    PathNode.CurveTo(124.80018f, 196.03946f, 121.74162f, 194.76945f, 119.49f, 192.51f),
                    PathNode.LineTo(87.49f, 160.51f),
                    PathNode.CurveTo(82.79558f, 155.81558f, 82.79558f, 148.20442f, 87.49f, 143.51f),
                    PathNode.CurveTo(92.18442f, 138.81558f, 99.79558f, 138.81558f, 104.49f, 143.51f),
                    PathNode.LineTo(128.0f, 167.0f),
                    PathNode.LineTo(151.51f, 143.48f),
                    PathNode.CurveTo(153.7648f, 141.23065f, 156.82132f, 139.96992f, 160.00623f, 139.97556f),
                    PathNode.CurveTo(163.19113f, 139.98119f, 166.24316f, 141.2527f, 168.49f, 143.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _caretCircleUpDown!!
    }

private var _caretCircleUpDown: ImageVector? = null
