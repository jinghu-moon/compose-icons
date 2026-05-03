package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorThinIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 221.17f),
                    PathNode.LineTo(173.35f, 167.7f),
                    PathNode.CurveTo(176.68422f, 167.12646f, 179.96056f, 166.25635f, 183.14f, 165.1f),
                    PathNode.CurveTo(212.19974f, 154.52213f, 227.18405f, 122.39113f, 216.61f, 93.33f),
                    PathNode.CurveTo(216.24706f, 92.33248f, 215.5025f, 91.520134f, 214.5403f, 91.07186f),
                    PathNode.CurveTo(213.57811f, 90.62359f, 212.47719f, 90.57615f, 211.48f, 90.94f),
                    PathNode.LineTo(156.17f, 111.07f),
                    PathNode.CurveTo(158.964f, 107.56845f, 161.33382f, 103.74855f, 163.23f, 99.69f),
                    PathNode.CurveTo(172.79428f, 79.16441f, 169.0558f, 54.89884f, 153.75711f, 38.20378f),
                    PathNode.CurveTo(138.4584f, 21.508718f, 114.61082f, 15.670345f, 93.33f, 23.41f),
                    PathNode.CurveTo(91.258026f, 24.16589f, 90.18887f, 26.456293f, 90.94f, 28.53f),
                    PathNode.LineTo(111.07f, 83.85f),
                    PathNode.CurveTo(107.57089f, 81.05251f, 103.75057f, 78.682434f, 99.69f, 76.79f),
                    PathNode.CurveTo(79.16441f, 67.225716f, 54.89884f, 70.964195f, 38.20378f, 86.26289f),
                    PathNode.CurveTo(21.508718f, 101.5616f, 15.670345f, 125.40919f, 23.41f, 146.69f),
                    PathNode.CurveTo(23.758871f, 147.70523f, 24.501179f, 148.53763f, 25.47f, 149.0f),
                    PathNode.CurveTo(26.432358f, 149.44759f, 27.533148f, 149.49435f, 28.53f, 149.13f),
                    PathNode.LineTo(83.85f, 129.0f),
                    PathNode.CurveTo(68.13525f, 148.5927f, 67.38756f, 176.25192f, 82.02088f, 196.66498f),
                    PathNode.CurveTo(96.654205f, 217.07805f, 123.08881f, 225.25136f, 146.69f, 216.66f),
                    PathNode.CurveTo(147.68752f, 216.29706f, 148.49986f, 215.55249f, 148.94814f, 214.5903f),
                    PathNode.CurveTo(149.39642f, 213.62811f, 149.44383f, 212.52719f, 149.08f, 211.53f),
                    PathNode.LineTo(129.0f, 156.17f),
                    PathNode.CurveTo(132.50003f, 158.96617f, 136.32019f, 161.33612f, 140.38f, 163.23f),
                    PathNode.CurveTo(147.42699f, 166.52216f, 155.08365f, 168.30688f, 162.86f, 168.47f),
                    PathNode.LineTo(221.22f, 226.83f),
                    PathNode.CurveTo(222.78296f, 228.39296f, 225.31702f, 228.39296f, 226.88f, 226.83f),
                    PathNode.CurveTo(228.44296f, 225.26703f, 228.44296f, 222.73297f, 226.88f, 221.17f),
                    PathNode.Close,
                    PathNode.MoveTo(99.88f, 29.71f),
                    PathNode.CurveTo(123.96805f, 23.146404f, 149.06577f, 36.144268f, 157.60452f, 59.604973f),
                    PathNode.CurveTo(166.14328f, 83.065674f, 155.2717f, 109.154915f, 132.6f, 119.61f),
                    PathNode.Close,
                    PathNode.MoveTo(125.09f, 122.38f),
                    PathNode.LineTo(117.64f, 125.09f),
                    PathNode.LineTo(114.92f, 117.64f),
                    PathNode.LineTo(122.38f, 114.92f),
                    PathNode.Close,
                    PathNode.MoveTo(29.71f, 140.14f),
                    PathNode.CurveTo(23.146404f, 116.05195f, 36.144268f, 90.95424f, 59.604973f, 82.41548f),
                    PathNode.CurveTo(83.065674f, 73.876724f, 109.154915f, 84.7483f, 119.61f, 107.42f),
                    PathNode.Close,
                    PathNode.MoveTo(140.14f, 210.31f),
                    PathNode.CurveTo(116.05195f, 216.8736f, 90.95424f, 203.87573f, 82.41548f, 180.41502f),
                    PathNode.CurveTo(73.876724f, 156.95433f, 84.7483f, 130.86508f, 107.42f, 120.41f),
                    PathNode.Close,
                    PathNode.MoveTo(164.43f, 160.49f),
                    PathNode.CurveTo(145.5612f, 160.63283f, 128.35316f, 149.72528f, 120.43f, 132.6f),
                    PathNode.LineTo(210.33f, 99.88f),
                    PathNode.CurveTo(214.23611f, 114.22289f, 211.27643f, 129.56624f, 202.31567f, 141.42714f),
                    PathNode.CurveTo(193.35492f, 153.28806f, 179.40439f, 160.32796f, 164.54f, 160.49f),
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
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
