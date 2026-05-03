package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Calculator: ImageVector
    get() {
        if (_calculator != null) return _calculator!!
        _calculator = phosphorDuotoneIcon(
            name = "Calculator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 64.0f),
                    PathNode.LineTo(176.0f, 112.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.LineTo(80.0f, 64.0f),
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
                    PathNode.MoveTo(80.0f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.CurveTo(180.41827f, 120.0f, 184.0f, 116.41828f, 184.0f, 112.0f),
                    PathNode.LineTo(184.0f, 64.0f),
                    PathNode.CurveTo(184.0f, 59.581722f, 180.41827f, 56.0f, 176.0f, 56.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(75.58172f, 56.0f, 72.0f, 59.581722f, 72.0f, 64.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.CurveTo(72.0f, 116.41828f, 75.58172f, 120.0f, 80.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 72.0f),
                    PathNode.LineTo(168.0f, 72.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.LineTo(88.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 148.0f),
                    PathNode.CurveTo(100.0f, 154.62741f, 94.62742f, 160.0f, 88.0f, 160.0f),
                    PathNode.CurveTo(81.37258f, 160.0f, 76.0f, 154.62741f, 76.0f, 148.0f),
                    PathNode.CurveTo(76.0f, 141.37259f, 81.37258f, 136.0f, 88.0f, 136.0f),
                    PathNode.CurveTo(94.62742f, 136.0f, 100.0f, 141.37259f, 100.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 148.0f),
                    PathNode.CurveTo(140.0f, 154.62741f, 134.62741f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(121.37258f, 160.0f, 116.0f, 154.62741f, 116.0f, 148.0f),
                    PathNode.CurveTo(116.0f, 141.37259f, 121.37258f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(134.62741f, 136.0f, 140.0f, 141.37259f, 140.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 148.0f),
                    PathNode.CurveTo(180.0f, 154.62741f, 174.62741f, 160.0f, 168.0f, 160.0f),
                    PathNode.CurveTo(161.37259f, 160.0f, 156.0f, 154.62741f, 156.0f, 148.0f),
                    PathNode.CurveTo(156.0f, 141.37259f, 161.37259f, 136.0f, 168.0f, 136.0f),
                    PathNode.CurveTo(174.62741f, 136.0f, 180.0f, 141.37259f, 180.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 188.0f),
                    PathNode.CurveTo(100.0f, 194.62741f, 94.62742f, 200.0f, 88.0f, 200.0f),
                    PathNode.CurveTo(81.37258f, 200.0f, 76.0f, 194.62741f, 76.0f, 188.0f),
                    PathNode.CurveTo(76.0f, 181.37259f, 81.37258f, 176.0f, 88.0f, 176.0f),
                    PathNode.CurveTo(94.62742f, 176.0f, 100.0f, 181.37259f, 100.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 188.0f),
                    PathNode.CurveTo(140.0f, 194.62741f, 134.62741f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(121.37258f, 200.0f, 116.0f, 194.62741f, 116.0f, 188.0f),
                    PathNode.CurveTo(116.0f, 181.37259f, 121.37258f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(134.62741f, 176.0f, 140.0f, 181.37259f, 140.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 188.0f),
                    PathNode.CurveTo(180.0f, 194.62741f, 174.62741f, 200.0f, 168.0f, 200.0f),
                    PathNode.CurveTo(161.37259f, 200.0f, 156.0f, 194.62741f, 156.0f, 188.0f),
                    PathNode.CurveTo(156.0f, 181.37259f, 161.37259f, 176.0f, 168.0f, 176.0f),
                    PathNode.CurveTo(174.62741f, 176.0f, 180.0f, 181.37259f, 180.0f, 188.0f),
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
        return _calculator!!
    }

private var _calculator: ImageVector? = null
