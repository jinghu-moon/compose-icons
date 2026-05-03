package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = phosphorLightIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.45f, 96.0f),
                    PathNode.CurveTo(202.65335f, 86.90371f, 209.16118f, 69.53371f, 204.43147f, 53.343967f),
                    PathNode.CurveTo(199.70174f, 37.15423f, 184.86646f, 26.019468f, 168.0f, 26.0f),
                    PathNode.LineTo(96.0f, 26.0f),
                    PathNode.CurveTo(79.13354f, 26.019468f, 64.29825f, 37.15423f, 59.568535f, 53.343967f),
                    PathNode.CurveTo(54.838818f, 69.53371f, 61.346645f, 86.90371f, 75.55f, 96.0f),
                    PathNode.CurveTo(64.38476f, 103.14802f, 57.751953f, 115.59827f, 58.04812f, 128.8523f),
                    PathNode.CurveTo(58.344288f, 142.10631f, 65.5266f, 154.24785f, 77.0f, 160.89f),
                    PathNode.CurveTo(60.188972f, 171.89244f, 53.524467f, 193.25984f, 61.099808f, 211.86842f),
                    PathNode.CurveTo(68.675156f, 230.47696f, 88.36848f, 241.1144f, 108.084175f, 237.2472f),
                    PathNode.CurveTo(127.79988f, 233.38f, 142.01558f, 216.09138f, 142.0f, 196.0f),
                    PathNode.LineTo(142.0f, 155.68f),
                    PathNode.CurveTo(152.48827f, 165.66089f, 167.73692f, 168.81453f, 181.32382f, 163.8127f),
                    PathNode.CurveTo(194.91074f, 158.81088f, 204.47475f, 146.52283f, 205.98788f, 132.12376f),
                    PathNode.CurveTo(207.50102f, 117.72472f, 200.70033f, 103.71696f, 188.45f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 64.0f),
                    PathNode.CurveTo(194.0f, 78.359406f, 182.3594f, 90.0f, 168.0f, 90.0f),
                    PathNode.LineTo(142.0f, 90.0f),
                    PathNode.LineTo(142.0f, 38.0f),
                    PathNode.LineTo(168.0f, 38.0f),
                    PathNode.CurveTo(182.3594f, 38.0f, 194.0f, 49.6406f, 194.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 64.0f),
                    PathNode.CurveTo(70.0f, 49.6406f, 81.640594f, 38.0f, 96.0f, 38.0f),
                    PathNode.LineTo(130.0f, 38.0f),
                    PathNode.LineTo(130.0f, 90.0f),
                    PathNode.LineTo(96.0f, 90.0f),
                    PathNode.CurveTo(81.640594f, 90.0f, 70.0f, 78.359406f, 70.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 154.0f),
                    PathNode.CurveTo(81.640594f, 154.0f, 70.0f, 142.3594f, 70.0f, 128.0f),
                    PathNode.CurveTo(70.0f, 113.640594f, 81.640594f, 102.0f, 96.0f, 102.0f),
                    PathNode.LineTo(130.0f, 102.0f),
                    PathNode.LineTo(130.0f, 154.0f),
                    PathNode.LineTo(96.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(130.0f, 196.0f),
                    PathNode.CurveTo(130.0f, 212.56854f, 116.56854f, 226.0f, 100.0f, 226.0f),
                    PathNode.CurveTo(83.43146f, 226.0f, 70.0f, 212.56854f, 70.0f, 196.0f),
                    PathNode.CurveTo(70.0f, 179.43146f, 83.43146f, 166.0f, 100.0f, 166.0f),
                    PathNode.LineTo(130.0f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 154.0f),
                    PathNode.CurveTo(153.6406f, 154.0f, 142.0f, 142.3594f, 142.0f, 128.0f),
                    PathNode.CurveTo(142.0f, 113.640594f, 153.6406f, 102.0f, 168.0f, 102.0f),
                    PathNode.CurveTo(182.3594f, 102.0f, 194.0f, 113.640594f, 194.0f, 128.0f),
                    PathNode.CurveTo(194.0f, 142.3594f, 182.3594f, 154.0f, 168.0f, 154.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
