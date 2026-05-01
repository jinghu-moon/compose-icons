package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatRight: ImageVector
    get() {
        if (_arrowFatRight != null) return _arrowFatRight!!
        _arrowFatRight = phosphorLightIcon(
            name = "ArrowFatRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.24f, 123.76f),
                    PathNode.LineTo(140.24f, 27.76f),
                    PathNode.CurveTo(138.52411f, 26.046238f, 135.94527f, 25.533934f, 133.7046f, 26.461704f),
                    PathNode.CurveTo(131.46396f, 27.389475f, 130.00214f, 29.574867f, 130.0f, 32.0f),
                    PathNode.LineTo(130.0f, 74.0f),
                    PathNode.LineTo(48.0f, 74.0f),
                    PathNode.CurveTo(40.268013f, 74.0f, 34.0f, 80.26801f, 34.0f, 88.0f),
                    PathNode.LineTo(34.0f, 168.0f),
                    PathNode.CurveTo(34.0f, 175.73198f, 40.268013f, 182.0f, 48.0f, 182.0f),
                    PathNode.LineTo(130.0f, 182.0f),
                    PathNode.LineTo(130.0f, 224.0f),
                    PathNode.CurveTo(130.00214f, 226.42514f, 131.46396f, 228.61052f, 133.7046f, 229.5383f),
                    PathNode.CurveTo(135.94527f, 230.46606f, 138.52411f, 229.95377f, 140.24f, 228.24f),
                    PathNode.LineTo(236.24f, 132.24f),
                    PathNode.CurveTo(238.57962f, 129.89746f, 238.57962f, 126.10254f, 236.24f, 123.76f),
                    PathNode.Close,
                    PathNode.MoveTo(142.0f, 209.51f),
                    PathNode.LineTo(142.0f, 176.0f),
                    PathNode.CurveTo(142.0f, 172.6863f, 139.3137f, 170.0f, 136.0f, 170.0f),
                    PathNode.LineTo(48.0f, 170.0f),
                    PathNode.CurveTo(46.89543f, 170.0f, 46.0f, 169.10457f, 46.0f, 168.0f),
                    PathNode.LineTo(46.0f, 88.0f),
                    PathNode.CurveTo(46.0f, 86.89543f, 46.89543f, 86.0f, 48.0f, 86.0f),
                    PathNode.LineTo(136.0f, 86.0f),
                    PathNode.CurveTo(139.3137f, 86.0f, 142.0f, 83.313705f, 142.0f, 80.0f),
                    PathNode.LineTo(142.0f, 46.49f),
                    PathNode.LineTo(223.51f, 128.0f),
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
        return _arrowFatRight!!
    }

private var _arrowFatRight: ImageVector? = null
