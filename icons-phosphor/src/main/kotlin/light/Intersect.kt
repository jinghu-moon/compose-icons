package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorLightIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.91f, 83.09f),
                    PathNode.CurveTo(166.34064f, 43.893257f, 131.35025f, 15.903645f, 91.66769f, 18.102404f),
                    PathNode.CurveTo(51.985115f, 20.301163f, 20.301163f, 51.985115f, 18.102404f, 91.66769f),
                    PathNode.CurveTo(15.903645f, 131.35025f, 43.893257f, 166.34064f, 83.09f, 172.91f),
                    PathNode.CurveTo(89.659355f, 212.10674f, 124.64974f, 240.09636f, 164.33232f, 237.8976f),
                    PathNode.CurveTo(204.0149f, 235.69884f, 235.69884f, 204.0149f, 237.8976f, 164.33232f),
                    PathNode.CurveTo(240.09636f, 124.64974f, 212.10674f, 89.659355f, 172.91f, 83.09f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 96.0f),
                    PathNode.CurveTo(30.01892f, 62.288624f, 55.440372f, 34.009834f, 88.95939f, 30.413647f),
                    PathNode.CurveTo(122.47841f, 26.817463f, 153.32018f, 49.05989f, 160.49f, 82.0f),
                    PathNode.LineTo(160.0f, 82.0f),
                    PathNode.CurveTo(116.94235f, 82.0496f, 82.0496f, 116.94235f, 82.0f, 160.0f),
                    PathNode.CurveTo(82.0f, 160.17f, 82.0f, 160.33f, 82.0f, 160.49f),
                    PathNode.CurveTo(51.674892f, 153.8689f, 30.041628f, 127.03948f, 30.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 160.0f),
                    PathNode.CurveTo(93.98879f, 150.51062f, 96.03584f, 141.13171f, 100.0f, 132.51f),
                    PathNode.LineTo(123.49f, 156.0f),
                    PathNode.CurveTo(114.86829f, 159.96416f, 105.48937f, 162.0112f, 96.0f, 162.0f),
                    PathNode.CurveTo(95.35f, 162.0f, 94.7f, 162.0f, 94.0f, 161.95f),
                    PathNode.CurveTo(94.0f, 161.3f, 94.0f, 160.65f, 94.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.23f, 149.75f),
                    PathNode.LineTo(106.23f, 121.75f),
                    PathNode.CurveTo(110.50756f, 115.75238f, 115.75238f, 110.50756f, 121.75f, 106.23f),
                    PathNode.LineTo(149.75f, 134.23f),
                    PathNode.CurveTo(145.47244f, 140.22762f, 140.22762f, 145.47244f, 134.23f, 149.75f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 96.0f),
                    PathNode.CurveTo(162.0112f, 105.48937f, 159.96416f, 114.86829f, 156.0f, 123.49f),
                    PathNode.LineTo(132.51f, 100.0f),
                    PathNode.CurveTo(141.13171f, 96.03584f, 150.51062f, 93.98879f, 160.0f, 94.0f),
                    PathNode.CurveTo(160.65f, 94.0f, 161.3f, 94.0f, 161.95f, 94.0f),
                    PathNode.CurveTo(162.0f, 94.7f, 162.0f, 95.35f, 162.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 226.0f),
                    PathNode.CurveTo(128.96051f, 225.95837f, 102.13111f, 204.3251f, 95.51f, 174.0f),
                    PathNode.LineTo(96.0f, 174.0f),
                    PathNode.CurveTo(139.05765f, 173.95041f, 173.95041f, 139.05765f, 174.0f, 96.0f),
                    PathNode.CurveTo(174.0f, 95.83f, 174.0f, 95.67f, 174.0f, 95.51f),
                    PathNode.CurveTo(206.94011f, 102.67982f, 229.18254f, 133.52159f, 225.58635f, 167.0406f),
                    PathNode.CurveTo(221.99017f, 200.55963f, 193.71138f, 225.98108f, 160.0f, 226.0f),
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
        return _intersect!!
    }

private var _intersect: ImageVector? = null
