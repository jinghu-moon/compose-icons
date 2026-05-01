package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorThinIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 20.0f),
                    PathNode.CurveTo(124.91799f, 20.002125f, 97.32673f, 39.898937f, 87.51f, 69.39f),
                    PathNode.CurveTo(69.516304f, 64.96295f, 50.581413f, 71.288605f, 38.8618f, 85.64209f),
                    PathNode.CurveTo(27.142185f, 99.995575f, 24.731247f, 119.81302f, 32.66753f, 136.55779f),
                    PathNode.CurveTo(40.603817f, 153.30257f, 57.469707f, 163.98364f, 76.0f, 164.0f),
                    PathNode.LineTo(120.94f, 164.0f),
                    PathNode.LineTo(100.57f, 197.94f),
                    PathNode.CurveTo(99.82751f, 199.17584f, 99.807526f, 200.71562f, 100.517685f, 201.9703f),
                    PathNode.CurveTo(101.227844f, 203.225f, 102.55827f, 204.00044f, 104.0f, 204.0f),
                    PathNode.LineTo(136.94f, 204.0f),
                    PathNode.LineTo(116.57f, 237.94f),
                    PathNode.CurveTo(115.4323f, 239.83434f, 116.04566f, 242.2923f, 117.94f, 243.43f),
                    PathNode.CurveTo(119.834335f, 244.5677f, 122.29229f, 243.95433f, 123.43f, 242.06f),
                    PathNode.LineTo(147.43f, 202.06f),
                    PathNode.CurveTo(148.17249f, 200.82416f, 148.19247f, 199.28438f, 147.48232f, 198.0297f),
                    PathNode.CurveTo(146.77216f, 196.775f, 145.44173f, 195.99956f, 144.0f, 196.0f),
                    PathNode.LineTo(111.06f, 196.0f),
                    PathNode.LineTo(130.26f, 164.0f),
                    PathNode.LineTo(156.0f, 164.0f),
                    PathNode.CurveTo(195.7645f, 164.0f, 228.0f, 131.7645f, 228.0f, 92.0f),
                    PathNode.CurveTo(228.0f, 52.235497f, 195.7645f, 20.0f, 156.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 156.0f),
                    PathNode.LineTo(76.0f, 156.0f),
                    PathNode.CurveTo(60.577026f, 155.98811f, 46.53481f, 147.11037f, 39.90952f, 133.1829f),
                    PathNode.CurveTo(33.284233f, 119.25546f, 35.256275f, 102.75972f, 44.97795f, 90.78653f),
                    PathNode.CurveTo(54.699627f, 78.81334f, 70.43886f, 73.49591f, 85.43f, 77.12f),
                    PathNode.CurveTo(84.687355f, 80.62919f, 84.20934f, 84.1892f, 84.0f, 87.77f),
                    PathNode.CurveTo(83.87298f, 89.97914f, 85.56086f, 91.87298f, 87.77f, 92.0f),
                    PathNode.CurveTo(89.97914f, 92.12702f, 91.87298f, 90.43914f, 92.0f, 88.23f),
                    PathNode.CurveTo(94.0207f, 53.397625f, 123.545525f, 26.588272f, 158.41077f, 27.927202f),
                    PathNode.CurveTo(193.276f, 29.266134f, 220.65778f, 58.260868f, 220.00113f, 93.14563f),
                    PathNode.CurveTo(219.34448f, 128.0304f, 190.89093f, 155.97412f, 156.0f, 156.0f),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
