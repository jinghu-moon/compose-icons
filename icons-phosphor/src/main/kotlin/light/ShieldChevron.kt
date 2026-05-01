package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) return _shieldChevron!!
        _shieldChevron = phosphorLightIcon(
            name = "ShieldChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 42.0f),
                    PathNode.LineTo(48.0f, 42.0f),
                    PathNode.CurveTo(40.268013f, 42.0f, 34.0f, 48.268013f, 34.0f, 56.0f),
                    PathNode.LineTo(34.0f, 112.0f),
                    PathNode.CurveTo(34.0f, 163.94f, 59.12f, 195.4f, 80.2f, 212.64f),
                    PathNode.CurveTo(102.93f, 231.24f, 125.47f, 237.53f, 126.42f, 237.79f),
                    PathNode.CurveTo(127.454414f, 238.07236f, 128.5456f, 238.07236f, 129.58f, 237.79f),
                    PathNode.CurveTo(130.53f, 237.53f, 153.07f, 231.24f, 175.8f, 212.64f),
                    PathNode.CurveTo(196.88f, 195.4f, 222.0f, 163.94f, 222.0f, 112.0f),
                    PathNode.LineTo(222.0f, 56.0f),
                    PathNode.CurveTo(222.0f, 48.268013f, 215.73198f, 42.0f, 208.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.56f, 203.06f),
                    PathNode.CurveTo(156.49606f, 212.96664f, 142.76065f, 220.64032f, 128.0f, 225.72f),
                    PathNode.CurveTo(113.23733f, 220.64484f, 99.501144f, 212.97073f, 87.44f, 203.06f),
                    PathNode.CurveTo(77.27904f, 194.79738f, 68.63049f, 184.83261f, 61.88f, 173.61f),
                    PathNode.LineTo(128.0f, 127.32f),
                    PathNode.LineTo(194.12f, 173.61f),
                    PathNode.CurveTo(187.3695f, 184.83261f, 178.72096f, 194.79738f, 168.56f, 203.06f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 112.0f),
                    PathNode.CurveTo(210.0f, 130.75f, 206.56f, 147.75f, 199.72f, 162.88f),
                    PathNode.LineTo(131.44f, 115.08f),
                    PathNode.CurveTo(129.37442f, 113.634575f, 126.62557f, 113.634575f, 124.56f, 115.08f),
                    PathNode.LineTo(56.28f, 162.88f),
                    PathNode.CurveTo(49.44f, 147.75f, 46.0f, 130.75f, 46.0f, 112.0f),
                    PathNode.LineTo(46.0f, 56.0f),
                    PathNode.CurveTo(46.0f, 54.89543f, 46.89543f, 54.0f, 48.0f, 54.0f),
                    PathNode.LineTo(208.0f, 54.0f),
                    PathNode.CurveTo(209.10457f, 54.0f, 210.0f, 54.89543f, 210.0f, 56.0f),
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
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
