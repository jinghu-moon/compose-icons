package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorThinIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 152.0f),
                    PathNode.CurveTo(212.0f, 154.20914f, 210.20914f, 156.0f, 208.0f, 156.0f),
                    PathNode.LineTo(132.0f, 156.0f),
                    PathNode.LineTo(132.0f, 222.34f),
                    PathNode.LineTo(157.17f, 197.17f),
                    PathNode.CurveTo(158.73297f, 195.60704f, 161.26703f, 195.60704f, 162.83f, 197.17f),
                    PathNode.CurveTo(164.39296f, 198.73297f, 164.39296f, 201.26703f, 162.83f, 202.83f),
                    PathNode.LineTo(130.83f, 234.83f),
                    PathNode.CurveTo(130.07973f, 235.58112f, 129.06163f, 236.00314f, 128.0f, 236.00314f),
                    PathNode.CurveTo(126.93836f, 236.00314f, 125.92027f, 235.58112f, 125.17f, 234.83f),
                    PathNode.LineTo(93.17f, 202.83f),
                    PathNode.CurveTo(91.60703f, 201.26703f, 91.60703f, 198.73297f, 93.17f, 197.17f),
                    PathNode.CurveTo(94.73296f, 195.60704f, 97.26704f, 195.60704f, 98.83f, 197.17f),
                    PathNode.LineTo(124.0f, 222.34f),
                    PathNode.LineTo(124.0f, 156.0f),
                    PathNode.LineTo(48.0f, 156.0f),
                    PathNode.CurveTo(45.79086f, 156.0f, 44.0f, 154.20914f, 44.0f, 152.0f),
                    PathNode.CurveTo(44.0f, 149.79086f, 45.79086f, 148.0f, 48.0f, 148.0f),
                    PathNode.LineTo(208.0f, 148.0f),
                    PathNode.CurveTo(210.20914f, 148.0f, 212.0f, 149.79086f, 212.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 108.0f),
                    PathNode.LineTo(208.0f, 108.0f),
                    PathNode.CurveTo(210.20914f, 108.0f, 212.0f, 106.20914f, 212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 101.79086f, 210.20914f, 100.0f, 208.0f, 100.0f),
                    PathNode.LineTo(132.0f, 100.0f),
                    PathNode.LineTo(132.0f, 33.66f),
                    PathNode.LineTo(157.17f, 58.83f),
                    PathNode.CurveTo(158.73297f, 60.392967f, 161.26703f, 60.392967f, 162.83f, 58.83f),
                    PathNode.CurveTo(164.39296f, 57.267033f, 164.39296f, 54.732967f, 162.83f, 53.17f),
                    PathNode.LineTo(130.83f, 21.17f),
                    PathNode.CurveTo(130.07973f, 20.418892f, 129.06163f, 19.996853f, 128.0f, 19.996853f),
                    PathNode.CurveTo(126.93836f, 19.996853f, 125.92027f, 20.418892f, 125.17f, 21.17f),
                    PathNode.LineTo(93.17f, 53.17f),
                    PathNode.CurveTo(91.60703f, 54.732967f, 91.60703f, 57.267033f, 93.17f, 58.83f),
                    PathNode.CurveTo(94.73296f, 60.392967f, 97.26704f, 60.392967f, 98.83f, 58.83f),
                    PathNode.LineTo(124.0f, 33.66f),
                    PathNode.LineTo(124.0f, 100.0f),
                    PathNode.LineTo(48.0f, 100.0f),
                    PathNode.CurveTo(45.79086f, 100.0f, 44.0f, 101.79086f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 106.20914f, 45.79086f, 108.0f, 48.0f, 108.0f),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
