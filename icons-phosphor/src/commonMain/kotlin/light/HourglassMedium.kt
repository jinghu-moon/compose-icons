package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HourglassMedium: ImageVector
    get() {
        if (_hourglassMedium != null) return _hourglassMedium!!
        _hourglassMedium = phosphorLightIcon(
            name = "HourglassMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.0f, 75.64f),
                    PathNode.LineTo(198.0f, 40.0f),
                    PathNode.CurveTo(198.0f, 32.268013f, 191.73198f, 26.0f, 184.0f, 26.0f),
                    PathNode.LineTo(72.0f, 26.0f),
                    PathNode.CurveTo(64.26801f, 26.0f, 58.0f, 32.268013f, 58.0f, 40.0f),
                    PathNode.LineTo(58.0f, 76.0f),
                    PathNode.CurveTo(58.00939f, 80.40438f, 60.08213f, 84.54986f, 63.6f, 87.2f),
                    PathNode.LineTo(118.0f, 128.0f),
                    PathNode.LineTo(63.6f, 168.8f),
                    PathNode.CurveTo(60.08213f, 171.45015f, 58.00939f, 175.59563f, 58.0f, 180.0f),
                    PathNode.LineTo(58.0f, 216.0f),
                    PathNode.CurveTo(58.0f, 223.73198f, 64.26801f, 230.0f, 72.0f, 230.0f),
                    PathNode.LineTo(184.0f, 230.0f),
                    PathNode.CurveTo(191.73198f, 230.0f, 198.0f, 223.73198f, 198.0f, 216.0f),
                    PathNode.LineTo(198.0f, 180.36f),
                    PathNode.CurveTo(197.98764f, 175.97389f, 195.93199f, 171.84409f, 192.44f, 169.19f),
                    PathNode.LineTo(138.0f, 128.0f),
                    PathNode.LineTo(192.49f, 86.81f),
                    PathNode.CurveTo(195.96317f, 84.14562f, 197.99954f, 80.01742f, 198.0f, 75.64f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 40.0f),
                    PathNode.CurveTo(70.0f, 38.89543f, 70.89543f, 38.0f, 72.0f, 38.0f),
                    PathNode.LineTo(184.0f, 38.0f),
                    PathNode.CurveTo(185.10457f, 38.0f, 186.0f, 38.89543f, 186.0f, 40.0f),
                    PathNode.LineTo(186.0f, 75.64f),
                    PathNode.CurveTo(186.00237f, 76.26776f, 185.70984f, 76.86021f, 185.21f, 77.24f),
                    PathNode.LineTo(178.9f, 82.0f),
                    PathNode.LineTo(76.67f, 82.0f),
                    PathNode.LineTo(70.8f, 77.6f),
                    PathNode.CurveTo(70.29639f, 77.22229f, 70.0f, 76.62952f, 70.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 120.49f),
                    PathNode.LineTo(92.67f, 94.0f),
                    PathNode.LineTo(163.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 180.36f),
                    PathNode.LineTo(186.0f, 216.0f),
                    PathNode.CurveTo(186.0f, 217.10457f, 185.10457f, 218.0f, 184.0f, 218.0f),
                    PathNode.LineTo(72.0f, 218.0f),
                    PathNode.CurveTo(70.89543f, 218.0f, 70.0f, 217.10457f, 70.0f, 216.0f),
                    PathNode.LineTo(70.0f, 180.0f),
                    PathNode.CurveTo(70.0f, 179.37048f, 70.29639f, 178.77771f, 70.8f, 178.4f),
                    PathNode.LineTo(122.0f, 140.0f),
                    PathNode.LineTo(122.0f, 168.0f),
                    PathNode.CurveTo(122.0f, 171.3137f, 124.686295f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(131.3137f, 174.0f, 134.0f, 171.3137f, 134.0f, 168.0f),
                    PathNode.LineTo(134.0f, 140.06f),
                    PathNode.LineTo(185.21f, 178.76f),
                    PathNode.CurveTo(185.70984f, 179.13979f, 186.00237f, 179.73224f, 186.0f, 180.36f),
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
        return _hourglassMedium!!
    }

private var _hourglassMedium: ImageVector? = null
