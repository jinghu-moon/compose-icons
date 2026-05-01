package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorThinIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.85f, 61.48f),
                    PathNode.CurveTo(218.02116f, 59.385437f, 213.35701f, 59.534782f, 209.67f, 61.87f),
                    PathNode.LineTo(124.0f, 116.43f),
                    PathNode.LineTo(124.0f, 71.84f),
                    PathNode.CurveTo(124.03113f, 67.51304f, 121.66351f, 63.52467f, 117.85f, 61.48f),
                    PathNode.CurveTo(114.02116f, 59.385437f, 109.357f, 59.534782f, 105.67f, 61.87f),
                    PathNode.LineTo(17.48f, 118.0f),
                    PathNode.CurveTo(14.067698f, 120.16666f, 12.000498f, 123.92794f, 12.000498f, 127.97f),
                    PathNode.CurveTo(12.000498f, 132.01205f, 14.067698f, 135.77335f, 17.48f, 137.94f),
                    PathNode.LineTo(105.67f, 194.1f),
                    PathNode.CurveTo(109.357f, 196.43521f, 114.02116f, 196.58456f, 117.85f, 194.49f),
                    PathNode.CurveTo(121.653946f, 192.45038f, 124.01997f, 188.47621f, 124.0f, 184.16f),
                    PathNode.LineTo(124.0f, 139.57f),
                    PathNode.LineTo(209.67f, 194.13f),
                    PathNode.CurveTo(213.35701f, 196.46521f, 218.02116f, 196.61456f, 221.85f, 194.52f),
                    PathNode.CurveTo(225.66351f, 192.47533f, 228.03111f, 188.48695f, 228.0f, 184.16f),
                    PathNode.LineTo(228.0f, 71.84f),
                    PathNode.CurveTo(228.03111f, 67.51304f, 225.66351f, 63.52467f, 221.85f, 61.48f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 184.16f),
                    PathNode.CurveTo(116.01018f, 185.56226f, 115.2392f, 186.85365f, 114.0f, 187.51f),
                    PathNode.CurveTo(112.74385f, 188.20403f, 111.208435f, 188.15413f, 110.0f, 187.38f),
                    PathNode.LineTo(21.78f, 131.22f),
                    PathNode.CurveTo(20.671135f, 130.52513f, 19.99782f, 129.3086f, 19.99782f, 128.0f),
                    PathNode.CurveTo(19.99782f, 126.6914f, 20.671135f, 125.47487f, 21.78f, 124.78f),
                    PathNode.LineTo(110.0f, 68.62f),
                    PathNode.CurveTo(110.63489f, 68.21007f, 111.374275f, 67.99138f, 112.13f, 67.99f),
                    PathNode.CurveTo(112.79845f, 67.99445f, 113.45512f, 68.16636f, 114.04f, 68.49f),
                    PathNode.CurveTo(115.2792f, 69.146355f, 116.05018f, 70.43775f, 116.04f, 71.84f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 184.16f),
                    PathNode.CurveTo(220.01018f, 185.56226f, 219.2392f, 186.85365f, 218.0f, 187.51f),
                    PathNode.CurveTo(216.74385f, 188.20403f, 215.20844f, 188.15413f, 214.0f, 187.38f),
                    PathNode.LineTo(125.82f, 131.22f),
                    PathNode.CurveTo(124.711136f, 130.52513f, 124.03782f, 129.3086f, 124.03782f, 128.0f),
                    PathNode.CurveTo(124.03782f, 126.6914f, 124.711136f, 125.47487f, 125.82f, 124.78f),
                    PathNode.LineTo(214.0f, 68.62f),
                    PathNode.CurveTo(214.63487f, 68.21007f, 215.37427f, 67.99138f, 216.13f, 67.99f),
                    PathNode.CurveTo(216.79845f, 67.99445f, 217.45511f, 68.16636f, 218.04f, 68.49f),
                    PathNode.CurveTo(219.27919f, 69.146355f, 220.05019f, 70.43775f, 220.04f, 71.84f),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
