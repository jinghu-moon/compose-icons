package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) return _bellSimple!!
        _bellSimple = phosphorLightIcon(
            name = "BellSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 224.0f),
                    PathNode.CurveTo(166.0f, 227.3137f, 163.3137f, 230.0f, 160.0f, 230.0f),
                    PathNode.LineTo(96.0f, 230.0f),
                    PathNode.CurveTo(92.686295f, 230.0f, 90.0f, 227.3137f, 90.0f, 224.0f),
                    PathNode.CurveTo(90.0f, 220.6863f, 92.686295f, 218.0f, 96.0f, 218.0f),
                    PathNode.LineTo(160.0f, 218.0f),
                    PathNode.CurveTo(163.3137f, 218.0f, 166.0f, 220.6863f, 166.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.11f, 191.0f),
                    PathNode.CurveTo(217.63953f, 195.35f, 213.01251f, 198.0268f, 208.01f, 198.0f),
                    PathNode.LineTo(48.0f, 198.0f),
                    PathNode.CurveTo(42.99116f, 197.98944f, 38.369576f, 195.30377f, 35.88049f, 190.95715f),
                    PathNode.CurveTo(33.391403f, 186.61055f, 33.414097f, 181.2653f, 35.94f, 176.94f),
                    PathNode.CurveTo(41.59f, 167.2f, 50.0f, 139.74f, 50.0f, 104.0f),
                    PathNode.CurveTo(50.0f, 60.92179f, 84.92179f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(171.07822f, 26.0f, 206.0f, 60.92179f, 206.0f, 104.0f),
                    PathNode.CurveTo(206.0f, 139.73f, 214.42f, 167.2f, 220.08f, 176.94f),
                    PathNode.CurveTo(222.63432f, 181.27571f, 222.6458f, 186.65343f, 220.11f, 191.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.7f, 183.0f),
                    PathNode.CurveTo(202.13f, 170.0f, 194.0f, 139.68f, 194.0f, 104.0f),
                    PathNode.CurveTo(194.0f, 67.54921f, 164.45079f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(91.54921f, 38.0f, 62.0f, 67.54921f, 62.0f, 104.0f),
                    PathNode.CurveTo(62.0f, 139.69f, 53.86f, 170.0f, 46.29f, 183.0f),
                    PathNode.CurveTo(45.932735f, 183.6188f, 45.932735f, 184.3812f, 46.29f, 185.0f),
                    PathNode.CurveTo(46.625732f, 185.62437f, 47.28115f, 186.00992f, 47.99f, 186.0f),
                    PathNode.LineTo(208.0f, 186.0f),
                    PathNode.CurveTo(208.70885f, 186.00992f, 209.36427f, 185.62437f, 209.7f, 185.0f),
                    PathNode.CurveTo(210.05727f, 184.3812f, 210.05727f, 183.6188f, 209.7f, 183.0f),
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
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
