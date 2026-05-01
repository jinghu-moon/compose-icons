package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorThinIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 148.0f),
                    PathNode.LineTo(132.0f, 148.0f),
                    PathNode.LineTo(132.0f, 91.77f),
                    PathNode.CurveTo(150.98573f, 89.64733f, 165.00722f, 73.06423f, 163.94423f, 53.98981f),
                    PathNode.CurveTo(162.88124f, 34.915382f, 147.10402f, 19.992912f, 128.0f, 19.992912f),
                    PathNode.CurveTo(108.89598f, 19.992912f, 93.11875f, 34.915382f, 92.05577f, 53.98981f),
                    PathNode.CurveTo(90.99279f, 73.06423f, 105.01427f, 89.64733f, 124.0f, 91.77f),
                    PathNode.LineTo(124.0f, 148.0f),
                    PathNode.LineTo(48.0f, 148.0f),
                    PathNode.CurveTo(41.37258f, 148.0f, 36.0f, 153.37259f, 36.0f, 160.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 160.0f),
                    PathNode.CurveTo(220.0f, 153.37259f, 214.62741f, 148.0f, 208.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 56.0f),
                    PathNode.CurveTo(100.0f, 40.53603f, 112.536026f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(143.46397f, 28.0f, 156.0f, 40.53603f, 156.0f, 56.0f),
                    PathNode.CurveTo(156.0f, 71.463974f, 143.46397f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(112.536026f, 84.0f, 100.0f, 71.463974f, 100.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 160.0f),
                    PathNode.CurveTo(44.0f, 157.79086f, 45.79086f, 156.0f, 48.0f, 156.0f),
                    PathNode.LineTo(208.0f, 156.0f),
                    PathNode.CurveTo(210.20914f, 156.0f, 212.0f, 157.79086f, 212.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 120.0f),
                    PathNode.CurveTo(164.0f, 117.79086f, 165.79086f, 116.0f, 168.0f, 116.0f),
                    PathNode.LineTo(200.0f, 116.0f),
                    PathNode.CurveTo(202.20914f, 116.0f, 204.0f, 117.79086f, 204.0f, 120.0f),
                    PathNode.CurveTo(204.0f, 122.20914f, 202.20914f, 124.0f, 200.0f, 124.0f),
                    PathNode.LineTo(168.0f, 124.0f),
                    PathNode.CurveTo(165.79086f, 124.0f, 164.0f, 122.20914f, 164.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _joystick!!
    }

private var _joystick: ImageVector? = null
