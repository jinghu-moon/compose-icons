package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorLightIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 184.0f),
                    PathNode.CurveTo(230.0f, 187.3137f, 227.3137f, 190.0f, 224.0f, 190.0f),
                    PathNode.CurveTo(220.6863f, 190.0f, 218.0f, 187.3137f, 218.0f, 184.0f),
                    PathNode.CurveTo(218.00032f, 147.59816f, 196.07251f, 114.78053f, 162.44162f, 100.850105f),
                    PathNode.CurveTo(128.81071f, 86.91968f, 90.09983f, 94.61985f, 64.36f, 120.36f),
                    PathNode.LineTo(38.55f, 146.0f),
                    PathNode.LineTo(88.0f, 146.0f),
                    PathNode.CurveTo(91.313705f, 146.0f, 94.0f, 148.6863f, 94.0f, 152.0f),
                    PathNode.CurveTo(94.0f, 155.3137f, 91.313705f, 158.0f, 88.0f, 158.0f),
                    PathNode.LineTo(24.0f, 158.0f),
                    PathNode.CurveTo(20.68629f, 158.0f, 18.0f, 155.3137f, 18.0f, 152.0f),
                    PathNode.LineTo(18.0f, 88.0f),
                    PathNode.CurveTo(18.0f, 84.686295f, 20.68629f, 82.0f, 24.0f, 82.0f),
                    PathNode.CurveTo(27.31371f, 82.0f, 30.0f, 84.686295f, 30.0f, 88.0f),
                    PathNode.LineTo(30.0f, 137.58f),
                    PathNode.LineTo(55.89f, 111.86f),
                    PathNode.CurveTo(85.06514f, 82.69691f, 128.9339f, 73.97795f, 167.04353f, 89.76814f),
                    PathNode.CurveTo(205.15318f, 105.55833f, 230.00009f, 142.74864f, 230.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
