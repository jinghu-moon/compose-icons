package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorLightIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.62f, 58.38f),
                    PathNode.CurveTo(199.7411f, 36.567627f, 164.3389f, 36.567627f, 142.46f, 58.38f),
                    PathNode.LineTo(128.0f, 72.24f),
                    PathNode.LineTo(113.56f, 58.34f),
                    PathNode.CurveTo(91.68676f, 36.469524f, 56.225475f, 36.471764f, 34.355f, 58.345f),
                    PathNode.CurveTo(12.484524f, 80.21824f, 12.486762f, 115.67953f, 34.36f, 137.55f),
                    PathNode.LineTo(123.73f, 228.21f),
                    PathNode.CurveTo(124.85774f, 229.35515f, 126.39777f, 229.99997f, 128.005f, 229.99997f),
                    PathNode.CurveTo(129.61223f, 229.99997f, 131.15225f, 229.35515f, 132.28f, 228.21f),
                    PathNode.LineTo(221.61f, 137.58f),
                    PathNode.CurveTo(243.45174f, 115.69924f, 243.4562f, 80.26627f, 221.62f, 58.38f),
                    PathNode.Close,
                    PathNode.MoveTo(213.11f, 129.13f),
                    PathNode.LineTo(128.0f, 215.45f),
                    PathNode.LineTo(42.89f, 129.1f),
                    PathNode.CurveTo(25.702898f, 111.91566f, 25.70066f, 84.0521f, 42.885f, 66.865f),
                    PathNode.CurveTo(60.06934f, 49.6779f, 87.9329f, 49.67566f, 105.12f, 66.86f),
                    PathNode.LineTo(105.2f, 66.94f),
                    PathNode.LineTo(119.36f, 80.58f),
                    PathNode.LineTo(107.85f, 91.66f),
                    PathNode.CurveTo(106.69114f, 92.77735f, 106.029884f, 94.31351f, 106.01484f, 95.923225f),
                    PathNode.CurveTo(105.999794f, 97.53294f, 106.632225f, 99.081184f, 107.77f, 100.22f),
                    PathNode.LineTo(135.53f, 128.0f),
                    PathNode.LineTo(123.77f, 139.76f),
                    PathNode.CurveTo(122.2346f, 141.27243f, 121.628334f, 143.49217f, 122.18174f, 145.57512f),
                    PathNode.CurveTo(122.73512f, 147.65807f, 124.36317f, 149.28418f, 126.44676f, 149.83513f),
                    PathNode.CurveTo(128.53035f, 150.38606f, 130.74937f, 149.77716f, 132.26f, 148.24f),
                    PathNode.LineTo(148.26f, 132.24f),
                    PathNode.CurveTo(149.38666f, 131.1146f, 150.01971f, 129.58745f, 150.01971f, 127.995f),
                    PathNode.CurveTo(150.01971f, 126.40254f, 149.38666f, 124.875404f, 148.26f, 123.75f),
                    PathNode.LineTo(120.58f, 96.06f),
                    PathNode.LineTo(150.82f, 66.94f),
                    PathNode.CurveTo(150.8515f, 66.91865f, 150.87865f, 66.8915f, 150.9f, 66.86f),
                    PathNode.CurveTo(168.09538f, 49.681183f, 195.96118f, 49.694614f, 213.14f, 66.89f),
                    PathNode.CurveTo(230.31882f, 84.085396f, 230.30539f, 111.95118f, 213.11f, 129.13f),
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
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
