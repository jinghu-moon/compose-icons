package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) return _gitlabLogo!!
        _gitlabLogo = phosphorFillIcon(
            name = "GitlabLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.15f, 117.1f),
                    PathNode.LineTo(210.25f, 41.0f),
                    PathNode.CurveTo(208.95007f, 35.92655f, 204.49562f, 32.29247f, 199.26448f, 32.037685f),
                    PathNode.CurveTo(194.03334f, 31.7829f, 189.24681f, 34.966892f, 187.46f, 39.89f),
                    PathNode.LineTo(169.78f, 88.0f),
                    PathNode.LineTo(86.22f, 88.0f),
                    PathNode.LineTo(68.54f, 39.87f),
                    PathNode.CurveTo(66.74935f, 34.94763f, 61.959602f, 31.767063f, 56.728077f, 32.02646f),
                    PathNode.CurveTo(51.496555f, 32.285854f, 47.044926f, 35.924637f, 45.75f, 41.0f),
                    PathNode.LineTo(25.85f, 117.1f),
                    PathNode.CurveTo(19.833054f, 140.02773f, 28.583685f, 164.29083f, 47.85f, 178.1f),
                    PathNode.LineTo(121.12f, 229.86f),
                    PathNode.CurveTo(125.23836f, 232.76816f, 130.74165f, 232.76816f, 134.86f, 229.86f),
                    PathNode.LineTo(208.13f, 178.1f),
                    PathNode.CurveTo(227.40376f, 164.29605f, 236.1627f, 140.03195f, 230.15f, 117.1f),
                    PathNode.Close,
                    PathNode.MoveTo(40.68f, 124.1f),
                    PathNode.LineTo(114.13f, 176.0f),
                    PathNode.LineTo(93.41f, 190.65f),
                    PathNode.LineTo(57.09f, 165.0f),
                    PathNode.CurveTo(44.15104f, 155.70734f, 37.754757f, 139.76926f, 40.68f, 124.11f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 215.1f),
                    PathNode.LineTo(107.27f, 200.45f),
                    PathNode.LineTo(128.0f, 185.8f),
                    PathNode.LineTo(148.73f, 200.44f),
                    PathNode.Close,
                    PathNode.MoveTo(198.91f, 165.0f),
                    PathNode.LineTo(162.59f, 190.66f),
                    PathNode.LineTo(141.87f, 176.0f),
                    PathNode.LineTo(215.32f, 124.1f),
                    PathNode.CurveTo(218.24939f, 139.76254f, 211.85265f, 155.70567f, 198.91f, 165.0f),
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
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
