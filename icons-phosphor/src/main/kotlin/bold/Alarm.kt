package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorBoldIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(72.77152f, 36.0f, 28.0f, 80.77152f, 28.0f, 136.0f),
                    PathNode.CurveTo(28.0f, 191.22847f, 72.77152f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(183.22847f, 236.0f, 228.0f, 191.22847f, 228.0f, 136.0f),
                    PathNode.CurveTo(227.93938f, 80.79665f, 183.20334f, 36.060623f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(86.02636f, 212.0f, 52.0f, 177.97365f, 52.0f, 136.0f),
                    PathNode.CurveTo(52.0f, 94.02636f, 86.02636f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(169.97365f, 60.0f, 204.0f, 94.02636f, 204.0f, 136.0f),
                    PathNode.CurveTo(203.9559f, 177.95538f, 169.95538f, 211.9559f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.49f, 72.49f),
                    PathNode.CurveTo(27.79558f, 77.18442f, 20.18442f, 77.18442f, 15.49f, 72.49f),
                    PathNode.CurveTo(10.795579f, 67.79558f, 10.79558f, 60.18442f, 15.49f, 55.49f),
                    PathNode.LineTo(47.49f, 23.49f),
                    PathNode.CurveTo(52.18442f, 18.79558f, 59.79558f, 18.79558f, 64.49f, 23.49f),
                    PathNode.CurveTo(69.18442f, 28.18442f, 69.18442f, 35.79558f, 64.49f, 40.49f),
                    PathNode.Close,
                    PathNode.MoveTo(240.49f, 72.49f),
                    PathNode.CurveTo(238.23837f, 74.74945f, 235.17982f, 76.01946f, 231.99f, 76.01946f),
                    PathNode.CurveTo(228.80019f, 76.01946f, 225.74162f, 74.74945f, 223.49f, 72.49f),
                    PathNode.LineTo(191.49f, 40.49f),
                    PathNode.CurveTo(186.79558f, 35.79558f, 186.79558f, 28.18442f, 191.49f, 23.49f),
                    PathNode.CurveTo(196.18442f, 18.79558f, 203.79558f, 18.79558f, 208.49f, 23.49f),
                    PathNode.LineTo(240.49f, 55.49f),
                    PathNode.CurveTo(242.74945f, 57.741623f, 244.01947f, 60.800182f, 244.01947f, 63.99f),
                    PathNode.CurveTo(244.01947f, 67.17982f, 242.74945f, 70.23838f, 240.49f, 72.49f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 124.0f),
                    PathNode.CurveTo(182.62741f, 124.0f, 188.0f, 129.37259f, 188.0f, 136.0f),
                    PathNode.CurveTo(188.0f, 142.62741f, 182.62741f, 148.0f, 176.0f, 148.0f),
                    PathNode.LineTo(128.0f, 148.0f),
                    PathNode.CurveTo(121.37258f, 148.0f, 116.0f, 142.62741f, 116.0f, 136.0f),
                    PathNode.LineTo(116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 81.37258f, 121.37258f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(134.62741f, 76.0f, 140.0f, 81.37258f, 140.0f, 88.0f),
                    PathNode.LineTo(140.0f, 124.0f),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
