package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrainSimple: ImageVector
    get() {
        if (_trainSimple != null) return _trainSimple!!
        _trainSimple = phosphorRegularIcon(
            name = "TrainSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(54.32689f, 24.0f, 40.0f, 38.32689f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(40.0f, 201.67311f, 54.32689f, 216.0f, 72.0f, 216.0f),
                    PathNode.LineTo(80.0f, 216.0f),
                    PathNode.LineTo(65.6f, 235.2f),
                    PathNode.CurveTo(62.94903f, 238.73462f, 63.66538f, 243.74904f, 67.2f, 246.4f),
                    PathNode.CurveTo(70.73462f, 249.05096f, 75.74903f, 248.33463f, 78.4f, 244.8f),
                    PathNode.LineTo(100.0f, 216.0f),
                    PathNode.LineTo(156.0f, 216.0f),
                    PathNode.LineTo(177.6f, 244.8f),
                    PathNode.CurveTo(180.25096f, 248.33463f, 185.26538f, 249.05096f, 188.8f, 246.4f),
                    PathNode.CurveTo(192.33463f, 243.74904f, 193.05096f, 238.73462f, 190.4f, 235.2f),
                    PathNode.LineTo(176.0f, 216.0f),
                    PathNode.LineTo(184.0f, 216.0f),
                    PathNode.CurveTo(201.67311f, 216.0f, 216.0f, 201.67311f, 216.0f, 184.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 38.32689f, 201.67311f, 24.0f, 184.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 40.0f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.CurveTo(192.83656f, 40.0f, 200.0f, 47.163445f, 200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.CurveTo(56.0f, 47.163445f, 63.163445f, 40.0f, 72.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 200.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(63.163445f, 200.0f, 56.0f, 192.83656f, 56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.CurveTo(200.0f, 192.83656f, 192.83656f, 200.0f, 184.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 172.0f),
                    PathNode.CurveTo(96.0f, 178.62741f, 90.62742f, 184.0f, 84.0f, 184.0f),
                    PathNode.CurveTo(77.37258f, 184.0f, 72.0f, 178.62741f, 72.0f, 172.0f),
                    PathNode.CurveTo(72.0f, 165.37259f, 77.37258f, 160.0f, 84.0f, 160.0f),
                    PathNode.CurveTo(90.62742f, 160.0f, 96.0f, 165.37259f, 96.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 172.0f),
                    PathNode.CurveTo(184.0f, 178.62741f, 178.62741f, 184.0f, 172.0f, 184.0f),
                    PathNode.CurveTo(165.37259f, 184.0f, 160.0f, 178.62741f, 160.0f, 172.0f),
                    PathNode.CurveTo(160.0f, 165.37259f, 165.37259f, 160.0f, 172.0f, 160.0f),
                    PathNode.CurveTo(178.62741f, 160.0f, 184.0f, 165.37259f, 184.0f, 172.0f),
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
        return _trainSimple!!
    }

private var _trainSimple: ImageVector? = null
