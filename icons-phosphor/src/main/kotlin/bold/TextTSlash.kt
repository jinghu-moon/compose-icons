package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorBoldIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.07f, 224.88f),
                    PathNode.CurveTo(211.16554f, 229.33647f, 203.57716f, 228.9738f, 199.12f, 224.07f),
                    PathNode.LineTo(140.0f, 159.0f),
                    PathNode.LineTo(140.0f, 188.0f),
                    PathNode.LineTo(160.0f, 188.0f),
                    PathNode.CurveTo(166.62741f, 188.0f, 172.0f, 193.37259f, 172.0f, 200.0f),
                    PathNode.CurveTo(172.0f, 206.62741f, 166.62741f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(89.37258f, 212.0f, 84.0f, 206.62741f, 84.0f, 200.0f),
                    PathNode.CurveTo(84.0f, 193.37259f, 89.37258f, 188.0f, 96.0f, 188.0f),
                    PathNode.LineTo(116.0f, 188.0f),
                    PathNode.LineTo(116.0f, 132.64f),
                    PathNode.LineTo(68.0f, 79.84f),
                    PathNode.LineTo(68.0f, 88.0f),
                    PathNode.CurveTo(68.0f, 94.62742f, 62.62742f, 100.0f, 56.0f, 100.0f),
                    PathNode.CurveTo(49.37258f, 100.0f, 44.0f, 94.62742f, 44.0f, 88.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.00023f, 55.224297f, 44.07727f, 54.45052f, 44.23f, 53.69f),
                    PathNode.LineTo(39.12f, 48.07f),
                    PathNode.CurveTo(36.175465f, 44.906956f, 35.15908f, 40.404972f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(37.759064f, 32.16236f, 41.174625f, 29.058353f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(49.6276f, 27.25621f, 54.012154f, 28.697262f, 56.88f, 31.93f),
                    PathNode.LineTo(216.88f, 207.93f),
                    PathNode.CurveTo(221.33647f, 212.83446f, 220.9738f, 220.42284f, 216.07f, 224.88f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 68.0f),
                    PathNode.LineTo(116.0f, 68.57f),
                    PathNode.CurveTo(116.0f, 75.19742f, 121.37258f, 80.57f, 128.0f, 80.57f),
                    PathNode.CurveTo(134.62741f, 80.57f, 140.0f, 75.19742f, 140.0f, 68.57f),
                    PathNode.LineTo(140.0f, 68.0f),
                    PathNode.LineTo(188.0f, 68.0f),
                    PathNode.LineTo(188.0f, 88.0f),
                    PathNode.CurveTo(188.0f, 94.62742f, 193.37259f, 100.0f, 200.0f, 100.0f),
                    PathNode.CurveTo(206.62741f, 100.0f, 212.0f, 94.62742f, 212.0f, 88.0f),
                    PathNode.LineTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 49.37258f, 206.62741f, 44.0f, 200.0f, 44.0f),
                    PathNode.LineTo(116.6f, 44.0f),
                    PathNode.CurveTo(109.97257f, 43.834316f, 104.46568f, 49.072582f, 104.3f, 55.7f),
                    PathNode.CurveTo(104.134315f, 62.327415f, 109.37258f, 67.83431f, 116.0f, 68.0f),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
