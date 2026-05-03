package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) return _thermometerHot!!
        _thermometerHot = phosphorThinIcon(
            name = "ThermometerHot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 156.29f),
                    PathNode.LineTo(124.0f, 48.0f),
                    PathNode.CurveTo(124.0f, 45.79086f, 122.20914f, 44.0f, 120.0f, 44.0f),
                    PathNode.CurveTo(117.79086f, 44.0f, 116.0f, 45.79086f, 116.0f, 48.0f),
                    PathNode.LineTo(116.0f, 156.29f),
                    PathNode.CurveTo(101.46469f, 158.38799f, 91.020195f, 171.35973f, 92.07189f, 186.00797f),
                    PathNode.CurveTo(93.12358f, 200.65619f, 105.314064f, 212.0028f, 120.0f, 212.0028f),
                    PathNode.CurveTo(134.68594f, 212.0028f, 146.87642f, 200.65619f, 147.92812f, 186.00797f),
                    PathNode.CurveTo(148.97981f, 171.35973f, 138.53531f, 158.38799f, 124.0f, 156.29f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 204.0f),
                    PathNode.CurveTo(108.95431f, 204.0f, 100.0f, 195.0457f, 100.0f, 184.0f),
                    PathNode.CurveTo(100.0f, 172.9543f, 108.95431f, 164.0f, 120.0f, 164.0f),
                    PathNode.CurveTo(131.0457f, 164.0f, 140.0f, 172.9543f, 140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 195.0457f, 131.0457f, 204.0f, 120.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 136.0f),
                    PathNode.LineTo(156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 28.117748f, 139.88223f, 12.0f, 120.0f, 12.0f),
                    PathNode.CurveTo(100.11775f, 12.0f, 84.0f, 28.117748f, 84.0f, 48.0f),
                    PathNode.LineTo(84.0f, 136.0f),
                    PathNode.CurveTo(63.33934f, 151.4955f, 54.91216f, 178.47314f, 63.079002f, 202.97366f),
                    PathNode.CurveTo(71.24584f, 227.4742f, 94.17418f, 244.0f, 120.0f, 244.0f),
                    PathNode.CurveTo(145.82582f, 244.0f, 168.75415f, 227.4742f, 176.921f, 202.97366f),
                    PathNode.CurveTo(185.08784f, 178.47314f, 176.66066f, 151.4955f, 156.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 236.0f),
                    PathNode.CurveTo(97.27695f, 236.00195f, 77.184135f, 221.24947f, 70.38087f, 199.56877f),
                    PathNode.CurveTo(63.577595f, 177.88808f, 71.63962f, 154.30077f, 90.29f, 141.32f),
                    PathNode.CurveTo(91.37333f, 140.56366f, 92.01329f, 139.32117f, 92.0f, 138.0f),
                    PathNode.LineTo(92.0f, 48.0f),
                    PathNode.CurveTo(92.0f, 32.536026f, 104.536026f, 20.0f, 120.0f, 20.0f),
                    PathNode.CurveTo(135.46397f, 20.0f, 148.0f, 32.536026f, 148.0f, 48.0f),
                    PathNode.LineTo(148.0f, 138.0f),
                    PathNode.CurveTo(147.99988f, 139.30705f, 148.63835f, 140.53171f, 149.71f, 141.28f),
                    PathNode.CurveTo(168.39725f, 154.24904f, 176.48634f, 177.8588f, 169.67862f, 199.56282f),
                    PathNode.CurveTo(162.87091f, 221.26685f, 142.74663f, 236.02716f, 120.0f, 236.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.65f, 78.59f),
                    PathNode.CurveTo(180.06949f, 77.700485f, 179.86661f, 76.616615f, 180.08609f, 75.57736f),
                    PathNode.CurveTo(180.30557f, 74.53811f, 180.9294f, 73.62882f, 181.82f, 73.05f),
                    PathNode.CurveTo(195.06f, 64.42f, 204.89f, 68.62f, 213.57f, 72.32f),
                    PathNode.CurveTo(221.72f, 75.8f, 228.15f, 78.54f, 237.82f, 72.25f),
                    PathNode.CurveTo(239.01682f, 71.401855f, 240.58186f, 71.27684f, 241.89815f, 71.92423f),
                    PathNode.CurveTo(243.21443f, 72.57162f, 244.07077f, 73.88756f, 244.12958f, 75.35325f),
                    PathNode.CurveTo(244.18837f, 76.81895f, 243.4402f, 78.19925f, 242.18f, 78.95f),
                    PathNode.CurveTo(236.43f, 82.7f, 231.32f, 84.0f, 226.67f, 84.0f),
                    PathNode.CurveTo(220.61f, 84.0f, 215.34f, 81.75f, 210.43f, 79.66f),
                    PathNode.CurveTo(202.28f, 76.19f, 195.85f, 73.44f, 186.18f, 79.73f),
                    PathNode.CurveTo(184.3373f, 80.93789f, 181.86476f, 80.428185f, 180.65f, 78.59f),
                    PathNode.Close,
                    PathNode.MoveTo(243.35f, 105.41f),
                    PathNode.CurveTo(243.93051f, 106.299515f, 244.13339f, 107.383385f, 243.91391f, 108.42264f),
                    PathNode.CurveTo(243.69443f, 109.46189f, 243.0706f, 110.37118f, 242.18f, 110.95f),
                    PathNode.CurveTo(236.43f, 114.7f, 231.32f, 116.02f, 226.67f, 116.02f),
                    PathNode.CurveTo(220.61f, 116.02f, 215.34f, 113.77f, 210.43f, 111.68f),
                    PathNode.CurveTo(202.28f, 108.21f, 195.85f, 105.46f, 186.18f, 111.75f),
                    PathNode.CurveTo(184.98318f, 112.598145f, 183.41814f, 112.72316f, 182.10185f, 112.07577f),
                    PathNode.CurveTo(180.78557f, 111.42838f, 179.92923f, 110.11244f, 179.87042f, 108.64675f),
                    PathNode.CurveTo(179.81163f, 107.18105f, 180.5598f, 105.80075f, 181.82f, 105.05f),
                    PathNode.CurveTo(195.06f, 96.42f, 204.89f, 100.62f, 213.57f, 104.32f),
                    PathNode.CurveTo(221.72f, 107.8f, 228.15f, 110.54f, 237.82f, 104.25f),
                    PathNode.CurveTo(239.6679f, 103.04595f, 242.14171f, 103.56487f, 243.35f, 105.41f),
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
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
