package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BoxArrowDown: ImageVector
    get() {
        if (_boxArrowDown != null) return _boxArrowDown!!
        _boxArrowDown = phosphorLightIcon(
            name = "BoxArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.37f, 69.32f),
                    PathNode.LineTo(205.37f, 37.32f),
                    PathNode.CurveTo(204.354f, 35.284912f, 202.2746f, 33.999317f, 200.0f, 34.0f),
                    PathNode.LineTo(56.0f, 34.0f),
                    PathNode.CurveTo(53.7254f, 33.999317f, 51.64599f, 35.284912f, 50.63f, 37.32f),
                    PathNode.LineTo(34.63f, 69.32f),
                    PathNode.CurveTo(34.21751f, 70.15329f, 34.00197f, 71.070206f, 34.0f, 72.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 72.0f),
                    PathNode.CurveTo(221.99803f, 71.070206f, 221.78249f, 70.15329f, 221.37f, 69.32f),
                    PathNode.Close,
                    PathNode.MoveTo(59.71f, 46.0f),
                    PathNode.LineTo(196.29f, 46.0f),
                    PathNode.LineTo(206.29f, 66.0f),
                    PathNode.LineTo(49.71f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 78.0f),
                    PathNode.LineTo(210.0f, 78.0f),
                    PathNode.LineTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.24f, 147.76f),
                    PathNode.CurveTo(166.57962f, 150.10254f, 166.57962f, 153.89746f, 164.24f, 156.24f),
                    PathNode.LineTo(132.24f, 188.24f),
                    PathNode.CurveTo(129.89746f, 190.57962f, 126.10254f, 190.57962f, 123.76f, 188.24f),
                    PathNode.LineTo(91.76f, 156.24f),
                    PathNode.CurveTo(89.55713f, 153.87592f, 89.62213f, 150.19193f, 91.90703f, 147.90703f),
                    PathNode.CurveTo(94.191925f, 145.62213f, 97.87592f, 145.55713f, 100.24f, 147.76f),
                    PathNode.LineTo(122.0f, 169.51f),
                    PathNode.LineTo(122.0f, 104.0f),
                    PathNode.CurveTo(122.0f, 100.686295f, 124.686295f, 98.0f, 128.0f, 98.0f),
                    PathNode.CurveTo(131.3137f, 98.0f, 134.0f, 100.686295f, 134.0f, 104.0f),
                    PathNode.LineTo(134.0f, 169.51f),
                    PathNode.LineTo(155.76f, 147.76f),
                    PathNode.CurveTo(158.10254f, 145.42038f, 161.89746f, 145.42038f, 164.24f, 147.76f),
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
        return _boxArrowDown!!
    }

private var _boxArrowDown: ImageVector? = null
