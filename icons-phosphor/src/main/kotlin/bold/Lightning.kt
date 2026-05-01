package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorBoldIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.71f, 117.38f),
                    PathNode.CurveTo(218.84595f, 113.518326f, 216.13364f, 110.33089f, 212.46f, 108.86f),
                    PathNode.LineTo(161.28f, 88.39f),
                    PathNode.LineTo(171.87f, 17.78f),
                    PathNode.CurveTo(172.66798f, 12.575142f, 169.97958f, 7.458118f, 165.2408f, 5.162195f),
                    PathNode.CurveTo(160.50201f, 2.866273f, 154.82007f, 3.927897f, 151.23f, 7.78f),
                    PathNode.LineTo(39.23f, 127.78f),
                    PathNode.CurveTo(36.52719f, 130.6745f, 35.426495f, 134.71611f, 36.288338f, 138.5814f),
                    PathNode.CurveTo(37.150177f, 142.44669f, 39.86357f, 145.63788f, 43.54f, 147.11f),
                    PathNode.LineTo(94.72f, 167.58f),
                    PathNode.LineTo(84.13f, 238.22f),
                    PathNode.CurveTo(83.332016f, 243.42487f, 86.02042f, 248.54189f, 90.7592f, 250.8378f),
                    PathNode.CurveTo(95.497986f, 253.13373f, 101.17993f, 252.0721f, 104.77f, 248.22f),
                    PathNode.LineTo(216.77f, 128.22f),
                    PathNode.CurveTo(219.48486f, 125.31661f, 220.58583f, 121.25725f, 219.71f, 117.38f),
                    PathNode.Close,
                    PathNode.MoveTo(113.6f, 203.55f),
                    PathNode.LineTo(119.87f, 161.78f),
                    PathNode.CurveTo(120.69488f, 156.2761f, 117.62718f, 150.92729f, 112.46f, 148.86f),
                    PathNode.LineTo(68.74f, 131.37f),
                    PathNode.LineTo(142.4f, 52.45f),
                    PathNode.LineTo(136.13f, 94.22f),
                    PathNode.CurveTo(135.30513f, 99.723915f, 138.37282f, 105.072716f, 143.54f, 107.14f),
                    PathNode.LineTo(187.26f, 124.63f),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null
