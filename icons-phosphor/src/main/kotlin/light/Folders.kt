package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorLightIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 66.0f),
                    PathNode.LineTo(154.0f, 66.0f),
                    PathNode.LineTo(125.73f, 44.8f),
                    PathNode.CurveTo(123.306656f, 42.98249f, 120.359184f, 42.0f, 117.33f, 42.0f),
                    PathNode.LineTo(72.0f, 42.0f),
                    PathNode.CurveTo(64.26801f, 42.0f, 58.0f, 48.268013f, 58.0f, 56.0f),
                    PathNode.LineTo(58.0f, 74.0f),
                    PathNode.LineTo(40.0f, 74.0f),
                    PathNode.CurveTo(32.268013f, 74.0f, 26.0f, 80.26801f, 26.0f, 88.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(192.89f, 214.0f),
                    PathNode.CurveTo(200.12817f, 213.99449f, 205.99449f, 208.12817f, 206.0f, 200.89f),
                    PathNode.LineTo(206.0f, 182.0f),
                    PathNode.LineTo(224.89f, 182.0f),
                    PathNode.CurveTo(232.12817f, 181.99449f, 237.99449f, 176.12817f, 238.0f, 168.89f),
                    PathNode.LineTo(238.0f, 80.0f),
                    PathNode.CurveTo(238.0f, 72.26801f, 231.73198f, 66.0f, 224.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 200.89f),
                    PathNode.CurveTo(194.0f, 201.50304f, 193.50304f, 202.0f, 192.89f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 88.0f),
                    PathNode.CurveTo(38.0f, 86.89543f, 38.89543f, 86.0f, 40.0f, 86.0f),
                    PathNode.LineTo(85.33f, 86.0f),
                    PathNode.CurveTo(85.76274f, 86.0f, 86.18381f, 86.14036f, 86.53f, 86.4f),
                    PathNode.LineTo(116.4f, 108.8f),
                    PathNode.CurveTo(117.438576f, 109.57893f, 118.70178f, 110.0f, 120.0f, 110.0f),
                    PathNode.LineTo(192.0f, 110.0f),
                    PathNode.CurveTo(193.10457f, 110.0f, 194.0f, 110.89543f, 194.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 168.89f),
                    PathNode.CurveTo(226.0f, 169.50304f, 225.50304f, 170.0f, 224.89f, 170.0f),
                    PathNode.LineTo(206.0f, 170.0f),
                    PathNode.LineTo(206.0f, 112.0f),
                    PathNode.CurveTo(206.0f, 104.26801f, 199.73198f, 98.0f, 192.0f, 98.0f),
                    PathNode.LineTo(122.0f, 98.0f),
                    PathNode.LineTo(93.73f, 76.8f),
                    PathNode.CurveTo(91.306656f, 74.98249f, 88.359184f, 74.0f, 85.33f, 74.0f),
                    PathNode.LineTo(70.0f, 74.0f),
                    PathNode.LineTo(70.0f, 56.0f),
                    PathNode.CurveTo(70.0f, 54.89543f, 70.89543f, 54.0f, 72.0f, 54.0f),
                    PathNode.LineTo(117.33f, 54.0f),
                    PathNode.CurveTo(117.76274f, 54.0f, 118.18381f, 54.140354f, 118.53f, 54.4f),
                    PathNode.LineTo(148.4f, 76.8f),
                    PathNode.CurveTo(149.43858f, 77.57893f, 150.70178f, 78.0f, 152.0f, 78.0f),
                    PathNode.LineTo(224.0f, 78.0f),
                    PathNode.CurveTo(225.10457f, 78.0f, 226.0f, 78.89543f, 226.0f, 80.0f),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
