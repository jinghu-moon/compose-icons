package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorThinIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 60.0f),
                    PathNode.CurveTo(198.74516f, 60.0f, 188.0f, 70.74516f, 188.0f, 84.0f),
                    PathNode.CurveTo(188.0f, 97.25484f, 198.74516f, 108.0f, 212.0f, 108.0f),
                    PathNode.CurveTo(225.25484f, 108.0f, 236.0f, 97.25484f, 236.0f, 84.0f),
                    PathNode.CurveTo(236.0f, 70.74516f, 225.25484f, 60.0f, 212.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 100.0f),
                    PathNode.CurveTo(203.16344f, 100.0f, 196.0f, 92.836555f, 196.0f, 84.0f),
                    PathNode.CurveTo(196.0f, 75.163445f, 203.16344f, 68.0f, 212.0f, 68.0f),
                    PathNode.CurveTo(220.83656f, 68.0f, 228.0f, 75.163445f, 228.0f, 84.0f),
                    PathNode.CurveTo(228.0f, 92.836555f, 220.83656f, 100.0f, 212.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 156.29f),
                    PathNode.LineTo(124.0f, 88.0f),
                    PathNode.CurveTo(124.0f, 85.79086f, 122.20914f, 84.0f, 120.0f, 84.0f),
                    PathNode.CurveTo(117.79086f, 84.0f, 116.0f, 85.79086f, 116.0f, 88.0f),
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
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
