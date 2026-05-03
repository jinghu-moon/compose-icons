package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorBoldIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.49f, 167.51f),
                    PathNode.CurveTo(186.74945f, 169.76163f, 188.01947f, 172.82018f, 188.01947f, 176.01f),
                    PathNode.CurveTo(188.01947f, 179.19981f, 186.74945f, 182.25838f, 184.49f, 184.51f),
                    PathNode.LineTo(136.49f, 232.51f),
                    PathNode.CurveTo(134.23837f, 234.76945f, 131.17982f, 236.03946f, 127.99f, 236.03946f),
                    PathNode.CurveTo(124.80018f, 236.03946f, 121.74162f, 234.76945f, 119.49f, 232.51f),
                    PathNode.LineTo(71.49f, 184.51f),
                    PathNode.CurveTo(66.79558f, 179.81558f, 66.79558f, 172.20442f, 71.49f, 167.51f),
                    PathNode.CurveTo(76.18442f, 162.81558f, 83.79558f, 162.81558f, 88.49f, 167.51f),
                    PathNode.LineTo(128.0f, 207.0f),
                    PathNode.LineTo(167.51f, 167.48f),
                    PathNode.CurveTo(169.7648f, 165.23065f, 172.82132f, 163.96992f, 176.00623f, 163.97556f),
                    PathNode.CurveTo(179.19113f, 163.98119f, 182.24316f, 165.2527f, 184.49f, 167.51f),
                    PathNode.Close,
                    PathNode.MoveTo(88.49f, 88.51f),
                    PathNode.LineTo(128.0f, 49.0f),
                    PathNode.LineTo(167.51f, 88.52f),
                    PathNode.CurveTo(172.20442f, 93.21442f, 179.81558f, 93.21442f, 184.51f, 88.52f),
                    PathNode.CurveTo(189.20442f, 83.82558f, 189.20442f, 76.214424f, 184.51f, 71.52f),
                    PathNode.LineTo(136.51f, 23.52f),
                    PathNode.CurveTo(134.25838f, 21.260546f, 131.19981f, 19.990538f, 128.01f, 19.990538f),
                    PathNode.CurveTo(124.82018f, 19.990538f, 121.76162f, 21.260546f, 119.51f, 23.52f),
                    PathNode.LineTo(71.51f, 71.52f),
                    PathNode.CurveTo(66.81558f, 76.214424f, 66.81558f, 83.82558f, 71.51f, 88.52f),
                    PathNode.CurveTo(76.20442f, 93.21442f, 83.81558f, 93.21442f, 88.51f, 88.52f),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
