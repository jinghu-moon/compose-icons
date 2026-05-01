package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorBoldIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 180.0f),
                    PathNode.CurveTo(156.7051f, 179.96693f, 179.96693f, 156.7051f, 180.0f, 128.0f),
                    PathNode.LineTo(180.0f, 64.0f),
                    PathNode.CurveTo(180.0f, 35.281193f, 156.71881f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(99.2812f, 12.0f, 76.0f, 35.281193f, 76.0f, 64.0f),
                    PathNode.LineTo(76.0f, 128.0f),
                    PathNode.CurveTo(76.033066f, 156.7051f, 99.2949f, 179.96693f, 128.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 64.0f),
                    PathNode.CurveTo(100.0f, 48.53603f, 112.536026f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(143.46397f, 36.0f, 156.0f, 48.53603f, 156.0f, 64.0f),
                    PathNode.LineTo(156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 143.46397f, 143.46397f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(112.536026f, 156.0f, 100.0f, 143.46397f, 100.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 219.22f),
                    PathNode.LineTo(140.0f, 240.0f),
                    PathNode.CurveTo(140.0f, 246.62741f, 134.62741f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(121.37258f, 252.0f, 116.0f, 246.62741f, 116.0f, 240.0f),
                    PathNode.LineTo(116.0f, 219.22f),
                    PathNode.CurveTo(70.25149f, 213.13939f, 36.058475f, 174.1508f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 121.37258f, 41.37258f, 116.0f, 48.0f, 116.0f),
                    PathNode.CurveTo(54.62742f, 116.0f, 60.0f, 121.37258f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 165.55536f, 90.44463f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(165.55536f, 196.0f, 196.0f, 165.55536f, 196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 121.37258f, 201.37259f, 116.0f, 208.0f, 116.0f),
                    PathNode.CurveTo(214.62741f, 116.0f, 220.0f, 121.37258f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94154f, 174.1508f, 185.7485f, 213.13939f, 140.0f, 219.22f),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
