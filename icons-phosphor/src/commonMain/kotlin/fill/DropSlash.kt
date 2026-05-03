package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorFillIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.CurveTo(215.88303f, 212.7287f, 216.56061f, 215.73003f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(214.82729f, 221.2251f, 212.55025f, 223.29443f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(206.91493f, 224.49586f, 203.9919f, 223.53516f, 202.08f, 221.38f),
                    PathNode.LineTo(189.18f, 207.19f),
                    PathNode.CurveTo(172.79614f, 223.1123f, 150.84624f, 232.01353f, 128.0f, 232.0f),
                    PathNode.CurveTo(80.0f, 232.0f, 40.51f, 193.07f, 40.0f, 145.12f),
                    PathNode.CurveTo(39.73f, 120.78f, 48.22f, 95.28f, 64.73f, 70.31f),
                    PathNode.LineTo(42.3f, 45.63f),
                    PathNode.CurveTo(39.293705f, 42.410446f, 39.35541f, 37.394615f, 42.44f, 34.25f),
                    PathNode.CurveTo(43.996f, 32.74565f, 46.095123f, 31.935938f, 48.258297f, 32.005657f),
                    PathNode.CurveTo(50.421474f, 32.07538f, 52.4641f, 33.018578f, 53.92f, 34.62f),
                    PathNode.Close,
                    PathNode.MoveTo(203.85f, 175.76f),
                    PathNode.CurveTo(204.78548f, 176.78958f, 206.18867f, 177.2592f, 207.55544f, 177.00014f),
                    PathNode.CurveTo(208.9222f, 176.74106f, 210.0562f, 175.7905f, 210.55f, 174.49f),
                    PathNode.CurveTo(214.16202f, 164.73074f, 216.00749f, 154.40627f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f),
                    PathNode.CurveTo(161.6478f, 33.484356f, 147.74547f, 20.638535f, 132.55f, 9.45f),
                    PathNode.CurveTo(129.79443f, 7.519659f, 126.12557f, 7.519659f, 123.37f, 9.45f),
                    PathNode.CurveTo(110.2782f, 19.1027f, 98.15464f, 30.003853f, 87.17f, 42.0f),
                    PathNode.CurveTo(85.76559f, 43.5299f, 85.76559f, 45.8801f, 87.17f, 47.41f),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
