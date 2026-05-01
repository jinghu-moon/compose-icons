package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorThinIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.0f, 204.0f),
                    PathNode.CurveTo(76.98628f, 179.61093f, 101.250694f, 163.92848f, 128.0f, 163.92848f),
                    PathNode.CurveTo(154.7493f, 163.92848f, 179.01372f, 179.61093f, 190.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 202.20914f, 218.20914f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(198.67f, 204.0f),
                    PathNode.CurveTo(189.91144f, 181.98694f, 171.40866f, 165.30267f, 148.61f, 158.86f),
                    PathNode.CurveTo(166.46614f, 149.39325f, 175.57695f, 128.97963f, 170.6994f, 109.3666f),
                    PathNode.CurveTo(165.82185f, 89.75358f, 148.21042f, 75.98549f, 128.0f, 75.98549f),
                    PathNode.CurveTo(107.78958f, 75.98549f, 90.17814f, 89.75358f, 85.30059f, 109.3666f),
                    PathNode.CurveTo(80.42304f, 128.97963f, 89.53386f, 149.39325f, 107.39f, 158.86f),
                    PathNode.CurveTo(84.59133f, 165.30267f, 66.08857f, 181.98694f, 57.33f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 53.79086f, 220.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(108.11775f, 156.0f, 92.0f, 139.88223f, 92.0f, 120.0f),
                    PathNode.CurveTo(92.0f, 100.11775f, 108.11775f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(147.88223f, 84.0f, 164.0f, 100.11775f, 164.0f, 120.0f),
                    PathNode.CurveTo(164.0f, 139.88223f, 147.88223f, 156.0f, 128.0f, 156.0f),
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
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
