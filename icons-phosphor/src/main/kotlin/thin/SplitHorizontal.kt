package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorThinIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.0f, 48.0f),
                    PathNode.LineTo(108.0f, 208.0f),
                    PathNode.CurveTo(108.0f, 210.20914f, 106.20914f, 212.0f, 104.0f, 212.0f),
                    PathNode.CurveTo(101.79086f, 212.0f, 100.0f, 210.20914f, 100.0f, 208.0f),
                    PathNode.LineTo(100.0f, 132.0f),
                    PathNode.LineTo(33.66f, 132.0f),
                    PathNode.LineTo(58.83f, 157.17f),
                    PathNode.CurveTo(60.392967f, 158.73297f, 60.392967f, 161.26703f, 58.83f, 162.83f),
                    PathNode.CurveTo(57.267033f, 164.39296f, 54.732967f, 164.39296f, 53.17f, 162.83f),
                    PathNode.LineTo(21.17f, 130.83f),
                    PathNode.CurveTo(20.418892f, 130.07973f, 19.996853f, 129.06163f, 19.996853f, 128.0f),
                    PathNode.CurveTo(19.996853f, 126.93836f, 20.418892f, 125.92027f, 21.17f, 125.17f),
                    PathNode.LineTo(53.17f, 93.17f),
                    PathNode.CurveTo(54.732967f, 91.60703f, 57.267033f, 91.60703f, 58.83f, 93.17f),
                    PathNode.CurveTo(60.392967f, 94.73296f, 60.392967f, 97.26704f, 58.83f, 98.83f),
                    PathNode.LineTo(33.66f, 124.0f),
                    PathNode.LineTo(100.0f, 124.0f),
                    PathNode.LineTo(100.0f, 48.0f),
                    PathNode.CurveTo(100.0f, 45.79086f, 101.79086f, 44.0f, 104.0f, 44.0f),
                    PathNode.CurveTo(106.20914f, 44.0f, 108.0f, 45.79086f, 108.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.83f, 125.17f),
                    PathNode.LineTo(202.83f, 93.17f),
                    PathNode.CurveTo(201.26703f, 91.60703f, 198.73297f, 91.60703f, 197.17f, 93.17f),
                    PathNode.CurveTo(195.60704f, 94.73296f, 195.60704f, 97.26704f, 197.17f, 98.83f),
                    PathNode.LineTo(222.34f, 124.0f),
                    PathNode.LineTo(156.0f, 124.0f),
                    PathNode.LineTo(156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 45.79086f, 154.20914f, 44.0f, 152.0f, 44.0f),
                    PathNode.CurveTo(149.79086f, 44.0f, 148.0f, 45.79086f, 148.0f, 48.0f),
                    PathNode.LineTo(148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 210.20914f, 149.79086f, 212.0f, 152.0f, 212.0f),
                    PathNode.CurveTo(154.20914f, 212.0f, 156.0f, 210.20914f, 156.0f, 208.0f),
                    PathNode.LineTo(156.0f, 132.0f),
                    PathNode.LineTo(222.34f, 132.0f),
                    PathNode.LineTo(197.17f, 157.17f),
                    PathNode.CurveTo(195.60704f, 158.73297f, 195.60704f, 161.26703f, 197.17f, 162.83f),
                    PathNode.CurveTo(198.73297f, 164.39296f, 201.26703f, 164.39296f, 202.83f, 162.83f),
                    PathNode.LineTo(234.83f, 130.83f),
                    PathNode.CurveTo(235.58112f, 130.07973f, 236.00314f, 129.06163f, 236.00314f, 128.0f),
                    PathNode.CurveTo(236.00314f, 126.93836f, 235.58112f, 125.92027f, 234.83f, 125.17f),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
