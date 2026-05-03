package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorLightIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.0f, 32.0f),
                    PathNode.LineTo(198.0f, 176.0f),
                    PathNode.CurveTo(198.0f, 179.3137f, 195.3137f, 182.0f, 192.0f, 182.0f),
                    PathNode.LineTo(62.49f, 182.0f),
                    PathNode.LineTo(100.24f, 219.76f),
                    PathNode.CurveTo(101.84522f, 221.25575f, 102.506f, 223.50844f, 101.96308f, 225.63431f),
                    PathNode.CurveTo(101.42017f, 227.76018f, 99.76018f, 229.42018f, 97.6343f, 229.96309f),
                    PathNode.CurveTo(95.508446f, 230.506f, 93.25577f, 229.84523f, 91.76f, 228.24f),
                    PathNode.LineTo(43.76f, 180.24f),
                    PathNode.CurveTo(41.420372f, 177.89746f, 41.420372f, 174.10254f, 43.76f, 171.76f),
                    PathNode.LineTo(91.76f, 123.76f),
                    PathNode.CurveTo(93.25577f, 122.15478f, 95.508446f, 121.494f, 97.6343f, 122.03692f),
                    PathNode.CurveTo(99.76018f, 122.57983f, 101.42017f, 124.23982f, 101.96308f, 126.3657f),
                    PathNode.CurveTo(102.506f, 128.49156f, 101.84522f, 130.74423f, 100.24f, 132.24f),
                    PathNode.LineTo(62.49f, 170.0f),
                    PathNode.LineTo(186.0f, 170.0f),
                    PathNode.LineTo(186.0f, 32.0f),
                    PathNode.CurveTo(186.0f, 28.68629f, 188.6863f, 26.0f, 192.0f, 26.0f),
                    PathNode.CurveTo(195.3137f, 26.0f, 198.0f, 28.68629f, 198.0f, 32.0f),
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
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null
