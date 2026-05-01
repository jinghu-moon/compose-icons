package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) return _bellSimple!!
        _bellSimple = phosphorFillIcon(
            name = "BellSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 228.41827f, 164.41827f, 232.0f, 160.0f, 232.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(91.58172f, 232.0f, 88.0f, 228.41827f, 88.0f, 224.0f),
                    PathNode.CurveTo(88.0f, 219.58173f, 91.58172f, 216.0f, 96.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(164.41827f, 216.0f, 168.0f, 219.58173f, 168.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.81f, 175.94f),
                    PathNode.CurveTo(216.25f, 166.38f, 208.0f, 139.33f, 208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 59.81722f, 172.18279f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(83.81722f, 24.0f, 48.0f, 59.81722f, 48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 139.34f, 39.74f, 166.38f, 34.19f, 175.94f),
                    PathNode.CurveTo(31.305237f, 180.8869f, 31.284256f, 186.99834f, 34.134987f, 191.96494f),
                    PathNode.CurveTo(36.985718f, 196.9315f, 42.27343f, 199.99585f, 48.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(213.72478f, 199.99228f, 219.00922f, 196.92653f, 221.85751f, 191.96059f),
                    PathNode.CurveTo(224.7058f, 186.99466f, 224.68387f, 180.88536f, 221.8f, 175.94f),
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
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
