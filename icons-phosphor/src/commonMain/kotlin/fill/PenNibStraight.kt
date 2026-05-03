package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorFillIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.33f, 123.89f),
                    PathNode.CurveTo(222.27f, 123.76f, 222.21f, 123.63f, 222.14f, 123.51f),
                    PathNode.LineTo(192.0f, 69.91f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(192.0f, 23.163445f, 184.83656f, 16.0f, 176.0f, 16.0f),
                    PathNode.LineTo(80.0f, 16.0f),
                    PathNode.CurveTo(71.163445f, 16.0f, 64.0f, 23.163445f, 64.0f, 32.0f),
                    PathNode.LineTo(64.0f, 69.9f),
                    PathNode.LineTo(33.86f, 123.51f),
                    PathNode.CurveTo(33.79f, 123.63f, 33.73f, 123.76f, 33.66f, 123.89f),
                    PathNode.CurveTo(30.997656f, 129.2495f, 31.561493f, 135.64864f, 35.12f, 140.46f),
                    PathNode.LineTo(35.23f, 140.6f),
                    PathNode.LineTo(112.84f, 241.41f),
                    PathNode.CurveTo(113.88334f, 242.75461f, 115.663246f, 243.2918f, 117.276245f, 242.74887f),
                    PathNode.CurveTo(118.88925f, 242.20595f, 119.98207f, 240.70183f, 120.0f, 239.0f),
                    PathNode.LineTo(120.0f, 154.63f),
                    PathNode.CurveTo(108.97963f, 150.7337f, 102.369026f, 139.46468f, 104.345634f, 127.94414f),
                    PathNode.CurveTo(106.32224f, 116.4236f, 116.31113f, 108.00259f, 128.0f, 108.00259f),
                    PathNode.CurveTo(139.68887f, 108.00259f, 149.67775f, 116.4236f, 151.65436f, 127.94414f),
                    PathNode.CurveTo(153.63098f, 139.46468f, 147.02037f, 150.7337f, 136.0f, 154.63f),
                    PathNode.LineTo(136.0f, 239.0f),
                    PathNode.CurveTo(136.0053f, 240.7073f, 137.09366f, 242.22307f, 138.70972f, 242.77379f),
                    PathNode.CurveTo(140.32578f, 243.32451f, 142.11324f, 242.78879f, 143.16f, 241.44f),
                    PathNode.LineTo(220.76f, 140.63f),
                    PathNode.LineTo(220.87f, 140.49f),
                    PathNode.CurveTo(224.44504f, 135.67355f, 225.00941f, 129.25653f, 222.33f, 123.89f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 64.0f),
                    PathNode.LineTo(80.0f, 64.0f),
                    PathNode.LineTo(80.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
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
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
