package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatUp: ImageVector
    get() {
        if (_arrowFatUp != null) return _arrowFatUp!!
        _arrowFatUp = phosphorLightIcon(
            name = "ArrowFatUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 115.76f),
                    PathNode.LineTo(132.24f, 19.76f),
                    PathNode.CurveTo(129.89746f, 17.420374f, 126.10254f, 17.420374f, 123.76f, 19.76f),
                    PathNode.LineTo(27.76f, 115.76f),
                    PathNode.CurveTo(26.046238f, 117.47589f, 25.533934f, 120.05473f, 26.461704f, 122.29539f),
                    PathNode.CurveTo(27.389475f, 124.53604f, 29.574867f, 125.99786f, 32.0f, 126.0f),
                    PathNode.LineTo(74.0f, 126.0f),
                    PathNode.LineTo(74.0f, 208.0f),
                    PathNode.CurveTo(74.0f, 215.73198f, 80.26801f, 222.0f, 88.0f, 222.0f),
                    PathNode.LineTo(168.0f, 222.0f),
                    PathNode.CurveTo(175.73198f, 222.0f, 182.0f, 215.73198f, 182.0f, 208.0f),
                    PathNode.LineTo(182.0f, 126.0f),
                    PathNode.LineTo(224.0f, 126.0f),
                    PathNode.CurveTo(226.42514f, 125.99786f, 228.61052f, 124.53604f, 229.5383f, 122.29539f),
                    PathNode.CurveTo(230.46606f, 120.05473f, 229.95377f, 117.47589f, 228.24f, 115.76f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 114.0f),
                    PathNode.CurveTo(172.6863f, 114.0f, 170.0f, 116.686295f, 170.0f, 120.0f),
                    PathNode.LineTo(170.0f, 208.0f),
                    PathNode.CurveTo(170.0f, 209.10457f, 169.10457f, 210.0f, 168.0f, 210.0f),
                    PathNode.LineTo(88.0f, 210.0f),
                    PathNode.CurveTo(86.89543f, 210.0f, 86.0f, 209.10457f, 86.0f, 208.0f),
                    PathNode.LineTo(86.0f, 120.0f),
                    PathNode.CurveTo(86.0f, 116.686295f, 83.313705f, 114.0f, 80.0f, 114.0f),
                    PathNode.LineTo(46.49f, 114.0f),
                    PathNode.LineTo(128.0f, 32.49f),
                    PathNode.LineTo(209.51f, 114.0f),
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
        return _arrowFatUp!!
    }

private var _arrowFatUp: ImageVector? = null
