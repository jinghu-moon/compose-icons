package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) return _pencilSlash!!
        _pencilSlash = phosphorFillIcon(
            name = "PencilSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(90.28f, 98.38f),
                    PathNode.LineTo(36.68f, 152.0f),
                    PathNode.CurveTo(33.67232f, 154.9938f, 31.987144f, 159.06631f, 32.0f, 163.31f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(92.69f, 224.0f),
                    PathNode.CurveTo(96.93579f, 224.01357f, 101.00975f, 222.32419f, 104.0f, 219.31f),
                    PathNode.LineTo(154.4f, 168.92f),
                    PathNode.LineTo(202.09f, 221.38f),
                    PathNode.CurveTo(204.00189f, 223.53516f, 206.92493f, 224.49586f, 209.7426f, 223.89514f),
                    PathNode.CurveTo(212.56026f, 223.29443f, 214.8373f, 221.2251f, 215.70395f, 218.47755f),
                    PathNode.CurveTo(216.57062f, 215.73003f, 215.89302f, 212.7287f, 213.93f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(101.06f, 110.26f),
                    PathNode.LineTo(117.0f, 127.74f),
                    PathNode.LineTo(68.0f, 176.69f),
                    PathNode.LineTo(51.31f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 179.31f),
                    PathNode.LineTo(76.69f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 204.69f),
                    PathNode.LineTo(79.32f, 188.0f),
                    PathNode.LineTo(127.73f, 139.59f),
                    PathNode.LineTo(143.62f, 157.07f),
                    PathNode.Close,
                    PathNode.MoveTo(227.32f, 96.0f),
                    PathNode.LineTo(183.0f, 140.34f),
                    PathNode.CurveTo(179.86855f, 143.46869f, 174.79369f, 143.46646f, 171.665f, 140.335f),
                    PathNode.CurveTo(168.5363f, 137.20355f, 168.53854f, 132.1287f, 171.67f, 129.0f),
                    PathNode.LineTo(186.35f, 114.32f),
                    PathNode.LineTo(169.66f, 97.66f),
                    PathNode.LineTo(156.31f, 111.0f),
                    PathNode.CurveTo(153.16469f, 113.98822f, 148.21075f, 113.924805f, 145.14297f, 110.857025f),
                    PathNode.CurveTo(142.0752f, 107.789246f, 142.01176f, 102.83531f, 145.0f, 99.69f),
                    PathNode.LineTo(158.35f, 86.34f),
                    PathNode.LineTo(158.35f, 86.34f),
                    PathNode.LineTo(141.66f, 69.66f),
                    PathNode.LineTo(129.66f, 81.66f),
                    PathNode.CurveTo(126.53683f, 84.785934f, 121.47094f, 84.78817f, 118.345f, 81.665f),
                    PathNode.CurveTo(115.21907f, 78.54183f, 115.21683f, 73.47593f, 118.34f, 70.35f),
                    PathNode.LineTo(160.0f, 28.69f),
                    PathNode.CurveTo(163.00069f, 25.688627f, 167.0709f, 24.002417f, 171.315f, 24.002417f),
                    PathNode.CurveTo(175.5591f, 24.002417f, 179.62932f, 25.688627f, 182.63f, 28.69f),
                    PathNode.LineTo(227.32f, 73.37f),
                    PathNode.CurveTo(230.32137f, 76.37069f, 232.00758f, 80.4409f, 232.00758f, 84.685f),
                    PathNode.CurveTo(232.00758f, 88.92911f, 230.32137f, 92.99931f, 227.32f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null
