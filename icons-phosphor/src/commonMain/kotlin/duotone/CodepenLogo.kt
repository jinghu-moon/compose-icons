package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorDuotoneIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 160.0f),
                    PathNode.LineTo(128.0f, 216.0f),
                    PathNode.LineTo(24.0f, 160.0f),
                    PathNode.LineTo(128.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.79f, 89.0f),
                    PathNode.LineTo(131.79f, 33.0f),
                    PathNode.CurveTo(129.42366f, 31.727034f, 126.57634f, 31.727034f, 124.21f, 33.0f),
                    PathNode.LineTo(20.21f, 89.0f),
                    PathNode.CurveTo(17.63141f, 90.38709f, 16.016596f, 93.07206f, 16.0f, 96.0f),
                    PathNode.LineTo(16.0f, 160.0f),
                    PathNode.CurveTo(15.99826f, 162.94589f, 17.61567f, 165.65439f, 20.21f, 167.05f),
                    PathNode.LineTo(124.21f, 223.05f),
                    PathNode.CurveTo(126.57634f, 224.32297f, 129.42366f, 224.32297f, 131.79f, 223.05f),
                    PathNode.LineTo(235.79f, 167.05f),
                    PathNode.CurveTo(238.38432f, 165.65439f, 240.00174f, 162.94589f, 240.0f, 160.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(239.9834f, 93.07206f, 238.36859f, 90.38709f, 235.79f, 89.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 146.61f),
                    PathNode.LineTo(189.45f, 128.0f),
                    PathNode.LineTo(224.0f, 109.39f),
                    PathNode.Close,
                    PathNode.MoveTo(172.57f, 118.91f),
                    PathNode.LineTo(136.0f, 99.22f),
                    PathNode.LineTo(136.0f, 53.39f),
                    PathNode.LineTo(215.13f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 142.91f),
                    PathNode.LineTo(100.3f, 128.0f),
                    PathNode.LineTo(128.0f, 113.09f),
                    PathNode.LineTo(155.7f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 53.39f),
                    PathNode.LineTo(120.0f, 99.22f),
                    PathNode.LineTo(83.43f, 118.91f),
                    PathNode.LineTo(40.87f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 109.39f),
                    PathNode.LineTo(66.55f, 128.0f),
                    PathNode.LineTo(32.0f, 146.61f),
                    PathNode.Close,
                    PathNode.MoveTo(83.43f, 137.09f),
                    PathNode.LineTo(120.0f, 156.78f),
                    PathNode.LineTo(120.0f, 202.61f),
                    PathNode.LineTo(40.87f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 202.61f),
                    PathNode.LineTo(136.0f, 156.78f),
                    PathNode.LineTo(172.57f, 137.09f),
                    PathNode.LineTo(215.13f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
