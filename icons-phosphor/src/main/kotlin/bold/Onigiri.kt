package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorBoldIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.0f, 144.51f),
                    PathNode.LineTo(179.13f, 48.65f),
                    PathNode.CurveTo(179.0793f, 48.549957f, 179.02252f, 48.45311f, 178.96f, 48.36f),
                    PathNode.CurveTo(168.0156f, 30.725378f, 148.73476f, 19.99921f, 127.98f, 19.99921f),
                    PathNode.CurveTo(107.22525f, 19.99921f, 87.9444f, 30.725378f, 77.0f, 48.36f),
                    PathNode.CurveTo(76.93747f, 48.45311f, 76.8807f, 48.549957f, 76.83f, 48.65f),
                    PathNode.LineTo(21.0f, 144.51f),
                    PathNode.CurveTo(9.584261f, 163.0247f, 9.082713f, 186.2677f, 19.689163f, 205.25761f),
                    PathNode.CurveTo(30.295614f, 224.24751f, 50.348835f, 236.01006f, 72.1f, 236.0f),
                    PathNode.LineTo(183.9f, 236.0f),
                    PathNode.CurveTo(205.65117f, 236.01006f, 225.70439f, 224.24751f, 236.31084f, 205.25761f),
                    PathNode.CurveTo(246.91728f, 186.2677f, 246.41574f, 163.0247f, 235.0f, 144.51f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 212.0f),
                    PathNode.LineTo(100.0f, 212.0f),
                    PathNode.LineTo(100.0f, 172.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.36f, 193.5f),
                    PathNode.CurveTo(209.0805f, 204.98976f, 196.99341f, 212.09756f, 183.9f, 212.0f),
                    PathNode.LineTo(180.0f, 212.0f),
                    PathNode.LineTo(180.0f, 168.0f),
                    PathNode.CurveTo(180.0f, 156.9543f, 171.0457f, 148.0f, 160.0f, 148.0f),
                    PathNode.LineTo(96.0f, 148.0f),
                    PathNode.CurveTo(84.95431f, 148.0f, 76.0f, 156.9543f, 76.0f, 168.0f),
                    PathNode.LineTo(76.0f, 212.0f),
                    PathNode.LineTo(72.1f, 212.0f),
                    PathNode.CurveTo(59.02956f, 212.00081f, 46.985493f, 204.9173f, 40.634045f, 193.49384f),
                    PathNode.CurveTo(34.2826f, 182.07037f, 34.62171f, 168.1018f, 41.52f, 157.0f),
                    PathNode.LineTo(41.69f, 156.72f),
                    PathNode.LineTo(97.51f, 60.88f),
                    PathNode.CurveTo(104.094025f, 50.37977f, 115.61628f, 44.004593f, 128.01f, 44.004593f),
                    PathNode.CurveTo(140.40372f, 44.004593f, 151.92598f, 50.37977f, 158.51f, 60.88f),
                    PathNode.LineTo(214.33f, 156.73f),
                    PathNode.LineTo(214.5f, 157.01f),
                    PathNode.CurveTo(221.4759f, 168.09038f, 221.80241f, 182.10683f, 215.35f, 193.5f),
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
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
