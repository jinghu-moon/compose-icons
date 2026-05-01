package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorThinIcon(
            name = "GreaterThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.00153f, 129.54816f, 219.10956f, 130.95816f, 217.71f, 131.62f),
                    PathNode.LineTo(65.71f, 203.62f),
                    PathNode.CurveTo(65.17677f, 203.87637f, 64.59163f, 204.00641f, 64.0f, 204.0f),
                    PathNode.CurveTo(62.125195f, 204.00392f, 60.49921f, 202.70517f, 60.088696f, 200.87587f),
                    PathNode.CurveTo(59.67818f, 199.04655f, 60.593292f, 197.17755f, 62.29f, 196.38f),
                    PathNode.LineTo(206.66f, 128.0f),
                    PathNode.LineTo(62.29f, 59.62f),
                    PathNode.CurveTo(60.34471f, 58.647125f, 59.53329f, 56.29818f, 60.463326f, 54.33205f),
                    PathNode.CurveTo(61.393364f, 52.36592f, 63.723972f, 51.50325f, 65.71f, 52.39f),
                    PathNode.LineTo(217.71f, 124.39f),
                    PathNode.CurveTo(219.1063f, 125.050285f, 219.99767f, 126.45547f, 220.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
