package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorLightIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 34.0f),
                    PathNode.LineTo(96.0f, 34.0f),
                    PathNode.CurveTo(83.84974f, 34.0f, 74.0f, 43.849735f, 74.0f, 56.0f),
                    PathNode.LineTo(74.0f, 200.0f),
                    PathNode.CurveTo(74.0f, 212.15027f, 83.84974f, 222.0f, 96.0f, 222.0f),
                    PathNode.LineTo(160.0f, 222.0f),
                    PathNode.CurveTo(172.15027f, 222.0f, 182.0f, 212.15027f, 182.0f, 200.0f),
                    PathNode.LineTo(182.0f, 56.0f),
                    PathNode.CurveTo(182.0f, 43.849735f, 172.15027f, 34.0f, 160.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.0f, 200.0f),
                    PathNode.CurveTo(170.0f, 205.52284f, 165.52284f, 210.0f, 160.0f, 210.0f),
                    PathNode.LineTo(96.0f, 210.0f),
                    PathNode.CurveTo(90.47715f, 210.0f, 86.0f, 205.52284f, 86.0f, 200.0f),
                    PathNode.LineTo(86.0f, 56.0f),
                    PathNode.CurveTo(86.0f, 50.477154f, 90.47715f, 46.0f, 96.0f, 46.0f),
                    PathNode.LineTo(160.0f, 46.0f),
                    PathNode.CurveTo(165.52284f, 46.0f, 170.0f, 50.477154f, 170.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 88.0f),
                    PathNode.LineTo(214.0f, 168.0f),
                    PathNode.CurveTo(214.0f, 171.3137f, 211.3137f, 174.0f, 208.0f, 174.0f),
                    PathNode.CurveTo(204.6863f, 174.0f, 202.0f, 171.3137f, 202.0f, 168.0f),
                    PathNode.LineTo(202.0f, 88.0f),
                    PathNode.CurveTo(202.0f, 84.686295f, 204.6863f, 82.0f, 208.0f, 82.0f),
                    PathNode.CurveTo(211.3137f, 82.0f, 214.0f, 84.686295f, 214.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 104.0f),
                    PathNode.LineTo(246.0f, 152.0f),
                    PathNode.CurveTo(246.0f, 155.3137f, 243.3137f, 158.0f, 240.0f, 158.0f),
                    PathNode.CurveTo(236.6863f, 158.0f, 234.0f, 155.3137f, 234.0f, 152.0f),
                    PathNode.LineTo(234.0f, 104.0f),
                    PathNode.CurveTo(234.0f, 100.686295f, 236.6863f, 98.0f, 240.0f, 98.0f),
                    PathNode.CurveTo(243.3137f, 98.0f, 246.0f, 100.686295f, 246.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 88.0f),
                    PathNode.LineTo(54.0f, 168.0f),
                    PathNode.CurveTo(54.0f, 171.3137f, 51.31371f, 174.0f, 48.0f, 174.0f),
                    PathNode.CurveTo(44.68629f, 174.0f, 42.0f, 171.3137f, 42.0f, 168.0f),
                    PathNode.LineTo(42.0f, 88.0f),
                    PathNode.CurveTo(42.0f, 84.686295f, 44.68629f, 82.0f, 48.0f, 82.0f),
                    PathNode.CurveTo(51.31371f, 82.0f, 54.0f, 84.686295f, 54.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(22.0f, 104.0f),
                    PathNode.LineTo(22.0f, 152.0f),
                    PathNode.CurveTo(22.0f, 155.3137f, 19.31371f, 158.0f, 16.0f, 158.0f),
                    PathNode.CurveTo(12.686292f, 158.0f, 10.0f, 155.3137f, 10.0f, 152.0f),
                    PathNode.LineTo(10.0f, 104.0f),
                    PathNode.CurveTo(10.0f, 100.686295f, 12.686292f, 98.0f, 16.0f, 98.0f),
                    PathNode.CurveTo(19.31371f, 98.0f, 22.0f, 100.686295f, 22.0f, 104.0f),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
