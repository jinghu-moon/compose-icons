package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorBoldIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.49f, 71.51f),
                    PathNode.LineTo(216.49f, 39.51f),
                    PathNode.CurveTo(211.79558f, 34.81558f, 204.18442f, 34.81558f, 199.49f, 39.51f),
                    PathNode.CurveTo(194.79558f, 44.20442f, 194.79558f, 51.81558f, 199.49f, 56.51f),
                    PathNode.LineTo(211.0f, 68.0f),
                    PathNode.LineTo(208.0f, 68.0f),
                    PathNode.CurveTo(156.0f, 68.0f, 143.2f, 98.71f, 132.92f, 123.38f),
                    PathNode.CurveTo(124.1f, 144.55f, 117.47f, 160.43f, 90.17f, 163.47f),
                    PathNode.CurveTo(83.917694f, 142.42741f, 63.112034f, 129.21233f, 41.40746f, 132.4976f),
                    PathNode.CurveTo(19.702883f, 135.78288f, 3.740169f, 154.56334f, 3.995405f, 176.51366f),
                    PathNode.CurveTo(4.250642f, 198.46397f, 20.645735f, 216.86818f, 42.420834f, 219.64789f),
                    PathNode.CurveTo(64.19593f, 222.42758f, 84.68868f, 208.73228f, 90.45f, 187.55f),
                    PathNode.CurveTo(133.79f, 183.68f, 145.52f, 155.55f, 155.08f, 132.62f),
                    PathNode.CurveTo(164.9f, 109.0f, 172.0f, 92.0f, 208.0f, 92.0f),
                    PathNode.LineTo(211.0f, 92.0f),
                    PathNode.LineTo(199.48f, 103.51f),
                    PathNode.CurveTo(194.78558f, 108.20442f, 194.78558f, 115.81558f, 199.48f, 120.51f),
                    PathNode.CurveTo(204.17442f, 125.20442f, 211.78558f, 125.20442f, 216.48f, 120.51f),
                    PathNode.LineTo(248.48f, 88.51f),
                    PathNode.CurveTo(250.74078f, 86.259705f, 252.01259f, 83.2019f, 252.01447f, 80.01208f),
                    PathNode.CurveTo(252.01634f, 76.82226f, 250.74812f, 73.762955f, 248.49f, 71.51f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 196.0f),
                    PathNode.CurveTo(36.954304f, 196.0f, 28.0f, 187.0457f, 28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 164.9543f, 36.954304f, 156.0f, 48.0f, 156.0f),
                    PathNode.CurveTo(59.045696f, 156.0f, 68.0f, 164.9543f, 68.0f, 176.0f),
                    PathNode.CurveTo(68.0f, 187.0457f, 59.045696f, 196.0f, 48.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
