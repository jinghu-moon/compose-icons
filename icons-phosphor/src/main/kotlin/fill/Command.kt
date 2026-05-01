package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorFillIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 116.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 72.0f),
                    PathNode.CurveTo(78.26801f, 72.0f, 72.0f, 78.26801f, 72.0f, 86.0f),
                    PathNode.CurveTo(72.0f, 93.73199f, 78.26801f, 100.0f, 86.0f, 100.0f),
                    PathNode.LineTo(100.0f, 100.0f),
                    PathNode.LineTo(100.0f, 86.0f),
                    PathNode.CurveTo(100.0f, 78.26801f, 93.73199f, 72.0f, 86.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 86.0f),
                    PathNode.CurveTo(184.0f, 78.26801f, 177.73198f, 72.0f, 170.0f, 72.0f),
                    PathNode.CurveTo(162.26802f, 72.0f, 156.0f, 78.26801f, 156.0f, 86.0f),
                    PathNode.LineTo(156.0f, 100.0f),
                    PathNode.LineTo(170.0f, 100.0f),
                    PathNode.CurveTo(177.73198f, 100.0f, 184.0f, 93.73199f, 184.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 170.0f),
                    PathNode.CurveTo(72.0f, 177.73198f, 78.26801f, 184.0f, 86.0f, 184.0f),
                    PathNode.CurveTo(93.73199f, 184.0f, 100.0f, 177.73198f, 100.0f, 170.0f),
                    PathNode.LineTo(100.0f, 156.0f),
                    PathNode.LineTo(86.0f, 156.0f),
                    PathNode.CurveTo(78.26801f, 156.0f, 72.0f, 162.26802f, 72.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 140.0f),
                    PathNode.LineTo(156.0f, 116.0f),
                    PathNode.LineTo(170.0f, 116.0f),
                    PathNode.CurveTo(186.56854f, 116.0f, 200.0f, 102.56854f, 200.0f, 86.0f),
                    PathNode.CurveTo(200.0f, 69.43146f, 186.56854f, 56.0f, 170.0f, 56.0f),
                    PathNode.CurveTo(153.43146f, 56.0f, 140.0f, 69.43146f, 140.0f, 86.0f),
                    PathNode.LineTo(140.0f, 100.0f),
                    PathNode.LineTo(116.0f, 100.0f),
                    PathNode.LineTo(116.0f, 86.0f),
                    PathNode.CurveTo(116.0f, 69.43146f, 102.56854f, 56.0f, 86.0f, 56.0f),
                    PathNode.CurveTo(69.43146f, 56.0f, 56.0f, 69.43146f, 56.0f, 86.0f),
                    PathNode.CurveTo(56.0f, 102.56854f, 69.43146f, 116.0f, 86.0f, 116.0f),
                    PathNode.LineTo(100.0f, 116.0f),
                    PathNode.LineTo(100.0f, 140.0f),
                    PathNode.LineTo(86.0f, 140.0f),
                    PathNode.CurveTo(69.43146f, 140.0f, 56.0f, 153.43146f, 56.0f, 170.0f),
                    PathNode.CurveTo(56.0f, 186.56854f, 69.43146f, 200.0f, 86.0f, 200.0f),
                    PathNode.CurveTo(102.56854f, 200.0f, 116.0f, 186.56854f, 116.0f, 170.0f),
                    PathNode.LineTo(116.0f, 156.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.LineTo(140.0f, 170.0f),
                    PathNode.CurveTo(140.0f, 186.56854f, 153.43146f, 200.0f, 170.0f, 200.0f),
                    PathNode.CurveTo(186.56854f, 200.0f, 200.0f, 186.56854f, 200.0f, 170.0f),
                    PathNode.CurveTo(200.0f, 153.43146f, 186.56854f, 140.0f, 170.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 170.0f),
                    PathNode.CurveTo(156.0f, 177.73198f, 162.26802f, 184.0f, 170.0f, 184.0f),
                    PathNode.CurveTo(177.73198f, 184.0f, 184.0f, 177.73198f, 184.0f, 170.0f),
                    PathNode.CurveTo(184.0f, 162.26802f, 177.73198f, 156.0f, 170.0f, 156.0f),
                    PathNode.LineTo(156.0f, 156.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _command!!
    }

private var _command: ImageVector? = null
