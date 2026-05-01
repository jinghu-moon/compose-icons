package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorDuotoneIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 144.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(80.0f, 192.83656f, 72.836555f, 200.0f, 64.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(39.163445f, 200.0f, 32.0f, 192.83656f, 32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.LineTo(64.0f, 128.0f),
                    PathNode.CurveTo(72.836555f, 128.0f, 80.0f, 135.16344f, 80.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 128.0f),
                    PathNode.CurveTo(183.16344f, 128.0f, 176.0f, 135.16344f, 176.0f, 144.0f),
                    PathNode.LineTo(176.0f, 184.0f),
                    PathNode.CurveTo(176.0f, 192.83656f, 183.16344f, 200.0f, 192.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(216.83656f, 200.0f, 224.0f, 192.83656f, 224.0f, 184.0f),
                    PathNode.LineTo(224.0f, 128.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.89f, 54.66f),
                    PathNode.CurveTo(172.17654f, 24.77271f, 127.37224f, 15.754092f, 88.409386f, 31.81759f),
                    PathNode.CurveTo(49.446537f, 47.88109f, 24.016485f, 85.85573f, 24.0f, 128.0f),
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _headphones!!
    }

private var _headphones: ImageVector? = null
