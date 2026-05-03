package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorThinIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(212.0f, 90.20914f, 210.20914f, 92.0f, 208.0f, 92.0f),
                    PathNode.CurveTo(205.79086f, 92.0f, 204.0f, 90.20914f, 204.0f, 88.0f),
                    PathNode.LineTo(204.0f, 57.66f),
                    PathNode.LineTo(153.46f, 108.2f),
                    PathNode.CurveTo(151.89703f, 109.76296f, 149.36296f, 109.76296f, 147.8f, 108.2f),
                    PathNode.CurveTo(146.23703f, 106.63703f, 146.23703f, 104.10297f, 147.8f, 102.54f),
                    PathNode.LineTo(198.34f, 52.0f),
                    PathNode.LineTo(168.0f, 52.0f),
                    PathNode.CurveTo(165.79086f, 52.0f, 164.0f, 50.20914f, 164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 45.79086f, 165.79086f, 44.0f, 168.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 164.0f),
                    PathNode.CurveTo(205.79086f, 164.0f, 204.0f, 165.79086f, 204.0f, 168.0f),
                    PathNode.LineTo(204.0f, 198.34f),
                    PathNode.LineTo(50.83f, 45.17f),
                    PathNode.CurveTo(49.267033f, 43.607033f, 46.732967f, 43.607033f, 45.17f, 45.17f),
                    PathNode.CurveTo(43.607033f, 46.732967f, 43.607033f, 49.267033f, 45.17f, 50.83f),
                    PathNode.LineTo(198.34f, 204.0f),
                    PathNode.LineTo(168.0f, 204.0f),
                    PathNode.CurveTo(165.79086f, 204.0f, 164.0f, 205.79086f, 164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 210.20914f, 165.79086f, 212.0f, 168.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(210.20914f, 212.0f, 212.0f, 210.20914f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 168.0f),
                    PathNode.CurveTo(212.0f, 165.79086f, 210.20914f, 164.0f, 208.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.54f, 147.8f),
                    PathNode.LineTo(45.17f, 205.17f),
                    PathNode.CurveTo(43.607033f, 206.73297f, 43.607033f, 209.26703f, 45.17f, 210.83f),
                    PathNode.CurveTo(46.732967f, 212.39296f, 49.267033f, 212.39296f, 50.83f, 210.83f),
                    PathNode.LineTo(108.2f, 153.46f),
                    PathNode.CurveTo(109.76296f, 151.89703f, 109.76296f, 149.36296f, 108.2f, 147.8f),
                    PathNode.CurveTo(106.63703f, 146.23703f, 104.10297f, 146.23703f, 102.54f, 147.8f),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
