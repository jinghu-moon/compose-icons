package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorRegularIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.00475f, 180.51962f, 181.80487f, 223.29427f, 129.29f, 224.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(103.4824f, 224.06114f, 79.88283f, 214.67862f, 62.1f, 197.8f),
                    PathNode.CurveTo(58.888466f, 194.76244f, 58.747433f, 189.69653f, 61.785f, 186.485f),
                    PathNode.CurveTo(64.82256f, 183.27347f, 69.888466f, 183.13243f, 73.1f, 186.17f),
                    PathNode.CurveTo(105.020294f, 216.27332f, 155.23099f, 215.04926f, 185.64648f, 183.42627f),
                    PathNode.CurveTo(216.06197f, 151.80328f, 215.33128f, 101.58298f, 184.00867f, 70.85826f),
                    PathNode.CurveTo(152.68605f, 40.13354f, 102.46098f, 40.37077f, 71.43f, 71.39f),
                    PathNode.CurveTo(71.348305f, 71.478355f, 71.26149f, 71.56184f, 71.17f, 71.64f),
                    PathNode.LineTo(44.59f, 96.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.CurveTo(76.41828f, 96.0f, 80.0f, 99.58172f, 80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 108.41828f, 76.41828f, 112.0f, 72.0f, 112.0f),
                    PathNode.LineTo(24.0f, 112.0f),
                    PathNode.CurveTo(19.581722f, 112.0f, 16.0f, 108.41828f, 16.0f, 104.0f),
                    PathNode.LineTo(16.0f, 56.0f),
                    PathNode.CurveTo(16.0f, 51.581722f, 19.581722f, 48.0f, 24.0f, 48.0f),
                    PathNode.CurveTo(28.418278f, 48.0f, 32.0f, 51.581722f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 85.8f),
                    PathNode.LineTo(60.25f, 60.0f),
                    PathNode.CurveTo(87.73327f, 32.62351f, 128.99176f, 24.477688f, 164.81732f, 39.35487f),
                    PathNode.CurveTo(200.6429f, 54.232056f, 223.99425f, 89.20822f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
