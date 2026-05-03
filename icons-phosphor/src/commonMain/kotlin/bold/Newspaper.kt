package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorBoldIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 108.0f),
                    PathNode.CurveTo(92.0f, 101.37258f, 97.37258f, 96.0f, 104.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(182.62741f, 96.0f, 188.0f, 101.37258f, 188.0f, 108.0f),
                    PathNode.CurveTo(188.0f, 114.62742f, 182.62741f, 120.0f, 176.0f, 120.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.CurveTo(97.37258f, 120.0f, 92.0f, 114.62742f, 92.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.CurveTo(182.62741f, 160.0f, 188.0f, 154.62741f, 188.0f, 148.0f),
                    PathNode.CurveTo(188.0f, 141.37259f, 182.62741f, 136.0f, 176.0f, 136.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.CurveTo(97.37258f, 136.0f, 92.0f, 141.37259f, 92.0f, 148.0f),
                    PathNode.CurveTo(92.0f, 154.62741f, 97.37258f, 160.0f, 104.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 64.0f),
                    PathNode.LineTo(236.0f, 184.0f),
                    PathNode.CurveTo(236.0f, 199.46397f, 223.46397f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(36.0f, 212.0f),
                    PathNode.CurveTo(18.326887f, 212.0f, 4.0f, 197.67311f, 4.0f, 180.0f),
                    PathNode.LineTo(4.0f, 88.0f),
                    PathNode.CurveTo(4.0f, 81.37258f, 9.372583f, 76.0f, 16.0f, 76.0f),
                    PathNode.CurveTo(22.627417f, 76.0f, 28.0f, 81.37258f, 28.0f, 88.0f),
                    PathNode.LineTo(28.0f, 180.0f),
                    PathNode.CurveTo(28.0f, 184.41827f, 31.581722f, 188.0f, 36.0f, 188.0f),
                    PathNode.CurveTo(40.418278f, 188.0f, 44.0f, 184.41827f, 44.0f, 180.0f),
                    PathNode.LineTo(44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 52.954304f, 52.954304f, 44.0f, 64.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(227.0457f, 44.0f, 236.0f, 52.954304f, 236.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 68.0f),
                    PathNode.LineTo(68.0f, 68.0f),
                    PathNode.LineTo(68.0f, 180.0f),
                    PathNode.CurveTo(68.00527f, 182.69817f, 67.66927f, 185.38615f, 67.0f, 188.0f),
                    PathNode.LineTo(208.0f, 188.0f),
                    PathNode.CurveTo(210.20914f, 188.0f, 212.0f, 186.20914f, 212.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
