package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorThinIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 136.0f),
                    PathNode.CurveTo(251.96141f, 98.46063f, 221.53935f, 68.03858f, 184.0f, 68.0f),
                    PathNode.LineTo(72.0f, 68.0f),
                    PathNode.CurveTo(34.460632f, 68.03858f, 4.038584f, 98.46063f, 4.0f, 136.0f),
                    PathNode.CurveTo(4.0068f, 145.63269f, 10.879078f, 153.89203f, 20.35f, 155.65f),
                    PathNode.CurveTo(23.91f, 174.84f, 54.81f, 188.0f, 72.0f, 188.0f),
                    PathNode.CurveTo(90.331665f, 187.99638f, 105.73315f, 174.21815f, 107.77f, 156.0f),
                    PathNode.LineTo(148.23f, 156.0f),
                    PathNode.CurveTo(150.26685f, 174.21815f, 165.66833f, 187.99638f, 184.0f, 188.0f),
                    PathNode.CurveTo(201.19f, 188.0f, 232.09f, 174.84f, 235.65f, 155.65f),
                    PathNode.CurveTo(245.12093f, 153.89203f, 251.9932f, 145.63269f, 252.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 152.0f),
                    PathNode.CurveTo(28.0f, 144.25f, 35.92f, 136.75f, 45.81f, 131.47f),
                    PathNode.LineTo(88.81f, 174.42f),
                    PathNode.CurveTo(83.96181f, 178.0571f, 78.06078f, 180.01591f, 72.0f, 180.0f),
                    PathNode.CurveTo(55.45f, 180.0f, 28.0f, 166.44f, 28.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.42f, 168.76f),
                    PathNode.LineTo(53.58f, 127.92f),
                    PathNode.CurveTo(60.0f, 125.46f, 66.58f, 124.0f, 72.0f, 124.0f),
                    PathNode.CurveTo(82.594826f, 124.00376f, 92.28014f, 129.98721f, 97.02506f, 139.46013f),
                    PathNode.CurveTo(101.76999f, 148.93303f, 100.761765f, 160.27281f, 94.42f, 168.76f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 152.0f),
                    PathNode.CurveTo(156.00005f, 143.9996f, 159.42969f, 136.38306f, 165.42f, 131.08f),
                    PathNode.LineTo(208.0f, 173.65f),
                    PathNode.CurveTo(200.0f, 177.56f, 191.0f, 180.0f, 184.0f, 180.0f),
                    PathNode.CurveTo(168.53603f, 180.0f, 156.0f, 167.46397f, 156.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.2f, 169.55f),
                    PathNode.LineTo(172.25f, 126.55f),
                    PathNode.CurveTo(175.93437f, 124.854904f, 179.94441f, 123.984634f, 184.0f, 124.0f),
                    PathNode.CurveTo(200.55f, 124.0f, 228.0f, 137.56f, 228.0f, 152.0f),
                    PathNode.CurveTo(228.0f, 158.39f, 222.62f, 164.6f, 215.2f, 169.55f),
                    PathNode.Close,
                    PathNode.MoveTo(235.46f, 147.49f),
                    PathNode.CurveTo(231.15f, 128.77f, 200.93f, 116.0f, 184.0f, 116.0f),
                    PathNode.CurveTo(165.66833f, 116.00361f, 150.26685f, 129.78185f, 148.23f, 148.0f),
                    PathNode.LineTo(107.77f, 148.0f),
                    PathNode.CurveTo(105.73315f, 129.78185f, 90.331665f, 116.00361f, 72.0f, 116.0f),
                    PathNode.CurveTo(55.07f, 116.0f, 24.85f, 128.77f, 20.54f, 147.49f),
                    PathNode.CurveTo(15.470263f, 145.9634f, 12.000159f, 141.2946f, 12.0f, 136.0f),
                    PathNode.CurveTo(12.038574f, 102.87891f, 38.878906f, 76.038574f, 72.0f, 76.0f),
                    PathNode.LineTo(184.0f, 76.0f),
                    PathNode.CurveTo(217.1211f, 76.038574f, 243.96143f, 102.87891f, 244.0f, 136.0f),
                    PathNode.CurveTo(243.99985f, 141.2946f, 240.52974f, 145.9634f, 235.46f, 147.49f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _goggles!!
    }

private var _goggles: ImageVector? = null
