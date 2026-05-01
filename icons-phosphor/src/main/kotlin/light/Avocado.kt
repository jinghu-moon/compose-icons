package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorLightIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 114.0f),
                    PathNode.CurveTo(102.5949f, 114.0f, 82.0f, 134.5949f, 82.0f, 160.0f),
                    PathNode.CurveTo(82.0f, 185.4051f, 102.5949f, 206.0f, 128.0f, 206.0f),
                    PathNode.CurveTo(153.4051f, 206.0f, 174.0f, 185.4051f, 174.0f, 160.0f),
                    PathNode.CurveTo(173.96695f, 134.60861f, 153.39139f, 114.03306f, 128.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 194.0f),
                    PathNode.CurveTo(109.22232f, 194.0f, 94.0f, 178.77768f, 94.0f, 160.0f),
                    PathNode.CurveTo(94.0f, 141.22232f, 109.22232f, 126.0f, 128.0f, 126.0f),
                    PathNode.CurveTo(146.77768f, 126.0f, 162.0f, 141.22232f, 162.0f, 160.0f),
                    PathNode.CurveTo(162.0f, 178.77768f, 146.77768f, 194.0f, 128.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.1f, 131.32f),
                    PathNode.LineTo(179.3f, 47.11f),
                    PathNode.CurveTo(172.08287f, 25.156076f, 151.6956f, 10.228189f, 128.58719f, 9.977256f),
                    PathNode.CurveTo(105.47878f, 9.726323f, 84.77216f, 24.207975f, 77.08f, 46.0f),
                    PathNode.LineTo(77.08f, 46.0f),
                    PathNode.LineTo(47.56f, 129.52f),
                    PathNode.CurveTo(34.111122f, 165.08632f, 45.6151f, 205.26291f, 75.850204f, 228.32097f),
                    PathNode.CurveTo(106.08531f, 251.37903f, 147.87387f, 251.84467f, 178.61526f, 229.46606f),
                    PathNode.CurveTo(209.35666f, 207.08746f, 221.75302f, 167.17717f, 209.1f, 131.32f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 234.0f),
                    PathNode.CurveTo(103.67843f, 233.984f, 80.91535f, 222.02565f, 67.10159f, 202.00768f),
                    PathNode.CurveTo(53.287834f, 181.98972f, 50.184803f, 156.46461f, 58.8f, 133.72f),
                    PathNode.CurveTo(58.8f, 133.67f, 58.8f, 133.63f, 58.85f, 133.59f),
                    PathNode.LineTo(88.39f, 50.0f),
                    PathNode.LineTo(88.39f, 50.0f),
                    PathNode.CurveTo(94.373375f, 33.035004f, 110.49653f, 21.764305f, 128.48454f, 21.97239f),
                    PathNode.CurveTo(146.47255f, 22.180475f, 162.33067f, 33.82113f, 167.92f, 50.92f),
                    PathNode.CurveTo(167.92f, 50.92f, 167.92f, 51.0f, 167.97f, 51.05f),
                    PathNode.LineTo(197.79f, 135.33f),
                    PathNode.CurveTo(205.77089f, 157.98245f, 202.27151f, 183.09851f, 188.40254f, 202.70667f),
                    PathNode.CurveTo(174.53355f, 222.31482f, 152.01724f, 233.98006f, 128.0f, 234.0f),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
