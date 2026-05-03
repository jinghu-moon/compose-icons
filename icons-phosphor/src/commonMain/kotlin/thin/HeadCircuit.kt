package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) return _headCircuit!!
        _headCircuit = phosphorThinIcon(
            name = "HeadCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.25f, 169.77f),
                    PathNode.CurveTo(208.83018f, 153.37328f, 220.57356f, 128.30717f, 220.0f, 102.0f),
                    PathNode.CurveTo(219.0f, 58.36f, 184.1f, 22.38f, 140.55f, 20.09f),
                    PathNode.CurveTo(117.6826f, 18.848007f, 95.29948f, 26.996382f, 78.58233f, 42.64877f),
                    PathNode.CurveTo(61.865173f, 58.30116f, 52.263466f, 80.10041f, 52.0f, 103.0f),
                    PathNode.LineTo(29.1f, 147.0f),
                    PathNode.CurveTo(29.05f, 147.09f, 29.01f, 147.18f, 28.97f, 147.27f),
                    PathNode.CurveTo(26.466784f, 153.10912f, 28.94836f, 159.8874f, 34.63f, 162.73f),
                    PathNode.LineTo(34.76f, 162.79f),
                    PathNode.LineTo(60.0f, 174.38f),
                    PathNode.LineTo(60.0f, 208.0f),
                    PathNode.CurveTo(60.0f, 214.62741f, 65.37258f, 220.0f, 72.0f, 220.0f),
                    PathNode.LineTo(120.0f, 220.0f),
                    PathNode.CurveTo(122.20914f, 220.0f, 124.0f, 218.20914f, 124.0f, 216.0f),
                    PathNode.CurveTo(124.0f, 213.79086f, 122.20914f, 212.0f, 120.0f, 212.0f),
                    PathNode.LineTo(72.0f, 212.0f),
                    PathNode.CurveTo(69.79086f, 212.0f, 68.0f, 210.20914f, 68.0f, 208.0f),
                    PathNode.LineTo(68.0f, 171.81f),
                    PathNode.CurveTo(68.00028f, 170.24307f, 67.085625f, 168.82028f, 65.66f, 168.17f),
                    PathNode.LineTo(38.16f, 155.58f),
                    PathNode.CurveTo(36.349228f, 154.63728f, 35.53893f, 152.48222f, 36.28f, 150.58f),
                    PathNode.LineTo(59.55f, 105.86f),
                    PathNode.CurveTo(59.84426f, 105.28404f, 59.99844f, 104.646774f, 60.0f, 104.0f),
                    PathNode.CurveTo(60.02291f, 66.67638f, 87.144554f, 34.8932f, 124.0f, 29.0f),
                    PathNode.LineTo(124.0f, 52.4f),
                    PathNode.CurveTo(113.94015f, 54.45346f, 107.06932f, 63.790794f, 108.10128f, 74.006096f),
                    PathNode.CurveTo(109.13323f, 84.2214f, 117.732704f, 91.99592f, 128.0f, 91.99592f),
                    PathNode.CurveTo(138.2673f, 91.99592f, 146.86678f, 84.2214f, 147.89873f, 74.006096f),
                    PathNode.CurveTo(148.93068f, 63.790794f, 142.05986f, 54.45346f, 132.0f, 52.4f),
                    PathNode.LineTo(132.0f, 28.11f),
                    PathNode.CurveTo(134.70152f, 27.969995f, 137.40848f, 27.969995f, 140.11f, 28.11f),
                    PathNode.CurveTo(173.24f, 29.85f, 200.83f, 53.11f, 209.31f, 84.0f),
                    PathNode.LineTo(184.0f, 84.0f),
                    PathNode.CurveTo(182.81377f, 84.00104f, 181.6892f, 84.52853f, 180.93f, 85.44f),
                    PathNode.LineTo(153.47f, 118.44f),
                    PathNode.CurveTo(144.38528f, 113.514114f, 133.04614f, 116.27165f, 127.23802f, 124.81929f),
                    PathNode.CurveTo(121.4299f, 133.36693f, 123.0418f, 144.9247f, 130.96698f, 151.55704f),
                    PathNode.CurveTo(138.89217f, 158.18936f, 150.55312f, 157.73921f, 157.9434f, 150.51566f),
                    PathNode.CurveTo(165.33371f, 143.29208f, 166.04979f, 131.64444f, 159.6f, 123.57f),
                    PathNode.LineTo(185.87f, 92.0f),
                    PathNode.LineTo(211.0f, 92.0f),
                    PathNode.CurveTo(215.47797f, 119.85206f, 204.13959f, 147.88991f, 181.56f, 164.8f),
                    PathNode.CurveTo(180.41003f, 165.66177f, 179.81071f, 167.07419f, 179.99f, 168.5f),
                    PathNode.LineTo(187.99f, 232.5f),
                    PathNode.CurveTo(188.24341f, 234.51192f, 189.96225f, 236.0159f, 191.99f, 236.0f),
                    PathNode.LineTo(192.49f, 236.0f),
                    PathNode.CurveTo(193.55624f, 235.87785f, 194.52869f, 235.33235f, 195.18874f, 234.48611f),
                    PathNode.CurveTo(195.8488f, 233.63988f, 196.14113f, 232.5639f, 196.0f, 231.5f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 72.0f),
                    PathNode.CurveTo(140.0f, 78.62742f, 134.62741f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(121.37258f, 84.0f, 116.0f, 78.62742f, 116.0f, 72.0f),
                    PathNode.CurveTo(116.0f, 65.37258f, 121.37258f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(134.62741f, 60.0f, 140.0f, 65.37258f, 140.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 148.0f),
                    PathNode.CurveTo(137.37259f, 148.0f, 132.0f, 142.62741f, 132.0f, 136.0f),
                    PathNode.CurveTo(132.0f, 129.37259f, 137.37259f, 124.0f, 144.0f, 124.0f),
                    PathNode.CurveTo(150.62741f, 124.0f, 156.0f, 129.37259f, 156.0f, 136.0f),
                    PathNode.CurveTo(156.0f, 142.62741f, 150.62741f, 148.0f, 144.0f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
