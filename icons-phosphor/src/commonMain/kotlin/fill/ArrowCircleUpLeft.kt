package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowCircleUpLeft: ImageVector
    get() {
        if (_arrowCircleUpLeft != null) return _arrowCircleUpLeft!!
        _arrowCircleUpLeft = phosphorFillIcon(
            name = "ArrowCircleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 165.66f),
                    PathNode.CurveTo(164.15945f, 167.16223f, 162.12328f, 168.00629f, 160.0f, 168.00629f),
                    PathNode.CurveTo(157.87672f, 168.00629f, 155.84055f, 167.16223f, 154.34f, 165.66f),
                    PathNode.LineTo(104.0f, 115.31f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(104.0f, 148.41827f, 100.41828f, 152.0f, 96.0f, 152.0f),
                    PathNode.CurveTo(91.58172f, 152.0f, 88.0f, 148.41827f, 88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(88.0f, 91.58172f, 91.58172f, 88.0f, 96.0f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(148.41827f, 88.0f, 152.0f, 91.58172f, 152.0f, 96.0f),
                    PathNode.CurveTo(152.0f, 100.41828f, 148.41827f, 104.0f, 144.0f, 104.0f),
                    PathNode.LineTo(115.31f, 104.0f),
                    PathNode.LineTo(165.66f, 154.34f),
                    PathNode.CurveTo(167.16223f, 155.84055f, 168.00629f, 157.87672f, 168.00629f, 160.0f),
                    PathNode.CurveTo(168.00629f, 162.12328f, 167.16223f, 164.15945f, 165.66f, 165.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowCircleUpLeft!!
    }

private var _arrowCircleUpLeft: ImageVector? = null
