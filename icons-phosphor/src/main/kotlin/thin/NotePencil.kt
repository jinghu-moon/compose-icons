package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorThinIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 61.17f),
                    PathNode.LineTo(194.83f, 29.17f),
                    PathNode.CurveTo(194.07973f, 28.418892f, 193.06163f, 27.996853f, 192.0f, 27.996853f),
                    PathNode.CurveTo(190.93837f, 27.996853f, 189.92027f, 28.418892f, 189.17f, 29.17f),
                    PathNode.LineTo(93.17f, 125.17f),
                    PathNode.CurveTo(92.42004f, 125.92079f, 91.99917f, 126.93881f, 92.0f, 128.0f),
                    PathNode.LineTo(92.0f, 160.0f),
                    PathNode.CurveTo(92.0f, 162.20914f, 93.79086f, 164.0f, 96.0f, 164.0f),
                    PathNode.LineTo(128.0f, 164.0f),
                    PathNode.CurveTo(129.06119f, 164.00084f, 130.07921f, 163.57996f, 130.83f, 162.83f),
                    PathNode.LineTo(226.83f, 66.83f),
                    PathNode.CurveTo(227.58112f, 66.07973f, 228.00314f, 65.06164f, 228.00314f, 64.0f),
                    PathNode.CurveTo(228.00314f, 62.938362f, 227.58112f, 61.920273f, 226.83f, 61.17f),
                    PathNode.Close,
                    PathNode.MoveTo(126.34f, 156.0f),
                    PathNode.LineTo(100.0f, 156.0f),
                    PathNode.LineTo(100.0f, 129.66f),
                    PathNode.LineTo(168.0f, 61.66f),
                    PathNode.LineTo(194.34f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 82.34f),
                    PathNode.LineTo(173.66f, 56.0f),
                    PathNode.LineTo(192.0f, 37.66f),
                    PathNode.LineTo(218.34f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.LineTo(220.0f, 208.0f),
                    PathNode.CurveTo(220.0f, 214.62741f, 214.62741f, 220.0f, 208.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 41.37258f, 41.37258f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(128.0f, 36.0f),
                    PathNode.CurveTo(130.20914f, 36.0f, 132.0f, 37.79086f, 132.0f, 40.0f),
                    PathNode.CurveTo(132.0f, 42.20914f, 130.20914f, 44.0f, 128.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(45.79086f, 44.0f, 44.0f, 45.79086f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(210.20914f, 212.0f, 212.0f, 210.20914f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 125.79086f, 213.79086f, 124.0f, 216.0f, 124.0f),
                    PathNode.CurveTo(218.20914f, 124.0f, 220.0f, 125.79086f, 220.0f, 128.0f),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
