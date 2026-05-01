package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = phosphorThinIcon(
            name = "Notebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 112.0f),
                    PathNode.CurveTo(180.0f, 114.20914f, 178.20914f, 116.0f, 176.0f, 116.0f),
                    PathNode.LineTo(112.0f, 116.0f),
                    PathNode.CurveTo(109.79086f, 116.0f, 108.0f, 114.20914f, 108.0f, 112.0f),
                    PathNode.CurveTo(108.0f, 109.79086f, 109.79086f, 108.0f, 112.0f, 108.0f),
                    PathNode.LineTo(176.0f, 108.0f),
                    PathNode.CurveTo(178.20914f, 108.0f, 180.0f, 109.79086f, 180.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 140.0f),
                    PathNode.LineTo(112.0f, 140.0f),
                    PathNode.CurveTo(109.79086f, 140.0f, 108.0f, 141.79086f, 108.0f, 144.0f),
                    PathNode.CurveTo(108.0f, 146.20914f, 109.79086f, 148.0f, 112.0f, 148.0f),
                    PathNode.LineTo(176.0f, 148.0f),
                    PathNode.CurveTo(178.20914f, 148.0f, 180.0f, 146.20914f, 180.0f, 144.0f),
                    PathNode.CurveTo(180.0f, 141.79086f, 178.20914f, 140.0f, 176.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 208.0f),
                    PathNode.CurveTo(220.0f, 214.62741f, 214.62741f, 220.0f, 208.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 41.37258f, 41.37258f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 212.0f),
                    PathNode.LineTo(76.0f, 212.0f),
                    PathNode.LineTo(76.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(45.79086f, 44.0f, 44.0f, 45.79086f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 45.79086f, 210.20914f, 44.0f, 208.0f, 44.0f),
                    PathNode.LineTo(84.0f, 44.0f),
                    PathNode.LineTo(84.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(210.20914f, 212.0f, 212.0f, 210.20914f, 212.0f, 208.0f),
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
        return _notebook!!
    }

private var _notebook: ImageVector? = null
