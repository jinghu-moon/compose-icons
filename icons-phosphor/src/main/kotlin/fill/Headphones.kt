package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorFillIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(232.0f, 197.25484f, 221.25484f, 208.0f, 208.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(178.74516f, 208.0f, 168.0f, 197.25484f, 168.0f, 184.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 130.74516f, 178.74516f, 120.0f, 192.0f, 120.0f),
                    PathNode.LineTo(215.65f, 120.0f),
                    PathNode.CurveTo(211.66742f, 74.864365f, 173.9606f, 40.191425f, 128.65f, 40.0f),
                    PathNode.LineTo(128.0f, 40.0f),
                    PathNode.CurveTo(82.497086f, 39.99773f, 44.496628f, 74.6855f, 40.36f, 120.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.CurveTo(77.25484f, 120.0f, 88.0f, 130.74516f, 88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.CurveTo(88.0f, 197.25484f, 77.25484f, 208.0f, 64.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(34.745167f, 208.0f, 24.0f, 197.25484f, 24.0f, 184.0f),
                    PathNode.LineTo(24.0f, 128.0f),
                    PathNode.CurveTo(24.04587f, 85.87004f, 49.47826f, 47.92054f, 88.4279f, 31.862492f),
                    PathNode.CurveTo(127.37754f, 15.80444f, 172.16579f, 24.803574f, 201.89f, 54.66f),
                    PathNode.CurveTo(221.27138f, 74.13573f, 232.10518f, 100.523994f, 232.0f, 128.0f),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
