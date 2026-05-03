package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorFillIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.CurveTo(223.99162f, 47.372574f, 211.25032f, 33.521923f, 194.68135f, 32.12867f),
                    PathNode.CurveTo(178.1124f, 30.73542f, 163.23703f, 42.263836f, 160.45206f, 58.65638f),
                    PathNode.CurveTo(157.66708f, 75.04892f, 167.90056f, 90.84314f, 184.0f, 95.0f),
                    PathNode.LineTo(184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 116.41828f, 180.41827f, 120.0f, 176.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.CurveTo(75.58172f, 120.0f, 72.0f, 116.41828f, 72.0f, 112.0f),
                    PathNode.LineTo(72.0f, 95.0f),
                    PathNode.CurveTo(87.602455f, 90.971466f, 97.7754f, 75.9697f, 95.74495f, 59.983997f),
                    PathNode.CurveTo(93.7145f, 43.998287f, 80.11414f, 32.016132f, 64.0f, 32.016132f),
                    PathNode.CurveTo(47.885857f, 32.016132f, 34.2855f, 43.998287f, 32.25505f, 59.983997f),
                    PathNode.CurveTo(30.224598f, 75.9697f, 40.397545f, 90.971466f, 56.0f, 95.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 125.25484f, 66.74516f, 136.0f, 80.0f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 161.0f),
                    PathNode.CurveTo(104.397545f, 165.02853f, 94.2246f, 180.03029f, 96.25505f, 196.016f),
                    PathNode.CurveTo(98.2855f, 212.00171f, 111.88586f, 223.98387f, 128.0f, 223.98387f),
                    PathNode.CurveTo(144.11415f, 223.98387f, 157.7145f, 212.00171f, 159.74495f, 196.016f),
                    PathNode.CurveTo(161.7754f, 180.03029f, 151.60245f, 165.02853f, 136.0f, 161.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(189.25484f, 136.0f, 200.0f, 125.25484f, 200.0f, 112.0f),
                    PathNode.LineTo(200.0f, 95.0f),
                    PathNode.CurveTo(214.1221f, 91.33185f, 223.9862f, 78.59071f, 224.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 192.0f),
                    PathNode.CurveTo(144.0f, 200.83656f, 136.83656f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(119.163445f, 208.0f, 112.0f, 200.83656f, 112.0f, 192.0f),
                    PathNode.CurveTo(112.0f, 183.16344f, 119.163445f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(136.83656f, 176.0f, 144.0f, 183.16344f, 144.0f, 192.0f),
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
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
