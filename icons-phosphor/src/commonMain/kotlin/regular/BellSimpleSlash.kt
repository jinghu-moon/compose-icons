package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) return _bellSimpleSlash!!
        _bellSimpleSlash = phosphorRegularIcon(
            name = "BellSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(58.82f, 63.8f),
                    PathNode.CurveTo(51.710613f, 76.00271f, 47.976192f, 89.87736f, 48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 139.34f, 39.74f, 166.38f, 34.19f, 175.94f),
                    PathNode.CurveTo(31.305237f, 180.8869f, 31.284256f, 186.99834f, 34.134987f, 191.96494f),
                    PathNode.CurveTo(36.985718f, 196.9315f, 42.27343f, 199.99585f, 48.0f, 200.0f),
                    PathNode.LineTo(182.64f, 200.0f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 184.0f),
                    PathNode.CurveTo(55.7f, 170.76f, 64.0f, 140.08f, 64.0f, 104.0f),
                    PathNode.CurveTo(63.985985f, 94.44005f, 66.12561f, 84.999725f, 70.26f, 76.38f),
                    PathNode.LineTo(168.09f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 228.41827f, 164.41827f, 232.0f, 160.0f, 232.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(91.58172f, 232.0f, 88.0f, 228.41827f, 88.0f, 224.0f),
                    PathNode.CurveTo(88.0f, 219.58173f, 91.58172f, 216.0f, 96.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(164.41827f, 216.0f, 168.0f, 219.58173f, 168.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 179.25f),
                    PathNode.CurveTo(213.06558f, 179.61237f, 212.07222f, 179.79883f, 211.07f, 179.8f),
                    PathNode.CurveTo(207.78165f, 179.79669f, 204.83025f, 177.7815f, 203.63f, 174.72f),
                    PathNode.CurveTo(196.35f, 156.19f, 192.0f, 129.75f, 192.0f, 104.0f),
                    PathNode.CurveTo(192.00653f, 81.22021f, 179.9042f, 60.153915f, 160.2222f, 48.68493f),
                    PathNode.CurveTo(140.54019f, 37.215942f, 116.24546f, 37.073154f, 96.43f, 48.31f),
                    PathNode.CurveTo(92.60002f, 50.38524f, 87.813644f, 49.01478f, 85.6624f, 45.226963f),
                    PathNode.CurveTo(83.51116f, 41.43915f, 84.78586f, 36.62638f, 88.53f, 34.4f),
                    PathNode.CurveTo(113.29787f, 20.35124f, 143.66638f, 20.526487f, 168.27046f, 34.86016f),
                    PathNode.CurveTo(192.87454f, 49.193832f, 208.00522f, 75.52519f, 208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 139.35f, 216.05f, 162.59f, 218.52f, 168.88f),
                    PathNode.CurveTo(220.13483f, 172.99174f, 218.11134f, 177.63412f, 214.0f, 179.25f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
