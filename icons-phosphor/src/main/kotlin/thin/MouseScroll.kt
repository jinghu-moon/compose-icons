package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorThinIcon(
            name = "MouseScroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 20.0f),
                    PathNode.LineTo(112.0f, 20.0f),
                    PathNode.CurveTo(78.87891f, 20.038574f, 52.038574f, 46.878906f, 52.0f, 80.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.CurveTo(52.038574f, 209.1211f, 78.87891f, 235.96143f, 112.0f, 236.0f),
                    PathNode.LineTo(144.0f, 236.0f),
                    PathNode.CurveTo(177.1211f, 235.96143f, 203.96143f, 209.1211f, 204.0f, 176.0f),
                    PathNode.LineTo(204.0f, 80.0f),
                    PathNode.CurveTo(203.96143f, 46.878906f, 177.1211f, 20.038574f, 144.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 176.0f),
                    PathNode.CurveTo(195.96693f, 204.7051f, 172.7051f, 227.96693f, 144.0f, 228.0f),
                    PathNode.LineTo(112.0f, 228.0f),
                    PathNode.CurveTo(83.2949f, 227.96693f, 60.033066f, 204.7051f, 60.0f, 176.0f),
                    PathNode.LineTo(60.0f, 80.0f),
                    PathNode.CurveTo(60.033066f, 51.2949f, 83.2949f, 28.033064f, 112.0f, 28.0f),
                    PathNode.LineTo(144.0f, 28.0f),
                    PathNode.CurveTo(172.7051f, 28.033064f, 195.96693f, 51.2949f, 196.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 73.66f),
                    PathNode.LineTo(132.0f, 182.34f),
                    PathNode.LineTo(149.17f, 165.17f),
                    PathNode.CurveTo(150.73297f, 163.60704f, 153.26703f, 163.60704f, 154.83f, 165.17f),
                    PathNode.CurveTo(156.39296f, 166.73297f, 156.39296f, 169.26703f, 154.83f, 170.83f),
                    PathNode.LineTo(130.83f, 194.83f),
                    PathNode.CurveTo(130.07973f, 195.58112f, 129.06163f, 196.00314f, 128.0f, 196.00314f),
                    PathNode.CurveTo(126.93836f, 196.00314f, 125.92027f, 195.58112f, 125.17f, 194.83f),
                    PathNode.LineTo(101.17f, 170.83f),
                    PathNode.CurveTo(99.60703f, 169.26703f, 99.60703f, 166.73297f, 101.17f, 165.17f),
                    PathNode.CurveTo(102.73296f, 163.60704f, 105.26704f, 163.60704f, 106.83f, 165.17f),
                    PathNode.LineTo(124.0f, 182.34f),
                    PathNode.LineTo(124.0f, 73.66f),
                    PathNode.LineTo(106.83f, 90.83f),
                    PathNode.CurveTo(105.26704f, 92.39297f, 102.73296f, 92.39297f, 101.17f, 90.83f),
                    PathNode.CurveTo(99.60703f, 89.26704f, 99.60703f, 86.73296f, 101.17f, 85.17f),
                    PathNode.LineTo(125.17f, 61.17f),
                    PathNode.CurveTo(125.92027f, 60.41889f, 126.93836f, 59.996853f, 128.0f, 59.996853f),
                    PathNode.CurveTo(129.06163f, 59.996853f, 130.07973f, 60.41889f, 130.83f, 61.17f),
                    PathNode.LineTo(154.83f, 85.17f),
                    PathNode.CurveTo(156.39296f, 86.73296f, 156.39296f, 89.26704f, 154.83f, 90.83f),
                    PathNode.CurveTo(153.26703f, 92.39297f, 150.73297f, 92.39297f, 149.17f, 90.83f),
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
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
