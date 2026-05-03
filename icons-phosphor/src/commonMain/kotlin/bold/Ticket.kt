package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorBoldIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 108.0f),
                    PathNode.CurveTo(238.62741f, 108.0f, 244.0f, 102.62742f, 244.0f, 96.0f),
                    PathNode.LineTo(244.0f, 64.0f),
                    PathNode.CurveTo(244.0f, 52.954304f, 235.0457f, 44.0f, 224.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(20.954306f, 44.0f, 12.0f, 52.954304f, 12.0f, 64.0f),
                    PathNode.LineTo(12.0f, 96.0f),
                    PathNode.CurveTo(12.0f, 102.62742f, 17.372583f, 108.0f, 24.0f, 108.0f),
                    PathNode.CurveTo(35.045696f, 108.0f, 44.0f, 116.95431f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 139.0457f, 35.045696f, 148.0f, 24.0f, 148.0f),
                    PathNode.CurveTo(17.372583f, 148.0f, 12.0f, 153.37259f, 12.0f, 160.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 203.0457f, 20.954306f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(235.0457f, 212.0f, 244.0f, 203.0457f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 160.0f),
                    PathNode.CurveTo(244.0f, 153.37259f, 238.62741f, 148.0f, 232.0f, 148.0f),
                    PathNode.CurveTo(220.9543f, 148.0f, 212.0f, 139.0457f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 116.95431f, 220.9543f, 108.0f, 232.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 170.34f),
                    PathNode.CurveTo(54.946976f, 164.98267f, 68.02818f, 147.68982f, 68.02818f, 128.0f),
                    PathNode.CurveTo(68.02818f, 108.31018f, 54.946976f, 91.01734f, 36.0f, 85.66f),
                    PathNode.LineTo(36.0f, 68.0f),
                    PathNode.LineTo(88.0f, 68.0f),
                    PathNode.LineTo(88.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 170.34f),
                    PathNode.LineTo(220.0f, 188.0f),
                    PathNode.LineTo(112.0f, 188.0f),
                    PathNode.LineTo(112.0f, 68.0f),
                    PathNode.LineTo(220.0f, 68.0f),
                    PathNode.LineTo(220.0f, 85.66f),
                    PathNode.CurveTo(201.05302f, 91.01734f, 187.97182f, 108.31018f, 187.97182f, 128.0f),
                    PathNode.CurveTo(187.97182f, 147.68982f, 201.05302f, 164.98267f, 220.0f, 170.34f),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
