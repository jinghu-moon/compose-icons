package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorBoldIcon(
            name = "CaretCircleDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.4f, 51.6f),
                    PathNode.CurveTo(162.2139f, 9.449766f, 93.848785f, 9.469148f, 51.686592f, 51.64329f),
                    PathNode.CurveTo(9.524402f, 93.81744f, 9.524402f, 162.18256f, 51.686592f, 204.3567f),
                    PathNode.CurveTo(93.848785f, 246.53085f, 162.2139f, 246.55022f, 204.4f, 204.4f),
                    PathNode.CurveTo(246.53166f, 162.17941f, 246.53166f, 93.82059f, 204.4f, 51.6f),
                    PathNode.Close,
                    PathNode.MoveTo(187.4f, 187.42f),
                    PathNode.CurveTo(154.58923f, 220.20532f, 101.41522f, 220.19157f, 68.62142f, 187.3893f),
                    PathNode.CurveTo(35.827618f, 154.587f, 35.827618f, 101.412994f, 68.62142f, 68.61071f),
                    PathNode.CurveTo(101.41522f, 35.808426f, 154.58923f, 35.794678f, 187.4f, 68.58f),
                    PathNode.CurveTo(220.17409f, 101.411194f, 220.18303f, 154.57777f, 187.42f, 187.42f),
                    PathNode.Close,
                    PathNode.MoveTo(176.49f, 104.47f),
                    PathNode.LineTo(153.0f, 128.0f),
                    PathNode.LineTo(176.53f, 151.53f),
                    PathNode.CurveTo(181.22443f, 156.22443f, 181.22443f, 163.83559f, 176.53f, 168.53f),
                    PathNode.CurveTo(171.83559f, 173.22443f, 164.22443f, 173.22443f, 159.53f, 168.53f),
                    PathNode.LineTo(127.53f, 136.53f),
                    PathNode.CurveTo(125.270546f, 134.27838f, 124.000534f, 131.21982f, 124.000534f, 128.03f),
                    PathNode.CurveTo(124.000534f, 124.84018f, 125.270546f, 121.781624f, 127.53f, 119.53f),
                    PathNode.LineTo(159.53f, 87.53f),
                    PathNode.CurveTo(164.22443f, 82.83558f, 171.83559f, 82.83558f, 176.53f, 87.53f),
                    PathNode.CurveTo(181.22443f, 92.22442f, 181.22443f, 99.83558f, 176.53f, 104.53f),
                    PathNode.Close,
                    PathNode.MoveTo(120.49f, 104.47f),
                    PathNode.LineTo(97.0f, 128.0f),
                    PathNode.LineTo(120.52f, 151.53f),
                    PathNode.CurveTo(125.214424f, 156.22443f, 125.214424f, 163.83559f, 120.52f, 168.53f),
                    PathNode.CurveTo(115.82558f, 173.22443f, 108.214424f, 173.22443f, 103.52f, 168.53f),
                    PathNode.LineTo(71.52f, 136.53f),
                    PathNode.CurveTo(69.260544f, 134.27838f, 67.99054f, 131.21982f, 67.99054f, 128.03f),
                    PathNode.CurveTo(67.99054f, 124.84018f, 69.260544f, 121.781624f, 71.52f, 119.53f),
                    PathNode.LineTo(103.52f, 87.53f),
                    PathNode.CurveTo(108.214424f, 82.83558f, 115.82558f, 82.83558f, 120.52f, 87.53f),
                    PathNode.CurveTo(125.214424f, 92.22442f, 125.214424f, 99.83558f, 120.52f, 104.53f),
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
        return _caretCircleDoubleLeft!!
    }

private var _caretCircleDoubleLeft: ImageVector? = null
