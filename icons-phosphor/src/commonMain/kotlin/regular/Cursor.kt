package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorRegularIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 132.69f),
                    PathNode.LineTo(214.08f, 115.0f),
                    PathNode.LineTo(214.41f, 114.87f),
                    PathNode.CurveTo(220.4464f, 112.19326f, 224.21837f, 106.0832f, 223.90628f, 99.48732f),
                    PathNode.CurveTo(223.5942f, 92.89145f, 219.26216f, 87.16482f, 213.0f, 85.07f),
                    PathNode.LineTo(52.92f, 32.8f),
                    PathNode.CurveTo(47.208054f, 30.930578f, 40.930206f, 32.430668f, 36.680435f, 36.680435f),
                    PathNode.CurveTo(32.430668f, 40.930206f, 30.930578f, 47.208054f, 32.8f, 52.92f),
                    PathNode.LineTo(85.07f, 213.0f),
                    PathNode.CurveTo(87.08787f, 219.32814f, 92.84375f, 223.72194f, 99.48f, 224.0f),
                    PathNode.LineTo(100.26f, 224.0f),
                    PathNode.CurveTo(106.6124f, 224.02211f, 112.36355f, 220.24706f, 114.87f, 214.41f),
                    PathNode.LineTo(115.0f, 214.08f),
                    PathNode.LineTo(132.69f, 168.0f),
                    PathNode.LineTo(184.0f, 219.31f),
                    PathNode.CurveTo(187.00069f, 222.31137f, 191.0709f, 223.99759f, 195.315f, 223.99759f),
                    PathNode.CurveTo(199.5591f, 223.99759f, 203.62932f, 222.31137f, 206.63f, 219.31f),
                    PathNode.LineTo(219.31f, 206.63f),
                    PathNode.CurveTo(222.31137f, 203.62932f, 223.99759f, 199.5591f, 223.99759f, 195.315f),
                    PathNode.CurveTo(223.99759f, 191.0709f, 222.31137f, 187.00069f, 219.31f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(195.31f, 208.0f),
                    PathNode.LineTo(144.0f, 156.69f),
                    PathNode.CurveTo(140.25706f, 152.94017f, 134.90057f, 151.28635f, 129.69514f, 152.27338f),
                    PathNode.CurveTo(124.4897f, 153.2604f, 120.11042f, 156.76028f, 118.0f, 161.62f),
                    PathNode.CurveTo(118.0f, 161.73f, 117.91f, 161.84f, 117.87f, 161.94f),
                    PathNode.LineTo(100.22f, 207.94f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(207.85f, 100.2f),
                    PathNode.LineTo(161.9f, 117.84f),
                    PathNode.LineTo(161.58f, 117.97f),
                    PathNode.CurveTo(156.72028f, 120.08043f, 153.22041f, 124.4597f, 152.23338f, 129.66515f),
                    PathNode.CurveTo(151.24635f, 134.87057f, 152.90016f, 140.22707f, 156.65f, 143.97f),
                    PathNode.LineTo(156.65f, 143.97f),
                    PathNode.LineTo(208.0f, 195.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cursor!!
    }

private var _cursor: ImageVector? = null
