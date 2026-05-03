package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorThinIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 100.0f),
                    PathNode.CurveTo(172.0f, 104.41828f, 168.41827f, 108.0f, 164.0f, 108.0f),
                    PathNode.CurveTo(159.58173f, 108.0f, 156.0f, 104.41828f, 156.0f, 100.0f),
                    PathNode.CurveTo(156.0f, 95.58172f, 159.58173f, 92.0f, 164.0f, 92.0f),
                    PathNode.CurveTo(168.41827f, 92.0f, 172.0f, 95.58172f, 172.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 124.0f),
                    PathNode.CurveTo(127.58172f, 124.0f, 124.0f, 127.58172f, 124.0f, 132.0f),
                    PathNode.CurveTo(124.0f, 136.41827f, 127.58172f, 140.0f, 132.0f, 140.0f),
                    PathNode.CurveTo(136.41827f, 140.0f, 140.0f, 136.41827f, 140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 127.58172f, 136.41827f, 124.0f, 132.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 96.0f),
                    PathNode.CurveTo(212.0f, 142.39192f, 174.39192f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(81.60808f, 180.0f, 44.0f, 142.39192f, 44.0f, 96.0f),
                    PathNode.CurveTo(44.0f, 49.60808f, 81.60808f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(174.37135f, 12.049603f, 211.9504f, 49.628643f, 212.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 96.0f),
                    PathNode.CurveTo(204.0f, 54.02636f, 169.97365f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(86.02636f, 20.0f, 52.0f, 54.02636f, 52.0f, 96.0f),
                    PathNode.CurveTo(52.0f, 137.97365f, 86.02636f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(169.95538f, 171.9559f, 203.9559f, 137.95538f, 204.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.57f, 196.26f),
                    PathNode.CurveTo(153.0f, 201.47f, 140.34f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(115.66f, 204.0f, 103.0f, 201.47f, 89.43f, 196.26f),
                    PathNode.CurveTo(87.364456f, 195.47023f, 85.04977f, 196.50446f, 84.26f, 198.57f),
                    PathNode.CurveTo(83.47023f, 200.63553f, 84.504456f, 202.95023f, 86.57f, 203.74f),
                    PathNode.CurveTo(98.52511f, 208.4618f, 111.164696f, 211.2207f, 124.0f, 211.91f),
                    PathNode.LineTo(124.0f, 248.0f),
                    PathNode.CurveTo(124.0f, 250.20914f, 125.79086f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(130.20914f, 252.0f, 132.0f, 250.20914f, 132.0f, 248.0f),
                    PathNode.LineTo(132.0f, 211.91f),
                    PathNode.CurveTo(144.83531f, 211.2207f, 157.47488f, 208.4618f, 169.43f, 203.74f),
                    PathNode.CurveTo(171.49554f, 202.95023f, 172.52977f, 200.63553f, 171.74f, 198.57f),
                    PathNode.CurveTo(170.95023f, 196.50446f, 168.63553f, 195.47023f, 166.57f, 196.26f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _golf!!
    }

private var _golf: ImageVector? = null
