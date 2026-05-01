package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorThinIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 112.0f),
                    PathNode.CurveTo(220.0f, 133.53f, 212.5f, 153.18f, 198.88f, 167.34f),
                    PathNode.CurveTo(186.26f, 180.47f, 169.17f, 188.0f, 152.0f, 188.0f),
                    PathNode.CurveTo(130.65f, 188.0f, 118.48f, 179.24f, 112.24f, 172.43f),
                    PathNode.LineTo(99.89f, 224.92f),
                    PathNode.CurveTo(99.463646f, 226.724f, 97.8537f, 227.99872f, 96.0f, 228.0f),
                    PathNode.CurveTo(95.690216f, 227.99738f, 95.381676f, 227.96048f, 95.08f, 227.89f),
                    PathNode.CurveTo(94.043144f, 227.65202f, 93.1438f, 227.01083f, 92.58082f, 226.10818f),
                    PathNode.CurveTo(92.017845f, 225.20555f, 91.837616f, 224.11583f, 92.08f, 223.08f),
                    PathNode.LineTo(124.08f, 87.08f),
                    PathNode.CurveTo(124.65175f, 85.00526f, 126.762566f, 83.75477f, 128.85687f, 84.25008f),
                    PathNode.CurveTo(130.95117f, 84.745384f, 132.27821f, 86.808945f, 131.86f, 88.92f),
                    PathNode.LineTo(114.58f, 162.37f),
                    PathNode.CurveTo(117.0f, 166.42f, 127.0f, 180.0f, 152.0f, 180.0f),
                    PathNode.CurveTo(181.49f, 180.0f, 212.0f, 154.56f, 212.0f, 112.0f),
                    PathNode.CurveTo(211.99121f, 80.05523f, 192.00711f, 51.52569f, 161.98799f, 40.60226f),
                    PathNode.CurveTo(131.96889f, 29.678835f, 98.323135f, 38.693417f, 77.78649f, 63.162067f),
                    PathNode.CurveTo(57.24985f, 87.630714f, 54.206406f, 122.32994f, 70.17f, 150.0f),
                    PathNode.CurveTo(71.27457f, 151.91367f, 70.61867f, 154.36043f, 68.705f, 155.465f),
                    PathNode.CurveTo(66.791336f, 156.56956f, 64.34457f, 155.91367f, 63.24f, 154.0f),
                    PathNode.CurveTo(45.59653f, 123.41729f, 48.960644f, 85.06584f, 71.659004f, 58.02184f),
                    PathNode.CurveTo(94.35738f, 30.977835f, 131.5445f, 21.014458f, 164.72333f, 33.087536f),
                    PathNode.CurveTo(197.90216f, 45.160618f, 219.9899f, 76.69286f, 220.0f, 112.0f),
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
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
