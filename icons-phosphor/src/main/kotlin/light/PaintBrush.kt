package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorLightIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 26.0f),
                    PathNode.CurveTo(203.2f, 26.0f, 179.89f, 37.41f, 154.7f, 59.9f),
                    PathNode.CurveTo(136.62f, 76.06f, 121.0f, 94.9f, 110.3f, 109.0f),
                    PathNode.CurveTo(92.62212f, 103.12208f, 73.19678f, 106.09344f, 58.084328f, 116.987076f),
                    PathNode.CurveTo(42.97188f, 127.880714f, 34.011997f, 145.37053f, 34.0f, 164.0f),
                    PathNode.CurveTo(34.0f, 196.07f, 13.57f, 210.39f, 12.65f, 211.0f),
                    PathNode.CurveTo(10.439289f, 212.46632f, 9.453903f, 215.21037f, 10.226756f, 217.74811f),
                    PathNode.CurveTo(10.99961f, 220.28583f, 13.347238f, 222.01482f, 16.0f, 222.0f),
                    PathNode.LineTo(92.0f, 222.0f),
                    PathNode.CurveTo(110.62947f, 221.988f, 128.11928f, 213.02812f, 139.01292f, 197.91568f),
                    PathNode.CurveTo(149.90656f, 182.80322f, 152.87793f, 163.37788f, 147.0f, 145.7f),
                    PathNode.CurveTo(161.08f, 135.03f, 179.92f, 119.38f, 196.08f, 101.3f),
                    PathNode.CurveTo(218.59f, 76.11f, 230.0f, 52.8f, 230.0f, 32.0f),
                    PathNode.CurveTo(230.0f, 28.68629f, 227.3137f, 26.0f, 224.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 210.0f),
                    PathNode.LineTo(30.65f, 210.0f),
                    PathNode.CurveTo(37.92f, 200.85f, 46.0f, 185.78f, 46.0f, 164.0f),
                    PathNode.CurveTo(46.0f, 138.5949f, 66.5949f, 118.0f, 92.0f, 118.0f),
                    PathNode.CurveTo(117.4051f, 118.0f, 138.0f, 138.5949f, 138.0f, 164.0f),
                    PathNode.CurveTo(138.0f, 189.4051f, 117.4051f, 210.0f, 92.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(121.49f, 114.09f),
                    PathNode.CurveTo(125.09f, 109.42f, 129.37f, 104.09f, 134.2f, 98.4f),
                    PathNode.CurveTo(143.58057f, 104.44067f, 151.55933f, 112.41943f, 157.6f, 121.8f),
                    PathNode.CurveTo(151.93f, 126.63f, 146.6f, 130.91f, 141.91f, 134.51f),
                    PathNode.CurveTo(136.92079f, 126.100685f, 129.89932f, 119.0792f, 121.49f, 114.09f),
                    PathNode.Close,
                    PathNode.MoveTo(166.69f, 113.79f),
                    PathNode.CurveTo(160.18642f, 104.12654f, 151.87346f, 95.81359f, 142.21f, 89.31f),
                    PathNode.CurveTo(163.05f, 66.46f, 191.0f, 42.0f, 217.56f, 38.44f),
                    PathNode.CurveTo(214.0f, 65.0f, 189.54f, 93.0f, 166.69f, 113.79f),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
