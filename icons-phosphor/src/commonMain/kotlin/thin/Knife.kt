package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorThinIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.0f, 35.0f),
                    PathNode.CurveTo(219.69849f, 25.720913f, 204.64153f, 25.720913f, 195.34f, 35.0f),
                    PathNode.LineTo(21.17f, 209.22f),
                    PathNode.CurveTo(20.145061f, 210.24861f, 19.758059f, 211.75188f, 20.158895f, 213.14754f),
                    PathNode.CurveTo(20.559732f, 214.5432f, 21.685446f, 215.61201f, 23.1f, 215.94f),
                    PathNode.CurveTo(34.673977f, 218.63138f, 46.517223f, 219.99352f, 58.4f, 220.0f),
                    PathNode.CurveTo(97.81f, 220.0f, 130.67f, 204.92f, 153.18f, 190.4f),
                    PathNode.CurveTo(184.39f, 170.26f, 202.41f, 147.4f, 203.18f, 146.49f),
                    PathNode.CurveTo(204.42433f, 144.89882f, 204.28706f, 142.6296f, 202.86f, 141.2f),
                    PathNode.LineTo(179.67f, 118.0f),
                    PathNode.LineTo(229.0f, 68.63f),
                    PathNode.CurveTo(238.25368f, 59.32969f, 238.25368f, 44.300312f, 229.0f, 35.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.59f, 144.27f),
                    PathNode.CurveTo(181.13484f, 159.49225f, 165.6576f, 172.79932f, 148.59f, 183.82f),
                    PathNode.CurveTo(110.74f, 208.17f, 71.59f, 216.82f, 32.04f, 209.63f),
                    PathNode.LineTo(146.0f, 95.67f),
                    PathNode.Close,
                    PathNode.MoveTo(223.38f, 63.0f),
                    PathNode.LineTo(174.0f, 112.36f),
                    PathNode.LineTo(151.66f, 90.0f),
                    PathNode.LineTo(201.0f, 40.62f),
                    PathNode.CurveTo(207.18007f, 34.439934f, 217.19994f, 34.439934f, 223.38f, 40.62f),
                    PathNode.CurveTo(229.56006f, 46.800068f, 229.56006f, 56.819935f, 223.38f, 63.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _knife!!
    }

private var _knife: ImageVector? = null
