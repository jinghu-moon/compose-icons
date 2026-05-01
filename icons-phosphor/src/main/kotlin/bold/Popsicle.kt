package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorBoldIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 4.0f),
                    PathNode.CurveTo(86.04464f, 4.044094f, 52.044098f, 38.044636f, 52.0f, 80.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.CurveTo(52.0f, 187.0457f, 60.954304f, 196.0f, 72.0f, 196.0f),
                    PathNode.LineTo(96.0f, 196.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.CurveTo(96.0f, 241.67311f, 110.32689f, 256.0f, 128.0f, 256.0f),
                    PathNode.CurveTo(145.67311f, 256.0f, 160.0f, 241.67311f, 160.0f, 224.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.LineTo(184.0f, 196.0f),
                    PathNode.CurveTo(195.0457f, 196.0f, 204.0f, 187.0457f, 204.0f, 176.0f),
                    PathNode.LineTo(204.0f, 80.0f),
                    PathNode.CurveTo(203.9559f, 38.044636f, 169.95538f, 4.044094f, 128.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 224.0f),
                    PathNode.CurveTo(136.0f, 228.41827f, 132.41827f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(123.58172f, 232.0f, 120.0f, 228.41827f, 120.0f, 224.0f),
                    PathNode.LineTo(120.0f, 196.0f),
                    PathNode.LineTo(136.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 172.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.LineTo(76.0f, 80.0f),
                    PathNode.CurveTo(76.0f, 51.281193f, 99.2812f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(156.71881f, 28.0f, 180.0f, 51.281193f, 180.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 76.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 150.62741f, 114.62742f, 156.0f, 108.0f, 156.0f),
                    PathNode.CurveTo(101.37258f, 156.0f, 96.0f, 150.62741f, 96.0f, 144.0f),
                    PathNode.LineTo(96.0f, 76.0f),
                    PathNode.CurveTo(96.0f, 69.37258f, 101.37258f, 64.0f, 108.0f, 64.0f),
                    PathNode.CurveTo(114.62742f, 64.0f, 120.0f, 69.37258f, 120.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 76.0f),
                    PathNode.LineTo(160.0f, 144.0f),
                    PathNode.CurveTo(160.0f, 150.62741f, 154.62741f, 156.0f, 148.0f, 156.0f),
                    PathNode.CurveTo(141.37259f, 156.0f, 136.0f, 150.62741f, 136.0f, 144.0f),
                    PathNode.LineTo(136.0f, 76.0f),
                    PathNode.CurveTo(136.0f, 69.37258f, 141.37259f, 64.0f, 148.0f, 64.0f),
                    PathNode.CurveTo(154.62741f, 64.0f, 160.0f, 69.37258f, 160.0f, 76.0f),
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
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
