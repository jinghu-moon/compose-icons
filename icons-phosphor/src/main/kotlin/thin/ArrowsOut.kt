package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorThinIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 96.0f),
                    PathNode.CurveTo(212.0f, 98.20914f, 210.20914f, 100.0f, 208.0f, 100.0f),
                    PathNode.CurveTo(205.79086f, 100.0f, 204.0f, 98.20914f, 204.0f, 96.0f),
                    PathNode.LineTo(204.0f, 57.66f),
                    PathNode.LineTo(154.83f, 106.83f),
                    PathNode.CurveTo(153.26703f, 108.39297f, 150.73297f, 108.39297f, 149.17f, 106.83f),
                    PathNode.CurveTo(147.60704f, 105.26704f, 147.60704f, 102.73296f, 149.17f, 101.17f),
                    PathNode.LineTo(198.34f, 52.0f),
                    PathNode.LineTo(160.0f, 52.0f),
                    PathNode.CurveTo(157.79086f, 52.0f, 156.0f, 50.20914f, 156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 45.79086f, 157.79086f, 44.0f, 160.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(101.17f, 149.17f),
                    PathNode.LineTo(52.0f, 198.34f),
                    PathNode.LineTo(52.0f, 160.0f),
                    PathNode.CurveTo(52.0f, 157.79086f, 50.20914f, 156.0f, 48.0f, 156.0f),
                    PathNode.CurveTo(45.79086f, 156.0f, 44.0f, 157.79086f, 44.0f, 160.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(98.20914f, 212.0f, 100.0f, 210.20914f, 100.0f, 208.0f),
                    PathNode.CurveTo(100.0f, 205.79086f, 98.20914f, 204.0f, 96.0f, 204.0f),
                    PathNode.LineTo(57.66f, 204.0f),
                    PathNode.LineTo(106.83f, 154.83f),
                    PathNode.CurveTo(108.39297f, 153.26703f, 108.39297f, 150.73297f, 106.83f, 149.17f),
                    PathNode.CurveTo(105.26704f, 147.60704f, 102.73296f, 147.60704f, 101.17f, 149.17f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 156.0f),
                    PathNode.CurveTo(205.79086f, 156.0f, 204.0f, 157.79086f, 204.0f, 160.0f),
                    PathNode.LineTo(204.0f, 198.34f),
                    PathNode.LineTo(154.83f, 149.17f),
                    PathNode.CurveTo(153.26703f, 147.60704f, 150.73297f, 147.60704f, 149.17f, 149.17f),
                    PathNode.CurveTo(147.60704f, 150.73297f, 147.60704f, 153.26703f, 149.17f, 154.83f),
                    PathNode.LineTo(198.34f, 204.0f),
                    PathNode.LineTo(160.0f, 204.0f),
                    PathNode.CurveTo(157.79086f, 204.0f, 156.0f, 205.79086f, 156.0f, 208.0f),
                    PathNode.CurveTo(156.0f, 210.20914f, 157.79086f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(210.20914f, 212.0f, 212.0f, 210.20914f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 160.0f),
                    PathNode.CurveTo(212.0f, 157.79086f, 210.20914f, 156.0f, 208.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.66f, 52.0f),
                    PathNode.LineTo(96.0f, 52.0f),
                    PathNode.CurveTo(98.20914f, 52.0f, 100.0f, 50.20914f, 100.0f, 48.0f),
                    PathNode.CurveTo(100.0f, 45.79086f, 98.20914f, 44.0f, 96.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(45.79086f, 44.0f, 44.0f, 45.79086f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 96.0f),
                    PathNode.CurveTo(44.0f, 98.20914f, 45.79086f, 100.0f, 48.0f, 100.0f),
                    PathNode.CurveTo(50.20914f, 100.0f, 52.0f, 98.20914f, 52.0f, 96.0f),
                    PathNode.LineTo(52.0f, 57.66f),
                    PathNode.LineTo(101.17f, 106.83f),
                    PathNode.CurveTo(102.73296f, 108.39297f, 105.26704f, 108.39297f, 106.83f, 106.83f),
                    PathNode.CurveTo(108.39297f, 105.26704f, 108.39297f, 102.73296f, 106.83f, 101.17f),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
