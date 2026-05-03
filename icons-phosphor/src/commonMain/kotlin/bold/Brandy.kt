package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorBoldIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 88.0f),
                    PathNode.LineTo(228.0f, 88.0f),
                    PathNode.CurveTo(228.024f, 68.63044f, 222.40134f, 49.67392f, 211.82f, 33.45f),
                    PathNode.CurveTo(209.61595f, 30.066532f, 205.85799f, 28.018442f, 201.82f, 28.0f),
                    PathNode.LineTo(54.23f, 28.0f),
                    PathNode.CurveTo(50.19201f, 28.018442f, 46.43405f, 30.066532f, 44.23f, 33.45f),
                    PathNode.CurveTo(33.631027f, 49.668446f, 27.990864f, 68.625374f, 28.0f, 88.0f),
                    PathNode.LineTo(28.0f, 88.0f),
                    PathNode.CurveTo(28.065771f, 138.56279f, 65.81063f, 181.14586f, 116.0f, 187.28f),
                    PathNode.LineTo(116.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.CurveTo(81.37258f, 212.0f, 76.0f, 217.37259f, 76.0f, 224.0f),
                    PathNode.CurveTo(76.0f, 230.62741f, 81.37258f, 236.0f, 88.0f, 236.0f),
                    PathNode.LineTo(168.0f, 236.0f),
                    PathNode.CurveTo(174.62741f, 236.0f, 180.0f, 230.62741f, 180.0f, 224.0f),
                    PathNode.CurveTo(180.0f, 217.37259f, 174.62741f, 212.0f, 168.0f, 212.0f),
                    PathNode.LineTo(140.0f, 212.0f),
                    PathNode.LineTo(140.0f, 187.28f),
                    PathNode.CurveTo(190.18936f, 181.14586f, 227.93423f, 138.56279f, 228.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(61.05f, 52.0f),
                    PathNode.LineTo(195.0f, 52.0f),
                    PathNode.CurveTo(199.03354f, 59.486225f, 201.77214f, 67.60061f, 203.1f, 76.0f),
                    PathNode.LineTo(53.0f, 76.0f),
                    PathNode.CurveTo(54.312202f, 67.603645f, 57.03385f, 59.489407f, 61.05f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.05f, 164.0f),
                    PathNode.CurveTo(90.74487f, 163.927f, 58.989746f, 136.8293f, 53.05f, 100.0f),
                    PathNode.LineTo(203.0f, 100.0f),
                    PathNode.CurveTo(197.06026f, 136.8293f, 165.30513f, 163.927f, 128.0f, 164.0f),
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
        return _brandy!!
    }

private var _brandy: ImageVector? = null
