package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorLightIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.47f, 156.0f),
                    PathNode.CurveTo(177.18655f, 139.4991f, 177.18655f, 116.5009f, 164.47f, 100.0f),
                    PathNode.LineTo(195.71f, 68.77f),
                    PathNode.CurveTo(225.43121f, 102.65634f, 225.43121f, 153.32365f, 195.71f, 187.21f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 128.0f),
                    PathNode.CurveTo(94.0f, 109.22232f, 109.22232f, 94.0f, 128.0f, 94.0f),
                    PathNode.CurveTo(146.77768f, 94.0f, 162.0f, 109.22232f, 162.0f, 128.0f),
                    PathNode.CurveTo(162.0f, 146.77768f, 146.77768f, 162.0f, 128.0f, 162.0f),
                    PathNode.CurveTo(109.22232f, 162.0f, 94.0f, 146.77768f, 94.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.22f, 60.29f),
                    PathNode.LineTo(156.0f, 91.53f),
                    PathNode.CurveTo(139.4991f, 78.813446f, 116.5009f, 78.813446f, 100.0f, 91.53f),
                    PathNode.LineTo(68.78f, 60.29f),
                    PathNode.CurveTo(102.66634f, 30.568789f, 153.33366f, 30.568789f, 187.22f, 60.29f),
                    PathNode.Close,
                    PathNode.MoveTo(60.29f, 68.78f),
                    PathNode.LineTo(91.53f, 100.0f),
                    PathNode.CurveTo(78.813446f, 116.5009f, 78.813446f, 139.4991f, 91.53f, 156.0f),
                    PathNode.LineTo(60.29f, 187.22f),
                    PathNode.CurveTo(30.568789f, 153.33366f, 30.568789f, 102.66634f, 60.29f, 68.78f),
                    PathNode.Close,
                    PathNode.MoveTo(68.78f, 195.71f),
                    PathNode.LineTo(100.0f, 164.47f),
                    PathNode.CurveTo(116.5009f, 177.18655f, 139.4991f, 177.18655f, 156.0f, 164.47f),
                    PathNode.LineTo(187.23f, 195.71f),
                    PathNode.CurveTo(153.34366f, 225.43121f, 102.676346f, 225.43121f, 68.79f, 195.71f),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
