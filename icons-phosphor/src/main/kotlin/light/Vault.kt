package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorLightIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 192.0f),
                    PathNode.CurveTo(26.0f, 199.73198f, 32.268013f, 206.0f, 40.0f, 206.0f),
                    PathNode.LineTo(58.0f, 206.0f),
                    PathNode.LineTo(58.0f, 224.0f),
                    PathNode.CurveTo(58.0f, 227.3137f, 60.68629f, 230.0f, 64.0f, 230.0f),
                    PathNode.CurveTo(67.313705f, 230.0f, 70.0f, 227.3137f, 70.0f, 224.0f),
                    PathNode.LineTo(70.0f, 206.0f),
                    PathNode.LineTo(186.0f, 206.0f),
                    PathNode.LineTo(186.0f, 224.0f),
                    PathNode.CurveTo(186.0f, 227.3137f, 188.6863f, 230.0f, 192.0f, 230.0f),
                    PathNode.CurveTo(195.3137f, 230.0f, 198.0f, 227.3137f, 198.0f, 224.0f),
                    PathNode.LineTo(198.0f, 206.0f),
                    PathNode.LineTo(216.0f, 206.0f),
                    PathNode.CurveTo(223.73198f, 206.0f, 230.0f, 199.73198f, 230.0f, 192.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 48.268013f, 223.73198f, 42.0f, 216.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 194.0f),
                    PathNode.LineTo(40.0f, 194.0f),
                    PathNode.CurveTo(38.89543f, 194.0f, 38.0f, 193.10457f, 38.0f, 192.0f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(217.10457f, 54.0f, 218.0f, 54.89543f, 218.0f, 56.0f),
                    PathNode.LineTo(218.0f, 122.0f),
                    PathNode.LineTo(197.6f, 122.0f),
                    PathNode.CurveTo(194.43852f, 97.969086f, 173.17271f, 80.51423f, 148.98656f, 82.09835f),
                    PathNode.CurveTo(124.8004f, 83.68247f, 105.99298f, 103.762024f, 105.99298f, 128.0f),
                    PathNode.CurveTo(105.99298f, 152.23799f, 124.8004f, 172.31752f, 148.98656f, 173.90164f),
                    PathNode.CurveTo(173.17271f, 175.48578f, 194.43852f, 158.03091f, 197.6f, 134.0f),
                    PathNode.LineTo(218.0f, 134.0f),
                    PathNode.LineTo(218.0f, 192.0f),
                    PathNode.CurveTo(218.0f, 193.10457f, 217.10457f, 194.0f, 216.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.63f, 122.0f),
                    PathNode.CurveTo(161.82407f, 116.08458f, 155.29308f, 112.90381f, 148.90579f, 114.341896f),
                    PathNode.CurveTo(142.51851f, 115.77998f, 137.9809f, 121.45283f, 137.9809f, 128.0f),
                    PathNode.CurveTo(137.9809f, 134.54718f, 142.51851f, 140.22002f, 148.90579f, 141.6581f),
                    PathNode.CurveTo(155.29308f, 143.09619f, 161.82407f, 139.91542f, 164.63f, 134.0f),
                    PathNode.LineTo(185.46f, 134.0f),
                    PathNode.CurveTo(182.35226f, 151.33409f, 166.523f, 163.42633f, 148.98177f, 161.86633f),
                    PathNode.CurveTo(131.44052f, 160.30634f, 117.9936f, 145.61047f, 117.9936f, 128.0f),
                    PathNode.CurveTo(117.9936f, 110.38953f, 131.44052f, 95.69366f, 148.98177f, 94.13366f),
                    PathNode.CurveTo(166.523f, 92.57366f, 182.35226f, 104.66591f, 185.46f, 122.0f),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
