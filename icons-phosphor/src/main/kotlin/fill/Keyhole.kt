package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorFillIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(157.52f, 170.39f),
                    PathNode.CurveTo(158.06372f, 171.62663f, 157.94655f, 173.0542f, 157.2084f, 174.18562f),
                    PathNode.CurveTo(156.47026f, 175.31702f, 155.2109f, 175.99944f, 153.86f, 176.0f),
                    PathNode.LineTo(102.14f, 176.0f),
                    PathNode.CurveTo(100.78909f, 175.99944f, 99.52974f, 175.31702f, 98.791595f, 174.18562f),
                    PathNode.CurveTo(98.05345f, 173.0542f, 97.93626f, 171.62663f, 98.48f, 170.39f),
                    PathNode.LineTo(112.0f, 139.72f),
                    PathNode.CurveTo(99.45702f, 132.4783f, 93.3418f, 117.71485f, 97.09037f, 103.724976f),
                    PathNode.CurveTo(100.83895f, 89.73511f, 113.51662f, 80.00719f, 128.0f, 80.00719f),
                    PathNode.CurveTo(142.48338f, 80.00719f, 155.16106f, 89.73511f, 158.90962f, 103.724976f),
                    PathNode.CurveTo(162.6582f, 117.71485f, 156.543f, 132.4783f, 144.0f, 139.72f),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
