package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorBoldIcon(
            name = "CaretCircleDoubleRight",
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
                    PathNode.MoveTo(128.47f, 119.51f),
                    PathNode.CurveTo(130.72946f, 121.76162f, 131.99947f, 124.82018f, 131.99947f, 128.01f),
                    PathNode.CurveTo(131.99947f, 131.19981f, 130.72946f, 134.25838f, 128.47f, 136.51f),
                    PathNode.LineTo(96.47f, 168.51f),
                    PathNode.CurveTo(91.77558f, 173.20442f, 84.16442f, 173.20442f, 79.47f, 168.51f),
                    PathNode.CurveTo(74.77558f, 163.81558f, 74.77558f, 156.20442f, 79.47f, 151.51f),
                    PathNode.LineTo(103.0f, 128.0f),
                    PathNode.LineTo(79.49f, 104.47f),
                    PathNode.CurveTo(74.79558f, 99.77558f, 74.79558f, 92.16442f, 79.49f, 87.47f),
                    PathNode.CurveTo(84.18442f, 82.77558f, 91.79558f, 82.77558f, 96.49f, 87.47f),
                    PathNode.Close,
                    PathNode.MoveTo(184.47f, 136.51f),
                    PathNode.LineTo(152.47f, 168.51f),
                    PathNode.CurveTo(147.77557f, 173.20442f, 140.16441f, 173.20442f, 135.47f, 168.51f),
                    PathNode.CurveTo(130.77557f, 163.81558f, 130.77557f, 156.20442f, 135.47f, 151.51f),
                    PathNode.LineTo(159.0f, 128.0f),
                    PathNode.LineTo(135.48f, 104.47f),
                    PathNode.CurveTo(130.78558f, 99.77558f, 130.78558f, 92.16442f, 135.48f, 87.47f),
                    PathNode.CurveTo(140.17442f, 82.77558f, 147.78558f, 82.77558f, 152.48f, 87.47f),
                    PathNode.LineTo(184.48f, 119.47f),
                    PathNode.CurveTo(186.74957f, 121.71842f, 188.02888f, 124.77903f, 188.03452f, 127.97376f),
                    PathNode.CurveTo(188.04015f, 131.16849f, 186.77164f, 134.2336f, 184.51f, 136.49f),
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
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null
