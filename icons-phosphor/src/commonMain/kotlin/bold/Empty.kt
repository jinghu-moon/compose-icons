package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorBoldIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(203.63f, 62.65f),
                    PathNode.LineTo(216.88f, 48.07f),
                    PathNode.CurveTo(221.24089f, 43.15425f, 220.83693f, 35.64535f, 215.9738f, 31.225838f),
                    PathNode.CurveTo(211.1107f, 26.80632f, 203.5975f, 27.120228f, 199.12f, 31.93f),
                    PathNode.LineTo(185.88f, 46.49f),
                    PathNode.CurveTo(144.64182f, 17.4034f, 88.19384f, 23.600208f, 54.247936f, 60.94045f),
                    PathNode.CurveTo(20.30203f, 98.28069f, 19.496712f, 155.06207f, 52.37f, 193.35f),
                    PathNode.LineTo(39.12f, 207.93f),
                    PathNode.CurveTo(36.175465f, 211.09306f, 35.15908f, 215.59502f, 36.459072f, 219.71634f),
                    PathNode.CurveTo(37.759064f, 223.83765f, 41.174625f, 226.94165f, 45.401115f, 227.84271f),
                    PathNode.CurveTo(49.6276f, 228.74379f, 54.012154f, 227.30273f, 56.88f, 224.07f),
                    PathNode.LineTo(70.12f, 209.51f),
                    PathNode.CurveTo(111.358185f, 238.5966f, 167.80617f, 232.3998f, 201.75206f, 195.05956f),
                    PathNode.CurveTo(235.69797f, 157.71931f, 236.50328f, 100.93792f, 203.63f, 62.65f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 128.0f),
                    PathNode.CurveTo(51.976418f, 100.08624f, 67.268616f, 74.40969f, 91.82339f, 61.134075f),
                    PathNode.CurveTo(116.37815f, 47.858463f, 146.23674f, 49.1241f, 169.58f, 64.43f),
                    PathNode.LineTo(68.67f, 175.43f),
                    PathNode.CurveTo(57.86527f, 161.98463f, 51.983185f, 145.24876f, 52.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.0f),
                    PathNode.CurveTo(113.222374f, 204.01405f, 98.76534f, 199.69225f, 86.42f, 191.57f),
                    PathNode.LineTo(187.33f, 80.57f),
                    PathNode.CurveTo(205.60081f, 103.368515f, 209.17229f, 134.62706f, 196.515f, 160.9593f),
                    PathNode.CurveTo(183.85767f, 187.29155f, 157.21632f, 204.02748f, 128.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _empty!!
    }

private var _empty: ImageVector? = null
