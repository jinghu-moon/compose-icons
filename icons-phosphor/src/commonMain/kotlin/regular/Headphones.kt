package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorRegularIcon(
            name = "Headphones",
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
                    PathNode.CurveTo(44.496628f, 74.6855f, 82.497086f, 39.99773f, 128.0f, 40.0f),
                    PathNode.LineTo(128.67f, 40.0f),
                    PathNode.CurveTo(173.98059f, 40.191425f, 211.68742f, 74.864365f, 215.67f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(178.74516f, 120.0f, 168.0f, 130.74516f, 168.0f, 144.0f),
                    PathNode.LineTo(168.0f, 184.0f),
                    PathNode.CurveTo(168.0f, 197.25484f, 178.74516f, 208.0f, 192.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(221.25484f, 208.0f, 232.0f, 197.25484f, 232.0f, 184.0f),
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
                    PathNode.MoveTo(216.0f, 184.0f),
                    PathNode.CurveTo(216.0f, 188.41827f, 212.41827f, 192.0f, 208.0f, 192.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.CurveTo(187.58173f, 192.0f, 184.0f, 188.41827f, 184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 144.0f),
                    PathNode.CurveTo(184.0f, 139.58173f, 187.58173f, 136.0f, 192.0f, 136.0f),
                    PathNode.LineTo(216.0f, 136.0f),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
