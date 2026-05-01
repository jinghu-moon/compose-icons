package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorThinIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 104.0f),
                    PathNode.LineTo(148.0f, 64.0f),
                    PathNode.CurveTo(148.0f, 61.79086f, 149.79086f, 60.0f, 152.0f, 60.0f),
                    PathNode.CurveTo(154.20914f, 60.0f, 156.0f, 61.79086f, 156.0f, 64.0f),
                    PathNode.LineTo(156.0f, 94.34f),
                    PathNode.LineTo(205.17f, 45.17f),
                    PathNode.CurveTo(206.73297f, 43.607033f, 209.26703f, 43.607033f, 210.83f, 45.17f),
                    PathNode.CurveTo(212.39296f, 46.732967f, 212.39296f, 49.267033f, 210.83f, 50.83f),
                    PathNode.LineTo(161.66f, 100.0f),
                    PathNode.LineTo(192.0f, 100.0f),
                    PathNode.CurveTo(194.20914f, 100.0f, 196.0f, 101.79086f, 196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 106.20914f, 194.20914f, 108.0f, 192.0f, 108.0f),
                    PathNode.LineTo(152.0f, 108.0f),
                    PathNode.CurveTo(149.79086f, 108.0f, 148.0f, 106.20914f, 148.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 148.0f),
                    PathNode.LineTo(64.0f, 148.0f),
                    PathNode.CurveTo(61.79086f, 148.0f, 60.0f, 149.79086f, 60.0f, 152.0f),
                    PathNode.CurveTo(60.0f, 154.20914f, 61.79086f, 156.0f, 64.0f, 156.0f),
                    PathNode.LineTo(94.34f, 156.0f),
                    PathNode.LineTo(45.17f, 205.17f),
                    PathNode.CurveTo(43.607033f, 206.73297f, 43.607033f, 209.26703f, 45.17f, 210.83f),
                    PathNode.CurveTo(46.732967f, 212.39296f, 49.267033f, 212.39296f, 50.83f, 210.83f),
                    PathNode.LineTo(100.0f, 161.66f),
                    PathNode.LineTo(100.0f, 192.0f),
                    PathNode.CurveTo(100.0f, 194.20914f, 101.79086f, 196.0f, 104.0f, 196.0f),
                    PathNode.CurveTo(106.20914f, 196.0f, 108.0f, 194.20914f, 108.0f, 192.0f),
                    PathNode.LineTo(108.0f, 152.0f),
                    PathNode.CurveTo(108.0f, 149.79086f, 106.20914f, 148.0f, 104.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(161.66f, 156.0f),
                    PathNode.LineTo(192.0f, 156.0f),
                    PathNode.CurveTo(194.20914f, 156.0f, 196.0f, 154.20914f, 196.0f, 152.0f),
                    PathNode.CurveTo(196.0f, 149.79086f, 194.20914f, 148.0f, 192.0f, 148.0f),
                    PathNode.LineTo(152.0f, 148.0f),
                    PathNode.CurveTo(149.79086f, 148.0f, 148.0f, 149.79086f, 148.0f, 152.0f),
                    PathNode.LineTo(148.0f, 192.0f),
                    PathNode.CurveTo(148.0f, 194.20914f, 149.79086f, 196.0f, 152.0f, 196.0f),
                    PathNode.CurveTo(154.20914f, 196.0f, 156.0f, 194.20914f, 156.0f, 192.0f),
                    PathNode.LineTo(156.0f, 161.66f),
                    PathNode.LineTo(205.17f, 210.83f),
                    PathNode.CurveTo(206.73297f, 212.39296f, 209.26703f, 212.39296f, 210.83f, 210.83f),
                    PathNode.CurveTo(212.39296f, 209.26703f, 212.39296f, 206.73297f, 210.83f, 205.17f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 60.0f),
                    PathNode.CurveTo(101.79086f, 60.0f, 100.0f, 61.79086f, 100.0f, 64.0f),
                    PathNode.LineTo(100.0f, 94.34f),
                    PathNode.LineTo(50.83f, 45.17f),
                    PathNode.CurveTo(49.267033f, 43.607033f, 46.732967f, 43.607033f, 45.17f, 45.17f),
                    PathNode.CurveTo(43.607033f, 46.732967f, 43.607033f, 49.267033f, 45.17f, 50.83f),
                    PathNode.LineTo(94.34f, 100.0f),
                    PathNode.LineTo(64.0f, 100.0f),
                    PathNode.CurveTo(61.79086f, 100.0f, 60.0f, 101.79086f, 60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 106.20914f, 61.79086f, 108.0f, 64.0f, 108.0f),
                    PathNode.LineTo(104.0f, 108.0f),
                    PathNode.CurveTo(106.20914f, 108.0f, 108.0f, 106.20914f, 108.0f, 104.0f),
                    PathNode.LineTo(108.0f, 64.0f),
                    PathNode.CurveTo(108.0f, 61.79086f, 106.20914f, 60.0f, 104.0f, 60.0f),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
