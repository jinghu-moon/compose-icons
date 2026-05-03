package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) return _markdownLogo!!
        _markdownLogo = phosphorLightIcon(
            name = "MarkdownLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 50.0f),
                    PathNode.LineTo(24.0f, 50.0f),
                    PathNode.CurveTo(16.268013f, 50.0f, 10.0f, 56.268013f, 10.0f, 64.0f),
                    PathNode.LineTo(10.0f, 192.0f),
                    PathNode.CurveTo(10.0f, 199.73198f, 16.268013f, 206.0f, 24.0f, 206.0f),
                    PathNode.LineTo(232.0f, 206.0f),
                    PathNode.CurveTo(239.73198f, 206.0f, 246.0f, 199.73198f, 246.0f, 192.0f),
                    PathNode.LineTo(246.0f, 64.0f),
                    PathNode.CurveTo(246.0f, 56.268013f, 239.73198f, 50.0f, 232.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.0f, 192.0f),
                    PathNode.CurveTo(234.0f, 193.10457f, 233.10457f, 194.0f, 232.0f, 194.0f),
                    PathNode.LineTo(24.0f, 194.0f),
                    PathNode.CurveTo(22.89543f, 194.0f, 22.0f, 193.10457f, 22.0f, 192.0f),
                    PathNode.LineTo(22.0f, 64.0f),
                    PathNode.CurveTo(22.0f, 62.89543f, 22.89543f, 62.0f, 24.0f, 62.0f),
                    PathNode.LineTo(232.0f, 62.0f),
                    PathNode.CurveTo(233.10457f, 62.0f, 234.0f, 62.89543f, 234.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(126.0f, 104.0f),
                    PathNode.LineTo(126.0f, 152.0f),
                    PathNode.CurveTo(126.0f, 155.3137f, 123.313705f, 158.0f, 120.0f, 158.0f),
                    PathNode.CurveTo(116.686295f, 158.0f, 114.0f, 155.3137f, 114.0f, 152.0f),
                    PathNode.LineTo(114.0f, 118.49f),
                    PathNode.LineTo(92.24f, 140.24f),
                    PathNode.CurveTo(89.89746f, 142.57962f, 86.10254f, 142.57962f, 83.76f, 140.24f),
                    PathNode.LineTo(62.0f, 118.49f),
                    PathNode.LineTo(62.0f, 152.0f),
                    PathNode.CurveTo(62.0f, 155.3137f, 59.31371f, 158.0f, 56.0f, 158.0f),
                    PathNode.CurveTo(52.68629f, 158.0f, 50.0f, 155.3137f, 50.0f, 152.0f),
                    PathNode.LineTo(50.0f, 104.0f),
                    PathNode.CurveTo(50.002132f, 101.57487f, 51.46396f, 99.38947f, 53.704613f, 98.4617f),
                    PathNode.CurveTo(55.945263f, 97.533936f, 58.524105f, 98.046234f, 60.24f, 99.76f),
                    PathNode.LineTo(88.0f, 127.51f),
                    PathNode.LineTo(115.76f, 99.76f),
                    PathNode.CurveTo(117.47589f, 98.046234f, 120.05473f, 97.533936f, 122.29539f, 98.4617f),
                    PathNode.CurveTo(124.53604f, 99.38947f, 125.99786f, 101.57487f, 126.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.24f, 123.76f),
                    PathNode.CurveTo(206.57962f, 126.10254f, 206.57962f, 129.89746f, 204.24f, 132.24f),
                    PathNode.LineTo(180.24f, 156.24f),
                    PathNode.CurveTo(177.89746f, 158.57962f, 174.10254f, 158.57962f, 171.76f, 156.24f),
                    PathNode.LineTo(147.76f, 132.24f),
                    PathNode.CurveTo(146.15477f, 130.74423f, 145.494f, 128.49156f, 146.03691f, 126.3657f),
                    PathNode.CurveTo(146.57982f, 124.23982f, 148.23982f, 122.57983f, 150.36569f, 122.03692f),
                    PathNode.CurveTo(152.49156f, 121.494f, 154.74425f, 122.15478f, 156.24f, 123.76f),
                    PathNode.LineTo(170.0f, 137.51f),
                    PathNode.LineTo(170.0f, 104.0f),
                    PathNode.CurveTo(170.0f, 100.686295f, 172.6863f, 98.0f, 176.0f, 98.0f),
                    PathNode.CurveTo(179.3137f, 98.0f, 182.0f, 100.686295f, 182.0f, 104.0f),
                    PathNode.LineTo(182.0f, 137.51f),
                    PathNode.LineTo(195.76f, 123.76f),
                    PathNode.CurveTo(198.10254f, 121.42038f, 201.89746f, 121.42038f, 204.24f, 123.76f),
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
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
