package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorThinIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(173.17f, 133.17f),
                    PathNode.LineTo(214.34f, 92.0f),
                    PathNode.LineTo(88.0f, 92.0f),
                    PathNode.CurveTo(59.281193f, 92.0f, 36.0f, 115.2812f, 36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 172.71881f, 59.281193f, 196.0f, 88.0f, 196.0f),
                    PathNode.LineTo(176.0f, 196.0f),
                    PathNode.CurveTo(178.20914f, 196.0f, 180.0f, 197.79086f, 180.0f, 200.0f),
                    PathNode.CurveTo(180.0f, 202.20914f, 178.20914f, 204.0f, 176.0f, 204.0f),
                    PathNode.LineTo(88.0f, 204.0f),
                    PathNode.CurveTo(54.862915f, 204.0f, 28.0f, 177.13708f, 28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 110.862915f, 54.862915f, 84.0f, 88.0f, 84.0f),
                    PathNode.LineTo(214.34f, 84.0f),
                    PathNode.LineTo(173.17f, 42.83f),
                    PathNode.CurveTo(171.60704f, 41.267033f, 171.60704f, 38.732967f, 173.17f, 37.17f),
                    PathNode.CurveTo(174.73297f, 35.607033f, 177.26703f, 35.607033f, 178.83f, 37.17f),
                    PathNode.LineTo(226.83f, 85.17f),
                    PathNode.CurveTo(227.58112f, 85.92027f, 228.00314f, 86.93836f, 228.00314f, 88.0f),
                    PathNode.CurveTo(228.00314f, 89.06164f, 227.58112f, 90.07973f, 226.83f, 90.83f),
                    PathNode.LineTo(178.83f, 138.83f),
                    PathNode.CurveTo(177.26703f, 140.39296f, 174.73297f, 140.39296f, 173.17f, 138.83f),
                    PathNode.CurveTo(171.60704f, 137.26703f, 171.60704f, 134.73297f, 173.17f, 133.17f),
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
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
