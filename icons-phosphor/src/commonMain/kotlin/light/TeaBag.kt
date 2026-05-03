package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorLightIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 162.0f),
                    PathNode.CurveTo(214.05887f, 162.0f, 206.0f, 153.94113f, 206.0f, 144.0f),
                    PathNode.LineTo(206.0f, 64.0f),
                    PathNode.CurveTo(206.0f, 34.176624f, 181.82338f, 10.0f, 152.0f, 10.0f),
                    PathNode.CurveTo(122.17662f, 10.0f, 98.0f, 34.176624f, 98.0f, 64.0f),
                    PathNode.LineTo(98.0f, 74.0f),
                    PathNode.LineTo(76.53f, 74.0f),
                    PathNode.CurveTo(71.617134f, 74.01617f, 67.068474f, 76.593735f, 64.53f, 80.8f),
                    PathNode.LineTo(44.0f, 115.0f),
                    PathNode.CurveTo(42.69156f, 117.177376f, 42.0002f, 119.66972f, 42.0f, 122.21f),
                    PathNode.LineTo(42.0f, 216.0f),
                    PathNode.CurveTo(42.0f, 223.73198f, 48.268013f, 230.0f, 56.0f, 230.0f),
                    PathNode.LineTo(152.0f, 230.0f),
                    PathNode.CurveTo(159.73198f, 230.0f, 166.0f, 223.73198f, 166.0f, 216.0f),
                    PathNode.LineTo(166.0f, 122.22f),
                    PathNode.CurveTo(165.9998f, 119.679726f, 165.30844f, 117.18738f, 164.0f, 115.01f),
                    PathNode.LineTo(143.48f, 80.8f),
                    PathNode.CurveTo(140.94154f, 76.593735f, 136.39287f, 74.01617f, 131.48f, 74.0f),
                    PathNode.LineTo(110.0f, 74.0f),
                    PathNode.LineTo(110.0f, 64.0f),
                    PathNode.CurveTo(110.0f, 40.80404f, 128.80405f, 22.0f, 152.0f, 22.0f),
                    PathNode.CurveTo(175.19595f, 22.0f, 194.0f, 40.80404f, 194.0f, 64.0f),
                    PathNode.LineTo(194.0f, 144.0f),
                    PathNode.CurveTo(194.0f, 160.56854f, 207.43146f, 174.0f, 224.0f, 174.0f),
                    PathNode.CurveTo(227.3137f, 174.0f, 230.0f, 171.3137f, 230.0f, 168.0f),
                    PathNode.CurveTo(230.0f, 164.6863f, 227.3137f, 162.0f, 224.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(131.47f, 86.0f),
                    PathNode.CurveTo(132.18022f, 86.00429f, 132.8349f, 86.38491f, 133.19f, 87.0f),
                    PathNode.LineTo(153.72f, 121.22f),
                    PathNode.CurveTo(153.89975f, 121.522865f, 153.99634f, 121.86783f, 154.0f, 122.22f),
                    PathNode.LineTo(154.0f, 216.0f),
                    PathNode.CurveTo(154.0f, 217.10457f, 153.10457f, 218.0f, 152.0f, 218.0f),
                    PathNode.LineTo(56.0f, 218.0f),
                    PathNode.CurveTo(54.89543f, 218.0f, 54.0f, 217.10457f, 54.0f, 216.0f),
                    PathNode.LineTo(54.0f, 122.22f),
                    PathNode.CurveTo(54.006683f, 121.86691f, 54.10674f, 121.52188f, 54.29f, 121.22f),
                    PathNode.LineTo(74.81f, 87.0f),
                    PathNode.CurveTo(75.16511f, 86.38491f, 75.81978f, 86.00429f, 76.53f, 86.0f),
                    PathNode.LineTo(98.0f, 86.0f),
                    PathNode.LineTo(98.0f, 136.0f),
                    PathNode.CurveTo(98.0f, 139.3137f, 100.686295f, 142.0f, 104.0f, 142.0f),
                    PathNode.CurveTo(107.313705f, 142.0f, 110.0f, 139.3137f, 110.0f, 136.0f),
                    PathNode.LineTo(110.0f, 86.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
