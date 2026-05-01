package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = phosphorLightIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 131.3137f, 219.3137f, 134.0f, 216.0f, 134.0f),
                    PathNode.LineTo(54.49f, 134.0f),
                    PathNode.LineTo(116.24f, 195.76f),
                    PathNode.CurveTo(117.84522f, 197.25575f, 118.506f, 199.50844f, 117.96308f, 201.63431f),
                    PathNode.CurveTo(117.42017f, 203.76018f, 115.76018f, 205.42018f, 113.6343f, 205.96309f),
                    PathNode.CurveTo(111.508446f, 206.506f, 109.25577f, 205.84523f, 107.76f, 204.24f),
                    PathNode.LineTo(35.76f, 132.24f),
                    PathNode.CurveTo(33.420372f, 129.89746f, 33.420372f, 126.10254f, 35.76f, 123.76f),
                    PathNode.LineTo(107.76f, 51.76f),
                    PathNode.CurveTo(110.12408f, 49.55713f, 113.808075f, 49.622128f, 116.09297f, 51.907024f),
                    PathNode.CurveTo(118.37787f, 54.19192f, 118.44287f, 57.875923f, 116.24f, 60.24f),
                    PathNode.LineTo(54.49f, 122.0f),
                    PathNode.LineTo(216.0f, 122.0f),
                    PathNode.CurveTo(219.3137f, 122.0f, 222.0f, 124.686295f, 222.0f, 128.0f),
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
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
