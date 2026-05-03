package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DeviceMobileCamera: ImageVector
    get() {
        if (_deviceMobileCamera != null) return _deviceMobileCamera!!
        _deviceMobileCamera = phosphorFillIcon(
            name = "DeviceMobileCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 16.0f),
                    PathNode.LineTo(80.0f, 16.0f),
                    PathNode.CurveTo(66.74516f, 16.0f, 56.0f, 26.745167f, 56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(56.0f, 229.25484f, 66.74516f, 240.0f, 80.0f, 240.0f),
                    PathNode.LineTo(176.0f, 240.0f),
                    PathNode.CurveTo(189.25484f, 240.0f, 200.0f, 229.25484f, 200.0f, 216.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(200.0f, 26.745167f, 189.25484f, 16.0f, 176.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.CurveTo(121.37258f, 72.0f, 116.0f, 66.62742f, 116.0f, 60.0f),
                    PathNode.CurveTo(116.0f, 53.37258f, 121.37258f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(134.62741f, 48.0f, 140.0f, 53.37258f, 140.0f, 60.0f),
                    PathNode.CurveTo(140.0f, 66.62742f, 134.62741f, 72.0f, 128.0f, 72.0f),
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
        return _deviceMobileCamera!!
    }

private var _deviceMobileCamera: ImageVector? = null
