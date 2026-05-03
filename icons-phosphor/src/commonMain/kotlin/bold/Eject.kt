package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorBoldIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.CurveTo(36.954304f, 152.0f, 28.0f, 160.9543f, 28.0f, 172.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 203.0457f, 36.954304f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(219.0457f, 212.0f, 228.0f, 203.0457f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 172.0f),
                    PathNode.CurveTo(228.0f, 160.9543f, 219.0457f, 152.0f, 208.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 188.0f),
                    PathNode.LineTo(52.0f, 188.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.LineTo(204.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.27f, 136.0f),
                    PathNode.LineTo(207.73f, 136.0f),
                    PathNode.CurveTo(215.8477f, 135.99207f, 223.17776f, 131.14183f, 226.35892f, 123.67339f),
                    PathNode.CurveTo(229.54007f, 116.20496f, 227.95872f, 107.55894f, 222.34f, 101.7f),
                    PathNode.LineTo(148.58f, 24.78f),
                    PathNode.CurveTo(143.20296f, 19.17138f, 135.76976f, 16.000273f, 128.0f, 16.000273f),
                    PathNode.CurveTo(120.23023f, 16.000273f, 112.79704f, 19.17138f, 107.42f, 24.78f),
                    PathNode.LineTo(33.66f, 101.7f),
                    PathNode.CurveTo(28.041277f, 107.55894f, 26.459923f, 116.20496f, 29.641083f, 123.67339f),
                    PathNode.CurveTo(32.822243f, 131.14183f, 40.152294f, 135.99207f, 48.27f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.75f, 41.39f),
                    PathNode.CurveTo(125.597374f, 40.501053f, 126.77189f, 39.998f, 128.0f, 39.998f),
                    PathNode.CurveTo(129.22812f, 39.998f, 130.40263f, 40.501053f, 131.25f, 41.39f),
                    PathNode.LineTo(199.0f, 112.0f),
                    PathNode.LineTo(57.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _eject!!
    }

private var _eject: ImageVector? = null
