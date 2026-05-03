package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorBoldIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.15f, 70.54f),
                    PathNode.LineTo(185.46f, 17.86f),
                    PathNode.CurveTo(181.70905f, 14.10752f, 176.62073f, 11.99927f, 171.315f, 11.99927f),
                    PathNode.CurveTo(166.00926f, 11.99927f, 160.92096f, 14.10752f, 157.17f, 17.86f),
                    PathNode.LineTo(17.85f, 157.17f),
                    PathNode.CurveTo(14.09752f, 160.92096f, 11.98927f, 166.00926f, 11.98927f, 171.315f),
                    PathNode.CurveTo(11.98927f, 176.62073f, 14.09752f, 181.70905f, 17.85f, 185.46f),
                    PathNode.LineTo(70.54f, 238.14f),
                    PathNode.CurveTo(74.29096f, 241.89249f, 79.379265f, 244.00073f, 84.685f, 244.00073f),
                    PathNode.CurveTo(89.99073f, 244.00073f, 95.07904f, 241.89249f, 98.83f, 238.14f),
                    PathNode.LineTo(238.15f, 98.83f),
                    PathNode.CurveTo(241.90248f, 95.07904f, 244.01073f, 89.99073f, 244.01073f, 84.685f),
                    PathNode.CurveTo(244.01073f, 79.379265f, 241.90248f, 74.29096f, 238.15f, 70.54f),
                    PathNode.Close,
                    PathNode.MoveTo(84.68f, 218.34f),
                    PathNode.LineTo(37.68f, 171.34f),
                    PathNode.LineTo(64.0f, 145.0f),
                    PathNode.LineTo(87.52f, 168.52f),
                    PathNode.CurveTo(92.214424f, 173.21442f, 99.82558f, 173.21442f, 104.52f, 168.52f),
                    PathNode.CurveTo(109.21442f, 163.82558f, 109.21442f, 156.21442f, 104.52f, 151.52f),
                    PathNode.LineTo(81.0f, 128.0f),
                    PathNode.LineTo(96.0f, 113.0f),
                    PathNode.LineTo(119.51f, 136.52f),
                    PathNode.CurveTo(124.20442f, 141.21442f, 131.81558f, 141.21442f, 136.51f, 136.52f),
                    PathNode.CurveTo(141.20442f, 131.82558f, 141.20442f, 124.214424f, 136.51f, 119.52f),
                    PathNode.LineTo(113.0f, 96.0f),
                    PathNode.LineTo(128.0f, 81.0f),
                    PathNode.LineTo(151.52f, 104.52f),
                    PathNode.CurveTo(156.21442f, 109.21442f, 163.82558f, 109.21442f, 168.52f, 104.52f),
                    PathNode.CurveTo(173.21442f, 99.82558f, 173.21442f, 92.214424f, 168.52f, 87.52f),
                    PathNode.LineTo(145.0f, 64.0f),
                    PathNode.LineTo(171.35f, 37.66f),
                    PathNode.LineTo(218.35f, 84.66f),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
