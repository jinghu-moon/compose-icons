package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorThinIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 88.0f),
                    PathNode.LineTo(204.0f, 176.0f),
                    PathNode.CurveTo(204.0f, 178.20914f, 202.20914f, 180.0f, 200.0f, 180.0f),
                    PathNode.CurveTo(197.79086f, 180.0f, 196.0f, 178.20914f, 196.0f, 176.0f),
                    PathNode.LineTo(196.0f, 88.0f),
                    PathNode.CurveTo(196.0f, 59.281193f, 172.71881f, 36.0f, 144.0f, 36.0f),
                    PathNode.CurveTo(115.2812f, 36.0f, 92.0f, 59.281193f, 92.0f, 88.0f),
                    PathNode.LineTo(92.0f, 214.34f),
                    PathNode.LineTo(133.17f, 173.17f),
                    PathNode.CurveTo(134.73297f, 171.60704f, 137.26703f, 171.60704f, 138.83f, 173.17f),
                    PathNode.CurveTo(140.39296f, 174.73297f, 140.39296f, 177.26703f, 138.83f, 178.83f),
                    PathNode.LineTo(90.83f, 226.83f),
                    PathNode.CurveTo(90.07973f, 227.58112f, 89.06164f, 228.00314f, 88.0f, 228.00314f),
                    PathNode.CurveTo(86.93836f, 228.00314f, 85.92027f, 227.58112f, 85.17f, 226.83f),
                    PathNode.LineTo(37.17f, 178.83f),
                    PathNode.CurveTo(35.607033f, 177.26703f, 35.607033f, 174.73297f, 37.17f, 173.17f),
                    PathNode.CurveTo(38.732967f, 171.60704f, 41.267033f, 171.60704f, 42.83f, 173.17f),
                    PathNode.LineTo(84.0f, 214.34f),
                    PathNode.LineTo(84.0f, 88.0f),
                    PathNode.CurveTo(84.0f, 54.862915f, 110.862915f, 28.0f, 144.0f, 28.0f),
                    PathNode.CurveTo(177.13708f, 28.0f, 204.0f, 54.862915f, 204.0f, 88.0f),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
