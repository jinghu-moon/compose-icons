package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorLightIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.34f, 52.86f),
                    PathNode.CurveTo(160.03452f, 39.879887f, 146.18071f, 28.460995f, 131.09f, 18.86f),
                    PathNode.CurveTo(129.1884f, 17.717522f, 126.81159f, 17.717522f, 124.91f, 18.86f),
                    PathNode.CurveTo(109.8193f, 28.460995f, 95.96549f, 39.879887f, 83.66f, 52.86f),
                    PathNode.CurveTo(56.4f, 81.48f, 42.0f, 113.0f, 42.0f, 144.0f),
                    PathNode.CurveTo(42.0f, 191.49649f, 80.50351f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(175.49649f, 230.0f, 214.0f, 191.49649f, 214.0f, 144.0f),
                    PathNode.CurveTo(214.0f, 113.0f, 199.6f, 81.48f, 172.34f, 52.86f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 184.0f),
                    PathNode.CurveTo(94.0f, 154.2f, 119.11f, 133.59f, 128.0f, 127.22f),
                    PathNode.CurveTo(136.91f, 133.57f, 162.0f, 154.09f, 162.0f, 184.0f),
                    PathNode.CurveTo(161.99873f, 202.10489f, 147.82957f, 217.04291f, 129.75f, 218.0f),
                    PathNode.CurveTo(129.16f, 218.0f, 128.59f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(127.41f, 218.0f, 126.84f, 218.0f, 126.25f, 218.0f),
                    PathNode.CurveTo(108.170425f, 217.04291f, 94.001274f, 202.10489f, 94.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.42f, 205.94f),
                    PathNode.CurveTo(172.09145f, 199.21071f, 174.01036f, 191.66568f, 174.0f, 184.0f),
                    PathNode.CurveTo(174.0f, 141.1f, 132.84f, 115.91f, 131.09f, 114.86f),
                    PathNode.CurveTo(129.1884f, 113.71752f, 126.81159f, 113.71752f, 124.91f, 114.86f),
                    PathNode.CurveTo(123.16f, 115.91f, 82.0f, 141.1f, 82.0f, 184.0f),
                    PathNode.CurveTo(81.98963f, 191.66568f, 83.908554f, 199.21071f, 87.58f, 205.94f),
                    PathNode.CurveTo(66.64514f, 192.28868f, 54.015427f, 168.99254f, 54.0f, 144.0f),
                    PathNode.CurveTo(54.0f, 84.17f, 113.62f, 40.74f, 128.0f, 31.14f),
                    PathNode.CurveTo(142.39f, 40.74f, 202.0f, 84.14f, 202.0f, 144.0f),
                    PathNode.CurveTo(201.98457f, 168.99254f, 189.35486f, 192.28868f, 168.42f, 205.94f),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
