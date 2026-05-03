package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) return _caretCircleDoubleDown!!
        _caretCircleDoubleDown = phosphorBoldIcon(
            name = "CaretCircleDoubleDown",
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
                    PathNode.MoveTo(168.5f, 79.49f),
                    PathNode.CurveTo(170.75946f, 81.74162f, 172.02946f, 84.80018f, 172.02946f, 87.99f),
                    PathNode.CurveTo(172.02946f, 91.17982f, 170.75946f, 94.23838f, 168.5f, 96.49f),
                    PathNode.LineTo(136.5f, 128.49f),
                    PathNode.CurveTo(134.24838f, 130.74945f, 131.18982f, 132.01947f, 128.0f, 132.01947f),
                    PathNode.CurveTo(124.81018f, 132.01947f, 121.751625f, 130.74945f, 119.5f, 128.49f),
                    PathNode.LineTo(87.5f, 96.49f),
                    PathNode.CurveTo(82.80559f, 91.79558f, 82.80559f, 84.18442f, 87.5f, 79.49f),
                    PathNode.CurveTo(92.19441f, 74.79558f, 99.80559f, 74.79558f, 104.5f, 79.49f),
                    PathNode.LineTo(128.0f, 103.0f),
                    PathNode.LineTo(151.53f, 79.47f),
                    PathNode.CurveTo(156.22174f, 74.789604f, 163.81929f, 74.79855f, 168.5f, 79.49f),
                    PathNode.Close,
                    PathNode.MoveTo(168.5f, 135.49f),
                    PathNode.CurveTo(170.75946f, 137.74162f, 172.02946f, 140.80019f, 172.02946f, 143.99f),
                    PathNode.CurveTo(172.02946f, 147.17982f, 170.75946f, 150.23837f, 168.5f, 152.49f),
                    PathNode.LineTo(136.5f, 184.49f),
                    PathNode.CurveTo(134.24838f, 186.74945f, 131.18982f, 188.01947f, 128.0f, 188.01947f),
                    PathNode.CurveTo(124.81018f, 188.01947f, 121.751625f, 186.74945f, 119.5f, 184.49f),
                    PathNode.LineTo(87.5f, 152.49f),
                    PathNode.CurveTo(82.80559f, 147.79558f, 82.80559f, 140.18442f, 87.5f, 135.49f),
                    PathNode.CurveTo(92.19441f, 130.79558f, 99.80559f, 130.79558f, 104.5f, 135.49f),
                    PathNode.LineTo(128.0f, 159.0f),
                    PathNode.LineTo(151.53f, 135.48f),
                    PathNode.CurveTo(156.22726f, 130.80511f, 163.82483f, 130.82301f, 168.5f, 135.52f),
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
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
