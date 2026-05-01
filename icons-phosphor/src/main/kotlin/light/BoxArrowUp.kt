package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorLightIcon(
            name = "BoxArrowUp",
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
                    PathNode.MoveTo(164.24f, 131.76f),
                    PathNode.CurveTo(165.84523f, 133.25577f, 166.506f, 135.50844f, 165.96309f, 137.63431f),
                    PathNode.CurveTo(165.42018f, 139.76018f, 163.76018f, 141.42018f, 161.63431f, 141.96309f),
                    PathNode.CurveTo(159.50844f, 142.506f, 157.25575f, 141.84523f, 155.76f, 140.24f),
                    PathNode.LineTo(134.0f, 118.49f),
                    PathNode.LineTo(134.0f, 184.0f),
                    PathNode.CurveTo(134.0f, 187.3137f, 131.3137f, 190.0f, 128.0f, 190.0f),
                    PathNode.CurveTo(124.686295f, 190.0f, 122.0f, 187.3137f, 122.0f, 184.0f),
                    PathNode.LineTo(122.0f, 118.49f),
                    PathNode.LineTo(100.24f, 140.24f),
                    PathNode.CurveTo(97.87592f, 142.44287f, 94.191925f, 142.37787f, 91.90703f, 140.09297f),
                    PathNode.CurveTo(89.62213f, 137.80807f, 89.55713f, 134.12408f, 91.76f, 131.76f),
                    PathNode.LineTo(123.76f, 99.76f),
                    PathNode.CurveTo(126.10254f, 97.42038f, 129.89746f, 97.42038f, 132.24f, 99.76f),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
