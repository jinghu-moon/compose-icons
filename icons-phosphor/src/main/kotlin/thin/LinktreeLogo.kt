package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorThinIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 160.0f),
                    PathNode.LineTo(132.0f, 232.0f),
                    PathNode.CurveTo(132.0f, 234.20914f, 130.20914f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(125.79086f, 236.0f, 124.0f, 234.20914f, 124.0f, 232.0f),
                    PathNode.LineTo(124.0f, 160.0f),
                    PathNode.CurveTo(124.0f, 157.79086f, 125.79086f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(130.20914f, 156.0f, 132.0f, 157.79086f, 132.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 100.0f),
                    PathNode.LineTo(137.66f, 100.0f),
                    PathNode.LineTo(186.83f, 50.83f),
                    PathNode.CurveTo(188.39296f, 49.267033f, 188.39296f, 46.732967f, 186.83f, 45.17f),
                    PathNode.CurveTo(185.26703f, 43.607033f, 182.73297f, 43.607033f, 181.17f, 45.17f),
                    PathNode.LineTo(132.0f, 94.34f),
                    PathNode.LineTo(132.0f, 24.0f),
                    PathNode.CurveTo(132.0f, 21.790861f, 130.20914f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(125.79086f, 20.0f, 124.0f, 21.790861f, 124.0f, 24.0f),
                    PathNode.LineTo(124.0f, 94.34f),
                    PathNode.LineTo(74.83f, 45.17f),
                    PathNode.CurveTo(73.26704f, 43.607033f, 70.73296f, 43.607033f, 69.17f, 45.17f),
                    PathNode.CurveTo(67.60703f, 46.732967f, 67.60703f, 49.267033f, 69.17f, 50.83f),
                    PathNode.LineTo(118.34f, 100.0f),
                    PathNode.LineTo(48.0f, 100.0f),
                    PathNode.CurveTo(45.79086f, 100.0f, 44.0f, 101.79086f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 106.20914f, 45.79086f, 108.0f, 48.0f, 108.0f),
                    PathNode.LineTo(118.34f, 108.0f),
                    PathNode.LineTo(69.17f, 157.17f),
                    PathNode.CurveTo(67.60703f, 158.73297f, 67.60703f, 161.26703f, 69.17f, 162.83f),
                    PathNode.CurveTo(70.73296f, 164.39296f, 73.26704f, 164.39296f, 74.83f, 162.83f),
                    PathNode.LineTo(128.0f, 109.66f),
                    PathNode.LineTo(181.17f, 162.83f),
                    PathNode.CurveTo(182.73297f, 164.39296f, 185.26703f, 164.39296f, 186.83f, 162.83f),
                    PathNode.CurveTo(188.39296f, 161.26703f, 188.39296f, 158.73297f, 186.83f, 157.17f),
                    PathNode.LineTo(137.66f, 108.0f),
                    PathNode.LineTo(208.0f, 108.0f),
                    PathNode.CurveTo(210.20914f, 108.0f, 212.0f, 106.20914f, 212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 101.79086f, 210.20914f, 100.0f, 208.0f, 100.0f),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
