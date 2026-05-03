package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorBoldIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.88f, 207.93f),
                    PathNode.LineTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(62.0f, 73.19f),
                    PathNode.LineTo(45.93f, 164.0f),
                    PathNode.LineTo(40.0f, 164.0f),
                    PathNode.CurveTo(33.37258f, 164.0f, 28.0f, 169.37259f, 28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 182.62741f, 33.37258f, 188.0f, 40.0f, 188.0f),
                    PathNode.LineTo(116.0f, 188.0f),
                    PathNode.LineTo(116.0f, 240.0f),
                    PathNode.CurveTo(116.0f, 246.62741f, 121.37258f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(134.62741f, 252.0f, 140.0f, 246.62741f, 140.0f, 240.0f),
                    PathNode.LineTo(140.0f, 188.0f),
                    PathNode.LineTo(166.33f, 188.0f),
                    PathNode.LineTo(199.12f, 224.07f),
                    PathNode.CurveTo(203.5975f, 228.87978f, 211.1107f, 229.19368f, 215.9738f, 224.77417f),
                    PathNode.CurveTo(220.83693f, 220.35464f, 221.24089f, 212.84575f, 216.88f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(70.3f, 164.0f),
                    PathNode.LineTo(82.37f, 95.64f),
                    PathNode.LineTo(144.51f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.06f, 40.0f),
                    PathNode.CurveTo(90.06f, 33.37258f, 95.43259f, 28.0f, 102.06f, 28.0f),
                    PathNode.LineTo(192.0f, 28.0f),
                    PathNode.CurveTo(198.62741f, 28.0f, 204.0f, 33.37258f, 204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 46.62742f, 198.62741f, 52.0f, 192.0f, 52.0f),
                    PathNode.LineTo(190.3f, 52.0f),
                    PathNode.LineTo(205.63f, 138.84f),
                    PathNode.CurveTo(206.18523f, 141.97498f, 205.47188f, 145.20209f, 203.64699f, 147.81094f),
                    PathNode.CurveTo(201.82211f, 150.41978f, 199.03528f, 152.19653f, 195.9f, 152.75f),
                    PathNode.CurveTo(195.20627f, 152.86859f, 194.5038f, 152.9288f, 193.8f, 152.93f),
                    PathNode.CurveTo(187.97879f, 152.92024f, 183.00415f, 148.73396f, 182.0f, 143.0f),
                    PathNode.LineTo(165.93f, 52.0f),
                    PathNode.LineTo(102.06f, 52.0f),
                    PathNode.CurveTo(95.43259f, 52.0f, 90.06f, 46.62742f, 90.06f, 40.0f),
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
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
