package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorFillIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 136.0f),
                    PathNode.LineTo(215.63f, 136.0f),
                    PathNode.CurveTo(214.5663f, 147.77414f, 211.11983f, 159.20908f, 205.5f, 169.61f),
                    PathNode.CurveTo(204.88908f, 170.7622f, 203.7548f, 171.54425f, 202.46066f, 171.70552f),
                    PathNode.CurveTo(201.16652f, 171.86679f, 199.87502f, 171.38704f, 199.0f, 170.42f),
                    PathNode.LineTo(92.51f, 53.28f),
                    PathNode.CurveTo(91.63515f, 52.32047f, 91.280495f, 50.99598f, 91.55881f, 49.72767f),
                    PathNode.CurveTo(91.83712f, 48.459366f, 92.71377f, 47.405064f, 93.91f, 46.9f),
                    PathNode.CurveTo(102.215614f, 43.384144f, 111.01743f, 41.18116f, 120.0f, 40.37f),
                    PathNode.LineTo(120.0f, 16.0f),
                    PathNode.CurveTo(119.99513f, 13.783165f, 120.91034f, 11.663696f, 122.52731f, 10.147192f),
                    PathNode.CurveTo(124.14429f, 8.630689f, 126.31803f, 7.853129f, 128.53f, 8.0f),
                    PathNode.CurveTo(132.80547f, 8.367124f, 136.06825f, 11.979348f, 136.0f, 16.27f),
                    PathNode.LineTo(136.0f, 40.37f),
                    PathNode.CurveTo(178.25223f, 44.281887f, 211.71811f, 77.74777f, 215.63f, 120.0f),
                    PathNode.LineTo(239.73f, 120.0f),
                    PathNode.CurveTo(244.013f, 119.94234f, 247.61339f, 123.20232f, 247.98f, 127.47f),
                    PathNode.CurveTo(248.12663f, 129.6785f, 247.35175f, 131.84904f, 245.83963f, 133.46538f),
                    PathNode.CurveTo(244.32753f, 135.0817f, 242.21336f, 135.99933f, 240.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(63.17f, 68.58f),
                    PathNode.CurveTo(50.126095f, 82.7489f, 42.113125f, 100.82025f, 40.37f, 120.0f),
                    PathNode.LineTo(16.0f, 120.0f),
                    PathNode.CurveTo(11.581722f, 120.0f, 8.0f, 123.58172f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 132.41827f, 11.581722f, 136.0f, 16.0f, 136.0f),
                    PathNode.LineTo(40.37f, 136.0f),
                    PathNode.CurveTo(44.281887f, 178.25223f, 77.74777f, 211.71811f, 120.0f, 215.63f),
                    PathNode.LineTo(120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 215.63f),
                    PathNode.CurveTo(152.33716f, 214.15248f, 167.93011f, 208.11282f, 181.0f, 198.2f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
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
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
