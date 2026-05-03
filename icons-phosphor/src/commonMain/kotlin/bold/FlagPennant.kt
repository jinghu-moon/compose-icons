package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) return _flagPennant!!
        _flagPennant = phosphorBoldIcon(
            name = "FlagPennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.94f, 92.67f),
                    PathNode.LineTo(59.94f, 28.67f),
                    PathNode.CurveTo(56.27174f, 27.394897f, 52.213203f, 27.973858f, 49.0478f, 30.223799f),
                    PathNode.CurveTo(45.882393f, 32.473736f, 44.001534f, 36.116444f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.CurveTo(62.62742f, 228.0f, 68.0f, 222.62741f, 68.0f, 216.0f),
                    PathNode.LineTo(68.0f, 176.53f),
                    PathNode.LineTo(243.94f, 115.33f),
                    PathNode.CurveTo(248.7585f, 113.648575f, 251.98637f, 109.10345f, 251.98637f, 104.0f),
                    PathNode.CurveTo(251.98637f, 98.89655f, 248.7585f, 94.351425f, 243.94f, 92.67f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 151.12f),
                    PathNode.LineTo(68.0f, 56.88f),
                    PathNode.LineTo(203.47f, 104.0f),
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
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
