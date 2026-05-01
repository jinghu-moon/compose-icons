package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) return _deviceMobile!!
        _deviceMobile = phosphorRegularIcon(
            name = "DeviceMobile",
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
                    PathNode.MoveTo(72.0f, 64.0f),
                    PathNode.LineTo(184.0f, 64.0f),
                    PathNode.LineTo(184.0f, 192.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(180.41827f, 32.0f, 184.0f, 35.581722f, 184.0f, 40.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(72.0f, 35.581722f, 75.58172f, 32.0f, 80.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(75.58172f, 224.0f, 72.0f, 220.41827f, 72.0f, 216.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.LineTo(184.0f, 216.0f),
                    PathNode.CurveTo(184.0f, 220.41827f, 180.41827f, 224.0f, 176.0f, 224.0f),
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
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
