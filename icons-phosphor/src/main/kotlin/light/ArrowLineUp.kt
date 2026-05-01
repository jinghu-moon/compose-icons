package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineUp: ImageVector
    get() {
        if (_arrowLineUp != null) return _arrowLineUp!!
        _arrowLineUp = phosphorLightIcon(
            name = "ArrowLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.24f, 139.76f),
                    PathNode.CurveTo(205.84523f, 141.25575f, 206.506f, 143.50844f, 205.96309f, 145.63431f),
                    PathNode.CurveTo(205.42018f, 147.76018f, 203.76018f, 149.42018f, 201.63431f, 149.96309f),
                    PathNode.CurveTo(199.50844f, 150.506f, 197.25575f, 149.84523f, 195.76f, 148.24f),
                    PathNode.LineTo(134.0f, 86.49f),
                    PathNode.LineTo(134.0f, 224.0f),
                    PathNode.CurveTo(134.0f, 227.3137f, 131.3137f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(124.686295f, 230.0f, 122.0f, 227.3137f, 122.0f, 224.0f),
                    PathNode.LineTo(122.0f, 86.49f),
                    PathNode.LineTo(60.24f, 148.24f),
                    PathNode.CurveTo(57.875923f, 150.44287f, 54.19192f, 150.37787f, 51.907024f, 148.09297f),
                    PathNode.CurveTo(49.622128f, 145.80807f, 49.55713f, 142.12408f, 51.76f, 139.76f),
                    PathNode.LineTo(123.76f, 67.76f),
                    PathNode.CurveTo(126.10254f, 65.42037f, 129.89746f, 65.42037f, 132.24f, 67.76f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 34.0f),
                    PathNode.LineTo(40.0f, 34.0f),
                    PathNode.CurveTo(36.68629f, 34.0f, 34.0f, 36.68629f, 34.0f, 40.0f),
                    PathNode.CurveTo(34.0f, 43.31371f, 36.68629f, 46.0f, 40.0f, 46.0f),
                    PathNode.LineTo(216.0f, 46.0f),
                    PathNode.CurveTo(219.3137f, 46.0f, 222.0f, 43.31371f, 222.0f, 40.0f),
                    PathNode.CurveTo(222.0f, 36.68629f, 219.3137f, 34.0f, 216.0f, 34.0f),
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
        return _arrowLineUp!!
    }

private var _arrowLineUp: ImageVector? = null
