package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorThinIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 136.33f),
                    PathNode.CurveTo(223.45844f, 189.21541f, 178.43677f, 229.36751f, 125.37835f, 227.852f),
                    PathNode.CurveTo(72.31992f, 226.3365f, 29.6635f, 183.68007f, 28.147999f, 130.62166f),
                    PathNode.CurveTo(26.6325f, 77.56323f, 66.784584f, 32.54156f, 119.67f, 28.0f),
                    PathNode.CurveTo(121.87914f, 27.817745f, 123.81775f, 29.460861f, 124.0f, 31.67f),
                    PathNode.CurveTo(124.18225f, 33.87914f, 122.53914f, 35.817745f, 120.33f, 36.0f),
                    PathNode.CurveTo(71.66832f, 40.17601f, 34.72138f, 81.60061f, 36.114895f, 130.42126f),
                    PathNode.CurveTo(37.50841f, 179.24191f, 76.75809f, 218.4916f, 125.578735f, 219.8851f),
                    PathNode.CurveTo(174.3994f, 221.27863f, 215.82399f, 184.33168f, 220.0f, 135.67f),
                    PathNode.CurveTo(220.18225f, 133.46086f, 222.12086f, 131.81775f, 224.33f, 132.0f),
                    PathNode.CurveTo(226.53914f, 132.18225f, 228.18225f, 134.12086f, 228.0f, 136.33f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 132.0f),
                    PathNode.LineTo(184.0f, 132.0f),
                    PathNode.CurveTo(186.20914f, 132.0f, 188.0f, 130.20914f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 125.79086f, 186.20914f, 124.0f, 184.0f, 124.0f),
                    PathNode.LineTo(132.0f, 124.0f),
                    PathNode.LineTo(132.0f, 72.0f),
                    PathNode.CurveTo(132.0f, 69.79086f, 130.20914f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(125.79086f, 68.0f, 124.0f, 69.79086f, 124.0f, 72.0f),
                    PathNode.LineTo(124.0f, 128.0f),
                    PathNode.CurveTo(124.0f, 130.20914f, 125.79086f, 132.0f, 128.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 44.0f),
                    PathNode.CurveTo(164.41827f, 44.0f, 168.0f, 40.418278f, 168.0f, 36.0f),
                    PathNode.CurveTo(168.0f, 31.581722f, 164.41827f, 28.0f, 160.0f, 28.0f),
                    PathNode.CurveTo(155.58173f, 28.0f, 152.0f, 31.581722f, 152.0f, 36.0f),
                    PathNode.CurveTo(152.0f, 40.418278f, 155.58173f, 44.0f, 160.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 68.0f),
                    PathNode.CurveTo(200.41827f, 68.0f, 204.0f, 64.41828f, 204.0f, 60.0f),
                    PathNode.CurveTo(204.0f, 55.581722f, 200.41827f, 52.0f, 196.0f, 52.0f),
                    PathNode.CurveTo(191.58173f, 52.0f, 188.0f, 55.581722f, 188.0f, 60.0f),
                    PathNode.CurveTo(188.0f, 64.41828f, 191.58173f, 68.0f, 196.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 104.0f),
                    PathNode.CurveTo(224.41827f, 104.0f, 228.0f, 100.41828f, 228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 91.58172f, 224.41827f, 88.0f, 220.0f, 88.0f),
                    PathNode.CurveTo(215.58173f, 88.0f, 212.0f, 91.58172f, 212.0f, 96.0f),
                    PathNode.CurveTo(212.0f, 100.41828f, 215.58173f, 104.0f, 220.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
