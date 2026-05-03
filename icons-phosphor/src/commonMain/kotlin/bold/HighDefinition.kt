package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorBoldIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 68.0f),
                    PathNode.LineTo(156.0f, 68.0f),
                    PathNode.CurveTo(149.37259f, 68.0f, 144.0f, 73.37258f, 144.0f, 80.0f),
                    PathNode.LineTo(144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 182.62741f, 149.37259f, 188.0f, 156.0f, 188.0f),
                    PathNode.LineTo(180.0f, 188.0f),
                    PathNode.CurveTo(213.13708f, 188.0f, 240.0f, 161.13708f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 94.862915f, 213.13708f, 68.0f, 180.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 164.0f),
                    PathNode.LineTo(168.0f, 164.0f),
                    PathNode.LineTo(168.0f, 92.0f),
                    PathNode.LineTo(180.0f, 92.0f),
                    PathNode.CurveTo(199.88223f, 92.0f, 216.0f, 108.11775f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 147.88223f, 199.88223f, 164.0f, 180.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 176.0f),
                    PathNode.LineTo(104.0f, 140.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 182.62741f, 50.62742f, 188.0f, 44.0f, 188.0f),
                    PathNode.CurveTo(37.37258f, 188.0f, 32.0f, 182.62741f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 73.37258f, 37.37258f, 68.0f, 44.0f, 68.0f),
                    PathNode.CurveTo(50.62742f, 68.0f, 56.0f, 73.37258f, 56.0f, 80.0f),
                    PathNode.LineTo(56.0f, 116.0f),
                    PathNode.LineTo(104.0f, 116.0f),
                    PathNode.LineTo(104.0f, 80.0f),
                    PathNode.CurveTo(104.0f, 73.37258f, 109.37258f, 68.0f, 116.0f, 68.0f),
                    PathNode.CurveTo(122.62742f, 68.0f, 128.0f, 73.37258f, 128.0f, 80.0f),
                    PathNode.LineTo(128.0f, 176.0f),
                    PathNode.CurveTo(128.0f, 182.62741f, 122.62742f, 188.0f, 116.0f, 188.0f),
                    PathNode.CurveTo(109.37258f, 188.0f, 104.0f, 182.62741f, 104.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 44.0f),
                    PathNode.CurveTo(20.0f, 37.37258f, 25.372583f, 32.0f, 32.0f, 32.0f),
                    PathNode.LineTo(224.0f, 32.0f),
                    PathNode.CurveTo(230.62741f, 32.0f, 236.0f, 37.37258f, 236.0f, 44.0f),
                    PathNode.CurveTo(236.0f, 50.62742f, 230.62741f, 56.0f, 224.0f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(25.372583f, 56.0f, 20.0f, 50.62742f, 20.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 212.0f),
                    PathNode.CurveTo(236.0f, 218.62741f, 230.62741f, 224.0f, 224.0f, 224.0f),
                    PathNode.LineTo(32.0f, 224.0f),
                    PathNode.CurveTo(25.372583f, 224.0f, 20.0f, 218.62741f, 20.0f, 212.0f),
                    PathNode.CurveTo(20.0f, 205.37259f, 25.372583f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(230.62741f, 200.0f, 236.0f, 205.37259f, 236.0f, 212.0f),
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
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
