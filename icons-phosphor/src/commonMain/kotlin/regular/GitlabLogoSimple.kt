package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) return _gitlabLogoSimple!!
        _gitlabLogoSimple = phosphorRegularIcon(
            name = "GitlabLogoSimple",
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
                    PathNode.MoveTo(198.91f, 165.0f),
                    PathNode.LineTo(128.0f, 215.09f),
                    PathNode.LineTo(57.09f, 165.0f),
                    PathNode.CurveTo(43.265858f, 155.05988f, 37.00219f, 137.62498f, 41.34f, 121.16f),
                    PathNode.LineTo(58.0f, 57.5f),
                    PathNode.LineTo(73.13f, 98.76f),
                    PathNode.CurveTo(74.28724f, 101.90837f, 77.28568f, 104.000496f, 80.64f, 104.0f),
                    PathNode.LineTo(175.36f, 104.0f),
                    PathNode.CurveTo(178.71432f, 104.000496f, 181.71275f, 101.90837f, 182.87f, 98.76f),
                    PathNode.LineTo(198.0f, 57.5f),
                    PathNode.LineTo(214.63f, 121.15f),
                    PathNode.CurveTo(218.97873f, 137.6118f, 212.72702f, 155.05054f, 198.91f, 165.0f),
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
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
