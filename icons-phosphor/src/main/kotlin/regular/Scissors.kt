package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorRegularIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(157.73f, 113.13f),
                    PathNode.CurveTo(156.52919f, 111.37755f, 156.07472f, 109.219444f, 156.46678f, 107.13156f),
                    PathNode.CurveTo(156.85884f, 105.04367f, 158.06526f, 103.19745f, 159.82f, 102.0f),
                    PathNode.LineTo(227.48f, 55.7f),
                    PathNode.CurveTo(231.12088f, 53.447468f, 235.88983f, 54.460667f, 238.30042f, 57.998882f),
                    PathNode.CurveTo(240.71101f, 61.5371f, 239.90869f, 66.346016f, 236.48f, 68.91f),
                    PathNode.LineTo(168.81f, 115.21f),
                    PathNode.CurveTo(167.48401f, 116.12443f, 165.91072f, 116.6128f, 164.3f, 116.61f),
                    PathNode.CurveTo(161.67125f, 116.59989f, 159.21523f, 115.29898f, 157.73f, 113.13f),
                    PathNode.Close,
                    PathNode.MoveTo(238.6f, 198.22f),
                    PathNode.CurveTo(236.10347f, 201.86478f, 231.12515f, 202.79597f, 227.48f, 200.3f),
                    PathNode.LineTo(136.0f, 137.7f),
                    PathNode.LineTo(93.49f, 166.78f),
                    PathNode.CurveTo(100.20527f, 183.83325f, 93.036606f, 203.20955f, 76.83917f, 211.78578f),
                    PathNode.CurveTo(60.64175f, 220.36201f, 40.586544f, 215.40024f, 30.256475f, 200.26094f),
                    PathNode.CurveTo(19.926407f, 185.12166f, 22.619326f, 164.63803f, 36.511383f, 152.68315f),
                    PathNode.CurveTo(50.40344f, 140.72827f, 71.05962f, 141.1187f, 84.49f, 153.59f),
                    PathNode.LineTo(121.83f, 128.0f),
                    PathNode.LineTo(84.44f, 102.41f),
                    PathNode.CurveTo(71.05529f, 114.81679f, 50.487377f, 115.19184f, 36.659245f, 103.28127f),
                    PathNode.CurveTo(22.831108f, 91.37071f, 20.15426f, 70.97429f, 30.44073f, 55.898895f),
                    PathNode.CurveTo(40.7272f, 40.8235f, 60.69535f, 35.87856f, 76.82821f, 44.411427f),
                    PathNode.CurveTo(92.96106f, 52.944298f, 100.11185f, 72.232796f, 93.44f, 89.22f),
                    PathNode.LineTo(236.44f, 187.09f),
                    PathNode.CurveTo(238.20604f, 188.27654f, 239.42667f, 190.11768f, 239.83202f, 192.20631f),
                    PathNode.CurveTo(240.23735f, 194.29495f, 239.794f, 196.45901f, 238.6f, 198.22f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 180.0f),
                    PathNode.CurveTo(80.00204f, 170.45839f, 73.26358f, 162.24413f, 63.90569f, 160.3808f),
                    PathNode.CurveTo(54.547794f, 158.51747f, 45.176826f, 163.52406f, 41.523804f, 172.33868f),
                    PathNode.CurveTo(37.870785f, 181.15334f, 40.953156f, 191.32092f, 48.885826f, 196.62328f),
                    PathNode.CurveTo(56.818493f, 201.92563f, 67.39205f, 200.88591f, 74.14f, 194.14f),
                    PathNode.CurveTo(77.90507f, 190.39957f, 80.01549f, 185.30719f, 80.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.14f, 90.13f),
                    PathNode.CurveTo(79.86121f, 84.410515f, 81.57343f, 75.807686f, 78.478165f, 68.33346f),
                    PathNode.CurveTo(75.382904f, 60.859226f, 68.0898f, 55.98573f, 60.0f, 55.98573f),
                    PathNode.CurveTo(51.910206f, 55.98573f, 44.617096f, 60.859226f, 41.52183f, 68.33346f),
                    PathNode.CurveTo(38.426567f, 75.807686f, 40.138786f, 84.410515f, 45.86f, 90.13f),
                    PathNode.CurveTo(49.59072f, 93.91658f, 54.68431f, 96.04864f, 60.0f, 96.04864f),
                    PathNode.CurveTo(65.31569f, 96.04864f, 70.40928f, 93.91658f, 74.14f, 90.13f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _scissors!!
    }

private var _scissors: ImageVector? = null
