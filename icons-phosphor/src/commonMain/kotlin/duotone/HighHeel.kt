package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorDuotoneIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 187.31f),
                    PathNode.LineTo(248.0f, 192.0f),
                    PathNode.CurveTo(248.0f, 196.41827f, 244.41827f, 200.0f, 240.0f, 200.0f),
                    PathNode.LineTo(150.72f, 200.0f),
                    PathNode.CurveTo(147.47827f, 200.01485f, 144.54805f, 198.07188f, 143.3f, 195.08f),
                    PathNode.CurveTo(125.51f, 151.28f, 82.38f, 120.0f, 32.0f, 120.0f),
                    PathNode.CurveTo(32.0f, 89.0f, 44.59f, 61.22f, 64.0f, 40.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.LineTo(229.21f, 164.0f),
                    PathNode.CurveTo(240.16298f, 166.40495f, 247.97495f, 176.09613f, 248.0f, 187.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.0f, 156.19f),
                    PathNode.LineTo(180.0f, 144.71f),
                    PathNode.LineTo(69.66f, 34.34f),
                    PathNode.CurveTo(68.11567f, 32.796314f, 66.007454f, 31.950966f, 63.824448f, 32.000065f),
                    PathNode.CurveTo(61.64144f, 32.049164f, 59.573368f, 32.98844f, 58.1f, 34.6f),
                    PathNode.CurveTo(36.11f, 58.64f, 24.0f, 89.0f, 24.0f, 120.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 200.83656f, 31.163445f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.CurveTo(80.836555f, 208.0f, 88.0f, 200.83656f, 88.0f, 192.0f),
                    PathNode.LineTo(88.0f, 143.06f),
                    PathNode.CurveTo(90.49f, 144.51f, 92.94f, 146.06f, 95.34f, 147.7f),
                    PathNode.CurveTo(113.499825f, 160.16302f, 127.59986f, 177.68463f, 135.89f, 198.09f),
                    PathNode.CurveTo(138.3406f, 204.11604f, 144.21484f, 208.04146f, 150.72f, 208.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(248.83656f, 208.0f, 256.0f, 200.83656f, 256.0f, 192.0f),
                    PathNode.LineTo(256.0f, 187.27f),
                    PathNode.CurveTo(256.03772f, 172.31113f, 245.61938f, 159.35905f, 231.0f, 156.19f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 128.29f),
                    PathNode.CurveTo(50.96053f, 129.06467f, 61.74504f, 131.46422f, 72.0f, 135.41f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 192.0f),
                    PathNode.LineTo(150.68f, 192.0f),
                    PathNode.CurveTo(141.21164f, 168.73161f, 125.123726f, 148.75298f, 104.41f, 134.54f),
                    PathNode.CurveTo(85.45428f, 121.435715f, 63.28802f, 113.74044f, 40.29f, 112.28f),
                    PathNode.CurveTo(42.093845f, 90.14502f, 50.515503f, 69.06474f, 64.46f, 51.78f),
                    PathNode.LineTo(170.34f, 157.66f),
                    PathNode.CurveTo(171.41153f, 158.7277f, 172.76382f, 159.46973f, 174.24f, 159.8f),
                    PathNode.LineTo(227.48f, 171.8f),
                    PathNode.CurveTo(234.79726f, 173.35674f, 240.0218f, 179.82901f, 240.0f, 187.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
