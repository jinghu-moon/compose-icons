package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendLeftDown: ImageVector
    get() {
        if (_arrowBendLeftDown != null) return _arrowBendLeftDown!!
        _arrowBendLeftDown = phosphorThinIcon(
            name = "ArrowBendLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 32.0f),
                    PathNode.CurveTo(204.0f, 34.20914f, 202.20914f, 36.0f, 200.0f, 36.0f),
                    PathNode.CurveTo(149.21265f, 36.055115f, 108.055115f, 77.21265f, 108.0f, 128.0f),
                    PathNode.LineTo(108.0f, 214.34f),
                    PathNode.LineTo(149.17f, 173.17f),
                    PathNode.CurveTo(150.73297f, 171.60704f, 153.26703f, 171.60704f, 154.83f, 173.17f),
                    PathNode.CurveTo(156.39296f, 174.73297f, 156.39296f, 177.26703f, 154.83f, 178.83f),
                    PathNode.LineTo(106.83f, 226.83f),
                    PathNode.CurveTo(106.07973f, 227.58112f, 105.06164f, 228.00314f, 104.0f, 228.00314f),
                    PathNode.CurveTo(102.93836f, 228.00314f, 101.92027f, 227.58112f, 101.17f, 226.83f),
                    PathNode.LineTo(53.17f, 178.83f),
                    PathNode.CurveTo(51.607033f, 177.26703f, 51.607033f, 174.73297f, 53.17f, 173.17f),
                    PathNode.CurveTo(54.732967f, 171.60704f, 57.267033f, 171.60704f, 58.83f, 173.17f),
                    PathNode.LineTo(100.0f, 214.34f),
                    PathNode.LineTo(100.0f, 128.0f),
                    PathNode.CurveTo(100.06062f, 72.79665f, 144.79666f, 28.060623f, 200.0f, 28.0f),
                    PathNode.CurveTo(202.20914f, 28.0f, 204.0f, 29.790861f, 204.0f, 32.0f),
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
        return _arrowBendLeftDown!!
    }

private var _arrowBendLeftDown: ImageVector? = null
