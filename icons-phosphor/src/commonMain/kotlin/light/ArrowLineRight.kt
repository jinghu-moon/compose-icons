package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) return _arrowLineRight!!
        _arrowLineRight = phosphorLightIcon(
            name = "ArrowLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.24f, 123.76f),
                    PathNode.CurveTo(190.57962f, 126.10254f, 190.57962f, 129.89746f, 188.24f, 132.24f),
                    PathNode.LineTo(116.24f, 204.24f),
                    PathNode.CurveTo(113.87592f, 206.44287f, 110.191925f, 206.37787f, 107.90703f, 204.09297f),
                    PathNode.CurveTo(105.62213f, 201.80807f, 105.55713f, 198.12408f, 107.76f, 195.76f),
                    PathNode.LineTo(169.51f, 134.0f),
                    PathNode.LineTo(32.0f, 134.0f),
                    PathNode.CurveTo(28.68629f, 134.0f, 26.0f, 131.3137f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 124.686295f, 28.68629f, 122.0f, 32.0f, 122.0f),
                    PathNode.LineTo(169.51f, 122.0f),
                    PathNode.LineTo(107.76f, 60.24f),
                    PathNode.CurveTo(105.55713f, 57.875923f, 105.62213f, 54.19192f, 107.90703f, 51.907024f),
                    PathNode.CurveTo(110.191925f, 49.622128f, 113.87592f, 49.55713f, 116.24f, 51.76f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 34.0f),
                    PathNode.CurveTo(212.6863f, 34.0f, 210.0f, 36.68629f, 210.0f, 40.0f),
                    PathNode.LineTo(210.0f, 216.0f),
                    PathNode.CurveTo(210.0f, 219.3137f, 212.6863f, 222.0f, 216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.LineTo(222.0f, 40.0f),
                    PathNode.CurveTo(222.0f, 36.68629f, 219.3137f, 34.0f, 216.0f, 34.0f),
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
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null
