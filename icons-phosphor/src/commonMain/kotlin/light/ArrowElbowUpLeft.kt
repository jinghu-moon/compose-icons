package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorLightIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.0f, 80.0f),
                    PathNode.LineTo(198.0f, 224.0f),
                    PathNode.CurveTo(198.0f, 227.3137f, 195.3137f, 230.0f, 192.0f, 230.0f),
                    PathNode.CurveTo(188.6863f, 230.0f, 186.0f, 227.3137f, 186.0f, 224.0f),
                    PathNode.LineTo(186.0f, 86.0f),
                    PathNode.LineTo(62.49f, 86.0f),
                    PathNode.LineTo(100.24f, 123.76f),
                    PathNode.CurveTo(101.84522f, 125.25577f, 102.506f, 127.508446f, 101.96308f, 129.63431f),
                    PathNode.CurveTo(101.42017f, 131.76018f, 99.76018f, 133.42018f, 97.6343f, 133.96309f),
                    PathNode.CurveTo(95.508446f, 134.506f, 93.25577f, 133.84523f, 91.76f, 132.24f),
                    PathNode.LineTo(43.76f, 84.24f),
                    PathNode.CurveTo(41.420372f, 81.89746f, 41.420372f, 78.10254f, 43.76f, 75.76f),
                    PathNode.LineTo(91.76f, 27.76f),
                    PathNode.CurveTo(93.25577f, 26.154774f, 95.508446f, 25.494007f, 97.6343f, 26.036915f),
                    PathNode.CurveTo(99.76018f, 26.579824f, 101.42017f, 28.239822f, 101.96308f, 30.365688f),
                    PathNode.CurveTo(102.506f, 32.491554f, 101.84522f, 34.744236f, 100.24f, 36.24f),
                    PathNode.LineTo(62.49f, 74.0f),
                    PathNode.LineTo(192.0f, 74.0f),
                    PathNode.CurveTo(195.3137f, 74.0f, 198.0f, 76.686295f, 198.0f, 80.0f),
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
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
