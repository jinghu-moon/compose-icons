package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorFillIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.76f, 138.83f),
                    PathNode.CurveTo(232.73431f, 142.12042f, 228.4701f, 143.99509f, 224.0f, 144.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.CurveTo(136.0f, 208.83656f, 143.16344f, 216.0f, 152.0f, 216.0f),
                    PathNode.CurveTo(160.83656f, 216.0f, 168.0f, 208.83656f, 168.0f, 200.0f),
                    PathNode.CurveTo(168.0f, 195.58173f, 171.58173f, 192.0f, 176.0f, 192.0f),
                    PathNode.CurveTo(180.41827f, 192.0f, 184.0f, 195.58173f, 184.0f, 200.0f),
                    PathNode.CurveTo(184.0f, 217.67311f, 169.67311f, 232.0f, 152.0f, 232.0f),
                    PathNode.CurveTo(134.32689f, 232.0f, 120.0f, 217.67311f, 120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.CurveTo(27.508144f, 144.0165f, 23.216232f, 142.14406f, 20.172953f, 138.8402f),
                    PathNode.CurveTo(17.129675f, 135.53635f, 15.615352f, 131.1054f, 16.0f, 126.63f),
                    PathNode.CurveTo(19.740648f, 83.92861f, 47.434685f, 47.06878f, 87.40712f, 31.58955f),
                    PathNode.CurveTo(127.37955f, 16.110321f, 172.67567f, 24.704876f, 204.2f, 53.75f),
                    PathNode.CurveTo(224.86441f, 72.68389f, 237.64507f, 98.70216f, 240.0f, 126.63f),
                    PathNode.CurveTo(240.35127f, 131.1102f, 238.81406f, 135.53331f, 235.76f, 138.83f),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
