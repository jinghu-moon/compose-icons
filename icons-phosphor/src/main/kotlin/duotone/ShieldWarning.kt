package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) return _shieldWarning!!
        _shieldWarning = phosphorDuotoneIcon(
            name = "ShieldWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 208.0f, 128.0f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(128.0f, 232.0f, 40.0f, 208.0f, 40.0f, 112.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 51.581722f, 43.581722f, 48.0f, 48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(212.41827f, 48.0f, 216.0f, 51.581722f, 216.0f, 56.0f),
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
                    PathNode.MoveTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 91.58172f, 123.58172f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(132.41827f, 88.0f, 136.0f, 91.58172f, 136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 140.41827f, 132.41827f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(123.58172f, 144.0f, 120.0f, 140.41827f, 120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(134.62741f, 184.0f, 140.0f, 178.62741f, 140.0f, 172.0f),
                    PathNode.CurveTo(140.0f, 165.37259f, 134.62741f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(121.37258f, 160.0f, 116.0f, 165.37259f, 116.0f, 172.0f),
                    PathNode.CurveTo(116.0f, 178.62741f, 121.37258f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 164.72f, 198.48f, 196.67f, 177.07f, 214.19f),
                    PathNode.CurveTo(154.01f, 233.05f, 131.07f, 239.46f, 130.07f, 239.72f),
                    PathNode.CurveTo(128.69499f, 240.09406f, 127.24502f, 240.09406f, 125.87f, 239.72f),
                    PathNode.CurveTo(124.87f, 239.46f, 101.96f, 233.05f, 78.87f, 214.19f),
                    PathNode.CurveTo(57.52f, 196.67f, 32.0f, 164.72f, 32.0f, 112.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 47.163445f, 39.163445f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(216.83656f, 40.0f, 224.0f, 47.163445f, 224.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 56.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.CurveTo(48.0f, 149.3f, 61.82f, 179.51f, 89.07f, 201.81f),
                    PathNode.CurveTo(100.67249f, 211.29903f, 113.84856f, 218.68074f, 128.0f, 223.62f),
                    PathNode.CurveTo(142.33904f, 218.59311f, 155.6798f, 211.07814f, 167.41f, 201.42f),
                    PathNode.CurveTo(194.34f, 179.16f, 208.0f, 149.07f, 208.0f, 112.0f),
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
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
