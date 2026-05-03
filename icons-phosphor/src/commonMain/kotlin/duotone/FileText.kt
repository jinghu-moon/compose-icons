package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileText: ImageVector
    get() {
        if (_fileText != null) return _fileText!!
        _fileText = phosphorDuotoneIcon(
            name = "FileText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.LineTo(152.0f, 32.0f),
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
                    PathNode.MoveTo(213.66f, 82.34f),
                    PathNode.LineTo(157.66f, 26.34f),
                    PathNode.CurveTo(156.15842f, 24.840092f, 154.12238f, 23.998331f, 152.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.00166f, 85.87763f, 215.15993f, 83.841576f, 213.66f, 82.34f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 51.31f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 92.41828f, 147.58173f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 136.0f),
                    PathNode.CurveTo(168.0f, 140.41827f, 164.41827f, 144.0f, 160.0f, 144.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.CurveTo(91.58172f, 144.0f, 88.0f, 140.41827f, 88.0f, 136.0f),
                    PathNode.CurveTo(88.0f, 131.58173f, 91.58172f, 128.0f, 96.0f, 128.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(164.41827f, 128.0f, 168.0f, 131.58173f, 168.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 172.41827f, 164.41827f, 176.0f, 160.0f, 176.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.CurveTo(91.58172f, 176.0f, 88.0f, 172.41827f, 88.0f, 168.0f),
                    PathNode.CurveTo(88.0f, 163.58173f, 91.58172f, 160.0f, 96.0f, 160.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.CurveTo(164.41827f, 160.0f, 168.0f, 163.58173f, 168.0f, 168.0f),
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
        return _fileText!!
    }

private var _fileText: ImageVector? = null
