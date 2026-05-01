package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorFillIcon(
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
                    PathNode.MoveTo(88.0f, 192.0f),
                    PathNode.CurveTo(88.0f, 200.83656f, 80.836555f, 208.0f, 72.0f, 208.0f),
                    PathNode.CurveTo(63.163445f, 208.0f, 56.0f, 200.83656f, 56.0f, 192.0f),
                    PathNode.CurveTo(56.0f, 183.16344f, 63.163445f, 176.0f, 72.0f, 176.0f),
                    PathNode.CurveTo(80.836555f, 176.0f, 88.0f, 183.16344f, 88.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 192.0f),
                    PathNode.CurveTo(231.99162f, 208.62743f, 219.25032f, 222.47807f, 202.68135f, 223.87132f),
                    PathNode.CurveTo(186.1124f, 225.26459f, 171.23703f, 213.73616f, 168.45206f, 197.34363f),
                    PathNode.CurveTo(165.66708f, 180.9511f, 175.90056f, 165.15686f, 192.0f, 161.0f),
                    PathNode.LineTo(192.0f, 110.63f),
                    PathNode.CurveTo(192.00166f, 108.50763f, 191.15993f, 106.47158f, 189.66f, 104.97f),
                    PathNode.LineTo(152.0f, 67.31f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(152.0f, 100.41828f, 148.41827f, 104.0f, 144.0f, 104.0f),
                    PathNode.CurveTo(139.58173f, 104.0f, 136.0f, 100.41828f, 136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.CurveTo(136.0f, 43.581722f, 139.58173f, 40.0f, 144.0f, 40.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.CurveTo(196.41827f, 40.0f, 200.0f, 43.581722f, 200.0f, 48.0f),
                    PathNode.CurveTo(200.0f, 52.418278f, 196.41827f, 56.0f, 192.0f, 56.0f),
                    PathNode.LineTo(163.31f, 56.0f),
                    PathNode.LineTo(201.0f, 93.66f),
                    PathNode.CurveTo(205.51141f, 98.163506f, 208.03226f, 104.285576f, 208.0f, 110.66f),
                    PathNode.LineTo(208.0f, 161.0f),
                    PathNode.CurveTo(222.1221f, 164.66814f, 231.9862f, 177.40929f, 232.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
