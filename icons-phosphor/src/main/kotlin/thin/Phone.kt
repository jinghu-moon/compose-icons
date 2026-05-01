package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorThinIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.78f, 162.13f),
                    PathNode.LineTo(173.56f, 141.0f),
                    PathNode.CurveTo(169.84114f, 139.39053f, 165.56117f, 139.76665f, 162.18f, 142.0f),
                    PathNode.CurveTo(162.04695f, 142.08434f, 161.91997f, 142.1779f, 161.8f, 142.28f),
                    PathNode.LineTo(137.0f, 163.42f),
                    PathNode.CurveTo(135.87917f, 164.10362f, 134.49098f, 164.1824f, 133.3f, 163.63f),
                    PathNode.CurveTo(117.06f, 155.79f, 100.25f, 139.11f, 92.41f, 123.06f),
                    PathNode.CurveTo(91.84667f, 121.87779f, 91.91428f, 120.49177f, 92.59f, 119.37f),
                    PathNode.LineTo(113.79f, 94.16f),
                    PathNode.CurveTo(113.89f, 94.04f, 113.98f, 93.91f, 114.07f, 93.78f),
                    PathNode.CurveTo(116.29628f, 90.40376f, 116.6722f, 86.133255f, 115.07f, 82.42f),
                    PathNode.LineTo(93.9f, 35.28f),
                    PathNode.CurveTo(91.80066f, 30.375711f, 86.71573f, 27.446175f, 81.42f, 28.09f),
                    PathNode.CurveTo(55.387196f, 31.522343f, 35.945568f, 53.741955f, 36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 157.2f, 98.8f, 220.0f, 176.0f, 220.0f),
                    PathNode.CurveTo(202.25804f, 220.05443f, 224.47766f, 200.61282f, 227.91f, 174.58f),
                    PathNode.CurveTo(228.54898f, 169.30971f, 225.64899f, 164.24593f, 220.78f, 162.13f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 173.58f),
                    PathNode.CurveTo(217.07867f, 195.62758f, 198.24014f, 212.07704f, 176.0f, 212.0f),
                    PathNode.CurveTo(103.22f, 212.0f, 44.0f, 152.78f, 44.0f, 80.0f),
                    PathNode.CurveTo(43.922955f, 57.759857f, 60.37242f, 38.92132f, 82.42f, 36.0f),
                    PathNode.CurveTo(82.57985f, 35.990067f, 82.74015f, 35.990067f, 82.9f, 36.0f),
                    PathNode.CurveTo(84.513596f, 36.013756f, 85.96091f, 36.995716f, 86.57f, 38.49f),
                    PathNode.LineTo(107.68f, 85.63f),
                    PathNode.CurveTo(108.179504f, 86.798416f, 108.09413f, 88.13465f, 107.45f, 89.23f),
                    PathNode.LineTo(86.26f, 114.43f),
                    PathNode.CurveTo(86.16f, 114.56f, 86.06f, 114.68f, 85.97f, 114.82f),
                    PathNode.CurveTo(83.674f, 118.33107f, 83.37826f, 122.78625f, 85.19f, 126.57f),
                    PathNode.CurveTo(93.88f, 144.36f, 111.8f, 162.15f, 129.79f, 170.84f),
                    PathNode.CurveTo(133.60014f, 172.64026f, 138.07538f, 172.31003f, 141.58f, 169.97f),
                    PathNode.LineTo(141.95f, 169.69f),
                    PathNode.LineTo(166.78f, 148.57f),
                    PathNode.CurveTo(167.85753f, 147.91171f, 169.18573f, 147.81126f, 170.35f, 148.3f),
                    PathNode.LineTo(217.56f, 169.46f),
                    PathNode.CurveTo(219.19629f, 170.1411f, 220.18925f, 171.81776f, 220.0f, 173.58f),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
