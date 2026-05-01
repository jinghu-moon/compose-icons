package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) return _shootingStar!!
        _shootingStar = phosphorFillIcon(
            name = "ShootingStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.24f, 84.38f),
                    PathNode.LineTo(207.18f, 108.06f),
                    PathNode.LineTo(215.74f, 143.45f),
                    PathNode.CurveTo(217.00981f, 148.68921f, 215.00143f, 154.17773f, 210.65f, 157.36f),
                    PathNode.CurveTo(206.24718f, 160.59538f, 200.33125f, 160.86751f, 195.65f, 158.05f),
                    PathNode.LineTo(164.0f, 139.0f),
                    PathNode.LineTo(132.35f, 158.06f),
                    PathNode.CurveTo(127.67083f, 160.88571f, 121.74999f, 160.61334f, 117.35f, 157.37f),
                    PathNode.CurveTo(112.99033f, 154.19368f, 110.97669f, 148.7016f, 112.25f, 143.46f),
                    PathNode.LineTo(120.81f, 108.07f),
                    PathNode.LineTo(92.76f, 84.38f),
                    PathNode.CurveTo(88.605064f, 80.86796f, 86.988144f, 75.19108f, 88.669f, 70.01685f),
                    PathNode.CurveTo(90.34985f, 64.84262f, 94.99431f, 61.19976f, 100.42f, 60.8f),
                    PathNode.LineTo(137.36f, 57.88f),
                    PathNode.LineTo(151.57f, 24.22f),
                    PathNode.CurveTo(153.6918f, 19.237139f, 158.5842f, 16.00294f, 164.0f, 16.00294f),
                    PathNode.CurveTo(169.4158f, 16.00294f, 174.3082f, 19.237139f, 176.43f, 24.22f),
                    PathNode.LineTo(190.64f, 57.88f),
                    PathNode.LineTo(227.58f, 60.8f),
                    PathNode.CurveTo(233.00569f, 61.19976f, 237.65015f, 64.84262f, 239.33101f, 70.01685f),
                    PathNode.CurveTo(241.01186f, 75.19108f, 239.39493f, 80.86796f, 235.24f, 84.38f),
                    PathNode.Close,
                    PathNode.MoveTo(88.11f, 111.89f),
                    PathNode.CurveTo(86.60945f, 110.38779f, 84.57327f, 109.54371f, 82.45f, 109.54371f),
                    PathNode.CurveTo(80.32673f, 109.54371f, 78.29054f, 110.38779f, 76.79f, 111.89f),
                    PathNode.LineTo(18.34f, 170.34f),
                    PathNode.CurveTo(15.214068f, 173.46593f, 15.214068f, 178.53407f, 18.34f, 181.66f),
                    PathNode.CurveTo(21.46593f, 184.78593f, 26.53407f, 184.78593f, 29.66f, 181.66f),
                    PathNode.LineTo(88.11f, 123.21f),
                    PathNode.CurveTo(89.61221f, 121.70946f, 90.45629f, 119.67327f, 90.45629f, 117.55f),
                    PathNode.CurveTo(90.45629f, 115.42673f, 89.61221f, 113.39055f, 88.11f, 111.89f),
                    PathNode.Close,
                    PathNode.MoveTo(87.61f, 173.08f),
                    PathNode.LineTo(34.34f, 226.34f),
                    PathNode.CurveTo(31.214067f, 229.46593f, 31.21407f, 234.53407f, 34.34f, 237.66f),
                    PathNode.CurveTo(37.46593f, 240.78593f, 42.53407f, 240.78593f, 45.66f, 237.66f),
                    PathNode.LineTo(98.92f, 184.39f),
                    PathNode.CurveTo(101.90823f, 181.24469f, 101.8448f, 176.29076f, 98.77702f, 173.22298f),
                    PathNode.CurveTo(95.70925f, 170.1552f, 90.75532f, 170.09177f, 87.61f, 173.08f),
                    PathNode.Close,
                    PathNode.MoveTo(160.61f, 172.08f),
                    PathNode.LineTo(106.32f, 226.36f),
                    PathNode.CurveTo(103.19407f, 229.48593f, 103.19407f, 234.55406f, 106.32f, 237.68f),
                    PathNode.CurveTo(109.44593f, 240.80594f, 114.51407f, 240.80594f, 117.64f, 237.68f),
                    PathNode.LineTo(171.92f, 183.4f),
                    PathNode.CurveTo(175.04593f, 180.27682f, 175.04817f, 175.21094f, 171.925f, 172.085f),
                    PathNode.CurveTo(168.80183f, 168.95908f, 163.73593f, 168.95683f, 160.61f, 172.08f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
