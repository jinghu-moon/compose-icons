package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorFillIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 192.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 98.67f),
                    PathNode.CurveTo(232.00014f, 93.32225f, 229.32852f, 88.328f, 224.88f, 85.36f),
                    PathNode.LineTo(136.88f, 26.69f),
                    PathNode.CurveTo(131.5057f, 23.107254f, 124.504295f, 23.107254f, 119.13f, 26.69f),
                    PathNode.LineTo(31.13f, 85.36f),
                    PathNode.CurveTo(26.677668f, 88.32571f, 24.002098f, 93.32036f, 24.0f, 98.67f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(11.581722f, 192.0f, 8.0f, 195.58173f, 8.0f, 200.0f),
                    PathNode.CurveTo(8.0f, 204.41827f, 11.581722f, 208.0f, 16.0f, 208.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(244.41827f, 208.0f, 248.0f, 204.41827f, 248.0f, 200.0f),
                    PathNode.CurveTo(248.0f, 195.58173f, 244.41827f, 192.0f, 240.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 128.0f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 152.0f),
                    PathNode.LineTo(64.0f, 152.0f),
                    PathNode.LineTo(64.0f, 128.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 168.0f),
                    PathNode.LineTo(120.0f, 168.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 168.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.LineTo(136.0f, 192.0f),
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
        return _garage!!
    }

private var _garage: ImageVector? = null
