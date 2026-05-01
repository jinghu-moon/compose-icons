package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorFillIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 30.326887f, 134.32689f, 16.0f, 152.0f, 16.0f),
                    PathNode.CurveTo(169.67311f, 16.0f, 184.0f, 30.326887f, 184.0f, 48.0f),
                    PathNode.CurveTo(184.0f, 65.67311f, 169.67311f, 80.0f, 152.0f, 80.0f),
                    PathNode.CurveTo(134.32689f, 80.0f, 120.0f, 65.67311f, 120.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.CurveTo(179.36f, 136.0f, 166.19f, 122.7f, 152.25f, 108.63f),
                    PathNode.CurveTo(148.72f, 105.06f, 145.07f, 101.37f, 141.25f, 98.05f),
                    PathNode.CurveTo(104.25f, 65.91f, 45.03f, 120.78f, 42.53f, 123.13f),
                    PathNode.CurveTo(39.433685f, 126.17811f, 39.33632f, 131.14037f, 42.31068f, 134.30759f),
                    PathNode.CurveTo(45.28504f, 137.4748f, 50.24363f, 137.68896f, 53.48f, 134.79f),
                    PathNode.CurveTo(62.786057f, 126.38279f, 73.02641f, 119.0716f, 84.0f, 113.0f),
                    PathNode.CurveTo(97.78f, 105.62f, 109.39f, 102.77f, 118.7f, 104.42f),
                    PathNode.LineTo(64.66f, 228.81f),
                    PathNode.CurveTo(62.902973f, 232.86104f, 64.76043f, 237.56958f, 68.81f, 239.33f),
                    PathNode.CurveTo(69.81465f, 239.77435f, 70.90147f, 240.00262f, 72.0f, 240.0f),
                    PathNode.CurveTo(75.18622f, 240.0014f, 78.069496f, 238.11195f, 79.34f, 235.19f),
                    PathNode.LineTo(112.93f, 157.92f),
                    PathNode.LineTo(144.0f, 180.12f),
                    PathNode.LineTo(144.0f, 232.0f),
                    PathNode.CurveTo(144.0f, 236.41827f, 147.58173f, 240.0f, 152.0f, 240.0f),
                    PathNode.CurveTo(156.41827f, 240.0f, 160.0f, 236.41827f, 160.0f, 232.0f),
                    PathNode.LineTo(160.0f, 176.0f),
                    PathNode.CurveTo(160.00006f, 173.41637f, 158.75237f, 170.99174f, 156.65f, 169.49f),
                    PathNode.LineTo(119.45f, 142.92f),
                    PathNode.LineTo(132.88f, 112.0f),
                    PathNode.CurveTo(135.52f, 114.44f, 138.14f, 117.07f, 140.88f, 119.84f),
                    PathNode.CurveTo(155.05f, 134.19f, 172.69f, 152.0f, 208.0f, 152.0f),
                    PathNode.CurveTo(212.41827f, 152.0f, 216.0f, 148.41827f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 139.58173f, 212.41827f, 136.0f, 208.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
