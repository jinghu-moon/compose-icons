package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorFillIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.CurveTo(215.88303f, 212.7287f, 216.56061f, 215.73003f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(214.82729f, 221.2251f, 212.55025f, 223.29443f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(206.91493f, 224.49586f, 203.9919f, 223.53516f, 202.08f, 221.38f),
                    PathNode.LineTo(188.51f, 206.46f),
                    PathNode.CurveTo(171.89058f, 217.90752f, 152.18045f, 224.0253f, 132.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 124.0f),
                    PathNode.CurveTo(31.977772f, 100.564316f, 40.225235f, 77.87228f, 55.29f, 59.92f),
                    PathNode.LineTo(42.08f, 45.38f),
                    PathNode.CurveTo(40.624893f, 43.778996f, 39.880253f, 41.656906f, 40.01591f, 39.4977f),
                    PathNode.CurveTo(40.151566f, 37.338497f, 41.155952f, 35.32629f, 42.8f, 33.92f),
                    PathNode.CurveTo(46.223637f, 31.146051f, 51.225613f, 31.565088f, 54.14f, 34.87f),
                    PathNode.Close,
                    PathNode.MoveTo(208.35f, 180.71f),
                    PathNode.CurveTo(209.16829f, 181.61053f, 210.35197f, 182.08965f, 211.56627f, 182.0118f),
                    PathNode.CurveTo(212.78056f, 181.93394f, 213.89339f, 181.30765f, 214.59f, 180.31f),
                    PathNode.CurveTo(240.58109f, 142.0822f, 236.9828f, 91.02194f, 205.88728f, 56.817112f),
                    PathNode.CurveTo(174.79176f, 22.61228f, 124.30441f, 14.178744f, 83.78f, 36.42f),
                    PathNode.CurveTo(82.71717f, 37.016773f, 81.98445f, 38.065598f, 81.78974f, 39.26886f),
                    PathNode.CurveTo(81.59504f, 40.47212f, 81.95961f, 41.698498f, 82.78f, 42.6f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
