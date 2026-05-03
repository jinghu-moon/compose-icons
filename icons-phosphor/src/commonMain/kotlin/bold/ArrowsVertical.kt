package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) return _arrowsVertical!!
        _arrowsVertical = phosphorBoldIcon(
            name = "ArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.49f, 191.51f),
                    PathNode.CurveTo(170.74945f, 193.76163f, 172.01947f, 196.82018f, 172.01947f, 200.01f),
                    PathNode.CurveTo(172.01947f, 203.19981f, 170.74945f, 206.25838f, 168.49f, 208.51f),
                    PathNode.LineTo(136.49f, 240.51f),
                    PathNode.CurveTo(134.23837f, 242.76945f, 131.17982f, 244.03946f, 127.99f, 244.03946f),
                    PathNode.CurveTo(124.80018f, 244.03946f, 121.74162f, 242.76945f, 119.49f, 240.51f),
                    PathNode.LineTo(87.49f, 208.51f),
                    PathNode.CurveTo(82.79558f, 203.81558f, 82.79558f, 196.20442f, 87.49f, 191.51f),
                    PathNode.CurveTo(92.18442f, 186.81558f, 99.79558f, 186.81558f, 104.49f, 191.51f),
                    PathNode.LineTo(116.0f, 203.0f),
                    PathNode.LineTo(116.0f, 53.0f),
                    PathNode.LineTo(104.49f, 64.49f),
                    PathNode.CurveTo(99.79558f, 69.18442f, 92.18442f, 69.18442f, 87.49f, 64.49f),
                    PathNode.CurveTo(82.79558f, 59.79558f, 82.79558f, 52.18442f, 87.49f, 47.49f),
                    PathNode.LineTo(119.49f, 15.49f),
                    PathNode.CurveTo(121.74162f, 13.230546f, 124.80018f, 11.960537f, 127.99f, 11.960537f),
                    PathNode.CurveTo(131.17982f, 11.960537f, 134.23837f, 13.230546f, 136.49f, 15.49f),
                    PathNode.LineTo(168.49f, 47.49f),
                    PathNode.CurveTo(173.18442f, 52.18442f, 173.18442f, 59.79558f, 168.49f, 64.49f),
                    PathNode.CurveTo(163.79558f, 69.18442f, 156.18442f, 69.18442f, 151.49f, 64.49f),
                    PathNode.LineTo(140.0f, 53.0f),
                    PathNode.LineTo(140.0f, 203.0f),
                    PathNode.LineTo(151.51f, 191.48f),
                    PathNode.CurveTo(153.7648f, 189.23065f, 156.82132f, 187.96992f, 160.00623f, 187.97556f),
                    PathNode.CurveTo(163.19113f, 187.98119f, 166.24316f, 189.2527f, 168.49f, 191.51f),
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
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
