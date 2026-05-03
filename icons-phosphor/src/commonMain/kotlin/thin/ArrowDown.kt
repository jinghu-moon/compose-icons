package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorThinIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.83f, 146.83f),
                    PathNode.LineTo(130.83f, 218.83f),
                    PathNode.CurveTo(130.07973f, 219.58112f, 129.06163f, 220.00314f, 128.0f, 220.00314f),
                    PathNode.CurveTo(126.93836f, 220.00314f, 125.92027f, 219.58112f, 125.17f, 218.83f),
                    PathNode.LineTo(53.17f, 146.83f),
                    PathNode.CurveTo(51.607033f, 145.26703f, 51.607033f, 142.73297f, 53.17f, 141.17f),
                    PathNode.CurveTo(54.732967f, 139.60704f, 57.267033f, 139.60704f, 58.83f, 141.17f),
                    PathNode.LineTo(124.0f, 206.34f),
                    PathNode.LineTo(124.0f, 40.0f),
                    PathNode.CurveTo(124.0f, 37.79086f, 125.79086f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(130.20914f, 36.0f, 132.0f, 37.79086f, 132.0f, 40.0f),
                    PathNode.LineTo(132.0f, 206.34f),
                    PathNode.LineTo(197.17f, 141.17f),
                    PathNode.CurveTo(198.73297f, 139.60704f, 201.26703f, 139.60704f, 202.83f, 141.17f),
                    PathNode.CurveTo(204.39296f, 142.73297f, 204.39296f, 145.26703f, 202.83f, 146.83f),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
