package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorFillIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 104.0f),
                    PathNode.LineTo(224.0f, 154.93f),
                    PathNode.CurveTo(224.0f, 201.13f, 187.15f, 239.48f, 141.0f, 239.99f),
                    PathNode.CurveTo(118.3704f, 240.29515f, 96.5815f, 231.42447f, 80.6f, 215.4f),
                    PathNode.CurveTo(58.79f, 192.33f, 34.15f, 136.0f, 34.15f, 136.0f),
                    PathNode.CurveTo(31.95973f, 132.20924f, 31.418472f, 127.68655f, 32.652374f, 123.48599f),
                    PathNode.CurveTo(33.886276f, 119.28544f, 36.78754f, 115.77398f, 40.68f, 113.77f),
                    PathNode.CurveTo(48.34f, 109.77f, 57.78f, 112.93f, 62.08f, 120.39f),
                    PathNode.LineTo(83.08f, 156.83f),
                    PathNode.CurveTo(84.27422f, 158.97534f, 86.63996f, 160.19371f, 89.08f, 159.92f),
                    PathNode.LineTo(89.2f, 159.92f),
                    PathNode.CurveTo(93.1699f, 159.23668f, 96.05346f, 155.76793f, 96.0f, 151.74f),
                    PathNode.LineTo(96.0f, 32.0f),
                    PathNode.CurveTo(95.99493f, 27.619694f, 97.78592f, 23.428843f, 100.95517f, 20.405107f),
                    PathNode.CurveTo(104.12443f, 17.381374f, 108.39477f, 15.789195f, 112.77f, 16.0f),
                    PathNode.CurveTo(121.38f, 16.4f, 128.0f, 23.82f, 128.0f, 32.43f),
                    PathNode.LineTo(128.0f, 104.0f),
                    PathNode.CurveTo(127.99513f, 106.216835f, 128.91034f, 108.3363f, 130.52731f, 109.852806f),
                    PathNode.CurveTo(132.14429f, 111.36931f, 134.31801f, 112.14687f, 136.53f, 112.0f),
                    PathNode.CurveTo(140.79767f, 111.63339f, 144.05766f, 108.033005f, 144.0f, 103.75f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(143.99492f, 83.61969f, 145.78592f, 79.42884f, 148.95517f, 76.405106f),
                    PathNode.CurveTo(152.12442f, 73.38138f, 156.39478f, 71.78919f, 160.77f, 72.0f),
                    PathNode.CurveTo(169.38f, 72.4f, 176.0f, 79.82f, 176.0f, 88.43f),
                    PathNode.LineTo(176.0f, 112.0f),
                    PathNode.CurveTo(175.99513f, 114.216835f, 176.91034f, 116.3363f, 178.52731f, 117.852806f),
                    PathNode.CurveTo(180.14429f, 119.36931f, 182.31801f, 120.14687f, 184.53f, 120.0f),
                    PathNode.CurveTo(188.79767f, 119.63339f, 192.05766f, 116.033005f, 192.0f, 111.75f),
                    PathNode.LineTo(192.0f, 104.47f),
                    PathNode.CurveTo(192.0f, 95.86f, 198.62f, 88.47f, 207.23f, 88.04f),
                    PathNode.CurveTo(211.5983f, 87.82953f, 215.86237f, 89.41633f, 219.03035f, 92.43131f),
                    PathNode.CurveTo(222.19835f, 95.44629f, 223.99414f, 99.62664f, 224.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
