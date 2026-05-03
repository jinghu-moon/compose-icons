package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorDuotoneIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.0f, 136.60106f, 176.60106f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(79.39894f, 176.0f, 40.0f, 136.60106f, 40.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 88.0f),
                    PathNode.LineTo(224.0f, 88.0f),
                    PathNode.CurveTo(224.02512f, 69.40471f, 218.62825f, 51.20548f, 208.47f, 35.63f),
                    PathNode.CurveTo(206.99338f, 33.365753f, 204.47319f, 32.00033f, 201.77f, 32.0f),
                    PathNode.LineTo(54.23f, 32.0f),
                    PathNode.CurveTo(51.526814f, 32.00033f, 49.006615f, 33.365753f, 47.53f, 35.63f),
                    PathNode.CurveTo(37.37175f, 51.20548f, 31.974876f, 69.40471f, 32.0f, 88.0f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.CurveTo(32.060425f, 137.89317f, 70.28514f, 179.44518f, 120.0f, 183.66f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.LineTo(88.0f, 216.0f),
                    PathNode.CurveTo(83.58172f, 216.0f, 80.0f, 219.58173f, 80.0f, 224.0f),
                    PathNode.CurveTo(80.0f, 228.41827f, 83.58172f, 232.0f, 88.0f, 232.0f),
                    PathNode.LineTo(168.0f, 232.0f),
                    PathNode.CurveTo(172.41827f, 232.0f, 176.0f, 228.41827f, 176.0f, 224.0f),
                    PathNode.CurveTo(176.0f, 219.58173f, 172.41827f, 216.0f, 168.0f, 216.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.LineTo(136.0f, 183.66f),
                    PathNode.CurveTo(185.71486f, 179.44518f, 223.93958f, 137.89317f, 224.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(58.7f, 48.0f),
                    PathNode.LineTo(197.3f, 48.0f),
                    PathNode.CurveTo(202.97452f, 57.81078f, 206.48631f, 68.72121f, 207.6f, 80.0f),
                    PathNode.LineTo(48.4f, 80.0f),
                    PathNode.CurveTo(49.51369f, 68.72121f, 53.025482f, 57.81078f, 58.7f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(86.934425f, 167.94954f, 52.557278f, 136.85463f, 48.4f, 96.0f),
                    PathNode.LineTo(207.6f, 96.0f),
                    PathNode.CurveTo(203.44272f, 136.85463f, 169.06557f, 167.94954f, 128.0f, 168.0f),
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
        return _brandy!!
    }

private var _brandy: ImageVector? = null
