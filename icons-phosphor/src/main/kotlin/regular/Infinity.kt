package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorRegularIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 128.0f),
                    PathNode.CurveTo(248.00163f, 150.65114f, 234.35765f, 171.07262f, 213.43082f, 179.74107f),
                    PathNode.CurveTo(192.50398f, 188.4095f, 168.41595f, 183.6176f, 152.4f, 167.6f),
                    PathNode.LineTo(152.07f, 167.25f),
                    PathNode.LineTo(92.12f, 99.55f),
                    PathNode.CurveTo(76.45101f, 84.0641f, 51.20998f, 84.16299f, 35.66281f, 99.77119f),
                    PathNode.CurveTo(20.115643f, 115.37939f, 20.115643f, 140.6206f, 35.66281f, 156.2288f),
                    PathNode.CurveTo(51.20998f, 171.837f, 76.45101f, 171.9359f, 92.12f, 156.45f),
                    PathNode.LineTo(100.64f, 146.83f),
                    PathNode.CurveTo(103.56987f, 143.5163f, 108.631294f, 143.20512f, 111.945f, 146.135f),
                    PathNode.CurveTo(115.258705f, 149.06487f, 115.56987f, 154.1263f, 112.64f, 157.44f),
                    PathNode.LineTo(103.95f, 167.25f),
                    PathNode.LineTo(103.62f, 167.6f),
                    PathNode.CurveTo(81.75005f, 189.46771f, 46.293846f, 189.4665f, 24.425388f, 167.5973f),
                    PathNode.CurveTo(2.556925f, 145.72809f, 2.556925f, 110.2719f, 24.425388f, 88.402695f),
                    PathNode.CurveTo(46.293846f, 66.533485f, 81.75005f, 66.53228f, 103.62f, 88.4f),
                    PathNode.LineTo(103.95f, 88.75f),
                    PathNode.LineTo(163.9f, 156.45f),
                    PathNode.CurveTo(179.56898f, 171.9359f, 204.81001f, 171.837f, 220.3572f, 156.2288f),
                    PathNode.CurveTo(235.90436f, 140.6206f, 235.90436f, 115.37939f, 220.3572f, 99.77119f),
                    PathNode.CurveTo(204.81001f, 84.16299f, 179.56898f, 84.0641f, 163.9f, 99.55f),
                    PathNode.LineTo(155.38f, 109.17f),
                    PathNode.CurveTo(152.45013f, 112.48371f, 147.3887f, 112.79487f, 144.075f, 109.865f),
                    PathNode.CurveTo(140.76129f, 106.93513f, 140.45013f, 101.87371f, 143.38f, 98.56f),
                    PathNode.LineTo(152.07f, 88.75f),
                    PathNode.LineTo(152.4f, 88.4f),
                    PathNode.CurveTo(168.41595f, 72.38241f, 192.50398f, 67.59049f, 213.43082f, 76.258934f),
                    PathNode.CurveTo(234.35765f, 84.92737f, 248.00163f, 105.34886f, 248.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _infinity!!
    }

private var _infinity: ImageVector? = null
