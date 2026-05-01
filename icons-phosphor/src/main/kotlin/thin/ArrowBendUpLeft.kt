package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorThinIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 200.0f),
                    PathNode.CurveTo(228.0f, 202.20914f, 226.20914f, 204.0f, 224.0f, 204.0f),
                    PathNode.CurveTo(221.79086f, 204.0f, 220.0f, 202.20914f, 220.0f, 200.0f),
                    PathNode.CurveTo(219.94489f, 149.21265f, 178.78735f, 108.055115f, 128.0f, 108.0f),
                    PathNode.LineTo(41.66f, 108.0f),
                    PathNode.LineTo(82.83f, 149.17f),
                    PathNode.CurveTo(84.39297f, 150.73297f, 84.39297f, 153.26703f, 82.83f, 154.83f),
                    PathNode.CurveTo(81.26704f, 156.39296f, 78.73296f, 156.39296f, 77.17f, 154.83f),
                    PathNode.LineTo(29.17f, 106.83f),
                    PathNode.CurveTo(28.418892f, 106.07973f, 27.996853f, 105.06164f, 27.996853f, 104.0f),
                    PathNode.CurveTo(27.996853f, 102.93836f, 28.418892f, 101.92027f, 29.17f, 101.17f),
                    PathNode.LineTo(77.17f, 53.17f),
                    PathNode.CurveTo(78.73296f, 51.607033f, 81.26704f, 51.607033f, 82.83f, 53.17f),
                    PathNode.CurveTo(84.39297f, 54.732967f, 84.39297f, 57.267033f, 82.83f, 58.83f),
                    PathNode.LineTo(41.66f, 100.0f),
                    PathNode.LineTo(128.0f, 100.0f),
                    PathNode.CurveTo(183.20334f, 100.06062f, 227.93938f, 144.79666f, 228.0f, 200.0f),
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
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null
