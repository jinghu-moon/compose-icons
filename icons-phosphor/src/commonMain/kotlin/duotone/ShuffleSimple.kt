package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorDuotoneIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(48.0f, 48.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 128.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.0f, 92.41828f, 212.41827f, 96.0f, 208.0f, 96.0f),
                    PathNode.CurveTo(203.58173f, 96.0f, 200.0f, 92.41828f, 200.0f, 88.0f),
                    PathNode.LineTo(200.0f, 67.31f),
                    PathNode.LineTo(156.28f, 111.0f),
                    PathNode.CurveTo(153.10591f, 113.718216f, 148.37445f, 113.53546f, 145.4195f, 110.580505f),
                    PathNode.CurveTo(142.46454f, 107.62556f, 142.2818f, 102.89408f, 145.0f, 99.72f),
                    PathNode.LineTo(188.69f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(163.58173f, 56.0f, 160.0f, 52.418278f, 160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 43.581722f, 163.58173f, 40.0f, 168.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(212.41827f, 40.0f, 216.0f, 43.581722f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 160.0f),
                    PathNode.CurveTo(203.58173f, 160.0f, 200.0f, 163.58173f, 200.0f, 168.0f),
                    PathNode.LineTo(200.0f, 188.69f),
                    PathNode.LineTo(53.66f, 42.34f),
                    PathNode.CurveTo(50.53407f, 39.21407f, 45.46593f, 39.21407f, 42.34f, 42.34f),
                    PathNode.CurveTo(39.21407f, 45.46593f, 39.21407f, 50.53407f, 42.34f, 53.66f),
                    PathNode.LineTo(188.69f, 200.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.CurveTo(163.58173f, 200.0f, 160.0f, 203.58173f, 160.0f, 208.0f),
                    PathNode.CurveTo(160.0f, 212.41827f, 163.58173f, 216.0f, 168.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(212.41827f, 216.0f, 216.0f, 212.41827f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(216.0f, 163.58173f, 212.41827f, 160.0f, 208.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(99.72f, 145.0f),
                    PathNode.LineTo(42.34f, 202.34f),
                    PathNode.CurveTo(39.21407f, 205.46593f, 39.21407f, 210.53407f, 42.34f, 213.66f),
                    PathNode.CurveTo(45.46593f, 216.78593f, 50.53407f, 216.78593f, 53.66f, 213.66f),
                    PathNode.LineTo(111.0f, 156.28f),
                    PathNode.CurveTo(113.718216f, 153.10591f, 113.53546f, 148.37445f, 110.580505f, 145.4195f),
                    PathNode.CurveTo(107.62556f, 142.46454f, 102.89408f, 142.2818f, 99.72f, 145.0f),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
