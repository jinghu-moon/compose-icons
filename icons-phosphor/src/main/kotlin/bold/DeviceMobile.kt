package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) return _deviceMobile!!
        _deviceMobile = phosphorBoldIcon(
            name = "DeviceMobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 12.0f),
                    PathNode.LineTo(80.0f, 12.0f),
                    PathNode.CurveTo(64.536026f, 12.0f, 52.0f, 24.536028f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 231.46397f, 64.536026f, 244.0f, 80.0f, 244.0f),
                    PathNode.LineTo(176.0f, 244.0f),
                    PathNode.CurveTo(191.46397f, 244.0f, 204.0f, 231.46397f, 204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 24.536028f, 191.46397f, 12.0f, 176.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 76.0f),
                    PathNode.LineTo(180.0f, 76.0f),
                    PathNode.LineTo(180.0f, 180.0f),
                    PathNode.LineTo(76.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 36.0f),
                    PathNode.LineTo(176.0f, 36.0f),
                    PathNode.CurveTo(178.20914f, 36.0f, 180.0f, 37.79086f, 180.0f, 40.0f),
                    PathNode.LineTo(180.0f, 52.0f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.LineTo(76.0f, 40.0f),
                    PathNode.CurveTo(76.0f, 37.79086f, 77.79086f, 36.0f, 80.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(77.79086f, 220.0f, 76.0f, 218.20914f, 76.0f, 216.0f),
                    PathNode.LineTo(76.0f, 204.0f),
                    PathNode.LineTo(180.0f, 204.0f),
                    PathNode.LineTo(180.0f, 216.0f),
                    PathNode.CurveTo(180.0f, 218.20914f, 178.20914f, 220.0f, 176.0f, 220.0f),
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
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
