package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Mouse: ImageVector
    get() {
        if (_mouse != null) return _mouse!!
        _mouse = phosphorBoldIcon(
            name = "Mouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 12.0f),
                    PathNode.LineTo(112.0f, 12.0f),
                    PathNode.CurveTo(74.46063f, 12.038584f, 44.038586f, 42.460632f, 44.0f, 80.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.CurveTo(44.038586f, 213.53935f, 74.46063f, 243.96141f, 112.0f, 244.0f),
                    PathNode.LineTo(144.0f, 244.0f),
                    PathNode.CurveTo(181.53935f, 243.96141f, 211.96141f, 213.53935f, 212.0f, 176.0f),
                    PathNode.LineTo(212.0f, 80.0f),
                    PathNode.CurveTo(211.96141f, 42.460632f, 181.53935f, 12.038584f, 144.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 80.0f),
                    PathNode.LineTo(188.0f, 100.0f),
                    PathNode.LineTo(140.0f, 100.0f),
                    PathNode.LineTo(140.0f, 36.0f),
                    PathNode.LineTo(144.0f, 36.0f),
                    PathNode.CurveTo(168.28911f, 36.027554f, 187.97244f, 55.71089f, 188.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 36.0f),
                    PathNode.LineTo(116.0f, 36.0f),
                    PathNode.LineTo(116.0f, 100.0f),
                    PathNode.LineTo(68.0f, 100.0f),
                    PathNode.LineTo(68.0f, 80.0f),
                    PathNode.CurveTo(68.02756f, 55.71089f, 87.71089f, 36.027554f, 112.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 220.0f),
                    PathNode.LineTo(112.0f, 220.0f),
                    PathNode.CurveTo(87.71089f, 219.97244f, 68.02756f, 200.28911f, 68.0f, 176.0f),
                    PathNode.LineTo(68.0f, 124.0f),
                    PathNode.LineTo(188.0f, 124.0f),
                    PathNode.LineTo(188.0f, 176.0f),
                    PathNode.CurveTo(187.97244f, 200.28911f, 168.28911f, 219.97244f, 144.0f, 220.0f),
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
        return _mouse!!
    }

private var _mouse: ImageVector? = null
