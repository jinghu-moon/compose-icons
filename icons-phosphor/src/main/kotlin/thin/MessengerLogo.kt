package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) return _messengerLogo!!
        _messengerLogo = phosphorThinIcon(
            name = "MessengerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.83f, 109.17f),
                    PathNode.CurveTo(179.58112f, 109.92027f, 180.00314f, 110.93836f, 180.00314f, 112.0f),
                    PathNode.CurveTo(180.00314f, 113.06164f, 179.58112f, 114.07973f, 178.83f, 114.83f),
                    PathNode.LineTo(146.83f, 146.83f),
                    PathNode.CurveTo(146.07973f, 147.58112f, 145.06163f, 148.00314f, 144.0f, 148.00314f),
                    PathNode.CurveTo(142.93837f, 148.00314f, 141.92027f, 147.58112f, 141.17f, 146.83f),
                    PathNode.LineTo(112.0f, 117.66f),
                    PathNode.LineTo(82.83f, 146.83f),
                    PathNode.CurveTo(81.26704f, 148.39296f, 78.73296f, 148.39296f, 77.17f, 146.83f),
                    PathNode.CurveTo(75.60703f, 145.26703f, 75.60703f, 142.73297f, 77.17f, 141.17f),
                    PathNode.LineTo(109.17f, 109.17f),
                    PathNode.CurveTo(109.92027f, 108.418884f, 110.93836f, 107.99686f, 112.0f, 107.99686f),
                    PathNode.CurveTo(113.06164f, 107.99686f, 114.07973f, 108.418884f, 114.83f, 109.17f),
                    PathNode.LineTo(144.0f, 138.34f),
                    PathNode.LineTo(173.17f, 109.17f),
                    PathNode.CurveTo(173.92027f, 108.418884f, 174.93837f, 107.99686f, 176.0f, 107.99686f),
                    PathNode.CurveTo(177.06163f, 107.99686f, 178.07973f, 108.418884f, 178.83f, 109.17f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.00658f, 163.42216f, 209.27353f, 196.20468f, 178.75246f, 214.18233f),
                    PathNode.CurveTo(148.2314f, 232.15993f, 110.477196f, 232.64975f, 79.5f, 215.47f),
                    PathNode.LineTo(43.81f, 227.37f),
                    PathNode.CurveTo(39.49761f, 228.80812f, 34.7428f, 227.68604f, 31.528385f, 224.47162f),
                    PathNode.CurveTo(28.313967f, 221.2572f, 27.191862f, 216.5024f, 28.63f, 212.19f),
                    PathNode.LineTo(40.53f, 176.5f),
                    PathNode.CurveTo(20.261026f, 139.91951f, 24.895897f, 94.58945f, 52.148563f, 62.867912f),
                    PathNode.CurveTo(79.40123f, 31.14637f, 123.51525f, 19.733715f, 162.73235f, 34.258995f),
                    PathNode.CurveTo(201.94943f, 48.784275f, 227.98598f, 86.17939f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(219.98828f, 89.320816f, 195.7847f, 54.779575f, 159.43315f, 41.564262f),
                    PathNode.CurveTo(123.08161f, 28.348951f, 82.34617f, 39.28214f, 57.497105f, 68.923386f),
                    PathNode.CurveTo(32.64804f, 98.56464f, 28.992697f, 140.58307f, 48.35f, 174.07f),
                    PathNode.CurveTo(48.9234f, 175.06238f, 49.04356f, 176.25307f, 48.68f, 177.34f),
                    PathNode.LineTo(36.22f, 214.72f),
                    PathNode.CurveTo(35.74062f, 216.15747f, 36.114655f, 217.7424f, 37.186127f, 218.81387f),
                    PathNode.CurveTo(38.2576f, 219.88535f, 39.842537f, 220.2594f, 41.28f, 219.78f),
                    PathNode.LineTo(78.66f, 207.32f),
                    PathNode.CurveTo(79.06892f, 207.18068f, 79.498f, 207.10973f, 79.93f, 207.11f),
                    PathNode.CurveTo(80.63221f, 207.11357f, 81.32142f, 207.29965f, 81.93f, 207.65f),
                    PathNode.CurveTo(110.39544f, 224.1179f, 145.48628f, 224.13948f, 173.97197f, 207.70663f),
                    PathNode.CurveTo(202.45766f, 191.27377f, 220.00575f, 160.88576f, 220.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
