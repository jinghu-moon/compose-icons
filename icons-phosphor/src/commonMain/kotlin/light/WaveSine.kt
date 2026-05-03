package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorLightIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.43f, 130.55f),
                    PathNode.CurveTo(215.84f, 176.57f, 197.0f, 198.0f, 178.0f, 198.0f),
                    PathNode.CurveTo(154.17f, 198.0f, 138.8f, 165.24f, 122.53f, 130.55f),
                    PathNode.CurveTo(109.26f, 102.17f, 94.17f, 70.0f, 78.0f, 70.0f),
                    PathNode.CurveTo(68.82f, 70.0f, 53.0f, 80.5f, 29.47f, 130.55f),
                    PathNode.CurveTo(28.024897f, 133.4833f, 24.497095f, 134.71931f, 21.537268f, 133.32935f),
                    PathNode.CurveTo(18.577442f, 131.93938f, 17.275642f, 128.43532f, 18.61f, 125.45f),
                    PathNode.CurveTo(40.16f, 79.43f, 59.0f, 58.0f, 78.0f, 58.0f),
                    PathNode.CurveTo(101.83f, 58.0f, 117.2f, 90.76f, 133.47f, 125.45f),
                    PathNode.CurveTo(146.74f, 153.83f, 161.83f, 186.0f, 178.0f, 186.0f),
                    PathNode.CurveTo(187.18f, 186.0f, 203.05f, 175.5f, 226.53f, 125.45f),
                    PathNode.CurveTo(227.9751f, 122.51669f, 231.5029f, 121.28068f, 234.46274f, 122.670654f),
                    PathNode.CurveTo(237.42256f, 124.06063f, 238.72435f, 127.56469f, 237.39f, 130.55f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
