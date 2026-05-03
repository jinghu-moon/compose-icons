package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Unite: ImageVector
    get() {
        if (_unite != null) return _unite!!
        _unite = phosphorFillIcon(
            name = "Unite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 164.0f),
                    PathNode.CurveTo(240.00139f, 205.2148f, 207.15186f, 238.9197f, 165.95064f, 239.97752f),
                    PathNode.CurveTo(124.74943f, 241.03535f, 90.21358f, 209.06056f, 88.1f, 167.9f),
                    PathNode.CurveTo(47.19261f, 165.79796f, 15.310314f, 131.65495f, 16.011267f, 90.699585f),
                    PathNode.CurveTo(16.712221f, 49.744225f, 49.744225f, 16.712221f, 90.699585f, 16.011267f),
                    PathNode.CurveTo(131.65495f, 15.310314f, 165.79796f, 47.19261f, 167.9f, 88.1f),
                    PathNode.CurveTo(208.28192f, 90.22548f, 239.94962f, 123.56221f, 240.0f, 164.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _unite!!
    }

private var _unite: ImageVector? = null
