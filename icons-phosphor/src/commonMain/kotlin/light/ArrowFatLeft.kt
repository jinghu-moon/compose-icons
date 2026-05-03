package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLeft: ImageVector
    get() {
        if (_arrowFatLeft != null) return _arrowFatLeft!!
        _arrowFatLeft = phosphorLightIcon(
            name = "ArrowFatLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 74.0f),
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
                    PathNode.LineTo(208.0f, 182.0f),
                    PathNode.CurveTo(215.73198f, 182.0f, 222.0f, 175.73198f, 222.0f, 168.0f),
                    PathNode.LineTo(222.0f, 88.0f),
                    PathNode.CurveTo(222.0f, 80.26801f, 215.73198f, 74.0f, 208.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 168.0f),
                    PathNode.CurveTo(210.0f, 169.10457f, 209.10457f, 170.0f, 208.0f, 170.0f),
                    PathNode.LineTo(120.0f, 170.0f),
                    PathNode.CurveTo(116.686295f, 170.0f, 114.0f, 172.6863f, 114.0f, 176.0f),
                    PathNode.LineTo(114.0f, 209.51f),
                    PathNode.LineTo(32.49f, 128.0f),
                    PathNode.LineTo(114.0f, 46.49f),
                    PathNode.LineTo(114.0f, 80.0f),
                    PathNode.CurveTo(114.0f, 83.313705f, 116.686295f, 86.0f, 120.0f, 86.0f),
                    PathNode.LineTo(208.0f, 86.0f),
                    PathNode.CurveTo(209.10457f, 86.0f, 210.0f, 86.89543f, 210.0f, 88.0f),
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
        return _arrowFatLeft!!
    }

private var _arrowFatLeft: ImageVector? = null
