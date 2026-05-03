package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) return _bellSimpleRinging!!
        _bellSimpleRinging = phosphorFillIcon(
            name = "BellSimpleRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 228.41827f, 164.41827f, 232.0f, 160.0f, 232.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(91.58172f, 232.0f, 88.0f, 228.41827f, 88.0f, 224.0f),
                    PathNode.CurveTo(88.0f, 219.58173f, 91.58172f, 216.0f, 96.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(164.41827f, 216.0f, 168.0f, 219.58173f, 168.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.39f, 60.32f),
                    PathNode.CurveTo(218.39873f, 42.746544f, 204.89777f, 27.878916f, 188.27f, 17.24f),
                    PathNode.CurveTo(185.85266f, 15.695841f, 182.79361f, 15.564074f, 180.25244f, 16.894648f),
                    PathNode.CurveTo(177.71129f, 18.225224f, 176.07698f, 20.814468f, 175.96906f, 23.680878f),
                    PathNode.CurveTo(175.86111f, 26.547285f, 177.29608f, 29.2521f, 179.73f, 30.77f),
                    PathNode.CurveTo(193.99582f, 39.845f, 205.55397f, 52.594906f, 213.19f, 67.68f),
                    PathNode.CurveTo(215.28824f, 71.47142f, 220.02373f, 72.903f, 223.87097f, 70.90894f),
                    PathNode.CurveTo(227.7182f, 68.91488f, 229.2784f, 64.22019f, 227.39f, 60.32f),
                    PathNode.Close,
                    PathNode.MoveTo(35.71f, 72.0f),
                    PathNode.CurveTo(38.697666f, 71.99875f, 41.435673f, 70.3328f, 42.81f, 67.68f),
                    PathNode.CurveTo(50.446026f, 52.594906f, 62.004185f, 39.845f, 76.27f, 30.77f),
                    PathNode.CurveTo(78.70391f, 29.2521f, 80.13888f, 26.547285f, 80.03095f, 23.680878f),
                    PathNode.CurveTo(79.92303f, 20.814468f, 78.28872f, 18.225224f, 75.74755f, 16.894648f),
                    PathNode.CurveTo(73.20639f, 15.564074f, 70.14734f, 15.695841f, 67.73f, 17.24f),
                    PathNode.CurveTo(51.102234f, 27.878916f, 37.601265f, 42.746544f, 28.61f, 60.32f),
                    PathNode.CurveTo(27.32547f, 62.799477f, 27.426773f, 65.76931f, 28.877277f, 68.15549f),
                    PathNode.CurveTo(30.32778f, 70.54167f, 32.917545f, 71.99883f, 35.71f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 112.0f),
                    PathNode.CurveTo(208.0f, 67.81722f, 172.18279f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(83.81722f, 32.0f, 48.0f, 67.81722f, 48.0f, 112.0f),
                    PathNode.CurveTo(48.0f, 138.28f, 43.22f, 160.39f, 34.19f, 175.94f),
                    PathNode.CurveTo(31.305237f, 180.8869f, 31.284256f, 186.99834f, 34.134987f, 191.96494f),
                    PathNode.CurveTo(36.985718f, 196.9315f, 42.27343f, 199.99585f, 48.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(213.72299f, 199.98871f, 219.00417f, 196.92154f, 221.85f, 191.95627f),
                    PathNode.CurveTo(224.69586f, 186.991f, 224.67297f, 180.8838f, 221.79f, 175.94f),
                    PathNode.CurveTo(212.78f, 160.38f, 208.0f, 138.27f, 208.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
