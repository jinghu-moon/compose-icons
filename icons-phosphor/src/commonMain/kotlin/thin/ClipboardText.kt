package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorThinIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 154.20914f, 162.20914f, 156.0f, 160.0f, 156.0f),
                    PathNode.LineTo(96.0f, 156.0f),
                    PathNode.CurveTo(93.79086f, 156.0f, 92.0f, 154.20914f, 92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 149.79086f, 93.79086f, 148.0f, 96.0f, 148.0f),
                    PathNode.LineTo(160.0f, 148.0f),
                    PathNode.CurveTo(162.20914f, 148.0f, 164.0f, 149.79086f, 164.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 116.0f),
                    PathNode.LineTo(96.0f, 116.0f),
                    PathNode.CurveTo(93.79086f, 116.0f, 92.0f, 117.79086f, 92.0f, 120.0f),
                    PathNode.CurveTo(92.0f, 122.20914f, 93.79086f, 124.0f, 96.0f, 124.0f),
                    PathNode.LineTo(160.0f, 124.0f),
                    PathNode.CurveTo(162.20914f, 124.0f, 164.0f, 122.20914f, 164.0f, 120.0f),
                    PathNode.CurveTo(164.0f, 117.79086f, 162.20914f, 116.0f, 160.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 216.0f),
                    PathNode.CurveTo(212.0f, 222.62741f, 206.62741f, 228.0f, 200.0f, 228.0f),
                    PathNode.LineTo(56.0f, 228.0f),
                    PathNode.CurveTo(49.37258f, 228.0f, 44.0f, 222.62741f, 44.0f, 216.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 41.37258f, 49.37258f, 36.0f, 56.0f, 36.0f),
                    PathNode.LineTo(94.08f, 36.0f),
                    PathNode.CurveTo(102.438705f, 25.883266f, 114.87688f, 20.025587f, 128.0f, 20.025587f),
                    PathNode.CurveTo(141.12312f, 20.025587f, 153.5613f, 25.883266f, 161.92f, 36.0f),
                    PathNode.LineTo(200.0f, 36.0f),
                    PathNode.CurveTo(206.62741f, 36.0f, 212.0f, 41.37258f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 64.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.LineTo(164.0f, 68.0f),
                    PathNode.LineTo(164.0f, 64.0f),
                    PathNode.CurveTo(164.0f, 44.11775f, 147.88223f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(108.11775f, 28.0f, 92.0f, 44.11775f, 92.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 48.0f),
                    PathNode.CurveTo(204.0f, 45.79086f, 202.20914f, 44.0f, 200.0f, 44.0f),
                    PathNode.LineTo(167.17f, 44.0f),
                    PathNode.CurveTo(170.34846f, 50.18737f, 172.00433f, 57.04398f, 172.0f, 64.0f),
                    PathNode.LineTo(172.0f, 72.0f),
                    PathNode.CurveTo(172.0f, 74.20914f, 170.20914f, 76.0f, 168.0f, 76.0f),
                    PathNode.LineTo(88.0f, 76.0f),
                    PathNode.CurveTo(85.79086f, 76.0f, 84.0f, 74.20914f, 84.0f, 72.0f),
                    PathNode.LineTo(84.0f, 64.0f),
                    PathNode.CurveTo(83.99566f, 57.04398f, 85.651535f, 50.18737f, 88.83f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(53.79086f, 44.0f, 52.0f, 45.79086f, 52.0f, 48.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 218.20914f, 53.79086f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(202.20914f, 220.0f, 204.0f, 218.20914f, 204.0f, 216.0f),
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
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
