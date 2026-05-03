package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorLightIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 82.0f),
                    PathNode.LineTo(182.0f, 82.0f),
                    PathNode.LineTo(182.0f, 48.0f),
                    PathNode.CurveTo(182.0f, 40.268013f, 175.73198f, 34.0f, 168.0f, 34.0f),
                    PathNode.LineTo(40.0f, 34.0f),
                    PathNode.CurveTo(32.268013f, 34.0f, 26.0f, 40.268013f, 26.0f, 48.0f),
                    PathNode.LineTo(26.0f, 176.0f),
                    PathNode.CurveTo(26.002687f, 178.31157f, 27.333044f, 180.41603f, 29.42f, 181.41f),
                    PathNode.CurveTo(30.223755f, 181.80084f, 31.10626f, 182.00266f, 32.0f, 182.0f),
                    PathNode.CurveTo(33.371754f, 182.00066f, 34.702316f, 181.53127f, 35.77f, 180.67f),
                    PathNode.LineTo(73.71f, 150.0f),
                    PathNode.LineTo(74.0f, 150.0f),
                    PathNode.LineTo(74.0f, 184.0f),
                    PathNode.CurveTo(74.0f, 191.73198f, 80.26801f, 198.0f, 88.0f, 198.0f),
                    PathNode.LineTo(182.29f, 198.0f),
                    PathNode.LineTo(220.23f, 228.67f),
                    PathNode.CurveTo(221.29768f, 229.53127f, 222.62825f, 230.00066f, 224.0f, 230.0f),
                    PathNode.CurveTo(224.89374f, 230.00266f, 225.77625f, 229.80084f, 226.58f, 229.41f),
                    PathNode.CurveTo(228.66696f, 228.41603f, 229.99731f, 226.31157f, 230.0f, 224.0f),
                    PathNode.LineTo(230.0f, 96.0f),
                    PathNode.CurveTo(230.0f, 88.26801f, 223.73198f, 82.0f, 216.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(71.58f, 138.0f),
                    PathNode.CurveTo(70.208244f, 137.99934f, 68.877686f, 138.46873f, 67.81f, 139.33f),
                    PathNode.LineTo(38.0f, 163.43f),
                    PathNode.LineTo(38.0f, 48.0f),
                    PathNode.CurveTo(38.0f, 46.89543f, 38.89543f, 46.0f, 40.0f, 46.0f),
                    PathNode.LineTo(168.0f, 46.0f),
                    PathNode.CurveTo(169.10457f, 46.0f, 170.0f, 46.89543f, 170.0f, 48.0f),
                    PathNode.LineTo(170.0f, 136.0f),
                    PathNode.CurveTo(170.0f, 137.10457f, 169.10457f, 138.0f, 168.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 211.43f),
                    PathNode.LineTo(188.19f, 187.33f),
                    PathNode.CurveTo(187.12231f, 186.46873f, 185.79175f, 185.99934f, 184.42f, 186.0f),
                    PathNode.LineTo(88.0f, 186.0f),
                    PathNode.CurveTo(86.89543f, 186.0f, 86.0f, 185.10457f, 86.0f, 184.0f),
                    PathNode.LineTo(86.0f, 150.0f),
                    PathNode.LineTo(168.0f, 150.0f),
                    PathNode.CurveTo(175.73198f, 150.0f, 182.0f, 143.73198f, 182.0f, 136.0f),
                    PathNode.LineTo(182.0f, 94.0f),
                    PathNode.LineTo(216.0f, 94.0f),
                    PathNode.CurveTo(217.10457f, 94.0f, 218.0f, 94.89543f, 218.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chats!!
    }

private var _chats: ImageVector? = null
