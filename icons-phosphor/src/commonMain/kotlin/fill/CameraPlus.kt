package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorFillIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 56.0f),
                    PathNode.LineTo(180.28f, 56.0f),
                    PathNode.LineTo(169.0f, 39.12f),
                    PathNode.CurveTo(166.0379f, 34.680305f, 161.05711f, 32.00988f, 155.72f, 32.0f),
                    PathNode.LineTo(100.28f, 32.0f),
                    PathNode.CurveTo(94.94289f, 32.00988f, 89.9621f, 34.680305f, 87.0f, 39.12f),
                    PathNode.LineTo(75.72f, 56.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.CurveTo(34.745167f, 56.0f, 24.0f, 66.74516f, 24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 205.25484f, 34.745167f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(221.25484f, 216.0f, 232.0f, 205.25484f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(232.0f, 66.74516f, 221.25484f, 56.0f, 208.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 144.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.CurveTo(136.0f, 172.41827f, 132.41827f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(123.58172f, 176.0f, 120.0f, 172.41827f, 120.0f, 168.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.CurveTo(91.58172f, 144.0f, 88.0f, 140.41827f, 88.0f, 136.0f),
                    PathNode.CurveTo(88.0f, 131.58173f, 91.58172f, 128.0f, 96.0f, 128.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 99.58172f, 123.58172f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(132.41827f, 96.0f, 136.0f, 99.58172f, 136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 128.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(164.41827f, 128.0f, 168.0f, 131.58173f, 168.0f, 136.0f),
                    PathNode.CurveTo(168.0f, 140.41827f, 164.41827f, 144.0f, 160.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
