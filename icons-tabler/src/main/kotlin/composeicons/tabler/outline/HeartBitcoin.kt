package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartBitcoin: ImageVector
    get() {
        if (_heartBitcoin != null) return _heartBitcoin!!
        _heartBitcoin = tablerOutlineIcon(
            name = "HeartBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 21.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 13.5f),
                    PathNode.MoveTo(19.0f, 22.5f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.MoveTo(17.0f, 18.0f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.LineTo(19.5f, 18.0f),
                    PathNode.CurveTo(20.328426f, 18.0f, 21.0f, 18.671574f, 21.0f, 19.5f),
                    PathNode.CurveTo(21.0f, 20.328426f, 20.328426f, 21.0f, 19.5f, 21.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.LineTo(19.5f, 18.0f),
                    PathNode.CurveTo(20.328426f, 18.0f, 21.0f, 17.328426f, 21.0f, 16.5f),
                    PathNode.CurveTo(21.0f, 15.671573f, 20.328426f, 15.0f, 19.5f, 15.0f),
                    PathNode.LineTo(16.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 19.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.LineTo(4.5f, 12.572f),
                    PathNode.CurveTo(3.151298f, 11.259582f, 2.65373f, 9.301041f, 3.21248f, 7.504033f),
                    PathNode.CurveTo(3.771231f, 5.707025f, 5.291653f, 4.375945f, 7.146762f, 4.0597f),
                    PathNode.CurveTo(9.001871f, 3.743454f, 10.877429f, 4.495612f, 12.0f, 6.006f),
                    PathNode.CurveTo(13.456027f, 4.069005f, 16.091423f, 3.454883f, 18.253716f, 4.548705f),
                    PathNode.CurveTo(20.41601f, 5.642528f, 21.482725f, 8.129409f, 20.785f, 10.45f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heartBitcoin!!
    }

private var _heartBitcoin: ImageVector? = null
