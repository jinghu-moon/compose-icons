package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = phosphorThinIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.83f, 130.83f),
                    PathNode.LineTo(146.83f, 202.83f),
                    PathNode.CurveTo(145.26703f, 204.39296f, 142.73297f, 204.39296f, 141.17f, 202.83f),
                    PathNode.CurveTo(139.60704f, 201.26703f, 139.60704f, 198.73297f, 141.17f, 197.17f),
                    PathNode.LineTo(206.34f, 132.0f),
                    PathNode.LineTo(40.0f, 132.0f),
                    PathNode.CurveTo(37.79086f, 132.0f, 36.0f, 130.20914f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 125.79086f, 37.79086f, 124.0f, 40.0f, 124.0f),
                    PathNode.LineTo(206.34f, 124.0f),
                    PathNode.LineTo(141.17f, 58.83f),
                    PathNode.CurveTo(139.60704f, 57.267033f, 139.60704f, 54.732967f, 141.17f, 53.17f),
                    PathNode.CurveTo(142.73297f, 51.607033f, 145.26703f, 51.607033f, 146.83f, 53.17f),
                    PathNode.LineTo(218.83f, 125.17f),
                    PathNode.CurveTo(219.58112f, 125.92027f, 220.00314f, 126.93836f, 220.00314f, 128.0f),
                    PathNode.CurveTo(220.00314f, 129.06163f, 219.58112f, 130.07973f, 218.83f, 130.83f),
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
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
