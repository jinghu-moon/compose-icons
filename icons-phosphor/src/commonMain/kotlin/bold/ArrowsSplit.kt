package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) return _arrowsSplit!!
        _arrowsSplit = phosphorBoldIcon(
            name = "ArrowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 192.49f),
                    PathNode.LineTo(200.49f, 224.49f),
                    PathNode.CurveTo(198.23837f, 226.74945f, 195.17982f, 228.01947f, 191.99f, 228.01947f),
                    PathNode.CurveTo(188.80019f, 228.01947f, 185.74162f, 226.74945f, 183.49f, 224.49f),
                    PathNode.LineTo(151.49f, 192.49f),
                    PathNode.CurveTo(146.79558f, 187.79558f, 146.79558f, 180.18442f, 151.49f, 175.49f),
                    PathNode.CurveTo(156.18442f, 170.79558f, 163.79558f, 170.79558f, 168.49f, 175.49f),
                    PathNode.LineTo(180.0f, 187.0f),
                    PathNode.LineTo(180.0f, 141.0f),
                    PathNode.LineTo(128.0f, 89.0f),
                    PathNode.LineTo(76.0f, 141.0f),
                    PathNode.LineTo(76.0f, 187.0f),
                    PathNode.LineTo(87.51f, 175.48f),
                    PathNode.CurveTo(92.20442f, 170.78558f, 99.81558f, 170.78558f, 104.51f, 175.48f),
                    PathNode.CurveTo(109.20442f, 180.17442f, 109.20442f, 187.78558f, 104.51f, 192.48f),
                    PathNode.LineTo(72.51f, 224.48f),
                    PathNode.CurveTo(70.25838f, 226.73946f, 67.19982f, 228.00946f, 64.01f, 228.00946f),
                    PathNode.CurveTo(60.820183f, 228.00946f, 57.761623f, 226.73946f, 55.51f, 224.48f),
                    PathNode.LineTo(23.51f, 192.48f),
                    PathNode.CurveTo(18.81558f, 187.78558f, 18.815578f, 180.17442f, 23.51f, 175.48f),
                    PathNode.CurveTo(28.20442f, 170.78558f, 35.81558f, 170.78558f, 40.51f, 175.48f),
                    PathNode.LineTo(52.0f, 187.0f),
                    PathNode.LineTo(52.0f, 136.0f),
                    PathNode.CurveTo(51.997498f, 132.81645f, 53.260136f, 129.76236f, 55.51f, 127.51f),
                    PathNode.LineTo(116.0f, 67.0f),
                    PathNode.LineTo(116.0f, 24.0f),
                    PathNode.CurveTo(116.0f, 17.372583f, 121.37258f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(134.62741f, 12.0f, 140.0f, 17.372583f, 140.0f, 24.0f),
                    PathNode.LineTo(140.0f, 67.0f),
                    PathNode.LineTo(200.49f, 127.48f),
                    PathNode.CurveTo(202.74724f, 129.73972f, 204.01048f, 132.80606f, 204.0f, 136.0f),
                    PathNode.LineTo(204.0f, 187.0f),
                    PathNode.LineTo(215.51f, 175.48f),
                    PathNode.CurveTo(220.20442f, 170.78558f, 227.81558f, 170.78558f, 232.51f, 175.48f),
                    PathNode.CurveTo(237.20442f, 180.17442f, 237.20442f, 187.78558f, 232.51f, 192.48f),
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
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
