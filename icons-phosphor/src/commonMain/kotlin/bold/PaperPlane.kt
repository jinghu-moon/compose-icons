package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorBoldIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.42f, 198.2f),
                    PathNode.LineTo(241.36f, 198.11f),
                    PathNode.LineTo(145.3f, 30.17f),
                    PathNode.CurveTo(141.75157f, 23.89387f, 135.0998f, 20.013369f, 127.89f, 20.013369f),
                    PathNode.CurveTo(120.6802f, 20.013369f, 114.028435f, 23.89387f, 110.48f, 30.17f),
                    PathNode.LineTo(14.58f, 198.2f),
                    PathNode.CurveTo(10.515925f, 205.45512f, 11.365294f, 214.46808f, 16.71321f, 220.83623f),
                    PathNode.CurveTo(22.061125f, 227.20439f, 30.791601f, 229.59886f, 38.64f, 226.85f),
                    PathNode.LineTo(128.0f, 196.67f),
                    PathNode.LineTo(217.36f, 226.85f),
                    PathNode.CurveTo(219.50818f, 227.61174f, 221.77077f, 228.00067f, 224.05f, 228.0f),
                    PathNode.CurveTo(231.1427f, 227.97716f, 237.69276f, 224.19951f, 241.26456f, 218.07176f),
                    PathNode.CurveTo(244.83633f, 211.944f, 244.89548f, 204.38287f, 241.42f, 198.2f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 175.39f),
                    PathNode.LineTo(140.0f, 120.0f),
                    PathNode.CurveTo(140.0f, 113.37258f, 134.62741f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(121.37258f, 108.0f, 116.0f, 113.37258f, 116.0f, 120.0f),
                    PathNode.LineTo(116.0f, 175.39f),
                    PathNode.LineTo(40.72f, 200.82f),
                    PathNode.LineTo(127.89f, 48.06f),
                    PathNode.LineTo(215.26f, 200.81f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
