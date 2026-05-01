package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = phosphorRegularIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.89f, 54.66f),
                    PathNode.CurveTo(182.56201f, 35.137634f, 156.26149f, 24.106524f, 128.79f, 24.0f),
                    PathNode.LineTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 197.25484f, 34.745167f, 208.0f, 48.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.CurveTo(77.25484f, 208.0f, 88.0f, 197.25484f, 88.0f, 184.0f),
                    PathNode.LineTo(88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 130.74516f, 77.25484f, 120.0f, 64.0f, 120.0f),
                    PathNode.LineTo(40.36f, 120.0f),
                    PathNode.CurveTo(43.509678f, 85.94643f, 66.078f, 56.79047f, 98.25498f, 45.205647f),
                    PathNode.CurveTo(130.43196f, 33.620823f, 166.40604f, 41.69948f, 190.54f, 65.93f),
                    PathNode.CurveTo(204.98892f, 80.453f, 213.87639f, 99.59061f, 215.65f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(178.74516f, 120.0f, 168.0f, 130.74516f, 168.0f, 144.0f),
                    PathNode.LineTo(168.0f, 184.0f),
                    PathNode.CurveTo(168.0f, 197.25484f, 178.74516f, 208.0f, 192.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(216.0f, 221.25484f, 205.25484f, 232.0f, 192.0f, 232.0f),
                    PathNode.LineTo(136.0f, 232.0f),
                    PathNode.CurveTo(131.58173f, 232.0f, 128.0f, 235.58173f, 128.0f, 240.0f),
                    PathNode.CurveTo(128.0f, 244.41827f, 131.58173f, 248.0f, 136.0f, 248.0f),
                    PathNode.LineTo(192.0f, 248.0f),
                    PathNode.CurveTo(214.09138f, 248.0f, 232.0f, 230.09138f, 232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.10518f, 100.523994f, 221.27138f, 74.13573f, 201.89f, 54.66f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 136.0f),
                    PathNode.CurveTo(68.41828f, 136.0f, 72.0f, 139.58173f, 72.0f, 144.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(72.0f, 188.41827f, 68.41828f, 192.0f, 64.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.CurveTo(43.581722f, 192.0f, 40.0f, 188.41827f, 40.0f, 184.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 192.0f),
                    PathNode.CurveTo(187.58173f, 192.0f, 184.0f, 188.41827f, 184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 144.0f),
                    PathNode.CurveTo(184.0f, 139.58173f, 187.58173f, 136.0f, 192.0f, 136.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _headset!!
    }

private var _headset: ImageVector? = null
