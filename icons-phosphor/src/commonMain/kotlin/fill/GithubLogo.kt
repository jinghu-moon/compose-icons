package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = phosphorFillIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 104.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.CurveTo(215.9652f, 139.98997f, 195.29022f, 163.66547f, 167.56f, 167.47f),
                    PathNode.CurveTo(173.0339f, 174.47461f, 176.00514f, 183.11021f, 176.0f, 192.0f),
                    PathNode.LineTo(176.0f, 232.0f),
                    PathNode.CurveTo(176.0f, 236.41827f, 172.41827f, 240.0f, 168.0f, 240.0f),
                    PathNode.LineTo(104.0f, 240.0f),
                    PathNode.CurveTo(99.58172f, 240.0f, 96.0f, 236.41827f, 96.0f, 232.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.CurveTo(49.90861f, 216.0f, 32.0f, 198.09138f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 162.74516f, 21.254833f, 152.0f, 8.0f, 152.0f),
                    PathNode.CurveTo(3.581722f, 152.0f, 0f, 148.41827f, 0f, 144.0f),
                    PathNode.CurveTo(0f, 139.58173f, 3.581722f, 136.0f, 8.0f, 136.0f),
                    PathNode.CurveTo(30.09139f, 136.0f, 48.0f, 153.90862f, 48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 189.25484f, 58.745167f, 200.0f, 72.0f, 200.0f),
                    PathNode.LineTo(96.0f, 200.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(95.99485f, 183.11021f, 98.96609f, 174.47461f, 104.44f, 167.47f),
                    PathNode.CurveTo(76.70977f, 163.66547f, 56.03481f, 139.98997f, 56.0f, 112.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.CurveTo(56.099606f, 94.05775f, 58.747276f, 84.30716f, 63.69f, 75.68f),
                    PathNode.CurveTo(58.746372f, 59.732723f, 60.697075f, 42.4447f, 69.07f, 28.0f),
                    PathNode.CurveTo(70.49938f, 25.524235f, 73.141235f, 23.999357f, 76.0f, 24.0f),
                    PathNode.CurveTo(94.89475f, 23.960451f, 112.694786f, 32.86047f, 124.0f, 48.0f),
                    PathNode.LineTo(148.0f, 48.0f),
                    PathNode.CurveTo(159.3052f, 32.86047f, 177.10522f, 23.960451f, 196.0f, 24.0f),
                    PathNode.CurveTo(198.85876f, 23.999357f, 201.50061f, 25.524235f, 202.93f, 28.0f),
                    PathNode.CurveTo(211.30432f, 42.44458f, 213.25162f, 59.734573f, 208.3f, 75.68f),
                    PathNode.CurveTo(213.25204f, 84.303795f, 215.9036f, 94.05599f, 216.0f, 104.0f),
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
        return _githubLogo!!
    }

private var _githubLogo: ImageVector? = null
