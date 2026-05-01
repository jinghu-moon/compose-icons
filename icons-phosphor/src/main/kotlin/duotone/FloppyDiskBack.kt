package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorDuotoneIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.CurveTo(176.0f, 84.41828f, 172.41827f, 88.0f, 168.0f, 88.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(83.58172f, 88.0f, 80.0f, 84.41828f, 80.0f, 80.0f),
                    PathNode.LineTo(80.0f, 40.73f),
                    PathNode.CurveTo(79.13021f, 41.122795f, 78.33772f, 41.668053f, 77.66f, 42.34f),
                    PathNode.LineTo(42.34f, 77.66f),
                    PathNode.CurveTo(40.84254f, 79.15913f, 40.00098f, 81.19109f, 40.0f, 83.31f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(212.41827f, 216.0f, 216.0f, 212.41827f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 43.581722f, 212.41827f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(110.32689f, 184.0f, 96.0f, 169.67311f, 96.0f, 152.0f),
                    PathNode.CurveTo(96.0f, 134.32689f, 110.32689f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(145.67311f, 120.0f, 160.0f, 134.32689f, 160.0f, 152.0f),
                    PathNode.CurveTo(160.0f, 169.67311f, 145.67311f, 184.0f, 128.0f, 184.0f),
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
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(83.31f, 32.0f),
                    PathNode.CurveTo(79.06421f, 31.986435f, 74.99025f, 33.67581f, 72.0f, 36.69f),
                    PathNode.LineTo(36.69f, 72.0f),
                    PathNode.CurveTo(33.67581f, 74.99025f, 31.986435f, 79.06421f, 32.0f, 83.31f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 80.0f),
                    PathNode.LineTo(88.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 83.31f),
                    PathNode.LineTo(72.0f, 59.31f),
                    PathNode.LineTo(72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 88.836555f, 79.163445f, 96.0f, 88.0f, 96.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.CurveTo(176.83656f, 96.0f, 184.0f, 88.836555f, 184.0f, 80.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.CurveTo(105.90861f, 112.0f, 88.0f, 129.90862f, 88.0f, 152.0f),
                    PathNode.CurveTo(88.0f, 174.09138f, 105.90861f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(150.09138f, 192.0f, 168.0f, 174.09138f, 168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 129.90862f, 150.09138f, 112.0f, 128.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 176.0f),
                    PathNode.CurveTo(114.74516f, 176.0f, 104.0f, 165.25484f, 104.0f, 152.0f),
                    PathNode.CurveTo(104.0f, 138.74516f, 114.74516f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(141.25484f, 128.0f, 152.0f, 138.74516f, 152.0f, 152.0f),
                    PathNode.CurveTo(152.0f, 165.25484f, 141.25484f, 176.0f, 128.0f, 176.0f),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
