package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorLightIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.76f, 116.24f),
                    PathNode.CurveTo(49.55713f, 113.87592f, 49.622128f, 110.191925f, 51.907024f, 107.90703f),
                    PathNode.CurveTo(54.19192f, 105.62213f, 57.875923f, 105.55713f, 60.24f, 107.76f),
                    PathNode.LineTo(122.0f, 169.51f),
                    PathNode.LineTo(122.0f, 32.0f),
                    PathNode.CurveTo(122.0f, 28.68629f, 124.686295f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(131.3137f, 26.0f, 134.0f, 28.68629f, 134.0f, 32.0f),
                    PathNode.LineTo(134.0f, 169.51f),
                    PathNode.LineTo(195.76f, 107.76f),
                    PathNode.CurveTo(198.12408f, 105.55713f, 201.80807f, 105.62213f, 204.09297f, 107.90703f),
                    PathNode.CurveTo(206.37787f, 110.191925f, 206.44287f, 113.87592f, 204.24f, 116.24f),
                    PathNode.LineTo(132.24f, 188.24f),
                    PathNode.CurveTo(129.89746f, 190.57962f, 126.10254f, 190.57962f, 123.76f, 188.24f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 210.0f),
                    PathNode.LineTo(40.0f, 210.0f),
                    PathNode.CurveTo(36.68629f, 210.0f, 34.0f, 212.6863f, 34.0f, 216.0f),
                    PathNode.CurveTo(34.0f, 219.3137f, 36.68629f, 222.0f, 40.0f, 222.0f),
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.CurveTo(222.0f, 212.6863f, 219.3137f, 210.0f, 216.0f, 210.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
