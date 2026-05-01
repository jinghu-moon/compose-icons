package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorBoldIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 208.0f),
                    PathNode.CurveTo(252.0f, 214.62741f, 246.62741f, 220.0f, 240.0f, 220.0f),
                    PathNode.LineTo(192.0f, 220.0f),
                    PathNode.CurveTo(187.45474f, 220.0f, 183.29956f, 217.43199f, 181.26688f, 213.36656f),
                    PathNode.CurveTo(179.23418f, 209.30115f, 179.67284f, 204.43622f, 182.4f, 200.8f),
                    PathNode.LineTo(225.57f, 143.24f),
                    PathNode.CurveTo(227.49121f, 140.69876f, 228.32307f, 137.49788f, 227.88226f, 134.34277f),
                    PathNode.CurveTo(227.44144f, 131.18768f, 225.76413f, 128.33737f, 223.22f, 126.42f),
                    PathNode.CurveTo(220.16644f, 124.11669f, 216.19778f, 123.40701f, 212.53523f, 124.50934f),
                    PathNode.CurveTo(208.87268f, 125.61166f, 205.955f, 128.39392f, 204.68f, 132.0f),
                    PathNode.CurveTo(202.47084f, 138.2491f, 195.6141f, 141.52414f, 189.365f, 139.315f),
                    PathNode.CurveTo(183.1159f, 137.10587f, 179.84087f, 130.2491f, 182.05f, 124.0f),
                    PathNode.CurveTo(183.28302f, 120.53166f, 185.0364f, 117.271034f, 187.25f, 114.33f),
                    PathNode.CurveTo(199.21802f, 98.45181f, 221.79181f, 95.28199f, 237.67f, 107.25f),
                    PathNode.CurveTo(253.54819f, 119.21801f, 256.71802f, 141.79181f, 244.75f, 157.67f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.LineTo(240.0f, 196.0f),
                    PathNode.CurveTo(246.62741f, 196.0f, 252.0f, 201.37259f, 252.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(151.86f, 46.93f),
                    PathNode.CurveTo(149.4547f, 44.84493f, 146.31949f, 43.800987f, 143.14435f, 44.027916f),
                    PathNode.CurveTo(139.9692f, 44.254845f, 137.01434f, 45.73405f, 134.93f, 48.14f),
                    PathNode.LineTo(92.0f, 97.68f),
                    PathNode.LineTo(49.07f, 48.14f),
                    PathNode.CurveTo(44.729046f, 43.13078f, 37.149223f, 42.589043f, 32.14f, 46.93f),
                    PathNode.CurveTo(27.130777f, 51.270954f, 26.589043f, 58.850777f, 30.93f, 63.86f),
                    PathNode.LineTo(76.12f, 116.0f),
                    PathNode.LineTo(30.93f, 168.14f),
                    PathNode.CurveTo(26.589043f, 173.14922f, 27.130777f, 180.72903f, 32.14f, 185.07f),
                    PathNode.CurveTo(37.149223f, 189.41096f, 44.729046f, 188.86922f, 49.07f, 183.86f),
                    PathNode.LineTo(92.0f, 134.32f),
                    PathNode.LineTo(134.93f, 183.86f),
                    PathNode.CurveTo(139.27097f, 188.86922f, 146.85078f, 189.41096f, 151.86f, 185.07f),
                    PathNode.CurveTo(156.86922f, 180.72903f, 157.41096f, 173.14922f, 153.07f, 168.14f),
                    PathNode.LineTo(107.88f, 116.0f),
                    PathNode.LineTo(153.07f, 63.86f),
                    PathNode.CurveTo(155.15508f, 61.454693f, 156.19902f, 58.31949f, 155.97208f, 55.144344f),
                    PathNode.CurveTo(155.74515f, 51.969204f, 154.26595f, 49.014328f, 151.86f, 46.93f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
