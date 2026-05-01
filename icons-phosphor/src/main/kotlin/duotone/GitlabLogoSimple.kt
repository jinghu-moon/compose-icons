package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) return _gitlabLogoSimple!!
        _gitlabLogoSimple = phosphorDuotoneIcon(
            name = "GitlabLogoSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(203.52f, 171.52f),
                    PathNode.LineTo(130.26f, 223.28f),
                    PathNode.CurveTo(128.90596f, 224.23907f, 127.09404f, 224.23907f, 125.74f, 223.28f),
                    PathNode.LineTo(52.48f, 171.52f),
                    PathNode.CurveTo(35.910088f, 159.67328f, 28.39727f, 138.81097f, 33.61f, 119.12f),
                    PathNode.LineTo(53.5f, 43.0f),
                    PathNode.CurveTo(53.92488f, 41.32966f, 55.388523f, 40.131065f, 57.109848f, 40.043846f),
                    PathNode.CurveTo(58.831173f, 39.956635f, 60.408466f, 41.001156f, 61.0f, 42.62f),
                    PathNode.LineTo(80.65f, 96.0f),
                    PathNode.LineTo(175.35f, 96.0f),
                    PathNode.LineTo(195.0f, 42.62f),
                    PathNode.CurveTo(195.57614f, 40.975285f, 197.16661f, 39.906418f, 198.90709f, 39.994247f),
                    PathNode.CurveTo(200.64758f, 40.08208f, 202.12238f, 41.305637f, 202.53f, 43.0f),
                    PathNode.LineTo(222.42f, 119.12f),
                    PathNode.CurveTo(227.62639f, 138.81732f, 220.10109f, 159.68114f, 203.52f, 171.52f),
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
