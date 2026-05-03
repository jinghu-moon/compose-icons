package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorBoldIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.05f, 110.42f),
                    PathNode.LineTo(122.05f, 174.42f),
                    PathNode.CurveTo(125.73732f, 176.52531f, 130.26268f, 176.52531f, 133.95f, 174.42f),
                    PathNode.LineTo(245.95f, 110.42f),
                    PathNode.CurveTo(249.68997f, 108.283775f, 251.99823f, 104.30706f, 251.99823f, 100.0f),
                    PathNode.CurveTo(251.99823f, 95.69294f, 249.68997f, 91.716225f, 245.95f, 89.58f),
                    PathNode.LineTo(133.95f, 25.58f),
                    PathNode.CurveTo(130.26268f, 23.474684f, 125.73732f, 23.474684f, 122.05f, 25.58f),
                    PathNode.LineTo(10.05f, 89.58f),
                    PathNode.CurveTo(6.310035f, 91.716225f, 4.001773f, 95.69294f, 4.001773f, 100.0f),
                    PathNode.CurveTo(4.001773f, 104.30706f, 6.310035f, 108.283775f, 10.05f, 110.42f),
                    PathNode.Close,
                    PathNode.MoveTo(128.05f, 49.82f),
                    PathNode.LineTo(215.81f, 100.0f),
                    PathNode.LineTo(128.0f, 150.18f),
                    PathNode.LineTo(40.19f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(250.47f, 142.05f),
                    PathNode.CurveTo(253.75557f, 147.80487f, 251.7544f, 155.13359f, 246.0f, 158.42f),
                    PathNode.LineTo(134.0f, 222.42f),
                    PathNode.CurveTo(130.31268f, 224.52531f, 125.787315f, 224.52531f, 122.1f, 222.42f),
                    PathNode.LineTo(10.1f, 158.42f),
                    PathNode.CurveTo(6.321293f, 156.32254f, 3.962345f, 152.35518f, 3.924322f, 148.03354f),
                    PathNode.CurveTo(3.886301f, 143.71191f, 6.175079f, 139.70366f, 9.916297f, 137.54004f),
                    PathNode.CurveTo(13.657516f, 135.3764f, 18.273174f, 135.39168f, 22.0f, 137.58f),
                    PathNode.LineTo(128.0f, 198.18f),
                    PathNode.LineTo(234.0f, 137.58f),
                    PathNode.CurveTo(236.76814f, 135.9863f, 240.05743f, 135.56197f, 243.1394f, 136.40096f),
                    PathNode.CurveTo(246.22137f, 137.23994f, 248.84167f, 139.27307f, 250.42f, 142.05f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
