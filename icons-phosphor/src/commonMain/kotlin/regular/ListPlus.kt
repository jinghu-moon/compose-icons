package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ListPlus: ImageVector
    get() {
        if (_listPlus != null) return _listPlus!!
        _listPlus = phosphorRegularIcon(
            name = "ListPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 59.581722f, 35.581722f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(220.41827f, 56.0f, 224.0f, 59.581722f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 68.41828f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 68.41828f, 32.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 136.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.CurveTo(220.41827f, 136.0f, 224.0f, 132.41827f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 123.58172f, 220.41827f, 120.0f, 216.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(35.581722f, 120.0f, 32.0f, 123.58172f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 132.41827f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.CurveTo(148.41827f, 200.0f, 152.0f, 196.41827f, 152.0f, 192.0f),
                    PathNode.CurveTo(152.0f, 187.58173f, 148.41827f, 184.0f, 144.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(216.0f, 163.58173f, 212.41827f, 160.0f, 208.0f, 160.0f),
                    PathNode.CurveTo(203.58173f, 160.0f, 200.0f, 163.58173f, 200.0f, 168.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.CurveTo(179.58173f, 184.0f, 176.0f, 187.58173f, 176.0f, 192.0f),
                    PathNode.CurveTo(176.0f, 196.41827f, 179.58173f, 200.0f, 184.0f, 200.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(200.0f, 220.41827f, 203.58173f, 224.0f, 208.0f, 224.0f),
                    PathNode.CurveTo(212.41827f, 224.0f, 216.0f, 220.41827f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(236.41827f, 200.0f, 240.0f, 196.41827f, 240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 187.58173f, 236.41827f, 184.0f, 232.0f, 184.0f),
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
        return _listPlus!!
    }

private var _listPlus: ImageVector? = null
