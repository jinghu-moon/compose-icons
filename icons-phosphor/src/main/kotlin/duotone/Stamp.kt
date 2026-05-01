package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorDuotoneIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(159.46f, 53.0f),
                    PathNode.LineTo(141.68f, 136.0f),
                    PathNode.LineTo(114.32f, 136.0f),
                    PathNode.LineTo(96.54f, 53.0f),
                    PathNode.CurveTo(95.03159f, 45.91854f, 96.80071f, 38.534576f, 101.354416f, 32.905533f),
                    PathNode.CurveTo(105.90812f, 27.276487f, 112.759674f, 24.00404f, 120.0f, 24.0f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(143.24033f, 24.00404f, 150.09187f, 27.276487f, 154.64558f, 32.905533f),
                    PathNode.CurveTo(159.19928f, 38.534576f, 160.9684f, 45.91854f, 159.46f, 53.0f),
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
                    PathNode.MoveTo(224.0f, 224.0f),
                    PathNode.CurveTo(224.0f, 228.41827f, 220.41827f, 232.0f, 216.0f, 232.0f),
                    PathNode.LineTo(40.0f, 232.0f),
                    PathNode.CurveTo(35.581722f, 232.0f, 32.0f, 228.41827f, 32.0f, 224.0f),
                    PathNode.CurveTo(32.0f, 219.58173f, 35.581722f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(220.41827f, 216.0f, 224.0f, 219.58173f, 224.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 144.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.CurveTo(224.0f, 192.83656f, 216.83656f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(39.163445f, 200.0f, 32.0f, 192.83656f, 32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.CurveTo(32.0f, 135.16344f, 39.163445f, 128.0f, 48.0f, 128.0f),
                    PathNode.LineTo(104.43f, 128.0f),
                    PathNode.LineTo(88.72f, 54.71f),
                    PathNode.CurveTo(86.69376f, 45.26167f, 89.045555f, 35.40369f, 95.11894f, 27.887674f),
                    PathNode.CurveTo(101.19234f, 20.371658f, 110.336845f, 16.002594f, 120.0f, 16.0f),
                    PathNode.LineTo(136.0f, 16.0f),
                    PathNode.CurveTo(145.6649f, 15.999575f, 154.81224f, 20.367355f, 160.88791f, 27.883787f),
                    PathNode.CurveTo(166.96358f, 35.400215f, 169.3166f, 45.259956f, 167.29f, 54.71f),
                    PathNode.LineTo(151.57f, 128.0f),
                    PathNode.LineTo(208.0f, 128.0f),
                    PathNode.CurveTo(216.83656f, 128.0f, 224.0f, 135.16344f, 224.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.79f, 128.0f),
                    PathNode.LineTo(135.21f, 128.0f),
                    PathNode.LineTo(151.64f, 51.35f),
                    PathNode.CurveTo(152.65138f, 46.62657f, 151.47467f, 41.699047f, 148.43819f, 37.942265f),
                    PathNode.CurveTo(145.4017f, 34.185486f, 140.83049f, 32.00162f, 136.0f, 32.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.CurveTo(115.167755f, 31.9986f, 110.59373f, 34.181183f, 107.554955f, 37.938377f),
                    PathNode.CurveTo(104.51619f, 41.69557f, 103.33825f, 46.62486f, 104.35f, 51.35f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 184.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.LineTo(208.0f, 184.0f),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
