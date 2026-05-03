package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorFillIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 36.0f),
                    PathNode.CurveTo(100.0f, 20.536028f, 112.536026f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(143.46397f, 8.0f, 156.0f, 20.536028f, 156.0f, 36.0f),
                    PathNode.CurveTo(156.0f, 51.46397f, 143.46397f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(112.536026f, 64.0f, 100.0f, 51.46397f, 100.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.6f, 92.57f),
                    PathNode.CurveTo(226.09636f, 85.17559f, 219.54504f, 79.89673f, 212.0f, 80.0f),
                    PathNode.LineTo(44.0f, 80.0f),
                    PathNode.CurveTo(36.48471f, 79.99962f, 29.982035f, 85.22971f, 28.371094f, 92.57032f),
                    PathNode.CurveTo(26.760153f, 99.91092f, 30.475176f, 107.383354f, 37.3f, 110.53f),
                    PathNode.LineTo(37.36f, 110.53f),
                    PathNode.LineTo(91.25f, 134.26f),
                    PathNode.LineTo(69.33f, 217.56f),
                    PathNode.CurveTo(65.85099f, 225.51889f, 69.35742f, 234.79985f, 77.23f, 238.47f),
                    PathNode.CurveTo(79.345695f, 239.47453f, 81.657936f, 239.9971f, 84.0f, 240.0f),
                    PathNode.CurveTo(90.15536f, 240.00902f, 95.77012f, 236.48619f, 98.44f, 230.94f),
                    PathNode.LineTo(128.0f, 180.0f),
                    PathNode.LineTo(157.58f, 231.0f),
                    PathNode.CurveTo(161.4058f, 238.78264f, 170.73532f, 242.10066f, 178.61618f, 238.48149f),
                    PathNode.CurveTo(186.49702f, 234.86232f, 190.06001f, 225.62358f, 186.65f, 217.65f),
                    PathNode.LineTo(164.73f, 134.35f),
                    PathNode.LineTo(218.73f, 110.59f),
                    PathNode.CurveTo(225.64459f, 107.507515f, 229.37468f, 99.92961f, 227.6f, 92.57f),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
