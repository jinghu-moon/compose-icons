package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorBoldIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 164.0f),
                    PathNode.LineTo(210.07f, 164.0f),
                    PathNode.LineTo(190.3f, 52.0f),
                    PathNode.LineTo(192.0f, 52.0f),
                    PathNode.CurveTo(198.62741f, 52.0f, 204.0f, 46.62742f, 204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 33.37258f, 198.62741f, 28.0f, 192.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(57.37258f, 28.0f, 52.0f, 33.37258f, 52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 46.62742f, 57.37258f, 52.0f, 64.0f, 52.0f),
                    PathNode.LineTo(65.7f, 52.0f),
                    PathNode.LineTo(45.93f, 164.0f),
                    PathNode.LineTo(40.0f, 164.0f),
                    PathNode.CurveTo(33.37258f, 164.0f, 28.0f, 169.37259f, 28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 182.62741f, 33.37258f, 188.0f, 40.0f, 188.0f),
                    PathNode.LineTo(116.0f, 188.0f),
                    PathNode.LineTo(116.0f, 240.0f),
                    PathNode.CurveTo(116.0f, 246.62741f, 121.37258f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(134.62741f, 252.0f, 140.0f, 246.62741f, 140.0f, 240.0f),
                    PathNode.LineTo(140.0f, 188.0f),
                    PathNode.LineTo(216.0f, 188.0f),
                    PathNode.CurveTo(222.62741f, 188.0f, 228.0f, 182.62741f, 228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 169.37259f, 222.62741f, 164.0f, 216.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.07f, 52.0f),
                    PathNode.LineTo(165.93f, 52.0f),
                    PathNode.LineTo(185.7f, 164.0f),
                    PathNode.LineTo(70.3f, 164.0f),
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
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
