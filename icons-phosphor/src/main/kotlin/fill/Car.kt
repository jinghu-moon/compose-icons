package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = phosphorFillIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 104.0f),
                    PathNode.LineTo(229.2f, 104.0f),
                    PathNode.LineTo(201.42f, 41.5f),
                    PathNode.CurveTo(198.8516f, 35.722977f, 193.12224f, 32.000076f, 186.8f, 32.0f),
                    PathNode.LineTo(69.2f, 32.0f),
                    PathNode.CurveTo(62.87776f, 32.000076f, 57.14841f, 35.722977f, 54.58f, 41.5f),
                    PathNode.LineTo(26.8f, 104.0f),
                    PathNode.LineTo(16.0f, 104.0f),
                    PathNode.CurveTo(11.581722f, 104.0f, 8.0f, 107.58172f, 8.0f, 112.0f),
                    PathNode.CurveTo(8.0f, 116.41828f, 11.581722f, 120.0f, 16.0f, 120.0f),
                    PathNode.LineTo(24.0f, 120.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(72.836555f, 216.0f, 80.0f, 208.83656f, 80.0f, 200.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(176.0f, 208.83656f, 183.16344f, 216.0f, 192.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 120.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.CurveTo(244.41827f, 120.0f, 248.0f, 116.41828f, 248.0f, 112.0f),
                    PathNode.CurveTo(248.0f, 107.58172f, 244.41827f, 104.0f, 240.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 152.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.CurveTo(51.581722f, 152.0f, 48.0f, 148.41827f, 48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 139.58173f, 51.581722f, 136.0f, 56.0f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.CurveTo(84.41828f, 136.0f, 88.0f, 139.58173f, 88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 148.41827f, 84.41828f, 152.0f, 80.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 152.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.CurveTo(171.58173f, 152.0f, 168.0f, 148.41827f, 168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 139.58173f, 171.58173f, 136.0f, 176.0f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.CurveTo(204.41827f, 136.0f, 208.0f, 139.58173f, 208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 148.41827f, 204.41827f, 152.0f, 200.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.31f, 104.0f),
                    PathNode.LineTo(69.2f, 48.0f),
                    PathNode.LineTo(186.8f, 48.0f),
                    PathNode.LineTo(211.69f, 104.0f),
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
        return _car!!
    }

private var _car: ImageVector? = null
