package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) return _projectorScreen!!
        _projectorScreen = phosphorThinIcon(
            name = "ProjectorScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 76.0f),
                    PathNode.CurveTo(222.62741f, 76.0f, 228.0f, 70.62742f, 228.0f, 64.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 41.37258f, 222.62741f, 36.0f, 216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(33.37258f, 36.0f, 28.0f, 41.37258f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 70.62742f, 33.37258f, 76.0f, 40.0f, 76.0f),
                    PathNode.LineTo(44.0f, 76.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.LineTo(32.0f, 180.0f),
                    PathNode.CurveTo(29.790861f, 180.0f, 28.0f, 181.79086f, 28.0f, 184.0f),
                    PathNode.CurveTo(28.0f, 186.20914f, 29.790861f, 188.0f, 32.0f, 188.0f),
                    PathNode.LineTo(124.0f, 188.0f),
                    PathNode.LineTo(124.0f, 212.4f),
                    PathNode.CurveTo(113.94015f, 214.45346f, 107.06932f, 223.7908f, 108.10128f, 234.0061f),
                    PathNode.CurveTo(109.13323f, 244.2214f, 117.732704f, 251.99591f, 128.0f, 251.99591f),
                    PathNode.CurveTo(138.2673f, 251.99591f, 146.86678f, 244.2214f, 147.89873f, 234.0061f),
                    PathNode.CurveTo(148.93068f, 223.7908f, 142.05986f, 214.45346f, 132.0f, 212.4f),
                    PathNode.LineTo(132.0f, 188.0f),
                    PathNode.LineTo(224.0f, 188.0f),
                    PathNode.CurveTo(226.20914f, 188.0f, 228.0f, 186.20914f, 228.0f, 184.0f),
                    PathNode.CurveTo(228.0f, 181.79086f, 226.20914f, 180.0f, 224.0f, 180.0f),
                    PathNode.LineTo(212.0f, 180.0f),
                    PathNode.LineTo(212.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 232.0f),
                    PathNode.CurveTo(140.0f, 238.62741f, 134.62741f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(121.37258f, 244.0f, 116.0f, 238.62741f, 116.0f, 232.0f),
                    PathNode.CurveTo(116.0f, 225.37259f, 121.37258f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(134.62741f, 220.0f, 140.0f, 225.37259f, 140.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 64.0f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 45.79086f, 37.79086f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(218.20914f, 44.0f, 220.0f, 45.79086f, 220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 66.20914f, 218.20914f, 68.0f, 216.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(37.79086f, 68.0f, 36.0f, 66.20914f, 36.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 180.0f),
                    PathNode.LineTo(52.0f, 180.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.LineTo(204.0f, 76.0f),
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
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
