package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorThinIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 136.0f),
                    PathNode.CurveTo(87.58172f, 136.0f, 84.0f, 132.41827f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 123.58172f, 87.58172f, 120.0f, 92.0f, 120.0f),
                    PathNode.CurveTo(96.41828f, 120.0f, 100.0f, 123.58172f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 132.41827f, 96.41828f, 136.0f, 92.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 120.0f),
                    PathNode.CurveTo(159.58173f, 120.0f, 156.0f, 123.58172f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 132.41827f, 159.58173f, 136.0f, 164.0f, 136.0f),
                    PathNode.CurveTo(168.41827f, 136.0f, 172.0f, 132.41827f, 172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 123.58172f, 168.41827f, 120.0f, 164.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(153.87f, 164.62f),
                    PathNode.CurveTo(138.02907f, 174.46771f, 117.970924f, 174.46771f, 102.13f, 164.62f),
                    PathNode.CurveTo(100.27197f, 163.57309f, 97.91936f, 164.16801f, 96.78234f, 165.9723f),
                    PathNode.CurveTo(95.64532f, 167.7766f, 96.12382f, 170.15562f, 97.87f, 171.38f),
                    PathNode.CurveTo(116.31478f, 182.86563f, 139.68521f, 182.86563f, 158.13f, 171.38f),
                    PathNode.CurveTo(159.41595f, 170.65543f, 160.19836f, 169.28154f, 160.16544f, 167.80586f),
                    PathNode.CurveTo(160.1325f, 166.33022f, 159.28957f, 164.9926f, 157.97256f, 164.3261f),
                    PathNode.CurveTo(156.65556f, 163.65962f, 155.07857f, 163.7726f, 153.87f, 164.62f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 183.22847f, 183.22847f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(72.77152f, 228.0f, 28.0f, 183.22847f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 72.77152f, 72.77152f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(183.20334f, 28.060623f, 227.93938f, 72.79665f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(219.95264f, 77.961754f, 179.96587f, 37.11363f, 129.94f, 36.0f),
                    PathNode.CurveTo(116.26f, 54.07f, 116.0f, 71.83f, 116.0f, 72.0f),
                    PathNode.CurveTo(116.0f, 78.62742f, 121.37258f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(134.62741f, 84.0f, 140.0f, 78.62742f, 140.0f, 72.0f),
                    PathNode.CurveTo(140.0f, 69.79086f, 141.79086f, 68.0f, 144.0f, 68.0f),
                    PathNode.CurveTo(146.20914f, 68.0f, 148.0f, 69.79086f, 148.0f, 72.0f),
                    PathNode.CurveTo(148.0f, 83.04569f, 139.0457f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(116.95431f, 92.0f, 108.0f, 83.04569f, 108.0f, 72.0f),
                    PathNode.CurveTo(108.0f, 71.22f, 108.16f, 54.69f, 120.0f, 36.36f),
                    PathNode.CurveTo(70.41645f, 40.688007f, 33.265724f, 83.66429f, 36.15516f, 133.35243f),
                    PathNode.CurveTo(39.044598f, 183.04056f, 80.92634f, 221.42099f, 130.67734f, 219.97255f),
                    PathNode.CurveTo(180.42833f, 218.52411f, 220.00623f, 177.77208f, 220.0f, 128.0f),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
