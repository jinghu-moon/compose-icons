package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) return _arrowBendUpRight!!
        _arrowBendUpRight = phosphorThinIcon(
            name = "ArrowBendUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 106.83f),
                    PathNode.LineTo(178.83f, 154.83f),
                    PathNode.CurveTo(177.26703f, 156.39296f, 174.73297f, 156.39296f, 173.17f, 154.83f),
                    PathNode.CurveTo(171.60704f, 153.26703f, 171.60704f, 150.73297f, 173.17f, 149.17f),
                    PathNode.LineTo(214.34f, 108.0f),
                    PathNode.LineTo(128.0f, 108.0f),
                    PathNode.CurveTo(77.21265f, 108.055115f, 36.055115f, 149.21265f, 36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 202.20914f, 34.20914f, 204.0f, 32.0f, 204.0f),
                    PathNode.CurveTo(29.790861f, 204.0f, 28.0f, 202.20914f, 28.0f, 200.0f),
                    PathNode.CurveTo(28.060623f, 144.79666f, 72.79665f, 100.06062f, 128.0f, 100.0f),
                    PathNode.LineTo(214.34f, 100.0f),
                    PathNode.LineTo(173.17f, 58.83f),
                    PathNode.CurveTo(171.60704f, 57.267033f, 171.60704f, 54.732967f, 173.17f, 53.17f),
                    PathNode.CurveTo(174.73297f, 51.607033f, 177.26703f, 51.607033f, 178.83f, 53.17f),
                    PathNode.LineTo(226.83f, 101.17f),
                    PathNode.CurveTo(227.58112f, 101.92027f, 228.00314f, 102.93836f, 228.00314f, 104.0f),
                    PathNode.CurveTo(228.00314f, 105.06164f, 227.58112f, 106.07973f, 226.83f, 106.83f),
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
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null
