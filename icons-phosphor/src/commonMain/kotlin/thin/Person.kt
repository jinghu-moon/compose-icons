package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Person: ImageVector
    get() {
        if (_person != null) return _person!!
        _person = phosphorThinIcon(
            name = "Person",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 68.0f),
                    PathNode.CurveTo(143.46397f, 68.0f, 156.0f, 55.46397f, 156.0f, 40.0f),
                    PathNode.CurveTo(156.0f, 24.536028f, 143.46397f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(112.536026f, 12.0f, 100.0f, 24.536028f, 100.0f, 40.0f),
                    PathNode.CurveTo(100.0f, 55.46397f, 112.536026f, 68.0f, 128.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(139.0457f, 20.0f, 148.0f, 28.954306f, 148.0f, 40.0f),
                    PathNode.CurveTo(148.0f, 51.045696f, 139.0457f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(116.95431f, 60.0f, 108.0f, 51.045696f, 108.0f, 40.0f),
                    PathNode.CurveTo(108.0f, 28.954306f, 116.95431f, 20.0f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.42f, 136.78f),
                    PathNode.LineTo(170.17f, 85.48f),
                    PathNode.CurveTo(164.85472f, 79.45289f, 157.20605f, 76.00007f, 149.17f, 76.0f),
                    PathNode.LineTo(106.83f, 76.0f),
                    PathNode.CurveTo(98.793945f, 76.00007f, 91.14528f, 79.45289f, 85.83f, 85.48f),
                    PathNode.LineTo(40.58f, 136.78f),
                    PathNode.CurveTo(34.466118f, 143.03563f, 34.509068f, 153.04158f, 40.676434f, 159.24449f),
                    PathNode.CurveTo(46.843803f, 165.4474f, 56.849346f, 165.54784f, 63.14f, 159.47f),
                    PathNode.LineTo(89.0f, 138.7f),
                    PathNode.LineTo(69.3f, 213.58f),
                    PathNode.CurveTo(65.7331f, 221.58743f, 69.27355f, 230.97412f, 77.240105f, 234.63141f),
                    PathNode.CurveTo(85.20666f, 238.28868f, 94.63283f, 234.85466f, 98.38f, 226.93f),
                    PathNode.LineTo(128.0f, 176.0f),
                    PathNode.LineTo(157.58f, 227.0f),
                    PathNode.CurveTo(161.32718f, 234.92467f, 170.75334f, 238.35867f, 178.7199f, 234.7014f),
                    PathNode.CurveTo(186.68645f, 231.04413f, 190.2269f, 221.65742f, 186.66f, 213.65f),
                    PathNode.LineTo(167.0f, 138.7f),
                    PathNode.LineTo(192.9f, 159.47f),
                    PathNode.CurveTo(199.19066f, 165.54784f, 209.1962f, 165.4474f, 215.36357f, 159.24449f),
                    PathNode.CurveTo(221.53093f, 153.04158f, 221.57388f, 143.03563f, 215.46f, 136.78f),
                    PathNode.Close,
                    PathNode.MoveTo(209.66f, 153.65f),
                    PathNode.CurveTo(206.53622f, 156.77173f, 201.47377f, 156.77173f, 198.35f, 153.65f),
                    PathNode.CurveTo(198.24698f, 153.54567f, 198.1367f, 153.44876f, 198.02f, 153.36f),
                    PathNode.LineTo(162.51f, 124.88f),
                    PathNode.CurveTo(161.16507f, 123.795135f, 159.27554f, 123.69653f, 157.825f, 124.63552f),
                    PathNode.CurveTo(156.37445f, 125.57452f, 155.69084f, 127.3388f, 156.13f, 129.01f),
                    PathNode.LineTo(179.0f, 215.94f),
                    PathNode.CurveTo(179.06053f, 216.16983f, 179.14082f, 216.39401f, 179.24f, 216.61f),
                    PathNode.CurveTo(180.49649f, 219.20746f, 180.25691f, 222.28027f, 178.613f, 224.65158f),
                    PathNode.CurveTo(176.9691f, 227.0229f, 174.17563f, 228.32524f, 171.30246f, 228.05981f),
                    PathNode.CurveTo(168.42929f, 227.79439f, 165.92166f, 226.00233f, 164.74f, 223.37f),
                    PathNode.CurveTo(164.69f, 223.26f, 164.63f, 223.16f, 164.57f, 223.05f),
                    PathNode.LineTo(131.46f, 166.0f),
                    PathNode.CurveTo(130.7444f, 164.76639f, 129.42613f, 164.0071f, 128.0f, 164.0071f),
                    PathNode.CurveTo(126.57387f, 164.0071f, 125.25559f, 164.76639f, 124.54f, 166.0f),
                    PathNode.LineTo(91.42f, 223.05f),
                    PathNode.CurveTo(91.36f, 223.16f, 91.3f, 223.26f, 91.25f, 223.37f),
                    PathNode.CurveTo(90.06833f, 226.00233f, 87.560715f, 227.79439f, 84.687546f, 228.05981f),
                    PathNode.CurveTo(81.81437f, 228.32524f, 79.0209f, 227.0229f, 77.37699f, 224.65158f),
                    PathNode.CurveTo(75.733086f, 222.28027f, 75.4935f, 219.20746f, 76.75f, 216.61f),
                    PathNode.CurveTo(76.849174f, 216.39401f, 76.929474f, 216.16983f, 76.99f, 215.94f),
                    PathNode.LineTo(99.87f, 129.0f),
                    PathNode.CurveTo(100.309166f, 127.3288f, 99.62555f, 125.564514f, 98.175f, 124.62553f),
                    PathNode.CurveTo(96.72446f, 123.68653f, 94.83494f, 123.78513f, 93.49f, 124.87f),
                    PathNode.LineTo(58.0f, 153.36f),
                    PathNode.CurveTo(57.8833f, 153.44876f, 57.773026f, 153.54567f, 57.67f, 153.65f),
                    PathNode.CurveTo(54.524685f, 156.63823f, 49.57075f, 156.5748f, 46.50297f, 153.50703f),
                    PathNode.CurveTo(43.435196f, 150.43925f, 43.37177f, 145.48532f, 46.36f, 142.34f),
                    PathNode.LineTo(46.53f, 142.16f),
                    PathNode.LineTo(91.83f, 90.77f),
                    PathNode.CurveTo(95.626884f, 86.465454f, 101.09019f, 83.99969f, 106.83f, 84.0f),
                    PathNode.LineTo(149.17f, 84.0f),
                    PathNode.CurveTo(154.90982f, 83.99969f, 160.37311f, 86.465454f, 164.17f, 90.77f),
                    PathNode.LineTo(209.49f, 142.16f),
                    PathNode.LineTo(209.66f, 142.34f),
                    PathNode.CurveTo(212.78172f, 145.46378f, 212.78172f, 150.52623f, 209.66f, 153.65f),
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
        return _person!!
    }

private var _person: ImageVector? = null
