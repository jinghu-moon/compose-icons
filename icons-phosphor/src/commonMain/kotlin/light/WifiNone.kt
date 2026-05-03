package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WifiNone: ImageVector
    get() {
        if (_wifiNone != null) return _wifiNone!!
        _wifiNone = phosphorLightIcon(
            name = "WifiNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(138.0f, 204.0f),
                    PathNode.CurveTo(138.0f, 209.52284f, 133.52284f, 214.0f, 128.0f, 214.0f),
                    PathNode.CurveTo(122.47715f, 214.0f, 118.0f, 209.52284f, 118.0f, 204.0f),
                    PathNode.CurveTo(118.0f, 198.47716f, 122.47715f, 194.0f, 128.0f, 194.0f),
                    PathNode.CurveTo(133.52284f, 194.0f, 138.0f, 198.47716f, 138.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wifiNone!!
    }

private var _wifiNone: ImageVector? = null
