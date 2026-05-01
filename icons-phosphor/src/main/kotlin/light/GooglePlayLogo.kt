package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorLightIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.84f, 115.93f),
                    PathNode.LineTo(71.0f, 19.89f),
                    PathNode.CurveTo(66.63799f, 17.342688f, 61.24201f, 17.342688f, 56.88f, 19.89f),
                    PathNode.CurveTo(52.590633f, 22.347002f, 49.960426f, 26.92693f, 50.0f, 31.87f),
                    PathNode.LineTo(50.0f, 224.13f),
                    PathNode.CurveTo(49.983074f, 229.06712f, 52.627743f, 233.63033f, 56.92f, 236.07f),
                    PathNode.CurveTo(61.282005f, 238.61731f, 66.67799f, 238.61731f, 71.04f, 236.07f),
                    PathNode.LineTo(238.84f, 140.07f),
                    PathNode.CurveTo(243.25624f, 137.66022f, 246.00383f, 133.03093f, 246.00383f, 128.0f),
                    PathNode.CurveTo(246.00383f, 122.96906f, 243.25624f, 118.33979f, 238.84f, 115.93f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 217.5f),
                    PathNode.LineTo(62.0f, 38.5f),
                    PathNode.LineTo(151.51f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 136.5f),
                    PathNode.LineTo(182.19f, 158.69f),
                    PathNode.LineTo(78.4f, 218.07f),
                    PathNode.Close,
                    PathNode.MoveTo(78.4f, 37.93f),
                    PathNode.LineTo(182.19f, 97.33f),
                    PathNode.LineTo(160.0f, 119.52f),
                    PathNode.Close,
                    PathNode.MoveTo(233.0f, 129.58f),
                    PathNode.LineTo(232.9f, 129.64f),
                    PathNode.LineTo(193.0f, 152.49f),
                    PathNode.LineTo(168.49f, 128.0f),
                    PathNode.LineTo(193.0f, 103.51f),
                    PathNode.LineTo(232.94f, 126.36f),
                    PathNode.LineTo(233.04f, 126.42f),
                    PathNode.CurveTo(233.6427f, 126.71577f, 234.02463f, 127.32864f, 234.02463f, 128.0f),
                    PathNode.CurveTo(234.02463f, 128.67136f, 233.6427f, 129.28424f, 233.04f, 129.58f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
