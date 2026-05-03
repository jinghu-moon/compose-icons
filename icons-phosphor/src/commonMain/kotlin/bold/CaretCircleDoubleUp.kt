package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) return _caretCircleDoubleUp!!
        _caretCircleDoubleUp = phosphorBoldIcon(
            name = "CaretCircleDoubleUp",
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
                    PathNode.MoveTo(168.5f, 159.53f),
                    PathNode.CurveTo(173.19443f, 164.22443f, 173.19443f, 171.83559f, 168.5f, 176.53f),
                    PathNode.CurveTo(163.80557f, 181.22443f, 156.19443f, 181.22443f, 151.5f, 176.53f),
                    PathNode.LineTo(128.0f, 153.0f),
                    PathNode.LineTo(104.47f, 176.53f),
                    PathNode.CurveTo(99.77558f, 181.22443f, 92.16442f, 181.22443f, 87.47f, 176.53f),
                    PathNode.CurveTo(82.77558f, 171.83559f, 82.77558f, 164.22443f, 87.47f, 159.53f),
                    PathNode.LineTo(119.47f, 127.53f),
                    PathNode.CurveTo(121.72163f, 125.270546f, 124.78018f, 124.000534f, 127.97f, 124.000534f),
                    PathNode.CurveTo(131.15982f, 124.000534f, 134.21838f, 125.270546f, 136.47f, 127.53f),
                    PathNode.Close,
                    PathNode.MoveTo(168.5f, 103.53f),
                    PathNode.CurveTo(173.19443f, 108.22442f, 173.19443f, 115.83558f, 168.5f, 120.53f),
                    PathNode.CurveTo(163.80557f, 125.22442f, 156.19443f, 125.22442f, 151.5f, 120.53f),
                    PathNode.LineTo(128.0f, 97.0f),
                    PathNode.LineTo(104.47f, 120.52f),
                    PathNode.CurveTo(99.77558f, 125.214424f, 92.16442f, 125.214424f, 87.47f, 120.52f),
                    PathNode.CurveTo(82.77558f, 115.82558f, 82.77558f, 108.214424f, 87.47f, 103.52f),
                    PathNode.LineTo(119.47f, 71.52f),
                    PathNode.CurveTo(121.72163f, 69.260544f, 124.78018f, 67.99054f, 127.97f, 67.99054f),
                    PathNode.CurveTo(131.15982f, 67.99054f, 134.21838f, 69.260544f, 136.47f, 71.52f),
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
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null
