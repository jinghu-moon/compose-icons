package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorBoldIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 78.53f),
                    PathNode.LineTo(220.0f, 72.0f),
                    PathNode.CurveTo(219.97244f, 47.71089f, 200.28911f, 28.027554f, 176.0f, 28.0f),
                    PathNode.LineTo(80.0f, 28.0f),
                    PathNode.CurveTo(55.71089f, 28.027554f, 36.027554f, 47.71089f, 36.0f, 72.0f),
                    PathNode.LineTo(36.0f, 78.53f),
                    PathNode.CurveTo(14.503911f, 85.44763f, -0.070468f, 105.44825f, -0.070468f, 128.03f),
                    PathNode.CurveTo(-0.070468f, 150.61176f, 14.503911f, 170.61237f, 36.0f, 177.53f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 211.0457f, 44.954304f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(211.0457f, 220.0f, 220.0f, 211.0457f, 220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 177.51f),
                    PathNode.CurveTo(241.4961f, 170.59238f, 256.07047f, 150.59175f, 256.07047f, 128.01f),
                    PathNode.CurveTo(256.07047f, 105.42825f, 241.4961f, 85.42763f, 220.0f, 78.51f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 52.0f),
                    PathNode.LineTo(176.0f, 52.0f),
                    PathNode.CurveTo(187.0457f, 52.0f, 196.0f, 60.954304f, 196.0f, 72.0f),
                    PathNode.LineTo(196.0f, 76.62f),
                    PathNode.CurveTo(172.18666f, 80.3687f, 154.05647f, 99.96733f, 152.17f, 124.0f),
                    PathNode.LineTo(103.83f, 124.0f),
                    PathNode.CurveTo(101.94353f, 99.96733f, 83.81334f, 80.3687f, 60.0f, 76.62f),
                    PathNode.LineTo(60.0f, 72.0f),
                    PathNode.CurveTo(60.0f, 60.954304f, 68.95431f, 52.0f, 80.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.81f, 155.86f),
                    PathNode.CurveTo(200.67415f, 156.47148f, 196.00044f, 161.63376f, 196.0f, 167.8f),
                    PathNode.LineTo(196.0f, 196.0f),
                    PathNode.LineTo(60.0f, 196.0f),
                    PathNode.LineTo(60.0f, 167.8f),
                    PathNode.CurveTo(59.99956f, 161.63376f, 55.325855f, 156.47148f, 49.19f, 155.86f),
                    PathNode.CurveTo(34.16758f, 154.34474f, 23.05195f, 141.1915f, 24.062824f, 126.126724f),
                    PathNode.CurveTo(25.0737f, 111.06195f, 37.846977f, 99.51169f, 52.937164f, 100.01705f),
                    PathNode.CurveTo(68.02735f, 100.5224f, 79.99927f, 112.90135f, 80.0f, 128.0f),
                    PathNode.LineTo(80.0f, 164.0f),
                    PathNode.CurveTo(80.0f, 170.62741f, 85.37258f, 176.0f, 92.0f, 176.0f),
                    PathNode.CurveTo(98.62742f, 176.0f, 104.0f, 170.62741f, 104.0f, 164.0f),
                    PathNode.LineTo(104.0f, 148.0f),
                    PathNode.LineTo(152.0f, 148.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(152.0f, 170.62741f, 157.37259f, 176.0f, 164.0f, 176.0f),
                    PathNode.CurveTo(170.62741f, 176.0f, 176.0f, 170.62741f, 176.0f, 164.0f),
                    PathNode.LineTo(176.0f, 128.0f),
                    PathNode.CurveTo(176.00073f, 112.90135f, 187.97264f, 100.5224f, 203.06284f, 100.01705f),
                    PathNode.CurveTo(218.15303f, 99.51169f, 230.9263f, 111.06195f, 231.93718f, 126.126724f),
                    PathNode.CurveTo(232.94804f, 141.1915f, 221.83243f, 154.34474f, 206.81f, 155.86f),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
