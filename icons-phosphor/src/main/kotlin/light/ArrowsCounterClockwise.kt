package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorLightIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 102.0f),
                    PathNode.LineTo(40.0f, 102.0f),
                    PathNode.CurveTo(36.68629f, 102.0f, 34.0f, 99.313705f, 34.0f, 96.0f),
                    PathNode.LineTo(34.0f, 48.0f),
                    PathNode.CurveTo(34.0f, 44.68629f, 36.68629f, 42.0f, 40.0f, 42.0f),
                    PathNode.CurveTo(43.31371f, 42.0f, 46.0f, 44.68629f, 46.0f, 48.0f),
                    PathNode.LineTo(46.0f, 81.52f),
                    PathNode.LineTo(64.0f, 63.52f),
                    PathNode.CurveTo(81.47982f, 45.95573f, 105.22009f, 36.053158f, 130.0f, 35.99f),
                    PathNode.LineTo(130.52f, 35.99f),
                    PathNode.CurveTo(155.06982f, 35.91574f, 178.66158f, 45.51123f, 196.19f, 62.7f),
                    PathNode.CurveTo(198.42859f, 65.03682f, 198.41075f, 68.72787f, 196.14966f, 71.04292f),
                    PathNode.CurveTo(193.88857f, 73.35798f, 190.19896f, 73.46287f, 187.81f, 71.28f),
                    PathNode.CurveTo(155.67017f, 39.90997f, 104.27548f, 40.23096f, 72.53f, 72.0f),
                    PathNode.LineTo(54.48f, 90.0f),
                    PathNode.LineTo(88.0f, 90.0f),
                    PathNode.CurveTo(91.313705f, 90.0f, 94.0f, 92.686295f, 94.0f, 96.0f),
                    PathNode.CurveTo(94.0f, 99.313705f, 91.313705f, 102.0f, 88.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 154.0f),
                    PathNode.LineTo(168.0f, 154.0f),
                    PathNode.CurveTo(164.6863f, 154.0f, 162.0f, 156.6863f, 162.0f, 160.0f),
                    PathNode.CurveTo(162.0f, 163.3137f, 164.6863f, 166.0f, 168.0f, 166.0f),
                    PathNode.LineTo(201.52f, 166.0f),
                    PathNode.LineTo(183.47f, 184.0f),
                    PathNode.CurveTo(168.23062f, 199.3064f, 147.53908f, 207.93837f, 125.94f, 208.0f),
                    PathNode.LineTo(125.48f, 208.0f),
                    PathNode.CurveTo(104.05806f, 208.05159f, 83.477104f, 199.6669f, 68.19f, 184.66f),
                    PathNode.CurveTo(65.80104f, 182.47713f, 62.11144f, 182.58202f, 59.85035f, 184.89708f),
                    PathNode.CurveTo(57.589256f, 187.21213f, 57.571404f, 190.90318f, 59.81f, 193.24f),
                    PathNode.CurveTo(77.330345f, 210.44707f, 100.92309f, 220.06093f, 125.48f, 220.0f),
                    PathNode.LineTo(126.0f, 220.0f),
                    PathNode.CurveTo(150.7799f, 219.93684f, 174.52019f, 210.03427f, 192.0f, 192.47f),
                    PathNode.LineTo(210.0f, 174.42f),
                    PathNode.LineTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 211.3137f, 212.6863f, 214.0f, 216.0f, 214.0f),
                    PathNode.CurveTo(219.3137f, 214.0f, 222.0f, 211.3137f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 160.0f),
                    PathNode.CurveTo(222.0f, 156.6863f, 219.3137f, 154.0f, 216.0f, 154.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
