package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) return _gitlabLogoSimple!!
        _gitlabLogoSimple = phosphorFillIcon(
            name = "GitlabLogoSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.14f, 178.06f),
                    PathNode.LineTo(134.87f, 229.82f),
                    PathNode.CurveTo(130.75165f, 232.72815f, 125.24835f, 232.72815f, 121.13f, 229.82f),
                    PathNode.LineTo(47.86f, 178.06f),
                    PathNode.CurveTo(28.593683f, 164.25081f, 19.843054f, 139.98772f, 25.86f, 117.06f),
                    PathNode.LineTo(45.75f, 41.0f),
                    PathNode.CurveTo(47.049923f, 35.92655f, 51.504383f, 32.29247f, 56.735516f, 32.037685f),
                    PathNode.CurveTo(61.966652f, 31.7829f, 66.75319f, 34.966892f, 68.54f, 39.89f),
                    PathNode.LineTo(86.22f, 88.0f),
                    PathNode.LineTo(169.78f, 88.0f),
                    PathNode.LineTo(187.46f, 39.87f),
                    PathNode.CurveTo(189.25064f, 34.94763f, 194.0404f, 31.767063f, 199.27193f, 32.02646f),
                    PathNode.CurveTo(204.50345f, 32.285854f, 208.95508f, 35.924637f, 210.25f, 41.0f),
                    PathNode.LineTo(230.15f, 117.12f),
                    PathNode.CurveTo(236.13756f, 140.0311f, 227.38576f, 164.26254f, 208.14f, 178.06f),
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
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
