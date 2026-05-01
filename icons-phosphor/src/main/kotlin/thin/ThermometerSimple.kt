package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorThinIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 156.29f),
                    PathNode.LineTo(132.0f, 88.0f),
                    PathNode.CurveTo(132.0f, 85.79086f, 130.20914f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(125.79086f, 84.0f, 124.0f, 85.79086f, 124.0f, 88.0f),
                    PathNode.LineTo(124.0f, 156.29f),
                    PathNode.CurveTo(109.46469f, 158.38799f, 99.020195f, 171.35973f, 100.07189f, 186.00797f),
                    PathNode.CurveTo(101.12358f, 200.65619f, 113.314064f, 212.0028f, 128.0f, 212.0028f),
                    PathNode.CurveTo(142.68594f, 212.0028f, 154.87642f, 200.65619f, 155.92812f, 186.00797f),
                    PathNode.CurveTo(156.97981f, 171.35973f, 146.53531f, 158.38799f, 132.0f, 156.29f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.0f),
                    PathNode.CurveTo(116.95431f, 204.0f, 108.0f, 195.0457f, 108.0f, 184.0f),
                    PathNode.CurveTo(108.0f, 172.9543f, 116.95431f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(139.0457f, 164.0f, 148.0f, 172.9543f, 148.0f, 184.0f),
                    PathNode.CurveTo(148.0f, 195.0457f, 139.0457f, 204.0f, 128.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 136.0f),
                    PathNode.LineTo(164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 28.117748f, 147.88223f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(108.11775f, 12.0f, 92.0f, 28.117748f, 92.0f, 48.0f),
                    PathNode.LineTo(92.0f, 136.0f),
                    PathNode.CurveTo(71.33934f, 151.4955f, 62.91216f, 178.47314f, 71.079f, 202.97366f),
                    PathNode.CurveTo(79.24584f, 227.4742f, 102.17418f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(153.82582f, 244.0f, 176.75415f, 227.4742f, 184.921f, 202.97366f),
                    PathNode.CurveTo(193.08784f, 178.47314f, 184.66066f, 151.4955f, 164.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 236.0f),
                    PathNode.CurveTo(105.27695f, 236.00195f, 85.184135f, 221.24947f, 78.38087f, 199.56877f),
                    PathNode.CurveTo(71.5776f, 177.88808f, 79.63962f, 154.30077f, 98.29f, 141.32f),
                    PathNode.CurveTo(99.37333f, 140.56366f, 100.01329f, 139.32117f, 100.0f, 138.0f),
                    PathNode.LineTo(100.0f, 48.0f),
                    PathNode.CurveTo(100.0f, 32.536026f, 112.536026f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(143.46397f, 20.0f, 156.0f, 32.536026f, 156.0f, 48.0f),
                    PathNode.LineTo(156.0f, 138.0f),
                    PathNode.CurveTo(155.99988f, 139.30705f, 156.63835f, 140.53171f, 157.71f, 141.28f),
                    PathNode.CurveTo(176.39725f, 154.24904f, 184.48634f, 177.8588f, 177.67862f, 199.56282f),
                    PathNode.CurveTo(170.87091f, 221.26685f, 150.74663f, 236.02716f, 128.0f, 236.0f),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
