package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorThinIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.47f, 31.52f),
                    PathNode.CurveTo(221.38411f, 28.417835f, 216.84178f, 27.264963f, 212.65f, 28.52f),
                    PathNode.LineTo(20.74f, 86.67f),
                    PathNode.CurveTo(15.930938f, 88.02626f, 12.465556f, 92.22051f, 12.040667f, 97.199066f),
                    PathNode.CurveTo(11.615776f, 102.17761f, 14.32031f, 106.898445f, 18.83f, 109.05f),
                    PathNode.LineTo(105.0f, 151.0f),
                    PathNode.LineTo(146.92f, 237.15f),
                    PathNode.CurveTo(148.88199f, 241.34819f, 153.10603f, 244.02237f, 157.74f, 244.0f),
                    PathNode.CurveTo(158.08f, 244.0f, 158.43f, 244.0f, 158.74f, 244.0f),
                    PathNode.CurveTo(163.7088f, 243.61246f, 167.90858f, 240.16718f, 169.26f, 235.37f),
                    PathNode.LineTo(227.47f, 43.37f),
                    PathNode.LineTo(227.47f, 43.29f),
                    PathNode.CurveTo(228.70963f, 39.113487f, 227.55756f, 34.59358f, 224.47f, 31.52f),
                    PathNode.Close,
                    PathNode.MoveTo(219.85f, 41.06f),
                    PathNode.LineTo(161.62f, 233.06f),
                    PathNode.CurveTo(161.16455f, 234.67084f, 159.75423f, 235.8277f, 158.08542f, 235.95934f),
                    PathNode.CurveTo(156.41663f, 236.09096f, 154.84236f, 235.16951f, 154.14f, 233.65f),
                    PathNode.LineTo(112.84f, 148.79f),
                    PathNode.LineTo(162.84f, 98.79f),
                    PathNode.CurveTo(164.40297f, 97.227036f, 164.40297f, 94.69296f, 162.84f, 93.13f),
                    PathNode.CurveTo(161.27704f, 91.56703f, 158.74297f, 91.56703f, 157.18f, 93.13f),
                    PathNode.LineTo(107.18f, 143.13f),
                    PathNode.LineTo(22.28f, 101.82f),
                    PathNode.CurveTo(20.72947f, 101.12715f, 19.809717f, 99.50644f, 20.01f, 97.82f),
                    PathNode.CurveTo(20.132313f, 96.11257f, 21.345755f, 94.68071f, 23.01f, 94.28f),
                    PathNode.LineTo(214.9f, 36.16f),
                    PathNode.CurveTo(215.25723f, 36.05482f, 215.62761f, 36.00095f, 216.0f, 36.0f),
                    PathNode.CurveTo(217.05016f, 36.015003f, 218.05229f, 36.442436f, 218.79f, 37.19f),
                    PathNode.CurveTo(219.82487f, 38.188843f, 220.23145f, 39.67322f, 219.85f, 41.06f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
