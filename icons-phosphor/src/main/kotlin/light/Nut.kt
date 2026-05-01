package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = phosphorLightIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 82.0f),
                    PathNode.CurveTo(102.5949f, 82.0f, 82.0f, 102.5949f, 82.0f, 128.0f),
                    PathNode.CurveTo(82.0f, 153.4051f, 102.5949f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(153.4051f, 174.0f, 174.0f, 153.4051f, 174.0f, 128.0f),
                    PathNode.CurveTo(173.96695f, 102.608604f, 153.39139f, 82.03306f, 128.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 162.0f),
                    PathNode.CurveTo(109.22232f, 162.0f, 94.0f, 146.77768f, 94.0f, 128.0f),
                    PathNode.CurveTo(94.0f, 109.22232f, 109.22232f, 94.0f, 128.0f, 94.0f),
                    PathNode.CurveTo(146.77768f, 94.0f, 162.0f, 109.22232f, 162.0f, 128.0f),
                    PathNode.CurveTo(162.0f, 146.77768f, 146.77768f, 162.0f, 128.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.72f, 67.91f),
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
                    PathNode.CurveTo(229.99571f, 75.06756f, 227.20499f, 70.36397f, 222.72f, 67.91f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 175.82f),
                    PathNode.CurveTo(218.00645f, 176.54094f, 217.62439f, 177.20955f, 217.0f, 177.57f),
                    PathNode.LineTo(129.0f, 225.75f),
                    PathNode.CurveTo(128.40184f, 226.07729f, 127.67816f, 226.07729f, 127.08f, 225.75f),
                    PathNode.LineTo(39.0f, 177.57f),
                    PathNode.CurveTo(38.37561f, 177.20955f, 37.993546f, 176.54094f, 38.0f, 175.82f),
                    PathNode.LineTo(38.0f, 80.18f),
                    PathNode.CurveTo(37.993546f, 79.45907f, 38.37561f, 78.79045f, 39.0f, 78.43f),
                    PathNode.LineTo(127.0f, 30.25f),
                    PathNode.CurveTo(127.59816f, 29.922716f, 128.32184f, 29.922716f, 128.92f, 30.25f),
                    PathNode.LineTo(216.92f, 78.43f),
                    PathNode.CurveTo(217.54439f, 78.79045f, 217.92645f, 79.45907f, 217.92f, 80.18f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _nut!!
    }

private var _nut: ImageVector? = null
