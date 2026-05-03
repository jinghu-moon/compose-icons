package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = phosphorLightIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.72f, 67.9f),
                    PathNode.LineTo(134.72f, 19.73f),
                    PathNode.CurveTo(130.53772f, 17.420195f, 125.46228f, 17.420195f, 121.28f, 19.73f),
                    PathNode.LineTo(33.28f, 67.91f),
                    PathNode.CurveTo(28.795013f, 70.36397f, 26.004295f, 75.06756f, 26.0f, 80.18f),
                    PathNode.LineTo(26.0f, 175.82f),
                    PathNode.CurveTo(26.004295f, 180.93243f, 28.795013f, 185.63603f, 33.28f, 188.09f),
                    PathNode.LineTo(121.28f, 236.27f),
                    PathNode.CurveTo(125.46325f, 238.57602f, 130.53674f, 238.57602f, 134.72f, 236.27f),
                    PathNode.LineTo(222.72f, 188.09f),
                    PathNode.CurveTo(227.20499f, 185.63603f, 229.99571f, 180.93243f, 230.0f, 175.82f),
                    PathNode.LineTo(230.0f, 80.18f),
                    PathNode.CurveTo(229.99936f, 75.06397f, 227.20813f, 70.35569f, 222.72f, 67.9f),
                    PathNode.Close,
                    PathNode.MoveTo(127.0f, 30.25f),
                    PathNode.CurveTo(127.59816f, 29.922716f, 128.32184f, 29.922716f, 128.92f, 30.25f),
                    PathNode.LineTo(212.51f, 76.0f),
                    PathNode.LineTo(128.0f, 122.24f),
                    PathNode.LineTo(43.49f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(39.0f, 177.57f),
                    PathNode.CurveTo(38.37561f, 177.20955f, 37.993546f, 176.54094f, 38.0f, 175.82f),
                    PathNode.LineTo(38.0f, 86.66f),
                    PathNode.LineTo(122.0f, 132.66f),
                    PathNode.LineTo(122.0f, 223.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.92f, 177.57f),
                    PathNode.LineTo(134.0f, 223.0f),
                    PathNode.LineTo(134.0f, 132.64f),
                    PathNode.LineTo(218.0f, 86.64f),
                    PathNode.LineTo(218.0f, 175.8f),
                    PathNode.CurveTo(218.01375f, 176.52805f, 217.63069f, 177.20604f, 217.0f, 177.57f),
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
        return _cube!!
    }

private var _cube: ImageVector? = null
