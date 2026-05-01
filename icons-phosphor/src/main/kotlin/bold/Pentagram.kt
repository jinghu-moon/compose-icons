package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorBoldIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.0f, 89.83f),
                    PathNode.CurveTo(240.34468f, 81.58118f, 232.66566f, 75.99167f, 224.0f, 76.0f),
                    PathNode.LineTo(165.85f, 76.0f),
                    PathNode.LineTo(147.05f, 18.05f),
                    PathNode.CurveTo(144.46315f, 9.7227f, 136.76323f, 4.043949f, 128.04338f, 4.032491f),
                    PathNode.CurveTo(119.32355f, 4.021032f, 111.60873f, 9.679527f, 109.0f, 18.0f),
                    PathNode.LineTo(90.15f, 76.0f),
                    PathNode.LineTo(32.0f, 76.0f),
                    PathNode.CurveTo(23.323181f, 76.0004f, 15.636366f, 81.59554f, 12.969229f, 89.85227f),
                    PathNode.CurveTo(10.302091f, 98.10899f, 13.2631f, 107.14366f, 20.3f, 112.22f),
                    PathNode.LineTo(67.4f, 146.11f),
                    PathNode.LineTo(49.33f, 201.81f),
                    PathNode.CurveTo(46.65334f, 210.04288f, 49.57738f, 219.06323f, 56.575016f, 224.16006f),
                    PathNode.CurveTo(63.572647f, 229.25691f, 73.055084f, 229.27303f, 80.07f, 224.2f),
                    PathNode.LineTo(128.0f, 189.71f),
                    PathNode.LineTo(175.89f, 224.16f),
                    PathNode.CurveTo(182.89809f, 229.2514f, 192.38718f, 229.2526f, 199.39655f, 224.16296f),
                    PathNode.CurveTo(206.40591f, 219.07332f, 209.34207f, 210.04991f, 206.67f, 201.81f),
                    PathNode.LineTo(188.6f, 146.11f),
                    PathNode.LineTo(235.75f, 112.19f),
                    PathNode.CurveTo(242.75377f, 107.09309f, 245.68042f, 98.06691f, 243.0f, 89.83f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 37.11f),
                    PathNode.LineTo(140.62f, 76.0f),
                    PathNode.LineTo(115.38f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.42f, 100.0f),
                    PathNode.LineTo(82.36f, 100.0f),
                    PathNode.LineTo(75.18f, 122.13f),
                    PathNode.Close,
                    PathNode.MoveTo(75.93f, 197.6f),
                    PathNode.LineTo(87.86f, 160.82f),
                    PathNode.LineTo(107.45f, 174.92f),
                    PathNode.Close,
                    PathNode.MoveTo(95.64f, 136.85f),
                    PathNode.LineTo(107.64f, 100.0f),
                    PathNode.LineTo(148.46f, 100.0f),
                    PathNode.LineTo(160.46f, 136.85f),
                    PathNode.LineTo(128.0f, 160.14f),
                    PathNode.Close,
                    PathNode.MoveTo(148.55f, 174.92f),
                    PathNode.LineTo(168.14f, 160.82f),
                    PathNode.LineTo(180.07f, 197.6f),
                    PathNode.Close,
                    PathNode.MoveTo(180.82f, 122.13f),
                    PathNode.LineTo(173.64f, 100.0f),
                    PathNode.LineTo(211.58f, 100.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
