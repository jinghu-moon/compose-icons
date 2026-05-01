package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorDuotoneIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 203.34622f, 163.34622f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(92.65378f, 232.0f, 64.0f, 203.34622f, 64.0f, 168.0f),
                    PathNode.CurveTo(64.0f, 132.65378f, 92.65378f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(163.34622f, 104.0f, 192.0f, 132.65378f, 192.0f, 168.0f),
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
                    PathNode.MoveTo(136.0f, 96.46f),
                    PathNode.LineTo(136.0f, 62.13f),
                    PathNode.LineTo(163.88f, 78.86f),
                    PathNode.CurveTo(167.66867f, 81.135414f, 172.58458f, 79.90868f, 174.86f, 76.12f),
                    PathNode.CurveTo(177.1354f, 72.33133f, 175.90868f, 67.41541f, 172.12f, 65.14f),
                    PathNode.LineTo(143.55f, 48.0f),
                    PathNode.LineTo(172.12f, 30.86f),
                    PathNode.CurveTo(175.90868f, 28.584587f, 177.1354f, 23.668673f, 174.86f, 19.88f),
                    PathNode.CurveTo(172.58458f, 16.091326f, 167.66867f, 14.864587f, 163.88f, 17.14f),
                    PathNode.LineTo(128.0f, 38.67f),
                    PathNode.LineTo(92.12f, 17.14f),
                    PathNode.CurveTo(88.33133f, 14.864587f, 83.41541f, 16.091326f, 81.14f, 19.88f),
                    PathNode.CurveTo(78.864586f, 23.668673f, 80.09132f, 28.584587f, 83.88f, 30.86f),
                    PathNode.LineTo(112.45f, 48.0f),
                    PathNode.LineTo(83.88f, 65.14f),
                    PathNode.CurveTo(80.09132f, 67.41541f, 78.864586f, 72.33133f, 81.14f, 76.12f),
                    PathNode.CurveTo(83.41541f, 79.90868f, 88.33133f, 81.135414f, 92.12f, 78.86f),
                    PathNode.LineTo(120.0f, 62.13f),
                    PathNode.LineTo(120.0f, 96.46f),
                    PathNode.CurveTo(82.02854f, 100.70534f, 53.98558f, 133.87154f, 56.11154f, 172.02039f),
                    PathNode.CurveTo(58.237507f, 210.16924f, 89.791954f, 240.01418f, 128.0f, 240.01418f),
                    PathNode.CurveTo(166.20804f, 240.01418f, 197.7625f, 210.16924f, 199.88846f, 172.02039f),
                    PathNode.CurveTo(202.01442f, 133.87154f, 173.97147f, 100.70534f, 136.0f, 96.46f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 224.0f),
                    PathNode.CurveTo(97.07206f, 224.0f, 72.0f, 198.92795f, 72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 137.07205f, 97.07206f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(158.92795f, 112.0f, 184.0f, 137.07205f, 184.0f, 168.0f),
                    PathNode.CurveTo(183.96693f, 198.91423f, 158.91423f, 223.96693f, 128.0f, 224.0f),
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
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
