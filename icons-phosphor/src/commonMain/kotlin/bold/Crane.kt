package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorBoldIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.17f, 13.71f),
                    PathNode.CurveTo(226.55609f, 11.54117f, 222.06927f, 11.427292f, 218.35f, 13.41f),
                    PathNode.LineTo(101.0f, 76.0f),
                    PathNode.LineTo(32.0f, 76.0f),
                    PathNode.CurveTo(20.954306f, 76.0f, 12.0f, 84.95431f, 12.0f, 96.0f),
                    PathNode.LineTo(12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 211.0457f, 20.954306f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(120.0f, 220.0f),
                    PathNode.CurveTo(131.0457f, 220.0f, 140.0f, 211.0457f, 140.0f, 200.0f),
                    PathNode.LineTo(140.0f, 168.0f),
                    PathNode.CurveTo(140.00093f, 166.83115f, 139.82907f, 165.66858f, 139.49f, 164.55f),
                    PathNode.LineTo(118.32f, 94.0f),
                    PathNode.LineTo(212.0f, 44.0f),
                    PathNode.LineTo(212.0f, 156.0f),
                    PathNode.LineTo(200.0f, 156.0f),
                    PathNode.LineTo(200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 145.37259f, 194.62741f, 140.0f, 188.0f, 140.0f),
                    PathNode.CurveTo(181.37259f, 140.0f, 176.0f, 145.37259f, 176.0f, 152.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.CurveTo(176.0f, 171.0457f, 184.9543f, 180.0f, 196.0f, 180.0f),
                    PathNode.LineTo(216.0f, 180.0f),
                    PathNode.CurveTo(227.0457f, 180.0f, 236.0f, 171.0457f, 236.0f, 160.0f),
                    PathNode.LineTo(236.0f, 24.0f),
                    PathNode.CurveTo(235.99919f, 19.784018f, 233.78601f, 15.877717f, 230.17f, 13.71f),
                    PathNode.Close,
                    PathNode.MoveTo(95.07f, 100.0f),
                    PathNode.LineTo(111.87f, 156.0f),
                    PathNode.LineTo(76.0f, 156.0f),
                    PathNode.LineTo(76.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 100.0f),
                    PathNode.LineTo(52.0f, 156.0f),
                    PathNode.LineTo(36.0f, 156.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 196.0f),
                    PathNode.LineTo(36.0f, 180.0f),
                    PathNode.LineTo(116.0f, 180.0f),
                    PathNode.LineTo(116.0f, 196.0f),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
