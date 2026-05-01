package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorThinIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 60.0f),
                    PathNode.LineTo(40.0f, 60.0f),
                    PathNode.CurveTo(33.37258f, 60.0f, 28.0f, 65.37258f, 28.0f, 72.0f),
                    PathNode.LineTo(28.0f, 136.0f),
                    PathNode.CurveTo(28.0f, 142.62741f, 33.37258f, 148.0f, 40.0f, 148.0f),
                    PathNode.LineTo(104.0f, 148.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.CurveTo(104.0f, 179.88223f, 87.88225f, 196.0f, 68.0f, 196.0f),
                    PathNode.CurveTo(65.79086f, 196.0f, 64.0f, 197.79086f, 64.0f, 200.0f),
                    PathNode.CurveTo(64.0f, 202.20914f, 65.79086f, 204.0f, 68.0f, 204.0f),
                    PathNode.CurveTo(92.28911f, 203.97244f, 111.97244f, 184.28911f, 112.0f, 160.0f),
                    PathNode.LineTo(112.0f, 72.0f),
                    PathNode.CurveTo(112.0f, 65.37258f, 106.62742f, 60.0f, 100.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 140.0f),
                    PathNode.LineTo(40.0f, 140.0f),
                    PathNode.CurveTo(37.79086f, 140.0f, 36.0f, 138.20914f, 36.0f, 136.0f),
                    PathNode.LineTo(36.0f, 72.0f),
                    PathNode.CurveTo(36.0f, 69.79086f, 37.79086f, 68.0f, 40.0f, 68.0f),
                    PathNode.LineTo(100.0f, 68.0f),
                    PathNode.CurveTo(102.20914f, 68.0f, 104.0f, 69.79086f, 104.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 60.0f),
                    PathNode.LineTo(156.0f, 60.0f),
                    PathNode.CurveTo(149.37259f, 60.0f, 144.0f, 65.37258f, 144.0f, 72.0f),
                    PathNode.LineTo(144.0f, 136.0f),
                    PathNode.CurveTo(144.0f, 142.62741f, 149.37259f, 148.0f, 156.0f, 148.0f),
                    PathNode.LineTo(220.0f, 148.0f),
                    PathNode.LineTo(220.0f, 160.0f),
                    PathNode.CurveTo(220.0f, 179.88223f, 203.88223f, 196.0f, 184.0f, 196.0f),
                    PathNode.CurveTo(181.79086f, 196.0f, 180.0f, 197.79086f, 180.0f, 200.0f),
                    PathNode.CurveTo(180.0f, 202.20914f, 181.79086f, 204.0f, 184.0f, 204.0f),
                    PathNode.CurveTo(208.28911f, 203.97244f, 227.97244f, 184.28911f, 228.0f, 160.0f),
                    PathNode.LineTo(228.0f, 72.0f),
                    PathNode.CurveTo(228.0f, 65.37258f, 222.62741f, 60.0f, 216.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 140.0f),
                    PathNode.LineTo(156.0f, 140.0f),
                    PathNode.CurveTo(153.79086f, 140.0f, 152.0f, 138.20914f, 152.0f, 136.0f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.CurveTo(152.0f, 69.79086f, 153.79086f, 68.0f, 156.0f, 68.0f),
                    PathNode.LineTo(216.0f, 68.0f),
                    PathNode.CurveTo(218.20914f, 68.0f, 220.0f, 69.79086f, 220.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _quotes!!
    }

private var _quotes: ImageVector? = null
