package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorLightIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 154.0f),
                    PathNode.CurveTo(108.686295f, 154.0f, 106.0f, 156.6863f, 106.0f, 160.0f),
                    PathNode.LineTo(106.0f, 193.52f),
                    PathNode.LineTo(64.93f, 152.44f),
                    PathNode.CurveTo(63.04794f, 150.56947f, 61.992813f, 148.02348f, 62.0f, 145.37f),
                    PathNode.LineTo(62.0f, 93.37f),
                    PathNode.CurveTo(77.08978f, 90.28981f, 87.39602f, 76.283806f, 85.84808f, 60.960854f),
                    PathNode.CurveTo(84.300156f, 45.6379f, 71.40093f, 33.976124f, 56.0f, 33.976124f),
                    PathNode.CurveTo(40.59906f, 33.976124f, 27.699848f, 45.6379f, 26.151915f, 60.960854f),
                    PathNode.CurveTo(24.603983f, 76.283806f, 34.91022f, 90.28981f, 50.0f, 93.37f),
                    PathNode.LineTo(50.0f, 145.37f),
                    PathNode.CurveTo(49.98479f, 151.20813f, 52.3034f, 156.81023f, 56.44f, 160.93f),
                    PathNode.LineTo(97.52f, 202.0f),
                    PathNode.LineTo(64.0f, 202.0f),
                    PathNode.CurveTo(60.68629f, 202.0f, 58.0f, 204.6863f, 58.0f, 208.0f),
                    PathNode.CurveTo(58.0f, 211.3137f, 60.68629f, 214.0f, 64.0f, 214.0f),
                    PathNode.LineTo(112.0f, 214.0f),
                    PathNode.CurveTo(115.313705f, 214.0f, 118.0f, 211.3137f, 118.0f, 208.0f),
                    PathNode.LineTo(118.0f, 160.0f),
                    PathNode.CurveTo(118.0f, 156.6863f, 115.313705f, 154.0f, 112.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 64.0f),
                    PathNode.CurveTo(38.0f, 54.058876f, 46.058876f, 46.0f, 56.0f, 46.0f),
                    PathNode.CurveTo(65.941124f, 46.0f, 74.0f, 54.058876f, 74.0f, 64.0f),
                    PathNode.CurveTo(74.0f, 73.94112f, 65.941124f, 82.0f, 56.0f, 82.0f),
                    PathNode.CurveTo(46.058876f, 82.0f, 38.0f, 73.94112f, 38.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 162.6f),
                    PathNode.LineTo(206.0f, 110.6f),
                    PathNode.CurveTo(206.01521f, 104.76187f, 203.69661f, 99.159775f, 199.56f, 95.04f),
                    PathNode.LineTo(158.48f, 54.0f),
                    PathNode.LineTo(192.0f, 54.0f),
                    PathNode.CurveTo(195.3137f, 54.0f, 198.0f, 51.31371f, 198.0f, 48.0f),
                    PathNode.CurveTo(198.0f, 44.68629f, 195.3137f, 42.0f, 192.0f, 42.0f),
                    PathNode.LineTo(144.0f, 42.0f),
                    PathNode.CurveTo(140.6863f, 42.0f, 138.0f, 44.68629f, 138.0f, 48.0f),
                    PathNode.LineTo(138.0f, 96.0f),
                    PathNode.CurveTo(138.0f, 99.313705f, 140.6863f, 102.0f, 144.0f, 102.0f),
                    PathNode.CurveTo(147.3137f, 102.0f, 150.0f, 99.313705f, 150.0f, 96.0f),
                    PathNode.LineTo(150.0f, 62.48f),
                    PathNode.LineTo(191.07f, 103.56f),
                    PathNode.CurveTo(192.95206f, 105.430534f, 194.00719f, 107.97652f, 194.0f, 110.63f),
                    PathNode.LineTo(194.0f, 162.63f),
                    PathNode.CurveTo(178.91022f, 165.71019f, 168.60399f, 179.71619f, 170.15192f, 195.03914f),
                    PathNode.CurveTo(171.69984f, 210.3621f, 184.59906f, 222.0239f, 200.0f, 222.0239f),
                    PathNode.CurveTo(215.40094f, 222.0239f, 228.30016f, 210.3621f, 229.84808f, 195.03914f),
                    PathNode.CurveTo(231.39601f, 179.71619f, 221.08978f, 165.71019f, 206.0f, 162.63f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 210.0f),
                    PathNode.CurveTo(190.05887f, 210.0f, 182.0f, 201.94113f, 182.0f, 192.0f),
                    PathNode.CurveTo(182.0f, 182.05887f, 190.05887f, 174.0f, 200.0f, 174.0f),
                    PathNode.CurveTo(209.94113f, 174.0f, 218.0f, 182.05887f, 218.0f, 192.0f),
                    PathNode.CurveTo(218.0f, 201.94113f, 209.94113f, 210.0f, 200.0f, 210.0f),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
