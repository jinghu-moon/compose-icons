package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineLeft: ImageVector
    get() {
        if (_arrowLineLeft != null) return _arrowLineLeft!!
        _arrowLineLeft = phosphorLightIcon(
            name = "ArrowLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 131.3137f, 227.3137f, 134.0f, 224.0f, 134.0f),
                    PathNode.LineTo(86.49f, 134.0f),
                    PathNode.LineTo(148.24f, 195.76f),
                    PathNode.CurveTo(149.84523f, 197.25575f, 150.506f, 199.50844f, 149.96309f, 201.63431f),
                    PathNode.CurveTo(149.42018f, 203.76018f, 147.76018f, 205.42018f, 145.63431f, 205.96309f),
                    PathNode.CurveTo(143.50844f, 206.506f, 141.25575f, 205.84523f, 139.76f, 204.24f),
                    PathNode.LineTo(67.76f, 132.24f),
                    PathNode.CurveTo(65.42037f, 129.89746f, 65.42037f, 126.10254f, 67.76f, 123.76f),
                    PathNode.LineTo(139.76f, 51.76f),
                    PathNode.CurveTo(142.12408f, 49.55713f, 145.80807f, 49.622128f, 148.09297f, 51.907024f),
                    PathNode.CurveTo(150.37787f, 54.19192f, 150.44287f, 57.875923f, 148.24f, 60.24f),
                    PathNode.LineTo(86.49f, 122.0f),
                    PathNode.LineTo(224.0f, 122.0f),
                    PathNode.CurveTo(227.3137f, 122.0f, 230.0f, 124.686295f, 230.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 34.0f),
                    PathNode.CurveTo(36.68629f, 34.0f, 34.0f, 36.68629f, 34.0f, 40.0f),
                    PathNode.LineTo(34.0f, 216.0f),
                    PathNode.CurveTo(34.0f, 219.3137f, 36.68629f, 222.0f, 40.0f, 222.0f),
                    PathNode.CurveTo(43.31371f, 222.0f, 46.0f, 219.3137f, 46.0f, 216.0f),
                    PathNode.LineTo(46.0f, 40.0f),
                    PathNode.CurveTo(46.0f, 36.68629f, 43.31371f, 34.0f, 40.0f, 34.0f),
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
        return _arrowLineLeft!!
    }

private var _arrowLineLeft: ImageVector? = null
