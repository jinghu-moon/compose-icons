package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorFillIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.CurveTo(203.58173f, 80.0f, 200.0f, 83.58172f, 200.0f, 88.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.LineTo(188.85f, 104.0f),
                    PathNode.LineTo(184.0f, 55.2f),
                    PathNode.CurveTo(183.79257f, 53.189045f, 182.83148f, 51.331184f, 181.31f, 50.0f),
                    PathNode.LineTo(181.31f, 50.0f),
                    PathNode.LineTo(138.44f, 11.88f),
                    PathNode.LineTo(138.24f, 11.71f),
                    PathNode.CurveTo(132.30751f, 6.768665f, 123.6925f, 6.768665f, 117.76f, 11.71f),
                    PathNode.LineTo(117.56f, 11.88f),
                    PathNode.LineTo(74.68f, 50.0f),
                    PathNode.LineTo(74.68f, 50.0f),
                    PathNode.CurveTo(73.15661f, 51.32844f, 72.19798f, 53.18846f, 72.0f, 55.2f),
                    PathNode.LineTo(67.15f, 104.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.CurveTo(56.0f, 83.58172f, 52.418278f, 80.0f, 48.0f, 80.0f),
                    PathNode.CurveTo(43.581722f, 80.0f, 40.0f, 83.58172f, 40.0f, 88.0f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 116.41828f, 43.581722f, 120.0f, 48.0f, 120.0f),
                    PathNode.LineTo(65.54f, 120.0f),
                    PathNode.LineTo(56.07f, 214.48f),
                    PathNode.CurveTo(55.641716f, 218.9679f, 57.12664f, 223.42818f, 60.15951f, 226.76378f),
                    PathNode.CurveTo(63.192387f, 230.09937f, 67.49173f, 232.00067f, 72.0f, 232.0f),
                    PathNode.LineTo(184.0f, 232.0f),
                    PathNode.CurveTo(188.51419f, 231.99893f, 192.8179f, 230.091f, 195.84993f, 226.74663f),
                    PathNode.CurveTo(198.88194f, 223.40225f, 200.36014f, 218.9327f, 199.92f, 214.44f),
                    PathNode.LineTo(190.46f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.CurveTo(212.41827f, 120.0f, 216.0f, 116.41828f, 216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.0f, 83.58172f, 212.41827f, 80.0f, 208.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(87.24f, 64.0f),
                    PathNode.LineTo(168.76f, 64.0f),
                    PathNode.LineTo(172.76f, 104.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 83.58172f, 132.41827f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(123.58172f, 80.0f, 120.0f, 83.58172f, 120.0f, 88.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.LineTo(83.23f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 216.0f),
                    PathNode.LineTo(76.81f, 168.0f),
                    PathNode.LineTo(179.19f, 168.0f),
                    PathNode.LineTo(184.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
