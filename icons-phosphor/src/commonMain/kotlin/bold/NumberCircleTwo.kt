package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorBoldIcon(
            name = "NumberCircleTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.75f, 125.67f),
                    PathNode.LineTo(128.0f, 164.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(158.62741f, 164.0f, 164.0f, 169.37259f, 164.0f, 176.0f),
                    PathNode.CurveTo(164.0f, 182.62741f, 158.62741f, 188.0f, 152.0f, 188.0f),
                    PathNode.LineTo(104.0f, 188.0f),
                    PathNode.CurveTo(99.454735f, 188.0f, 95.299576f, 185.43199f, 93.26688f, 181.36656f),
                    PathNode.CurveTo(91.23417f, 177.30115f, 91.67284f, 172.43622f, 94.4f, 168.8f),
                    PathNode.LineTo(137.57f, 111.24f),
                    PathNode.CurveTo(140.4149f, 107.46649f, 140.78017f, 102.37461f, 138.50299f, 98.23367f),
                    PathNode.CurveTo(136.22583f, 94.09273f, 131.7303f, 91.67388f, 127.01993f, 92.05514f),
                    PathNode.CurveTo(122.30956f, 92.436386f, 118.261566f, 95.54674f, 116.68f, 100.0f),
                    PathNode.CurveTo(114.47086f, 106.2491f, 107.614105f, 109.52414f, 101.365f, 107.315f),
                    PathNode.CurveTo(95.1159f, 105.10586f, 91.84086f, 98.2491f, 94.05f, 92.0f),
                    PathNode.CurveTo(95.28301f, 88.53166f, 97.0364f, 85.271034f, 99.25f, 82.33f),
                    PathNode.CurveTo(111.21801f, 66.45181f, 133.79181f, 63.281994f, 149.67f, 75.25f),
                    PathNode.CurveTo(165.54819f, 87.21801f, 168.71802f, 109.79182f, 156.75f, 125.67f),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
