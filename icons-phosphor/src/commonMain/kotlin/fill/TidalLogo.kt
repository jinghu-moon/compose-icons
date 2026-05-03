package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) return _tidalLogo!!
        _tidalLogo = phosphorFillIcon(
            name = "TidalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(253.66f, 101.66f),
                    PathNode.LineTo(217.66f, 137.66f),
                    PathNode.CurveTo(216.15945f, 139.16223f, 214.12328f, 140.00629f, 212.0f, 140.00629f),
                    PathNode.CurveTo(209.87672f, 140.00629f, 207.84055f, 139.16223f, 206.34f, 137.66f),
                    PathNode.LineTo(170.34f, 101.66f),
                    PathNode.LineTo(170.0f, 101.28f),
                    PathNode.LineTo(169.66f, 101.66f),
                    PathNode.LineTo(135.31f, 136.0f),
                    PathNode.LineTo(169.66f, 170.34f),
                    PathNode.CurveTo(171.16223f, 171.84055f, 172.00629f, 173.87672f, 172.00629f, 176.0f),
                    PathNode.CurveTo(172.00629f, 178.12328f, 171.16223f, 180.15945f, 169.66f, 181.66f),
                    PathNode.LineTo(133.66f, 217.66f),
                    PathNode.CurveTo(132.15945f, 219.16223f, 130.12328f, 220.00629f, 128.0f, 220.00629f),
                    PathNode.CurveTo(125.876724f, 220.00629f, 123.840546f, 219.16223f, 122.34f, 217.66f),
                    PathNode.LineTo(86.34f, 181.66f),
                    PathNode.CurveTo(84.83778f, 180.15945f, 83.993706f, 178.12328f, 83.993706f, 176.0f),
                    PathNode.CurveTo(83.993706f, 173.87672f, 84.83778f, 171.84055f, 86.34f, 170.34f),
                    PathNode.LineTo(120.69f, 136.0f),
                    PathNode.LineTo(86.34f, 101.66f),
                    PathNode.LineTo(86.0f, 101.28f),
                    PathNode.LineTo(85.66f, 101.66f),
                    PathNode.LineTo(49.66f, 137.66f),
                    PathNode.CurveTo(48.159454f, 139.16223f, 46.123276f, 140.00629f, 44.0f, 140.00629f),
                    PathNode.CurveTo(41.876724f, 140.00629f, 39.840546f, 139.16223f, 38.34f, 137.66f),
                    PathNode.LineTo(2.34f, 101.66f),
                    PathNode.CurveTo(0.837784f, 100.159454f, -0.006293f, 98.123276f, -0.006293f, 96.0f),
                    PathNode.CurveTo(-0.006293f, 93.876724f, 0.837784f, 91.840546f, 2.34f, 90.34f),
                    PathNode.LineTo(38.34f, 54.34f),
                    PathNode.CurveTo(39.840546f, 52.837784f, 41.876724f, 51.993706f, 44.0f, 51.993706f),
                    PathNode.CurveTo(46.123276f, 51.993706f, 48.159454f, 52.837784f, 49.66f, 54.34f),
                    PathNode.LineTo(85.66f, 90.34f),
                    PathNode.LineTo(86.0f, 90.72f),
                    PathNode.LineTo(86.34f, 90.34f),
                    PathNode.LineTo(122.34f, 54.34f),
                    PathNode.CurveTo(123.840546f, 52.837784f, 125.876724f, 51.993706f, 128.0f, 51.993706f),
                    PathNode.CurveTo(130.12328f, 51.993706f, 132.15945f, 52.837784f, 133.66f, 54.34f),
                    PathNode.LineTo(169.66f, 90.34f),
                    PathNode.LineTo(170.0f, 90.72f),
                    PathNode.LineTo(170.34f, 90.34f),
                    PathNode.LineTo(206.34f, 54.34f),
                    PathNode.CurveTo(207.84055f, 52.837784f, 209.87672f, 51.993706f, 212.0f, 51.993706f),
                    PathNode.CurveTo(214.12328f, 51.993706f, 216.15945f, 52.837784f, 217.66f, 54.34f),
                    PathNode.LineTo(253.66f, 90.34f),
                    PathNode.CurveTo(255.16223f, 91.840546f, 256.0063f, 93.876724f, 256.0063f, 96.0f),
                    PathNode.CurveTo(256.0063f, 98.123276f, 255.16223f, 100.159454f, 253.66f, 101.66f),
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
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
