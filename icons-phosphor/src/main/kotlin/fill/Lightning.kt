package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorFillIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.85f, 125.46f),
                    PathNode.LineTo(101.85f, 245.46f),
                    PathNode.CurveTo(99.41165f, 248.0622f, 95.545364f, 248.73628f, 92.37027f, 247.11278f),
                    PathNode.CurveTo(89.19517f, 245.4893f, 87.47802f, 241.96027f, 88.16f, 238.46f),
                    PathNode.LineTo(102.82f, 165.13f),
                    PathNode.LineTo(45.19f, 143.49f),
                    PathNode.CurveTo(42.676052f, 142.54964f, 40.801205f, 140.41125f, 40.197666f, 137.79593f),
                    PathNode.CurveTo(39.594128f, 135.18059f, 40.34234f, 132.43689f, 42.19f, 130.49f),
                    PathNode.LineTo(154.19f, 10.49f),
                    PathNode.CurveTo(156.62836f, 7.8878f, 160.49463f, 7.213716f, 163.66974f, 8.837214f),
                    PathNode.CurveTo(166.84483f, 10.460713f, 168.56198f, 13.989727f, 167.88f, 17.49f),
                    PathNode.LineTo(153.18f, 90.9f),
                    PathNode.LineTo(210.81f, 112.51f),
                    PathNode.CurveTo(213.305f, 113.45651f, 215.16379f, 115.584724f, 215.76602f, 118.18438f),
                    PathNode.CurveTo(216.36826f, 120.78403f, 215.63463f, 123.5128f, 213.81f, 125.46f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _lightning!!
    }

private var _lightning: ImageVector? = null
