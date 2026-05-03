package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) return _arrowsInSimple!!
        _arrowsInSimple = phosphorThinIcon(
            name = "ArrowsInSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.83f, 50.83f),
                    PathNode.LineTo(153.66f, 108.0f),
                    PathNode.LineTo(192.0f, 108.0f),
                    PathNode.CurveTo(194.20914f, 108.0f, 196.0f, 109.79086f, 196.0f, 112.0f),
                    PathNode.CurveTo(196.0f, 114.20914f, 194.20914f, 116.0f, 192.0f, 116.0f),
                    PathNode.LineTo(144.0f, 116.0f),
                    PathNode.CurveTo(141.79086f, 116.0f, 140.0f, 114.20914f, 140.0f, 112.0f),
                    PathNode.LineTo(140.0f, 64.0f),
                    PathNode.CurveTo(140.0f, 61.79086f, 141.79086f, 60.0f, 144.0f, 60.0f),
                    PathNode.CurveTo(146.20914f, 60.0f, 148.0f, 61.79086f, 148.0f, 64.0f),
                    PathNode.LineTo(148.0f, 102.34f),
                    PathNode.LineTo(205.17f, 45.17f),
                    PathNode.CurveTo(206.73297f, 43.607033f, 209.26703f, 43.607033f, 210.83f, 45.17f),
                    PathNode.CurveTo(212.39296f, 46.732967f, 212.39296f, 49.267033f, 210.83f, 50.83f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 140.0f),
                    PathNode.LineTo(64.0f, 140.0f),
                    PathNode.CurveTo(61.79086f, 140.0f, 60.0f, 141.79086f, 60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 146.20914f, 61.79086f, 148.0f, 64.0f, 148.0f),
                    PathNode.LineTo(102.34f, 148.0f),
                    PathNode.LineTo(45.17f, 205.17f),
                    PathNode.CurveTo(43.607033f, 206.73297f, 43.607033f, 209.26703f, 45.17f, 210.83f),
                    PathNode.CurveTo(46.732967f, 212.39296f, 49.267033f, 212.39296f, 50.83f, 210.83f),
                    PathNode.LineTo(108.0f, 153.66f),
                    PathNode.LineTo(108.0f, 192.0f),
                    PathNode.CurveTo(108.0f, 194.20914f, 109.79086f, 196.0f, 112.0f, 196.0f),
                    PathNode.CurveTo(114.20914f, 196.0f, 116.0f, 194.20914f, 116.0f, 192.0f),
                    PathNode.LineTo(116.0f, 144.0f),
                    PathNode.CurveTo(116.0f, 141.79086f, 114.20914f, 140.0f, 112.0f, 140.0f),
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
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
