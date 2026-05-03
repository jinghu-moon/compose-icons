package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorRegularIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 104.0f),
                    PathNode.CurveTo(236.41827f, 104.0f, 240.0f, 100.41828f, 240.0f, 96.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 96.0f),
                    PathNode.CurveTo(16.0f, 100.41828f, 19.581722f, 104.0f, 24.0f, 104.0f),
                    PathNode.CurveTo(37.254833f, 104.0f, 48.0f, 114.74516f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 141.25484f, 37.254833f, 152.0f, 24.0f, 152.0f),
                    PathNode.CurveTo(19.581722f, 152.0f, 16.0f, 155.58173f, 16.0f, 160.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 160.0f),
                    PathNode.CurveTo(240.0f, 155.58173f, 236.41827f, 152.0f, 232.0f, 152.0f),
                    PathNode.CurveTo(218.74516f, 152.0f, 208.0f, 141.25484f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 114.74516f, 218.74516f, 104.0f, 232.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 167.2f),
                    PathNode.CurveTo(50.642593f, 163.41446f, 64.0401f, 147.02306f, 64.0401f, 128.0f),
                    PathNode.CurveTo(64.0401f, 108.976944f, 50.642593f, 92.58554f, 32.0f, 88.8f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 167.2f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 88.8f),
                    PathNode.CurveTo(205.3574f, 92.58554f, 191.9599f, 108.976944f, 191.9599f, 128.0f),
                    PathNode.CurveTo(191.9599f, 147.02306f, 205.3574f, 163.41446f, 224.0f, 167.2f),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
