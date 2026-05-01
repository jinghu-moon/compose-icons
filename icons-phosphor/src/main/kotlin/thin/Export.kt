package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = phosphorThinIcon(
            name = "Export",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 112.0f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 214.62741f, 206.62741f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(49.37258f, 220.0f, 44.0f, 214.62741f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 105.37258f, 49.37258f, 100.0f, 56.0f, 100.0f),
                    PathNode.LineTo(80.0f, 100.0f),
                    PathNode.CurveTo(82.20914f, 100.0f, 84.0f, 101.79086f, 84.0f, 104.0f),
                    PathNode.CurveTo(84.0f, 106.20914f, 82.20914f, 108.0f, 80.0f, 108.0f),
                    PathNode.LineTo(56.0f, 108.0f),
                    PathNode.CurveTo(53.79086f, 108.0f, 52.0f, 109.79086f, 52.0f, 112.0f),
                    PathNode.LineTo(52.0f, 208.0f),
                    PathNode.CurveTo(52.0f, 210.20914f, 53.79086f, 212.0f, 56.0f, 212.0f),
                    PathNode.LineTo(200.0f, 212.0f),
                    PathNode.CurveTo(202.20914f, 212.0f, 204.0f, 210.20914f, 204.0f, 208.0f),
                    PathNode.LineTo(204.0f, 112.0f),
                    PathNode.CurveTo(204.0f, 109.79086f, 202.20914f, 108.0f, 200.0f, 108.0f),
                    PathNode.LineTo(176.0f, 108.0f),
                    PathNode.CurveTo(173.79086f, 108.0f, 172.0f, 106.20914f, 172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 101.79086f, 173.79086f, 100.0f, 176.0f, 100.0f),
                    PathNode.LineTo(200.0f, 100.0f),
                    PathNode.CurveTo(206.62741f, 100.0f, 212.0f, 105.37258f, 212.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.83f, 66.83f),
                    PathNode.LineTo(124.0f, 33.66f),
                    PathNode.LineTo(124.0f, 136.0f),
                    PathNode.CurveTo(124.0f, 138.20914f, 125.79086f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(130.20914f, 140.0f, 132.0f, 138.20914f, 132.0f, 136.0f),
                    PathNode.LineTo(132.0f, 33.66f),
                    PathNode.LineTo(165.17f, 66.83f),
                    PathNode.CurveTo(166.73297f, 68.39297f, 169.26703f, 68.39297f, 170.83f, 66.83f),
                    PathNode.CurveTo(172.39296f, 65.26704f, 172.39296f, 62.732967f, 170.83f, 61.17f),
                    PathNode.LineTo(130.83f, 21.17f),
                    PathNode.CurveTo(130.07973f, 20.418892f, 129.06163f, 19.996853f, 128.0f, 19.996853f),
                    PathNode.CurveTo(126.93836f, 19.996853f, 125.92027f, 20.418892f, 125.17f, 21.17f),
                    PathNode.LineTo(85.17f, 61.17f),
                    PathNode.CurveTo(83.60703f, 62.732967f, 83.60703f, 65.26704f, 85.17f, 66.83f),
                    PathNode.CurveTo(86.73296f, 68.39297f, 89.26704f, 68.39297f, 90.83f, 66.83f),
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
        return _export!!
    }

private var _export: ImageVector? = null
