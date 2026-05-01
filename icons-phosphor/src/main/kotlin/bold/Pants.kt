package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorBoldIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.85f, 213.52f),
                    PathNode.LineTo(205.85f, 37.52f),
                    PathNode.CurveTo(204.59904f, 27.509468f, 196.0884f, 19.997803f, 186.0f, 20.0f),
                    PathNode.LineTo(70.0f, 20.0f),
                    PathNode.CurveTo(59.91161f, 19.997803f, 51.40096f, 27.509468f, 50.15f, 37.52f),
                    PathNode.LineTo(28.15f, 213.52f),
                    PathNode.CurveTo(27.43858f, 219.21298f, 29.20628f, 224.93733f, 33.003754f, 229.23795f),
                    PathNode.CurveTo(36.801228f, 233.53856f, 42.262745f, 236.00125f, 48.0f, 236.0f),
                    PathNode.LineTo(88.69f, 236.0f),
                    PathNode.CurveTo(97.822845f, 236.02821f, 105.807434f, 229.84819f, 108.07f, 221.0f),
                    PathNode.LineTo(128.0f, 144.0f),
                    PathNode.LineTo(147.91f, 220.94f),
                    PathNode.CurveTo(150.17014f, 229.80685f, 158.15964f, 236.009f, 167.31f, 236.0f),
                    PathNode.LineTo(208.0f, 236.0f),
                    PathNode.CurveTo(213.73726f, 236.00125f, 219.19879f, 233.53856f, 222.99625f, 229.23795f),
                    PathNode.CurveTo(226.79372f, 224.93733f, 228.56142f, 219.21298f, 227.85f, 213.52f),
                    PathNode.Close,
                    PathNode.MoveTo(182.47f, 44.0f),
                    PathNode.LineTo(184.47f, 60.0f),
                    PathNode.LineTo(71.53f, 60.0f),
                    PathNode.LineTo(73.53f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(85.6f, 212.0f),
                    PathNode.LineTo(52.53f, 212.0f),
                    PathNode.LineTo(63.73f, 122.4f),
                    PathNode.CurveTo(81.351135f, 117.49001f, 94.11334f, 102.21356f, 95.81f, 84.0f),
                    PathNode.LineTo(116.0f, 84.0f),
                    PathNode.LineTo(116.0f, 94.47f),
                    PathNode.Close,
                    PathNode.MoveTo(170.41f, 212.0f),
                    PathNode.LineTo(140.0f, 94.47f),
                    PathNode.LineTo(140.0f, 84.0f),
                    PathNode.LineTo(160.19f, 84.0f),
                    PathNode.CurveTo(161.88507f, 102.212074f, 174.64879f, 117.48635f, 192.27f, 122.39f),
                    PathNode.LineTo(203.47f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pants!!
    }

private var _pants: ImageVector? = null
