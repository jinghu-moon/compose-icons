package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bug: ImageVector
    get() {
        if (_bug != null) return _bug!!
        _bug = phosphorFillIcon(
            name = "Bug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 92.0f),
                    PathNode.CurveTo(168.0f, 98.62742f, 162.62741f, 104.0f, 156.0f, 104.0f),
                    PathNode.CurveTo(149.37259f, 104.0f, 144.0f, 98.62742f, 144.0f, 92.0f),
                    PathNode.CurveTo(144.0f, 85.37258f, 149.37259f, 80.0f, 156.0f, 80.0f),
                    PathNode.CurveTo(162.62741f, 80.0f, 168.0f, 85.37258f, 168.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 80.0f),
                    PathNode.CurveTo(93.37258f, 80.0f, 88.0f, 85.37258f, 88.0f, 92.0f),
                    PathNode.CurveTo(88.0f, 98.62742f, 93.37258f, 104.0f, 100.0f, 104.0f),
                    PathNode.CurveTo(106.62742f, 104.0f, 112.0f, 98.62742f, 112.0f, 92.0f),
                    PathNode.CurveTo(112.0f, 85.37258f, 106.62742f, 80.0f, 100.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 144.0f),
                    PathNode.CurveTo(216.022f, 151.76562f, 215.0132f, 159.49985f, 213.0f, 167.0f),
                    PathNode.LineTo(235.24f, 176.72f),
                    PathNode.CurveTo(238.65288f, 178.2745f, 240.52785f, 181.99115f, 239.74992f, 185.6598f),
                    PathNode.CurveTo(238.97202f, 189.32846f, 235.75006f, 191.96434f, 232.0f, 192.0f),
                    PathNode.CurveTo(230.89825f, 192.00253f, 229.80818f, 191.7743f, 228.8f, 191.33f),
                    PathNode.LineTo(207.38f, 182.0f),
                    PathNode.CurveTo(192.75505f, 212.56328f, 161.8822f, 232.0156f, 128.0f, 232.0156f),
                    PathNode.CurveTo(94.117805f, 232.0156f, 63.244946f, 212.56328f, 48.62f, 182.0f),
                    PathNode.LineTo(27.2f, 191.33f),
                    PathNode.CurveTo(26.191813f, 191.7743f, 25.101746f, 192.00253f, 24.0f, 192.0f),
                    PathNode.CurveTo(20.213589f, 191.9977f, 16.94735f, 189.34122f, 16.173647f, 185.63469f),
                    PathNode.CurveTo(15.399944f, 181.92818f, 17.3307f, 178.18686f, 20.8f, 176.67f),
                    PathNode.LineTo(43.0f, 167.0f),
                    PathNode.CurveTo(40.986797f, 159.49985f, 39.97799f, 151.76562f, 40.0f, 144.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.CurveTo(11.581722f, 136.0f, 8.0f, 132.41827f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 123.58172f, 11.581722f, 120.0f, 16.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.CurveTo(39.97799f, 104.23437f, 40.986797f, 96.50017f, 43.0f, 89.0f),
                    PathNode.LineTo(20.8f, 79.33f),
                    PathNode.CurveTo(18.117138f, 78.22852f, 16.240505f, 75.76132f, 15.895264f, 72.881775f),
                    PathNode.CurveTo(15.550023f, 70.00223f, 16.790249f, 67.16133f, 19.136696f, 65.45687f),
                    PathNode.CurveTo(21.48314f, 63.75241f, 24.568296f, 63.45134f, 27.2f, 64.67f),
                    PathNode.LineTo(48.62f, 74.0f),
                    PathNode.CurveTo(63.244946f, 43.43672f, 94.117805f, 23.984413f, 128.0f, 23.984413f),
                    PathNode.CurveTo(161.8822f, 23.984413f, 192.75505f, 43.43672f, 207.38f, 74.0f),
                    PathNode.LineTo(228.8f, 64.64f),
                    PathNode.CurveTo(232.82364f, 62.98805f, 237.42992f, 64.85353f, 239.17017f, 68.83978f),
                    PathNode.CurveTo(240.9104f, 72.826035f, 239.14693f, 77.472305f, 235.2f, 79.3f),
                    PathNode.LineTo(213.0f, 89.05f),
                    PathNode.CurveTo(215.0132f, 96.55017f, 216.022f, 104.28437f, 216.0f, 112.05f),
                    PathNode.LineTo(216.0f, 120.05f),
                    PathNode.LineTo(240.0f, 120.05f),
                    PathNode.CurveTo(244.41827f, 120.05f, 248.0f, 123.63172f, 248.0f, 128.05f),
                    PathNode.CurveTo(248.0f, 132.46828f, 244.41827f, 136.05f, 240.0f, 136.05f),
                    PathNode.LineTo(216.0f, 136.05f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 139.58173f, 132.41827f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 139.58173f, 120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.CurveTo(120.0f, 212.41827f, 123.58172f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(132.41827f, 216.0f, 136.0f, 212.41827f, 136.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 72.2355f, 167.7645f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(88.2355f, 40.0f, 56.0f, 72.2355f, 56.0f, 112.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(200.0f, 120.0f),
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
        return _bug!!
    }

private var _bug: ImageVector? = null
