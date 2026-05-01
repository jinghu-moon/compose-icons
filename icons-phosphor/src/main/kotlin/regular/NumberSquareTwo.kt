package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) return _numberSquareTwo!!
        _numberSquareTwo = phosphorRegularIcon(
            name = "NumberSquareTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 176.0f),
                    PathNode.CurveTo(160.0f, 180.41827f, 156.41827f, 184.0f, 152.0f, 184.0f),
                    PathNode.LineTo(104.0f, 184.0f),
                    PathNode.CurveTo(100.969826f, 184.0f, 98.19972f, 182.28798f, 96.84458f, 179.57771f),
                    PathNode.CurveTo(95.48945f, 176.86742f, 95.78189f, 173.62415f, 97.6f, 171.2f),
                    PathNode.LineTo(140.77f, 113.64f),
                    PathNode.CurveTo(144.54596f, 108.60791f, 145.02252f, 101.83005f, 141.98785f, 96.31909f),
                    PathNode.CurveTo(138.95319f, 90.80814f, 132.9706f, 87.58708f, 126.699295f, 88.08764f),
                    PathNode.CurveTo(120.42799f, 88.588196f, 115.03208f, 92.71745f, 112.91f, 98.64f),
                    PathNode.CurveTo(111.4354f, 102.80699f, 106.86199f, 104.9896f, 102.695f, 103.515f),
                    PathNode.CurveTo(98.528015f, 102.0404f, 96.3454f, 97.46699f, 97.82f, 93.3f),
                    PathNode.CurveTo(98.918144f, 90.22013f, 100.47576f, 87.32405f, 102.44f, 84.71f),
                    PathNode.CurveTo(113.077f, 70.59637f, 133.14136f, 67.77799f, 147.255f, 78.415f),
                    PathNode.CurveTo(161.36864f, 89.052f, 164.18701f, 109.11636f, 153.55f, 123.23f),
                    PathNode.LineTo(120.0f, 168.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.CurveTo(156.41827f, 168.0f, 160.0f, 171.58173f, 160.0f, 176.0f),
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
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
