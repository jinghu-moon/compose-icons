package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorLightIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 90.0f),
                    PathNode.LineTo(150.0f, 90.0f),
                    PathNode.LineTo(150.0f, 40.0f),
                    PathNode.CurveTo(150.0f, 32.268013f, 143.73198f, 26.0f, 136.0f, 26.0f),
                    PathNode.LineTo(72.0f, 26.0f),
                    PathNode.CurveTo(64.26801f, 26.0f, 58.0f, 32.268013f, 58.0f, 40.0f),
                    PathNode.LineTo(58.0f, 88.0f),
                    PathNode.CurveTo(58.0f, 95.73199f, 64.26801f, 102.0f, 72.0f, 102.0f),
                    PathNode.LineTo(138.0f, 102.0f),
                    PathNode.LineTo(138.0f, 154.0f),
                    PathNode.LineTo(72.0f, 154.0f),
                    PathNode.CurveTo(64.26801f, 154.0f, 58.0f, 160.26802f, 58.0f, 168.0f),
                    PathNode.LineTo(58.0f, 216.0f),
                    PathNode.CurveTo(58.0f, 223.73198f, 64.26801f, 230.0f, 72.0f, 230.0f),
                    PathNode.LineTo(136.0f, 230.0f),
                    PathNode.CurveTo(143.73198f, 230.0f, 150.0f, 223.73198f, 150.0f, 216.0f),
                    PathNode.LineTo(150.0f, 166.0f),
                    PathNode.LineTo(216.0f, 166.0f),
                    PathNode.CurveTo(223.73198f, 166.0f, 230.0f, 159.73198f, 230.0f, 152.0f),
                    PathNode.LineTo(230.0f, 104.0f),
                    PathNode.CurveTo(230.0f, 96.26801f, 223.73198f, 90.0f, 216.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 216.0f),
                    PathNode.CurveTo(138.0f, 217.10457f, 137.10457f, 218.0f, 136.0f, 218.0f),
                    PathNode.LineTo(72.0f, 218.0f),
                    PathNode.CurveTo(70.89543f, 218.0f, 70.0f, 217.10457f, 70.0f, 216.0f),
                    PathNode.LineTo(70.0f, 168.0f),
                    PathNode.CurveTo(70.0f, 166.89543f, 70.89543f, 166.0f, 72.0f, 166.0f),
                    PathNode.LineTo(138.0f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 90.0f),
                    PathNode.LineTo(72.0f, 90.0f),
                    PathNode.CurveTo(70.89543f, 90.0f, 70.0f, 89.10457f, 70.0f, 88.0f),
                    PathNode.LineTo(70.0f, 40.0f),
                    PathNode.CurveTo(70.0f, 38.89543f, 70.89543f, 38.0f, 72.0f, 38.0f),
                    PathNode.LineTo(136.0f, 38.0f),
                    PathNode.CurveTo(137.10457f, 38.0f, 138.0f, 38.89543f, 138.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 152.0f),
                    PathNode.CurveTo(218.0f, 153.10457f, 217.10457f, 154.0f, 216.0f, 154.0f),
                    PathNode.LineTo(150.0f, 154.0f),
                    PathNode.LineTo(150.0f, 102.0f),
                    PathNode.LineTo(216.0f, 102.0f),
                    PathNode.CurveTo(217.10457f, 102.0f, 218.0f, 102.89543f, 218.0f, 104.0f),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
