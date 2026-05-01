package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorBoldIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 208.0f),
                    PathNode.CurveTo(180.0f, 214.62741f, 174.62741f, 220.0f, 168.0f, 220.0f),
                    PathNode.LineTo(88.0f, 220.0f),
                    PathNode.CurveTo(83.454735f, 220.0f, 79.299576f, 217.43199f, 77.26688f, 213.36656f),
                    PathNode.CurveTo(75.23417f, 209.30115f, 75.67284f, 204.43622f, 78.4f, 200.8f),
                    PathNode.LineTo(150.35f, 104.88f),
                    PathNode.CurveTo(156.87717f, 96.26885f, 157.86699f, 84.670456f, 152.89333f, 75.07783f),
                    PathNode.CurveTo(147.91966f, 65.4852f, 137.87027f, 59.610485f, 127.07133f, 59.982716f),
                    PathNode.CurveTo(116.27238f, 60.354942f, 106.651344f, 66.90767f, 102.35f, 76.82f),
                    PathNode.CurveTo(99.69351f, 82.895134f, 92.615135f, 85.66649f, 86.54f, 83.01f),
                    PathNode.CurveTo(80.46487f, 80.3535f, 77.69351f, 73.27513f, 80.35f, 67.2f),
                    PathNode.CurveTo(81.97903f, 63.477142f, 84.036224f, 59.956745f, 86.48f, 56.71f),
                    PathNode.CurveTo(103.763756f, 33.773613f, 136.3686f, 29.19125f, 159.305f, 46.475002f),
                    PathNode.CurveTo(182.24138f, 63.75875f, 186.82375f, 96.36362f, 169.54f, 119.3f),
                    PathNode.LineTo(112.0f, 196.0f),
                    PathNode.LineTo(168.0f, 196.0f),
                    PathNode.CurveTo(174.62741f, 196.0f, 180.0f, 201.37259f, 180.0f, 208.0f),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
