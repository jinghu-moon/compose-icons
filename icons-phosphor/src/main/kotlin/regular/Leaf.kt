package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorRegularIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.45f, 40.07f),
                    PathNode.CurveTo(223.21342f, 36.018856f, 219.98114f, 32.78658f, 215.93f, 32.55f),
                    PathNode.CurveTo(139.8f, 28.08f, 78.82f, 51.0f, 52.82f, 94.0f),
                    PathNode.CurveTo(43.807644f, 108.70914f, 39.366573f, 125.763405f, 40.06f, 143.0f),
                    PathNode.CurveTo(40.63f, 158.92f, 45.27f, 175.0f, 53.85f, 190.85f),
                    PathNode.LineTo(34.34f, 210.35f),
                    PathNode.CurveTo(31.214067f, 213.47594f, 31.21407f, 218.54407f, 34.34f, 221.67f),
                    PathNode.CurveTo(37.46593f, 224.79593f, 42.53407f, 224.79593f, 45.66f, 221.67f),
                    PathNode.LineTo(65.16f, 202.16f),
                    PathNode.CurveTo(81.0f, 210.73f, 97.09f, 215.37f, 113.0f, 215.94f),
                    PathNode.QuadTo(114.67f, 216.0f, 116.33f, 216.0f),
                    PathNode.CurveTo(132.44743f, 216.04308f, 148.25949f, 211.60449f, 162.0f, 203.18f),
                    PathNode.CurveTo(205.0f, 177.18f, 227.93f, 116.21f, 223.45f, 40.07f),
                    PathNode.Close,
                    PathNode.MoveTo(153.75f, 189.5f),
                    PathNode.CurveTo(131.0f, 203.28f, 104.07f, 203.5f, 77.04f, 190.27f),
                    PathNode.LineTo(165.67f, 101.65f),
                    PathNode.CurveTo(168.79593f, 98.52407f, 168.79593f, 93.45593f, 165.67f, 90.33f),
                    PathNode.CurveTo(162.54407f, 87.20407f, 157.47594f, 87.20407f, 154.35f, 90.33f),
                    PathNode.LineTo(65.73f, 179.0f),
                    PathNode.CurveTo(52.54f, 152.0f, 52.73f, 125.0f, 66.5f, 102.29f),
                    PathNode.CurveTo(88.59f, 65.82f, 141.1f, 45.85f, 207.81f, 48.23f),
                    PathNode.CurveTo(210.2f, 114.89f, 190.22f, 167.41f, 153.75f, 189.5f),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
