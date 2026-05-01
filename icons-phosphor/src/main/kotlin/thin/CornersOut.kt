package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorThinIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(212.0f, 90.20914f, 210.20914f, 92.0f, 208.0f, 92.0f),
                    PathNode.CurveTo(205.79086f, 92.0f, 204.0f, 90.20914f, 204.0f, 88.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(168.0f, 52.0f),
                    PathNode.CurveTo(165.79086f, 52.0f, 164.0f, 50.20914f, 164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 45.79086f, 165.79086f, 44.0f, 168.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 168.0f),
                    PathNode.CurveTo(52.0f, 165.79086f, 50.20914f, 164.0f, 48.0f, 164.0f),
                    PathNode.CurveTo(45.79086f, 164.0f, 44.0f, 165.79086f, 44.0f, 168.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.CurveTo(90.20914f, 212.0f, 92.0f, 210.20914f, 92.0f, 208.0f),
                    PathNode.CurveTo(92.0f, 205.79086f, 90.20914f, 204.0f, 88.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 164.0f),
                    PathNode.CurveTo(205.79086f, 164.0f, 204.0f, 165.79086f, 204.0f, 168.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(168.0f, 204.0f),
                    PathNode.CurveTo(165.79086f, 204.0f, 164.0f, 205.79086f, 164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 210.20914f, 165.79086f, 212.0f, 168.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(210.20914f, 212.0f, 212.0f, 210.20914f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 168.0f),
                    PathNode.CurveTo(212.0f, 165.79086f, 210.20914f, 164.0f, 208.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(45.79086f, 44.0f, 44.0f, 45.79086f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 88.0f),
                    PathNode.CurveTo(44.0f, 90.20914f, 45.79086f, 92.0f, 48.0f, 92.0f),
                    PathNode.CurveTo(50.20914f, 92.0f, 52.0f, 90.20914f, 52.0f, 88.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(88.0f, 52.0f),
                    PathNode.CurveTo(90.20914f, 52.0f, 92.0f, 50.20914f, 92.0f, 48.0f),
                    PathNode.CurveTo(92.0f, 45.79086f, 90.20914f, 44.0f, 88.0f, 44.0f),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
