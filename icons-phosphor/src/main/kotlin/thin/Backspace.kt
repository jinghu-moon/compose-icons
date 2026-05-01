package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorThinIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(68.53f, 44.0f),
                    PathNode.CurveTo(64.317154f, 44.01266f, 60.41628f, 46.22278f, 58.24f, 49.83f),
                    PathNode.LineTo(12.57f, 125.94f),
                    PathNode.CurveTo(11.808348f, 127.20773f, 11.808348f, 128.79227f, 12.57f, 130.06f),
                    PathNode.LineTo(58.24f, 206.17f),
                    PathNode.CurveTo(60.41628f, 209.77722f, 64.317154f, 211.98734f, 68.53f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 202.20914f, 218.20914f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(68.53f, 204.0f),
                    PathNode.CurveTo(67.12534f, 204.00044f, 65.823395f, 203.26405f, 65.1f, 202.06f),
                    PathNode.LineTo(20.67f, 128.0f),
                    PathNode.LineTo(65.1f, 53.94f),
                    PathNode.CurveTo(65.823395f, 52.735943f, 67.12534f, 51.999565f, 68.53f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 53.79086f, 220.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.83f, 106.83f),
                    PathNode.LineTo(141.66f, 128.0f),
                    PathNode.LineTo(162.83f, 149.17f),
                    PathNode.CurveTo(164.39296f, 150.73297f, 164.39296f, 153.26703f, 162.83f, 154.83f),
                    PathNode.CurveTo(161.26703f, 156.39296f, 158.73297f, 156.39296f, 157.17f, 154.83f),
                    PathNode.LineTo(136.0f, 133.66f),
                    PathNode.LineTo(114.83f, 154.83f),
                    PathNode.CurveTo(113.26704f, 156.39296f, 110.73296f, 156.39296f, 109.17f, 154.83f),
                    PathNode.CurveTo(107.60703f, 153.26703f, 107.60703f, 150.73297f, 109.17f, 149.17f),
                    PathNode.LineTo(130.34f, 128.0f),
                    PathNode.LineTo(109.17f, 106.83f),
                    PathNode.CurveTo(107.60703f, 105.26704f, 107.60703f, 102.73296f, 109.17f, 101.17f),
                    PathNode.CurveTo(110.73296f, 99.60703f, 113.26704f, 99.60703f, 114.83f, 101.17f),
                    PathNode.LineTo(136.0f, 122.34f),
                    PathNode.LineTo(157.17f, 101.17f),
                    PathNode.CurveTo(158.73297f, 99.60703f, 161.26703f, 99.60703f, 162.83f, 101.17f),
                    PathNode.CurveTo(164.39296f, 102.73296f, 164.39296f, 105.26704f, 162.83f, 106.83f),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
