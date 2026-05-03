package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorThinIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 50.20914f, 226.20914f, 52.0f, 224.0f, 52.0f),
                    PathNode.LineTo(48.0f, 52.0f),
                    PathNode.CurveTo(45.79086f, 52.0f, 44.0f, 50.20914f, 44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(224.0f, 44.0f),
                    PathNode.CurveTo(226.20914f, 44.0f, 228.0f, 45.79086f, 228.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.17f, 93.17f),
                    PathNode.LineTo(76.0f, 198.34f),
                    PathNode.LineTo(76.0f, 112.0f),
                    PathNode.CurveTo(76.0f, 109.79086f, 74.20914f, 108.0f, 72.0f, 108.0f),
                    PathNode.CurveTo(69.79086f, 108.0f, 68.0f, 109.79086f, 68.0f, 112.0f),
                    PathNode.LineTo(68.0f, 208.0f),
                    PathNode.CurveTo(68.0f, 210.20914f, 69.79086f, 212.0f, 72.0f, 212.0f),
                    PathNode.LineTo(168.0f, 212.0f),
                    PathNode.CurveTo(170.20914f, 212.0f, 172.0f, 210.20914f, 172.0f, 208.0f),
                    PathNode.CurveTo(172.0f, 205.79086f, 170.20914f, 204.0f, 168.0f, 204.0f),
                    PathNode.LineTo(81.66f, 204.0f),
                    PathNode.LineTo(186.83f, 98.83f),
                    PathNode.CurveTo(188.39296f, 97.26704f, 188.39296f, 94.73296f, 186.83f, 93.17f),
                    PathNode.CurveTo(185.26703f, 91.60703f, 182.73297f, 91.60703f, 181.17f, 93.17f),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
