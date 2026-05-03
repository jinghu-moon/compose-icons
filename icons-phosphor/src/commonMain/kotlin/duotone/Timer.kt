package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = phosphorDuotoneIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 136.0f),
                    PathNode.CurveTo(216.0f, 184.60106f, 176.60106f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(79.39894f, 224.0f, 40.0f, 184.60106f, 40.0f, 136.0f),
                    PathNode.CurveTo(40.0f, 87.39894f, 79.39894f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(176.60106f, 48.0f, 216.0f, 87.39894f, 216.0f, 136.0f),
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
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(74.98067f, 40.0f, 32.0f, 82.98067f, 32.0f, 136.0f),
                    PathNode.CurveTo(32.0f, 189.01933f, 74.98067f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(181.01933f, 232.0f, 224.0f, 189.01933f, 224.0f, 136.0f),
                    PathNode.CurveTo(223.93938f, 83.00579f, 180.9942f, 40.06062f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(83.81722f, 216.0f, 48.0f, 180.18279f, 48.0f, 136.0f),
                    PathNode.CurveTo(48.0f, 91.81722f, 83.81722f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(172.18279f, 56.0f, 208.0f, 91.81722f, 208.0f, 136.0f),
                    PathNode.CurveTo(207.9504f, 180.16223f, 172.16223f, 215.9504f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.66f, 90.34f),
                    PathNode.CurveTo(175.16223f, 91.840546f, 176.00629f, 93.876724f, 176.00629f, 96.0f),
                    PathNode.CurveTo(176.00629f, 98.123276f, 175.16223f, 100.159454f, 173.66f, 101.66f),
                    PathNode.LineTo(133.66f, 141.66f),
                    PathNode.CurveTo(130.53407f, 144.78593f, 125.465935f, 144.78593f, 122.34f, 141.66f),
                    PathNode.CurveTo(119.214066f, 138.53407f, 119.214066f, 133.46593f, 122.34f, 130.34f),
                    PathNode.LineTo(162.34f, 90.34f),
                    PathNode.CurveTo(163.84055f, 88.83778f, 165.87672f, 87.993706f, 168.0f, 87.993706f),
                    PathNode.CurveTo(170.12328f, 87.993706f, 172.15945f, 88.83778f, 173.66f, 90.34f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 16.0f),
                    PathNode.CurveTo(96.0f, 11.581722f, 99.58172f, 8.0f, 104.0f, 8.0f),
                    PathNode.LineTo(152.0f, 8.0f),
                    PathNode.CurveTo(156.41827f, 8.0f, 160.0f, 11.581722f, 160.0f, 16.0f),
                    PathNode.CurveTo(160.0f, 20.418278f, 156.41827f, 24.0f, 152.0f, 24.0f),
                    PathNode.LineTo(104.0f, 24.0f),
                    PathNode.CurveTo(99.58172f, 24.0f, 96.0f, 20.418278f, 96.0f, 16.0f),
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
        return _timer!!
    }

private var _timer: ImageVector? = null
