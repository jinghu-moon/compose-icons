package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorRegularIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 88.0f),
                    PathNode.LineTo(240.0f, 152.0f),
                    PathNode.CurveTo(240.0f, 156.41827f, 236.41827f, 160.0f, 232.0f, 160.0f),
                    PathNode.LineTo(168.0f, 160.0f),
                    PathNode.CurveTo(163.58173f, 160.0f, 160.0f, 156.41827f, 160.0f, 152.0f),
                    PathNode.CurveTo(160.0f, 147.58173f, 163.58173f, 144.0f, 168.0f, 144.0f),
                    PathNode.LineTo(212.6f, 144.0f),
                    PathNode.LineTo(190.24f, 121.79f),
                    PathNode.CurveTo(165.07553f, 96.61372f, 127.22211f, 89.07719f, 94.33376f, 102.69529f),
                    PathNode.CurveTo(61.44542f, 116.31339f, 40.00032f, 148.4037f, 40.0f, 184.0f),
                    PathNode.CurveTo(40.0f, 188.41827f, 36.418278f, 192.0f, 32.0f, 192.0f),
                    PathNode.CurveTo(27.581722f, 192.0f, 24.0f, 188.41827f, 24.0f, 184.0f),
                    PathNode.CurveTo(23.999277f, 141.93536f, 49.338066f, 104.012375f, 88.20068f, 87.91484f),
                    PathNode.CurveTo(127.06329f, 71.81731f, 171.79617f, 80.715454f, 201.54f, 110.46f),
                    PathNode.LineTo(224.0f, 132.77f),
                    PathNode.LineTo(224.0f, 88.0f),
                    PathNode.CurveTo(224.0f, 83.58172f, 227.58173f, 80.0f, 232.0f, 80.0f),
                    PathNode.CurveTo(236.41827f, 80.0f, 240.0f, 83.58172f, 240.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
