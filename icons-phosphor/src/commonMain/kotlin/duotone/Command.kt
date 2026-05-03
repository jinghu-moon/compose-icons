package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorDuotoneIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 76.0f),
                    PathNode.LineTo(208.0f, 76.0f),
                    PathNode.CurveTo(208.0f, 91.463974f, 195.46397f, 104.0f, 180.0f, 104.0f),
                    PathNode.LineTo(152.0f, 104.0f),
                    PathNode.LineTo(152.0f, 76.0f),
                    PathNode.CurveTo(152.0f, 60.53603f, 164.53603f, 48.0f, 180.0f, 48.0f),
                    PathNode.LineTo(180.0f, 48.0f),
                    PathNode.CurveTo(195.46397f, 48.0f, 208.0f, 60.53603f, 208.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 48.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.CurveTo(60.53603f, 48.0f, 48.0f, 60.53603f, 48.0f, 76.0f),
                    PathNode.LineTo(48.0f, 76.0f),
                    PathNode.CurveTo(48.0f, 91.463974f, 60.53603f, 104.0f, 76.0f, 104.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.LineTo(104.0f, 76.0f),
                    PathNode.CurveTo(104.0f, 60.53603f, 91.463974f, 48.0f, 76.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 152.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.LineTo(152.0f, 180.0f),
                    PathNode.CurveTo(152.0f, 195.46397f, 164.53603f, 208.0f, 180.0f, 208.0f),
                    PathNode.LineTo(180.0f, 208.0f),
                    PathNode.CurveTo(195.46397f, 208.0f, 208.0f, 195.46397f, 208.0f, 180.0f),
                    PathNode.LineTo(208.0f, 180.0f),
                    PathNode.CurveTo(208.0f, 164.53603f, 195.46397f, 152.0f, 180.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 180.0f),
                    PathNode.LineTo(48.0f, 180.0f),
                    PathNode.CurveTo(48.0f, 195.46397f, 60.53603f, 208.0f, 76.0f, 208.0f),
                    PathNode.LineTo(76.0f, 208.0f),
                    PathNode.CurveTo(91.463974f, 208.0f, 104.0f, 195.46397f, 104.0f, 180.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.LineTo(76.0f, 152.0f),
                    PathNode.CurveTo(60.53603f, 152.0f, 48.0f, 164.53603f, 48.0f, 180.0f),
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
                    PathNode.MoveTo(180.0f, 144.0f),
                    PathNode.LineTo(160.0f, 144.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.LineTo(180.0f, 112.0f),
                    PathNode.CurveTo(199.88223f, 112.0f, 216.0f, 95.88225f, 216.0f, 76.0f),
                    PathNode.CurveTo(216.0f, 56.11775f, 199.88223f, 40.0f, 180.0f, 40.0f),
                    PathNode.CurveTo(160.11777f, 40.0f, 144.0f, 56.11775f, 144.0f, 76.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.LineTo(112.0f, 76.0f),
                    PathNode.CurveTo(112.0f, 56.11775f, 95.88225f, 40.0f, 76.0f, 40.0f),
                    PathNode.CurveTo(56.11775f, 40.0f, 40.0f, 56.11775f, 40.0f, 76.0f),
                    PathNode.CurveTo(40.0f, 95.88225f, 56.11775f, 112.0f, 76.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.LineTo(76.0f, 144.0f),
                    PathNode.CurveTo(56.11775f, 144.0f, 40.0f, 160.11777f, 40.0f, 180.0f),
                    PathNode.CurveTo(40.0f, 199.88223f, 56.11775f, 216.0f, 76.0f, 216.0f),
                    PathNode.CurveTo(95.88225f, 216.0f, 112.0f, 199.88223f, 112.0f, 180.0f),
                    PathNode.LineTo(112.0f, 160.0f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.LineTo(144.0f, 180.0f),
                    PathNode.CurveTo(144.0f, 199.88223f, 160.11777f, 216.0f, 180.0f, 216.0f),
                    PathNode.CurveTo(199.88223f, 216.0f, 216.0f, 199.88223f, 216.0f, 180.0f),
                    PathNode.CurveTo(216.0f, 160.11777f, 199.88223f, 144.0f, 180.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 76.0f),
                    PathNode.CurveTo(160.0f, 64.95431f, 168.9543f, 56.0f, 180.0f, 56.0f),
                    PathNode.CurveTo(191.0457f, 56.0f, 200.0f, 64.95431f, 200.0f, 76.0f),
                    PathNode.CurveTo(200.0f, 87.04569f, 191.0457f, 96.0f, 180.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 76.0f),
                    PathNode.CurveTo(56.0f, 64.95431f, 64.95431f, 56.0f, 76.0f, 56.0f),
                    PathNode.CurveTo(87.04569f, 56.0f, 96.0f, 64.95431f, 96.0f, 76.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.LineTo(76.0f, 96.0f),
                    PathNode.CurveTo(64.95431f, 96.0f, 56.0f, 87.04569f, 56.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 180.0f),
                    PathNode.CurveTo(96.0f, 191.0457f, 87.04569f, 200.0f, 76.0f, 200.0f),
                    PathNode.CurveTo(64.95431f, 200.0f, 56.0f, 191.0457f, 56.0f, 180.0f),
                    PathNode.CurveTo(56.0f, 168.9543f, 64.95431f, 160.0f, 76.0f, 160.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 112.0f),
                    PathNode.LineTo(144.0f, 112.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 200.0f),
                    PathNode.CurveTo(168.9543f, 200.0f, 160.0f, 191.0457f, 160.0f, 180.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(180.0f, 160.0f),
                    PathNode.CurveTo(191.0457f, 160.0f, 200.0f, 168.9543f, 200.0f, 180.0f),
                    PathNode.CurveTo(200.0f, 191.0457f, 191.0457f, 200.0f, 180.0f, 200.0f),
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
        return _command!!
    }

private var _command: ImageVector? = null
