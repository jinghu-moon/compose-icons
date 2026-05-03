package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorThinIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 80.0f),
                    PathNode.LineTo(132.0f, 125.74f),
                    PathNode.LineTo(170.06f, 148.57f),
                    PathNode.CurveTo(171.95433f, 149.7077f, 172.5677f, 152.16566f, 171.43f, 154.06f),
                    PathNode.CurveTo(170.2923f, 155.95433f, 167.83434f, 156.5677f, 165.94f, 155.43f),
                    PathNode.LineTo(125.94f, 131.43f),
                    PathNode.CurveTo(124.73595f, 130.7066f, 123.999565f, 129.40465f, 124.0f, 128.0f),
                    PathNode.LineTo(124.0f, 80.0f),
                    PathNode.CurveTo(124.0f, 77.79086f, 125.79086f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(130.20914f, 76.0f, 132.0f, 77.79086f, 132.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 60.0f),
                    PathNode.CurveTo(221.79086f, 60.0f, 220.0f, 61.79086f, 220.0f, 64.0f),
                    PathNode.LineTo(220.0f, 92.85f),
                    PathNode.CurveTo(211.33f, 82.46f, 203.0f, 73.0f, 193.05f, 63.0f),
                    PathNode.CurveTo(157.35843f, 27.334545f, 99.60026f, 27.071539f, 63.585354f, 62.41047f),
                    PathNode.CurveTo(27.57045f, 97.7494f, 26.73916f, 155.50218f, 61.722023f, 191.86305f),
                    PathNode.CurveTo(96.70489f, 228.2239f, 154.44669f, 229.62341f, 191.15f, 195.0f),
                    PathNode.CurveTo(192.75714f, 193.48122f, 192.82878f, 190.94714f, 191.31f, 189.34f),
                    PathNode.CurveTo(189.79121f, 187.73285f, 187.25714f, 187.66124f, 185.65f, 189.18f),
                    PathNode.CurveTo(152.14238f, 220.80295f, 99.41574f, 219.53352f, 67.46876f, 186.3347f),
                    PathNode.CurveTo(35.52177f, 153.1359f, 36.2789f, 100.39941f, 69.16579f, 68.1314f),
                    PathNode.CurveTo(102.052666f, 35.863396f, 154.79402f, 36.108154f, 187.38f, 68.68f),
                    PathNode.CurveTo(197.7f, 79.0f, 206.39f, 89.0f, 215.53f, 100.0f),
                    PathNode.LineTo(184.0f, 100.0f),
                    PathNode.CurveTo(181.79086f, 100.0f, 180.0f, 101.79086f, 180.0f, 104.0f),
                    PathNode.CurveTo(180.0f, 106.20914f, 181.79086f, 108.0f, 184.0f, 108.0f),
                    PathNode.LineTo(224.0f, 108.0f),
                    PathNode.CurveTo(226.20914f, 108.0f, 228.0f, 106.20914f, 228.0f, 104.0f),
                    PathNode.LineTo(228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 61.79086f, 226.20914f, 60.0f, 224.0f, 60.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
