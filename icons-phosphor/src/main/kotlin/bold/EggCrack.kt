package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorBoldIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(190.0f, 57.34f),
                    PathNode.CurveTo(171.06f, 29.0f, 147.88f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(108.12f, 12.0f, 84.94f, 29.0f, 66.0f, 57.34f),
                    PathNode.CurveTo(46.94f, 86.0f, 36.0f, 120.46f, 36.0f, 152.0f),
                    PathNode.CurveTo(36.0f, 202.8102f, 77.18981f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(178.8102f, 244.0f, 220.0f, 202.8102f, 220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 120.46f, 209.06f, 86.0f, 190.0f, 57.34f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(90.46063f, 219.96141f, 60.038586f, 189.53935f, 60.0f, 152.0f),
                    PathNode.CurveTo(60.0f, 90.88f, 106.19f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(135.59f, 36.0f, 146.13f, 42.65f, 156.64f, 53.88f),
                    PathNode.LineTo(119.05f, 96.0f),
                    PathNode.CurveTo(116.25308f, 99.12888f, 115.29397f, 103.4916f, 116.5207f, 107.50506f),
                    PathNode.CurveTo(117.74743f, 111.51851f, 120.98174f, 114.59949f, 125.05f, 115.63f),
                    PathNode.LineTo(145.95f, 120.86f),
                    PathNode.LineTo(140.19f, 149.64f),
                    PathNode.CurveTo(139.5661f, 152.76166f, 140.20816f, 156.00331f, 141.97485f, 158.65147f),
                    PathNode.CurveTo(143.74155f, 161.29965f, 146.4881f, 163.1373f, 149.61f, 163.76f),
                    PathNode.CurveTo(150.3965f, 163.92061f, 151.19727f, 164.00102f, 152.0f, 164.0f),
                    PathNode.CurveTo(157.7186f, 163.99635f, 162.6401f, 159.95787f, 163.76f, 154.35f),
                    PathNode.LineTo(171.76f, 114.35f),
                    PathNode.CurveTo(173.0189f, 108.066154f, 169.11794f, 101.902084f, 162.9f, 100.35f),
                    PathNode.LineTo(150.16f, 97.16f),
                    PathNode.LineTo(171.56f, 73.16f),
                    PathNode.CurveTo(185.2f, 94.34f, 196.0f, 122.44f, 196.0f, 152.0f),
                    PathNode.CurveTo(195.96141f, 189.53935f, 165.53935f, 219.96141f, 128.0f, 220.0f),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
