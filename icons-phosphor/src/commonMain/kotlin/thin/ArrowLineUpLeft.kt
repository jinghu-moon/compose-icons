package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorThinIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 210.20914f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 205.79086f, 45.79086f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(226.20914f, 204.0f, 228.0f, 205.79086f, 228.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 148.0f),
                    PathNode.CurveTo(74.20914f, 148.0f, 76.0f, 146.20914f, 76.0f, 144.0f),
                    PathNode.LineTo(76.0f, 57.66f),
                    PathNode.LineTo(181.17f, 162.83f),
                    PathNode.CurveTo(182.73297f, 164.39296f, 185.26703f, 164.39296f, 186.83f, 162.83f),
                    PathNode.CurveTo(188.39296f, 161.26703f, 188.39296f, 158.73297f, 186.83f, 157.17f),
                    PathNode.LineTo(81.66f, 52.0f),
                    PathNode.LineTo(168.0f, 52.0f),
                    PathNode.CurveTo(170.20914f, 52.0f, 172.0f, 50.20914f, 172.0f, 48.0f),
                    PathNode.CurveTo(172.0f, 45.79086f, 170.20914f, 44.0f, 168.0f, 44.0f),
                    PathNode.LineTo(72.0f, 44.0f),
                    PathNode.CurveTo(69.79086f, 44.0f, 68.0f, 45.79086f, 68.0f, 48.0f),
                    PathNode.LineTo(68.0f, 144.0f),
                    PathNode.CurveTo(68.0f, 146.20914f, 69.79086f, 148.0f, 72.0f, 148.0f),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
