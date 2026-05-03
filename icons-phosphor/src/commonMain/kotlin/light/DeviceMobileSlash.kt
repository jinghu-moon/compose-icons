package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorLightIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.44f, 212.0f),
                    PathNode.LineTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(58.0f, 59.92f),
                    PathNode.LineTo(58.0f, 216.0f),
                    PathNode.CurveTo(58.0f, 228.15027f, 67.84974f, 238.0f, 80.0f, 238.0f),
                    PathNode.LineTo(176.0f, 238.0f),
                    PathNode.CurveTo(188.15027f, 238.0f, 198.0f, 228.15027f, 198.0f, 216.0f),
                    PathNode.LineTo(198.0f, 213.92f),
                    PathNode.LineTo(203.56f, 220.04f),
                    PathNode.CurveTo(205.79123f, 222.49214f, 209.58786f, 222.67123f, 212.04f, 220.44f),
                    PathNode.CurveTo(214.49214f, 218.20877f, 214.67123f, 214.41214f, 212.44f, 211.96f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 216.0f),
                    PathNode.CurveTo(186.0f, 221.52284f, 181.52284f, 226.0f, 176.0f, 226.0f),
                    PathNode.LineTo(80.0f, 226.0f),
                    PathNode.CurveTo(74.47715f, 226.0f, 70.0f, 221.52284f, 70.0f, 216.0f),
                    PathNode.LineTo(70.0f, 73.12f),
                    PathNode.LineTo(186.0f, 200.72f),
                    PathNode.Close,
                    PathNode.MoveTo(70.7f, 24.0f),
                    PathNode.CurveTo(70.7f, 20.68629f, 73.38629f, 18.0f, 76.7f, 18.0f),
                    PathNode.LineTo(176.0f, 18.0f),
                    PathNode.CurveTo(188.15027f, 18.0f, 198.0f, 27.849735f, 198.0f, 40.0f),
                    PathNode.LineTo(198.0f, 150.83f),
                    PathNode.CurveTo(198.0f, 154.1437f, 195.3137f, 156.83f, 192.0f, 156.83f),
                    PathNode.CurveTo(188.6863f, 156.83f, 186.0f, 154.1437f, 186.0f, 150.83f),
                    PathNode.LineTo(186.0f, 40.0f),
                    PathNode.CurveTo(186.0f, 34.477154f, 181.52284f, 30.0f, 176.0f, 30.0f),
                    PathNode.LineTo(76.7f, 30.0f),
                    PathNode.CurveTo(73.38629f, 30.0f, 70.7f, 27.31371f, 70.7f, 24.0f),
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
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
