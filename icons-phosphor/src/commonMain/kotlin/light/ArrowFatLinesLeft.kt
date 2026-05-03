package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) return _arrowFatLinesLeft!!
        _arrowFatLinesLeft = phosphorLightIcon(
            name = "ArrowFatLinesLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 74.0f),
                    PathNode.LineTo(126.0f, 74.0f),
                    PathNode.LineTo(126.0f, 32.0f),
                    PathNode.CurveTo(125.99786f, 29.574867f, 124.53604f, 27.389475f, 122.29539f, 26.461704f),
                    PathNode.CurveTo(120.05473f, 25.533934f, 117.47589f, 26.046238f, 115.76f, 27.76f),
                    PathNode.LineTo(19.76f, 123.76f),
                    PathNode.CurveTo(17.420374f, 126.10254f, 17.420374f, 129.89746f, 19.76f, 132.24f),
                    PathNode.LineTo(115.76f, 228.24f),
                    PathNode.CurveTo(117.47589f, 229.95377f, 120.05473f, 230.46606f, 122.29539f, 229.5383f),
                    PathNode.CurveTo(124.53604f, 228.61052f, 125.99786f, 226.42514f, 126.0f, 224.0f),
                    PathNode.LineTo(126.0f, 182.0f),
                    PathNode.LineTo(152.0f, 182.0f),
                    PathNode.CurveTo(155.3137f, 182.0f, 158.0f, 179.3137f, 158.0f, 176.0f),
                    PathNode.LineTo(158.0f, 80.0f),
                    PathNode.CurveTo(158.0f, 76.686295f, 155.3137f, 74.0f, 152.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 170.0f),
                    PathNode.LineTo(120.0f, 170.0f),
                    PathNode.CurveTo(116.686295f, 170.0f, 114.0f, 172.6863f, 114.0f, 176.0f),
                    PathNode.LineTo(114.0f, 209.51f),
                    PathNode.LineTo(32.49f, 128.0f),
                    PathNode.LineTo(114.0f, 46.49f),
                    PathNode.LineTo(114.0f, 80.0f),
                    PathNode.CurveTo(114.0f, 83.313705f, 116.686295f, 86.0f, 120.0f, 86.0f),
                    PathNode.LineTo(146.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 80.0f),
                    PathNode.LineTo(222.0f, 176.0f),
                    PathNode.CurveTo(222.0f, 179.3137f, 219.3137f, 182.0f, 216.0f, 182.0f),
                    PathNode.CurveTo(212.6863f, 182.0f, 210.0f, 179.3137f, 210.0f, 176.0f),
                    PathNode.LineTo(210.0f, 80.0f),
                    PathNode.CurveTo(210.0f, 76.686295f, 212.6863f, 74.0f, 216.0f, 74.0f),
                    PathNode.CurveTo(219.3137f, 74.0f, 222.0f, 76.686295f, 222.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 80.0f),
                    PathNode.LineTo(190.0f, 176.0f),
                    PathNode.CurveTo(190.0f, 179.3137f, 187.3137f, 182.0f, 184.0f, 182.0f),
                    PathNode.CurveTo(180.6863f, 182.0f, 178.0f, 179.3137f, 178.0f, 176.0f),
                    PathNode.LineTo(178.0f, 80.0f),
                    PathNode.CurveTo(178.0f, 76.686295f, 180.6863f, 74.0f, 184.0f, 74.0f),
                    PathNode.CurveTo(187.3137f, 74.0f, 190.0f, 76.686295f, 190.0f, 80.0f),
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
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
