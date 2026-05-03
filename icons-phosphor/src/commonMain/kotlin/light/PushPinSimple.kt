package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorLightIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 170.0f),
                    PathNode.LineTo(205.0f, 170.0f),
                    PathNode.LineTo(183.15f, 46.0f),
                    PathNode.LineTo(192.0f, 46.0f),
                    PathNode.CurveTo(195.3137f, 46.0f, 198.0f, 43.31371f, 198.0f, 40.0f),
                    PathNode.CurveTo(198.0f, 36.68629f, 195.3137f, 34.0f, 192.0f, 34.0f),
                    PathNode.LineTo(64.0f, 34.0f),
                    PathNode.CurveTo(60.68629f, 34.0f, 58.0f, 36.68629f, 58.0f, 40.0f),
                    PathNode.CurveTo(58.0f, 43.31371f, 60.68629f, 46.0f, 64.0f, 46.0f),
                    PathNode.LineTo(72.85f, 46.0f),
                    PathNode.LineTo(51.0f, 170.0f),
                    PathNode.LineTo(40.0f, 170.0f),
                    PathNode.CurveTo(36.68629f, 170.0f, 34.0f, 172.6863f, 34.0f, 176.0f),
                    PathNode.CurveTo(34.0f, 179.3137f, 36.68629f, 182.0f, 40.0f, 182.0f),
                    PathNode.LineTo(122.0f, 182.0f),
                    PathNode.LineTo(122.0f, 240.0f),
                    PathNode.CurveTo(122.0f, 243.3137f, 124.686295f, 246.0f, 128.0f, 246.0f),
                    PathNode.CurveTo(131.3137f, 246.0f, 134.0f, 243.3137f, 134.0f, 240.0f),
                    PathNode.LineTo(134.0f, 182.0f),
                    PathNode.LineTo(216.0f, 182.0f),
                    PathNode.CurveTo(219.3137f, 182.0f, 222.0f, 179.3137f, 222.0f, 176.0f),
                    PathNode.CurveTo(222.0f, 172.6863f, 219.3137f, 170.0f, 216.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(85.0f, 46.0f),
                    PathNode.LineTo(171.0f, 46.0f),
                    PathNode.LineTo(192.88f, 170.0f),
                    PathNode.LineTo(63.15f, 170.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
