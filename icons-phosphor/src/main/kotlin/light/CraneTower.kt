package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorLightIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 82.0f),
                    PathNode.LineTo(107.71f, 82.0f),
                    PathNode.LineTo(85.37f, 37.32f),
                    PathNode.CurveTo(84.35401f, 35.284912f, 82.274605f, 33.999317f, 80.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(44.68629f, 34.0f, 42.0f, 36.68629f, 42.0f, 40.0f),
                    PathNode.LineTo(42.0f, 82.0f),
                    PathNode.LineTo(24.0f, 82.0f),
                    PathNode.CurveTo(20.68629f, 82.0f, 18.0f, 84.686295f, 18.0f, 88.0f),
                    PathNode.CurveTo(18.0f, 91.313705f, 20.68629f, 94.0f, 24.0f, 94.0f),
                    PathNode.LineTo(42.0f, 94.0f),
                    PathNode.LineTo(42.0f, 210.0f),
                    PathNode.LineTo(24.0f, 210.0f),
                    PathNode.CurveTo(20.68629f, 210.0f, 18.0f, 212.6863f, 18.0f, 216.0f),
                    PathNode.CurveTo(18.0f, 219.3137f, 20.68629f, 222.0f, 24.0f, 222.0f),
                    PathNode.LineTo(128.0f, 222.0f),
                    PathNode.CurveTo(131.3137f, 222.0f, 134.0f, 219.3137f, 134.0f, 216.0f),
                    PathNode.CurveTo(134.0f, 212.6863f, 131.3137f, 210.0f, 128.0f, 210.0f),
                    PathNode.LineTo(110.0f, 210.0f),
                    PathNode.LineTo(110.0f, 94.0f),
                    PathNode.LineTo(210.0f, 94.0f),
                    PathNode.LineTo(210.0f, 184.0f),
                    PathNode.CurveTo(210.0f, 185.10457f, 209.10457f, 186.0f, 208.0f, 186.0f),
                    PathNode.LineTo(192.0f, 186.0f),
                    PathNode.CurveTo(190.89543f, 186.0f, 190.0f, 185.10457f, 190.0f, 184.0f),
                    PathNode.LineTo(190.0f, 176.0f),
                    PathNode.CurveTo(190.0f, 172.6863f, 187.3137f, 170.0f, 184.0f, 170.0f),
                    PathNode.CurveTo(180.6863f, 170.0f, 178.0f, 172.6863f, 178.0f, 176.0f),
                    PathNode.LineTo(178.0f, 184.0f),
                    PathNode.CurveTo(178.0f, 191.73198f, 184.26802f, 198.0f, 192.0f, 198.0f),
                    PathNode.LineTo(208.0f, 198.0f),
                    PathNode.CurveTo(215.73198f, 198.0f, 222.0f, 191.73198f, 222.0f, 184.0f),
                    PathNode.LineTo(222.0f, 94.0f),
                    PathNode.LineTo(240.0f, 94.0f),
                    PathNode.CurveTo(243.3137f, 94.0f, 246.0f, 91.313705f, 246.0f, 88.0f),
                    PathNode.CurveTo(246.0f, 84.686295f, 243.3137f, 82.0f, 240.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 46.0f),
                    PathNode.LineTo(76.29f, 46.0f),
                    PathNode.LineTo(94.29f, 82.0f),
                    PathNode.LineTo(54.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 210.0f),
                    PathNode.LineTo(54.0f, 158.0f),
                    PathNode.LineTo(98.0f, 158.0f),
                    PathNode.LineTo(98.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 146.0f),
                    PathNode.LineTo(54.0f, 146.0f),
                    PathNode.LineTo(54.0f, 94.0f),
                    PathNode.LineTo(98.0f, 94.0f),
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
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
