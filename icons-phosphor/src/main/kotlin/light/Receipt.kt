package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorLightIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.0f, 104.0f),
                    PathNode.CurveTo(182.0f, 107.313705f, 179.3137f, 110.0f, 176.0f, 110.0f),
                    PathNode.LineTo(80.0f, 110.0f),
                    PathNode.CurveTo(76.686295f, 110.0f, 74.0f, 107.313705f, 74.0f, 104.0f),
                    PathNode.CurveTo(74.0f, 100.686295f, 76.686295f, 98.0f, 80.0f, 98.0f),
                    PathNode.LineTo(176.0f, 98.0f),
                    PathNode.CurveTo(179.3137f, 98.0f, 182.0f, 100.686295f, 182.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 130.0f),
                    PathNode.LineTo(80.0f, 130.0f),
                    PathNode.CurveTo(76.686295f, 130.0f, 74.0f, 132.6863f, 74.0f, 136.0f),
                    PathNode.CurveTo(74.0f, 139.3137f, 76.686295f, 142.0f, 80.0f, 142.0f),
                    PathNode.LineTo(176.0f, 142.0f),
                    PathNode.CurveTo(179.3137f, 142.0f, 182.0f, 139.3137f, 182.0f, 136.0f),
                    PathNode.CurveTo(182.0f, 132.6863f, 179.3137f, 130.0f, 176.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 56.0f),
                    PathNode.LineTo(230.0f, 208.0f),
                    PathNode.CurveTo(229.99771f, 210.07895f, 228.9194f, 212.00856f, 227.15f, 213.1f),
                    PathNode.CurveTo(226.20534f, 213.68983f, 225.11368f, 214.00174f, 224.0f, 214.0f),
                    PathNode.CurveTo(223.06992f, 214.00056f, 222.15244f, 213.78488f, 221.32f, 213.37f),
                    PathNode.LineTo(192.0f, 198.71f),
                    PathNode.LineTo(162.68f, 213.37f),
                    PathNode.CurveTo(160.99263f, 214.2124f, 159.00737f, 214.2124f, 157.32f, 213.37f),
                    PathNode.LineTo(128.0f, 198.71f),
                    PathNode.LineTo(98.68f, 213.37f),
                    PathNode.CurveTo(96.99263f, 214.2124f, 95.00737f, 214.2124f, 93.32f, 213.37f),
                    PathNode.LineTo(64.0f, 198.71f),
                    PathNode.LineTo(34.68f, 213.37f),
                    PathNode.CurveTo(32.819798f, 214.29868f, 30.611406f, 214.19814f, 28.843288f, 213.10426f),
                    PathNode.CurveTo(27.07517f, 212.01039f, 25.999376f, 210.07913f, 26.0f, 208.0f),
                    PathNode.LineTo(26.0f, 56.0f),
                    PathNode.CurveTo(26.0f, 48.268013f, 32.268013f, 42.0f, 40.0f, 42.0f),
                    PathNode.LineTo(216.0f, 42.0f),
                    PathNode.CurveTo(223.73198f, 42.0f, 230.0f, 48.268013f, 230.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 56.0f),
                    PathNode.CurveTo(218.0f, 54.89543f, 217.10457f, 54.0f, 216.0f, 54.0f),
                    PathNode.LineTo(40.0f, 54.0f),
                    PathNode.CurveTo(38.89543f, 54.0f, 38.0f, 54.89543f, 38.0f, 56.0f),
                    PathNode.LineTo(38.0f, 198.29f),
                    PathNode.LineTo(61.32f, 186.63f),
                    PathNode.CurveTo(63.007366f, 185.7876f, 64.99263f, 185.7876f, 66.68f, 186.63f),
                    PathNode.LineTo(96.0f, 201.29f),
                    PathNode.LineTo(125.32f, 186.63f),
                    PathNode.CurveTo(127.00737f, 185.7876f, 128.99263f, 185.7876f, 130.68f, 186.63f),
                    PathNode.LineTo(160.0f, 201.29f),
                    PathNode.LineTo(189.32f, 186.63f),
                    PathNode.CurveTo(191.00737f, 185.7876f, 192.99263f, 185.7876f, 194.68f, 186.63f),
                    PathNode.LineTo(218.0f, 198.29f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _receipt!!
    }

private var _receipt: ImageVector? = null
