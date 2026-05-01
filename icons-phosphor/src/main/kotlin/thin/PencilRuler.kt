package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorThinIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(160.0f, 36.0f),
                    PathNode.CurveTo(153.37259f, 36.0f, 148.0f, 41.37258f, 148.0f, 48.0f),
                    PathNode.LineTo(148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 214.62741f, 153.37259f, 220.0f, 160.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(160.0f, 212.0f),
                    PathNode.CurveTo(157.79086f, 212.0f, 156.0f, 210.20914f, 156.0f, 208.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.LineTo(184.0f, 172.0f),
                    PathNode.CurveTo(186.20914f, 172.0f, 188.0f, 170.20914f, 188.0f, 168.0f),
                    PathNode.CurveTo(188.0f, 165.79086f, 186.20914f, 164.0f, 184.0f, 164.0f),
                    PathNode.LineTo(156.0f, 164.0f),
                    PathNode.LineTo(156.0f, 132.0f),
                    PathNode.LineTo(184.0f, 132.0f),
                    PathNode.CurveTo(186.20914f, 132.0f, 188.0f, 130.20914f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 125.79086f, 186.20914f, 124.0f, 184.0f, 124.0f),
                    PathNode.LineTo(156.0f, 124.0f),
                    PathNode.LineTo(156.0f, 92.0f),
                    PathNode.LineTo(184.0f, 92.0f),
                    PathNode.CurveTo(186.20914f, 92.0f, 188.0f, 90.20914f, 188.0f, 88.0f),
                    PathNode.CurveTo(188.0f, 85.79086f, 186.20914f, 84.0f, 184.0f, 84.0f),
                    PathNode.LineTo(156.0f, 84.0f),
                    PathNode.LineTo(156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 45.79086f, 157.79086f, 44.0f, 160.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.83f, 29.17f),
                    PathNode.CurveTo(74.07973f, 28.418892f, 73.06164f, 27.996853f, 72.0f, 27.996853f),
                    PathNode.CurveTo(70.93836f, 27.996853f, 69.92027f, 28.418892f, 69.17f, 29.17f),
                    PathNode.LineTo(37.17f, 61.17f),
                    PathNode.CurveTo(36.420044f, 61.920788f, 35.999165f, 62.938816f, 36.0f, 64.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(96.0f, 220.0f),
                    PathNode.CurveTo(102.62742f, 220.0f, 108.0f, 214.62741f, 108.0f, 208.0f),
                    PathNode.LineTo(108.0f, 64.0f),
                    PathNode.CurveTo(108.00083f, 62.938816f, 107.57996f, 61.920788f, 106.83f, 61.17f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 76.0f),
                    PathNode.LineTo(68.0f, 76.0f),
                    PathNode.LineTo(68.0f, 180.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 208.0f),
                    PathNode.CurveTo(100.0f, 210.20914f, 98.20914f, 212.0f, 96.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 188.0f),
                    PathNode.LineTo(100.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 180.0f),
                    PathNode.LineTo(76.0f, 180.0f),
                    PathNode.LineTo(76.0f, 76.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 68.0f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.LineTo(44.0f, 65.66f),
                    PathNode.LineTo(72.0f, 37.66f),
                    PathNode.LineTo(100.0f, 65.66f),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
