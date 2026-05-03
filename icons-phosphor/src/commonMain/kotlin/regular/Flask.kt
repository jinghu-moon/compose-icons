package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorRegularIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.69f, 199.77f),
                    PathNode.LineTo(160.0f, 96.92f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(172.41827f, 40.0f, 176.0f, 36.418278f, 176.0f, 32.0f),
                    PathNode.CurveTo(176.0f, 27.581722f, 172.41827f, 24.0f, 168.0f, 24.0f),
                    PathNode.LineTo(88.0f, 24.0f),
                    PathNode.CurveTo(83.58172f, 24.0f, 80.0f, 27.581722f, 80.0f, 32.0f),
                    PathNode.CurveTo(80.0f, 36.418278f, 83.58172f, 40.0f, 88.0f, 40.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.LineTo(96.0f, 96.92f),
                    PathNode.LineTo(34.31f, 199.77f),
                    PathNode.CurveTo(31.34801f, 204.7082f, 31.26809f, 210.85716f, 34.10074f, 215.87067f),
                    PathNode.CurveTo(36.933384f, 220.88419f, 42.241604f, 223.98883f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(213.76376f, 223.99962f, 219.08186f, 220.89923f, 221.92186f, 215.88371f),
                    PathNode.CurveTo(224.76184f, 210.8682f, 224.68474f, 204.7128f, 221.72f, 199.77f),
                    PathNode.Close,
                    PathNode.MoveTo(110.86f, 103.25f),
                    PathNode.CurveTo(111.608215f, 102.00982f, 112.00247f, 100.5884f, 112.0f, 99.14f),
                    PathNode.LineTo(112.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(144.0f, 99.14f),
                    PathNode.CurveTo(143.99754f, 100.5884f, 144.39178f, 102.00982f, 145.14f, 103.25f),
                    PathNode.LineTo(183.36f, 167.0f),
                    PathNode.CurveTo(171.36f, 169.37f, 154.29f, 168.37f, 131.61f, 156.89f),
                    PathNode.CurveTo(115.7f, 148.84f, 100.56f, 144.57f, 86.39f, 144.08f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 208.0f),
                    PathNode.LineTo(76.54f, 160.42f),
                    PathNode.CurveTo(90.79f, 158.68f, 106.85f, 162.27f, 124.36f, 171.14f),
                    PathNode.CurveTo(143.36f, 180.75f, 159.36f, 184.02f, 172.36f, 184.02f),
                    PathNode.CurveTo(178.97157f, 184.04926f, 185.55386f, 183.1402f, 191.91f, 181.32f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flask!!
    }

private var _flask: ImageVector? = null
