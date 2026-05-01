package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) return _deviceMobile!!
        _deviceMobile = phosphorLightIcon(
            name = "DeviceMobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 18.0f),
                    PathNode.LineTo(80.0f, 18.0f),
                    PathNode.CurveTo(67.84974f, 18.0f, 58.0f, 27.849735f, 58.0f, 40.0f),
                    PathNode.LineTo(58.0f, 216.0f),
                    PathNode.CurveTo(58.0f, 228.15027f, 67.84974f, 238.0f, 80.0f, 238.0f),
                    PathNode.LineTo(176.0f, 238.0f),
                    PathNode.CurveTo(188.15027f, 238.0f, 198.0f, 228.15027f, 198.0f, 216.0f),
                    PathNode.LineTo(198.0f, 40.0f),
                    PathNode.CurveTo(198.0f, 27.849735f, 188.15027f, 18.0f, 176.0f, 18.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 62.0f),
                    PathNode.LineTo(186.0f, 62.0f),
                    PathNode.LineTo(186.0f, 194.0f),
                    PathNode.LineTo(70.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 30.0f),
                    PathNode.LineTo(176.0f, 30.0f),
                    PathNode.CurveTo(181.52284f, 30.0f, 186.0f, 34.477154f, 186.0f, 40.0f),
                    PathNode.LineTo(186.0f, 50.0f),
                    PathNode.LineTo(70.0f, 50.0f),
                    PathNode.LineTo(70.0f, 40.0f),
                    PathNode.CurveTo(70.0f, 34.477154f, 74.47715f, 30.0f, 80.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 226.0f),
                    PathNode.LineTo(80.0f, 226.0f),
                    PathNode.CurveTo(74.47715f, 226.0f, 70.0f, 221.52284f, 70.0f, 216.0f),
                    PathNode.LineTo(70.0f, 206.0f),
                    PathNode.LineTo(186.0f, 206.0f),
                    PathNode.LineTo(186.0f, 216.0f),
                    PathNode.CurveTo(186.0f, 221.52284f, 181.52284f, 226.0f, 176.0f, 226.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
