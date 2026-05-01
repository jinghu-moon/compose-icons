package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorRegularIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.00243f, 174.66388f, 190.44902f, 214.57079f, 144.47766f, 222.58028f),
                    PathNode.CurveTo(98.5063f, 230.58978f, 53.433823f, 204.38171f, 37.654842f, 160.46654f),
                    PathNode.CurveTo(21.87586f, 116.55137f, 39.961185f, 67.65032f, 80.51748f, 44.56992f),
                    PathNode.CurveTo(121.07378f, 21.489515f, 172.35281f, 30.915615f, 202.05f, 66.91f),
                    PathNode.CurveTo(203.99478f, 69.09825f, 204.58896f, 72.17403f, 203.59915f, 74.929184f),
                    PathNode.CurveTo(202.60934f, 77.68434f, 200.19365f, 79.6788f, 197.30095f, 80.129166f),
                    PathNode.CurveTo(194.40823f, 80.57953f, 191.50055f, 79.41385f, 189.72f, 77.09f),
                    PathNode.CurveTo(165.45824f, 47.67215f, 123.805855f, 39.467052f, 90.199615f, 57.48549f),
                    PathNode.CurveTo(56.593384f, 75.50393f, 40.375572f, 114.736916f, 51.450268f, 151.22519f),
                    PathNode.CurveTo(62.524963f, 187.71347f, 97.813484f, 211.31357f, 135.76543f, 207.61311f),
                    PathNode.CurveTo(173.71736f, 203.91266f, 203.78238f, 173.94034f, 207.6f, 136.0f),
                    PathNode.LineTo(128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 123.58172f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(220.41827f, 120.0f, 224.0f, 123.58172f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
