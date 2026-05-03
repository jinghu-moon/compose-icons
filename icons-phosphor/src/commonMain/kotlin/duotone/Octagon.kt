package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorDuotoneIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 91.55f),
                    PathNode.LineTo(224.0f, 164.45f),
                    PathNode.CurveTo(224.00166f, 166.57237f, 223.15993f, 168.60843f, 221.66f, 170.11f),
                    PathNode.LineTo(170.11f, 221.66f),
                    PathNode.CurveTo(168.60843f, 223.15993f, 166.57237f, 224.00166f, 164.45f, 224.0f),
                    PathNode.LineTo(91.55f, 224.0f),
                    PathNode.CurveTo(89.42763f, 224.00166f, 87.39158f, 223.15993f, 85.89f, 221.66f),
                    PathNode.LineTo(34.34f, 170.11f),
                    PathNode.CurveTo(32.84009f, 168.60843f, 31.998331f, 166.57237f, 32.0f, 164.45f),
                    PathNode.LineTo(32.0f, 91.55f),
                    PathNode.CurveTo(31.998331f, 89.42763f, 32.84009f, 87.39158f, 34.34f, 85.89f),
                    PathNode.LineTo(85.89f, 34.34f),
                    PathNode.CurveTo(87.39158f, 32.84009f, 89.42763f, 31.998331f, 91.55f, 32.0f),
                    PathNode.LineTo(164.45f, 32.0f),
                    PathNode.CurveTo(166.57237f, 31.998331f, 168.60843f, 32.84009f, 170.11f, 34.34f),
                    PathNode.LineTo(221.66f, 85.89f),
                    PathNode.CurveTo(223.15993f, 87.39158f, 224.00166f, 89.42763f, 224.0f, 91.55f),
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
                    PathNode.MoveTo(227.31f, 80.24f),
                    PathNode.LineTo(175.76f, 28.69f),
                    PathNode.CurveTo(172.76974f, 25.675812f, 168.69579f, 23.986435f, 164.45f, 24.0f),
                    PathNode.LineTo(91.55f, 24.0f),
                    PathNode.CurveTo(87.30421f, 23.986435f, 83.230255f, 25.675812f, 80.24f, 28.69f),
                    PathNode.LineTo(28.69f, 80.24f),
                    PathNode.CurveTo(25.675812f, 83.230255f, 23.986435f, 87.30421f, 24.0f, 91.55f),
                    PathNode.LineTo(24.0f, 164.45f),
                    PathNode.CurveTo(23.986435f, 168.69579f, 25.675812f, 172.76974f, 28.69f, 175.76f),
                    PathNode.LineTo(80.24f, 227.31f),
                    PathNode.CurveTo(83.230255f, 230.32419f, 87.30421f, 232.01357f, 91.55f, 232.0f),
                    PathNode.LineTo(164.45f, 232.0f),
                    PathNode.CurveTo(168.69579f, 232.01357f, 172.76974f, 230.32419f, 175.76f, 227.31f),
                    PathNode.LineTo(227.31f, 175.76f),
                    PathNode.CurveTo(230.32419f, 172.76974f, 232.01357f, 168.69579f, 232.0f, 164.45f),
                    PathNode.LineTo(232.0f, 91.55f),
                    PathNode.CurveTo(232.01357f, 87.30421f, 230.32419f, 83.230255f, 227.31f, 80.24f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 164.45f),
                    PathNode.LineTo(164.45f, 216.0f),
                    PathNode.LineTo(91.55f, 216.0f),
                    PathNode.LineTo(40.0f, 164.45f),
                    PathNode.LineTo(40.0f, 91.55f),
                    PathNode.LineTo(91.55f, 40.0f),
                    PathNode.LineTo(164.45f, 40.0f),
                    PathNode.LineTo(216.0f, 91.55f),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
