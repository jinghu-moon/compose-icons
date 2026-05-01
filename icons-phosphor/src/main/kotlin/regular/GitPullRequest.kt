package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorRegularIcon(
            name = "GitPullRequest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 64.0f),
                    PathNode.CurveTo(103.991615f, 47.372574f, 91.25031f, 33.521923f, 74.68136f, 32.12867f),
                    PathNode.CurveTo(58.1124f, 30.73542f, 43.237022f, 42.263836f, 40.452057f, 58.65638f),
                    PathNode.CurveTo(37.667088f, 75.04892f, 47.90056f, 90.84314f, 64.0f, 95.0f),
                    PathNode.LineTo(64.0f, 161.0f),
                    PathNode.CurveTo(48.397545f, 165.02853f, 38.224594f, 180.03029f, 40.25505f, 196.016f),
                    PathNode.CurveTo(42.2855f, 212.00171f, 55.885857f, 223.98387f, 72.0f, 223.98387f),
                    PathNode.CurveTo(88.11414f, 223.98387f, 101.7145f, 212.00171f, 103.74495f, 196.016f),
                    PathNode.CurveTo(105.7754f, 180.03029f, 95.602455f, 165.02853f, 80.0f, 161.0f),
                    PathNode.LineTo(80.0f, 95.0f),
                    PathNode.CurveTo(94.12211f, 91.33185f, 103.986206f, 78.59071f, 104.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 55.163445f, 63.163445f, 48.0f, 72.0f, 48.0f),
                    PathNode.CurveTo(80.836555f, 48.0f, 88.0f, 55.163445f, 88.0f, 64.0f),
                    PathNode.CurveTo(88.0f, 72.836555f, 80.836555f, 80.0f, 72.0f, 80.0f),
                    PathNode.CurveTo(63.163445f, 80.0f, 56.0f, 72.836555f, 56.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 192.0f),
                    PathNode.CurveTo(88.0f, 200.83656f, 80.836555f, 208.0f, 72.0f, 208.0f),
                    PathNode.CurveTo(63.163445f, 208.0f, 56.0f, 200.83656f, 56.0f, 192.0f),
                    PathNode.CurveTo(56.0f, 183.16344f, 63.163445f, 176.0f, 72.0f, 176.0f),
                    PathNode.CurveTo(80.836555f, 176.0f, 88.0f, 183.16344f, 88.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 161.0f),
                    PathNode.LineTo(208.0f, 110.63f),
                    PathNode.CurveTo(208.03226f, 104.25557f, 205.51141f, 98.1335f, 201.0f, 93.63f),
                    PathNode.LineTo(163.31f, 56.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.CurveTo(196.41827f, 56.0f, 200.0f, 52.418278f, 200.0f, 48.0f),
                    PathNode.CurveTo(200.0f, 43.581722f, 196.41827f, 40.0f, 192.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.CurveTo(139.58173f, 40.0f, 136.0f, 43.581722f, 136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.CurveTo(136.0f, 100.41828f, 139.58173f, 104.0f, 144.0f, 104.0f),
                    PathNode.CurveTo(148.41827f, 104.0f, 152.0f, 100.41828f, 152.0f, 96.0f),
                    PathNode.LineTo(152.0f, 67.31f),
                    PathNode.LineTo(189.66f, 105.0f),
                    PathNode.CurveTo(191.15993f, 106.50158f, 192.00166f, 108.537636f, 192.0f, 110.66f),
                    PathNode.LineTo(192.0f, 161.0f),
                    PathNode.CurveTo(176.39755f, 165.02853f, 166.2246f, 180.03029f, 168.25505f, 196.016f),
                    PathNode.CurveTo(170.2855f, 212.00171f, 183.88585f, 223.98387f, 200.0f, 223.98387f),
                    PathNode.CurveTo(216.11415f, 223.98387f, 229.7145f, 212.00171f, 231.74495f, 196.016f),
                    PathNode.CurveTo(233.7754f, 180.03029f, 223.60245f, 165.02853f, 208.0f, 161.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 208.0f),
                    PathNode.CurveTo(191.16344f, 208.0f, 184.0f, 200.83656f, 184.0f, 192.0f),
                    PathNode.CurveTo(184.0f, 183.16344f, 191.16344f, 176.0f, 200.0f, 176.0f),
                    PathNode.CurveTo(208.83656f, 176.0f, 216.0f, 183.16344f, 216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 200.83656f, 208.83656f, 208.0f, 200.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
