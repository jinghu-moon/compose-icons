package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorFillIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.CurveTo(231.99162f, 47.372574f, 219.25032f, 33.521923f, 202.68135f, 32.12867f),
                    PathNode.CurveTo(186.1124f, 30.73542f, 171.23703f, 42.263836f, 168.45206f, 58.65638f),
                    PathNode.CurveTo(165.66708f, 75.04892f, 175.90056f, 90.84314f, 192.0f, 95.0f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.CurveTo(192.0f, 116.41828f, 188.41827f, 120.0f, 184.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(93.27405f, 119.999245f, 90.56816f, 120.46601f, 88.0f, 121.38f),
                    PathNode.LineTo(88.0f, 95.0f),
                    PathNode.CurveTo(103.602455f, 90.971466f, 113.7754f, 75.9697f, 111.74495f, 59.983997f),
                    PathNode.CurveTo(109.7145f, 43.998287f, 96.11414f, 32.016132f, 80.0f, 32.016132f),
                    PathNode.CurveTo(63.885857f, 32.016132f, 50.2855f, 43.998287f, 48.25505f, 59.983997f),
                    PathNode.CurveTo(46.224594f, 75.9697f, 56.397545f, 90.971466f, 72.0f, 95.0f),
                    PathNode.LineTo(72.0f, 161.0f),
                    PathNode.CurveTo(56.397545f, 165.02853f, 46.224594f, 180.03029f, 48.25505f, 196.016f),
                    PathNode.CurveTo(50.2855f, 212.00171f, 63.885857f, 223.98387f, 80.0f, 223.98387f),
                    PathNode.CurveTo(96.11414f, 223.98387f, 109.7145f, 212.00171f, 111.74495f, 196.016f),
                    PathNode.CurveTo(113.7754f, 180.03029f, 103.602455f, 165.02853f, 88.0f, 161.0f),
                    PathNode.LineTo(88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 139.58173f, 91.58172f, 136.0f, 96.0f, 136.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.CurveTo(197.25484f, 136.0f, 208.0f, 125.25484f, 208.0f, 112.0f),
                    PathNode.LineTo(208.0f, 95.0f),
                    PathNode.CurveTo(222.1221f, 91.33185f, 231.9862f, 78.59071f, 232.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 64.0f),
                    PathNode.CurveTo(64.0f, 55.163445f, 71.163445f, 48.0f, 80.0f, 48.0f),
                    PathNode.CurveTo(88.836555f, 48.0f, 96.0f, 55.163445f, 96.0f, 64.0f),
                    PathNode.CurveTo(96.0f, 72.836555f, 88.836555f, 80.0f, 80.0f, 80.0f),
                    PathNode.CurveTo(71.163445f, 80.0f, 64.0f, 72.836555f, 64.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 200.83656f, 88.836555f, 208.0f, 80.0f, 208.0f),
                    PathNode.CurveTo(71.163445f, 208.0f, 64.0f, 200.83656f, 64.0f, 192.0f),
                    PathNode.CurveTo(64.0f, 183.16344f, 71.163445f, 176.0f, 80.0f, 176.0f),
                    PathNode.CurveTo(88.836555f, 176.0f, 96.0f, 183.16344f, 96.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
