package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorThinIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 28.0f),
                    PathNode.CurveTo(203.71f, 28.0f, 180.84f, 39.24f, 156.0f, 61.4f),
                    PathNode.CurveTo(137.53f, 77.89f, 121.61f, 97.23f, 111.0f, 111.33f),
                    PathNode.CurveTo(93.841385f, 105.14123f, 74.74379f, 107.69715f, 59.81643f, 118.18014f),
                    PathNode.CurveTo(44.88907f, 128.66312f, 36.002693f, 145.75941f, 36.0f, 164.0f),
                    PathNode.CurveTo(36.0f, 197.22f, 14.74f, 212.0f, 13.78f, 212.68f),
                    PathNode.CurveTo(12.320928f, 213.66049f, 11.673008f, 215.47867f, 12.183197f, 217.16092f),
                    PathNode.CurveTo(12.693387f, 218.84315f, 14.242097f, 219.99515f, 16.0f, 220.0f),
                    PathNode.LineTo(92.0f, 220.0f),
                    PathNode.CurveTo(110.240585f, 219.9973f, 127.33687f, 211.11093f, 137.81987f, 196.18358f),
                    PathNode.CurveTo(148.30286f, 181.25621f, 150.85876f, 162.15862f, 144.67f, 145.0f),
                    PathNode.CurveTo(158.78f, 134.37f, 178.11f, 118.45f, 194.6f, 100.0f),
                    PathNode.CurveTo(216.76f, 75.16f, 228.0f, 52.29f, 228.0f, 32.0f),
                    PathNode.CurveTo(228.0f, 29.790861f, 226.20914f, 28.0f, 224.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 212.0f),
                    PathNode.LineTo(26.35f, 212.0f),
                    PathNode.CurveTo(33.91f, 203.69f, 44.0f, 188.08f, 44.0f, 164.0f),
                    PathNode.CurveTo(44.0f, 137.49033f, 65.49033f, 116.0f, 92.0f, 116.0f),
                    PathNode.CurveTo(118.50967f, 116.0f, 140.0f, 137.49033f, 140.0f, 164.0f),
                    PathNode.CurveTo(140.0f, 190.50967f, 118.50967f, 212.0f, 92.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.52f, 114.69f),
                    PathNode.CurveTo(122.65f, 109.25f, 127.84f, 102.69f, 133.81f, 95.79f),
                    PathNode.CurveTo(144.56712f, 102.38705f, 153.61295f, 111.43288f, 160.21f, 122.19f),
                    PathNode.CurveTo(153.27f, 128.19f, 146.75f, 133.35f, 141.31f, 137.48f),
                    PathNode.CurveTo(136.0956f, 127.82547f, 128.17453f, 119.9044f, 118.52f, 114.69f),
                    PathNode.Close,
                    PathNode.MoveTo(166.29f, 116.83f),
                    PathNode.CurveTo(159.34952f, 105.90952f, 150.09048f, 96.65049f, 139.17f, 89.71f),
                    PathNode.CurveTo(161.0f, 65.43f, 191.26f, 38.63f, 219.82f, 36.18f),
                    PathNode.CurveTo(217.37f, 64.74f, 190.57f, 95.0f, 166.29f, 116.83f),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
