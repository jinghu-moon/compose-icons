package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorThinIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 92.0f),
                    PathNode.LineTo(148.0f, 92.0f),
                    PathNode.LineTo(148.0f, 40.0f),
                    PathNode.CurveTo(148.0f, 33.37258f, 142.62741f, 28.0f, 136.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(65.37258f, 28.0f, 60.0f, 33.37258f, 60.0f, 40.0f),
                    PathNode.LineTo(60.0f, 88.0f),
                    PathNode.CurveTo(60.0f, 94.62742f, 65.37258f, 100.0f, 72.0f, 100.0f),
                    PathNode.LineTo(140.0f, 100.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.LineTo(72.0f, 156.0f),
                    PathNode.CurveTo(65.37258f, 156.0f, 60.0f, 161.37259f, 60.0f, 168.0f),
                    PathNode.LineTo(60.0f, 216.0f),
                    PathNode.CurveTo(60.0f, 222.62741f, 65.37258f, 228.0f, 72.0f, 228.0f),
                    PathNode.LineTo(136.0f, 228.0f),
                    PathNode.CurveTo(142.62741f, 228.0f, 148.0f, 222.62741f, 148.0f, 216.0f),
                    PathNode.LineTo(148.0f, 164.0f),
                    PathNode.LineTo(216.0f, 164.0f),
                    PathNode.CurveTo(222.62741f, 164.0f, 228.0f, 158.62741f, 228.0f, 152.0f),
                    PathNode.LineTo(228.0f, 104.0f),
                    PathNode.CurveTo(228.0f, 97.37258f, 222.62741f, 92.0f, 216.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 216.0f),
                    PathNode.CurveTo(140.0f, 218.20914f, 138.20914f, 220.0f, 136.0f, 220.0f),
                    PathNode.LineTo(72.0f, 220.0f),
                    PathNode.CurveTo(69.79086f, 220.0f, 68.0f, 218.20914f, 68.0f, 216.0f),
                    PathNode.LineTo(68.0f, 168.0f),
                    PathNode.CurveTo(68.0f, 165.79086f, 69.79086f, 164.0f, 72.0f, 164.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 92.0f),
                    PathNode.LineTo(72.0f, 92.0f),
                    PathNode.CurveTo(69.79086f, 92.0f, 68.0f, 90.20914f, 68.0f, 88.0f),
                    PathNode.LineTo(68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 37.79086f, 69.79086f, 36.0f, 72.0f, 36.0f),
                    PathNode.LineTo(136.0f, 36.0f),
                    PathNode.CurveTo(138.20914f, 36.0f, 140.0f, 37.79086f, 140.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 154.20914f, 218.20914f, 156.0f, 216.0f, 156.0f),
                    PathNode.LineTo(148.0f, 156.0f),
                    PathNode.LineTo(148.0f, 100.0f),
                    PathNode.LineTo(216.0f, 100.0f),
                    PathNode.CurveTo(218.20914f, 100.0f, 220.0f, 101.79086f, 220.0f, 104.0f),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
