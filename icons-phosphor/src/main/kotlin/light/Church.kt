package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = phosphorLightIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.09f, 146.86f),
                    PathNode.LineTo(190.0f, 124.6f),
                    PathNode.LineTo(190.0f, 104.0f),
                    PathNode.CurveTo(190.00496f, 101.85146f, 188.8607f, 99.864265f, 187.0f, 98.79f),
                    PathNode.LineTo(134.0f, 68.52f),
                    PathNode.LineTo(134.0f, 46.0f),
                    PathNode.LineTo(152.0f, 46.0f),
                    PathNode.CurveTo(155.3137f, 46.0f, 158.0f, 43.31371f, 158.0f, 40.0f),
                    PathNode.CurveTo(158.0f, 36.68629f, 155.3137f, 34.0f, 152.0f, 34.0f),
                    PathNode.LineTo(134.0f, 34.0f),
                    PathNode.LineTo(134.0f, 16.0f),
                    PathNode.CurveTo(134.0f, 12.686292f, 131.3137f, 10.0f, 128.0f, 10.0f),
                    PathNode.CurveTo(124.686295f, 10.0f, 122.0f, 12.686292f, 122.0f, 16.0f),
                    PathNode.LineTo(122.0f, 34.0f),
                    PathNode.LineTo(104.0f, 34.0f),
                    PathNode.CurveTo(100.686295f, 34.0f, 98.0f, 36.68629f, 98.0f, 40.0f),
                    PathNode.CurveTo(98.0f, 43.31371f, 100.686295f, 46.0f, 104.0f, 46.0f),
                    PathNode.LineTo(122.0f, 46.0f),
                    PathNode.LineTo(122.0f, 68.52f),
                    PathNode.LineTo(69.0f, 98.79f),
                    PathNode.CurveTo(67.139305f, 99.864265f, 65.99504f, 101.85146f, 66.0f, 104.0f),
                    PathNode.LineTo(66.0f, 124.6f),
                    PathNode.LineTo(28.91f, 146.86f),
                    PathNode.CurveTo(27.105444f, 147.94418f, 26.001102f, 149.8948f, 26.0f, 152.0f),
                    PathNode.LineTo(26.0f, 216.0f),
                    PathNode.CurveTo(26.0f, 219.3137f, 28.68629f, 222.0f, 32.0f, 222.0f),
                    PathNode.LineTo(112.0f, 222.0f),
                    PathNode.CurveTo(115.313705f, 222.0f, 118.0f, 219.3137f, 118.0f, 216.0f),
                    PathNode.LineTo(118.0f, 168.0f),
                    PathNode.CurveTo(118.0f, 162.47716f, 122.47715f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(133.52284f, 158.0f, 138.0f, 162.47716f, 138.0f, 168.0f),
                    PathNode.LineTo(138.0f, 216.0f),
                    PathNode.CurveTo(138.0f, 219.3137f, 140.6863f, 222.0f, 144.0f, 222.0f),
                    PathNode.LineTo(224.0f, 222.0f),
                    PathNode.CurveTo(227.3137f, 222.0f, 230.0f, 219.3137f, 230.0f, 216.0f),
                    PathNode.LineTo(230.0f, 152.0f),
                    PathNode.CurveTo(229.9989f, 149.8948f, 228.89456f, 147.94418f, 227.09f, 146.86f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 155.4f),
                    PathNode.LineTo(66.0f, 138.6f),
                    PathNode.LineTo(66.0f, 210.0f),
                    PathNode.LineTo(38.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 146.0f),
                    PathNode.CurveTo(115.84974f, 146.0f, 106.0f, 155.84973f, 106.0f, 168.0f),
                    PathNode.LineTo(106.0f, 210.0f),
                    PathNode.LineTo(78.0f, 210.0f),
                    PathNode.LineTo(78.0f, 107.48f),
                    PathNode.LineTo(128.0f, 78.91f),
                    PathNode.LineTo(178.0f, 107.48f),
                    PathNode.LineTo(178.0f, 210.0f),
                    PathNode.LineTo(150.0f, 210.0f),
                    PathNode.LineTo(150.0f, 168.0f),
                    PathNode.CurveTo(150.0f, 155.84973f, 140.15027f, 146.0f, 128.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 210.0f),
                    PathNode.LineTo(190.0f, 210.0f),
                    PathNode.LineTo(190.0f, 138.6f),
                    PathNode.LineTo(218.0f, 155.4f),
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
        return _church!!
    }

private var _church: ImageVector? = null
