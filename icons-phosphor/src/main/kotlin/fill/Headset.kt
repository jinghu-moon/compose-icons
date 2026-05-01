package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = phosphorFillIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 230.09138f, 214.09138f, 248.0f, 192.0f, 248.0f),
                    PathNode.LineTo(136.0f, 248.0f),
                    PathNode.CurveTo(131.58173f, 248.0f, 128.0f, 244.41827f, 128.0f, 240.0f),
                    PathNode.CurveTo(128.0f, 235.58173f, 131.58173f, 232.0f, 136.0f, 232.0f),
                    PathNode.LineTo(192.0f, 232.0f),
                    PathNode.CurveTo(205.25484f, 232.0f, 216.0f, 221.25484f, 216.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(178.74516f, 208.0f, 168.0f, 197.25484f, 168.0f, 184.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 130.74516f, 178.74516f, 120.0f, 192.0f, 120.0f),
                    PathNode.LineTo(215.65f, 120.0f),
                    PathNode.CurveTo(212.55962f, 86.051094f, 190.14014f, 56.94099f, 158.10616f, 45.283306f),
                    PathNode.CurveTo(126.07216f, 33.625633f, 90.18701f, 41.51777f, 66.0f, 65.54f),
                    PathNode.CurveTo(51.266556f, 80.0791f, 42.179222f, 99.38083f, 40.36f, 120.0f),
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
        return _headset!!
    }

private var _headset: ImageVector? = null
