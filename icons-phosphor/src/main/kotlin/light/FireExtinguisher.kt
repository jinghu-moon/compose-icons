package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorLightIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(217.72f, 50.25f),
                    PathNode.LineTo(152.21f, 30.6f),
                    PathNode.LineTo(186.68f, 13.37f),
                    PathNode.CurveTo(189.64577f, 11.889877f, 190.85013f, 8.28577f, 189.37f, 5.32f),
                    PathNode.CurveTo(187.88988f, 2.354231f, 184.28577f, 1.149877f, 181.32f, 2.63f),
                    PathNode.LineTo(134.51f, 26.0f),
                    PathNode.CurveTo(92.03077f, 26.848982f, 58.029613f, 61.5123f, 58.0f, 104.0f),
                    PathNode.LineTo(58.0f, 208.0f),
                    PathNode.CurveTo(58.0f, 211.3137f, 60.68629f, 214.0f, 64.0f, 214.0f),
                    PathNode.CurveTo(67.313705f, 214.0f, 70.0f, 211.3137f, 70.0f, 208.0f),
                    PathNode.LineTo(70.0f, 174.0f),
                    PathNode.LineTo(90.0f, 174.0f),
                    PathNode.LineTo(90.0f, 232.0f),
                    PathNode.CurveTo(90.0f, 239.73198f, 96.26801f, 246.0f, 104.0f, 246.0f),
                    PathNode.LineTo(168.0f, 246.0f),
                    PathNode.CurveTo(175.73198f, 246.0f, 182.0f, 239.73198f, 182.0f, 232.0f),
                    PathNode.LineTo(182.0f, 104.0f),
                    PathNode.CurveTo(181.96576f, 80.928406f, 164.87048f, 61.4398f, 142.0f, 58.4f),
                    PathNode.LineTo(142.0f, 40.07f),
                    PathNode.LineTo(214.27f, 61.75f),
                    PathNode.CurveTo(214.83179f, 61.915413f, 215.41437f, 61.999596f, 216.0f, 62.0f),
                    PathNode.CurveTo(218.98035f, 62.00303f, 221.51115f, 59.817963f, 221.94283f, 56.869038f),
                    PathNode.CurveTo(222.3745f, 53.920116f, 220.57617f, 51.101337f, 217.72f, 50.25f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 162.0f),
                    PathNode.LineTo(70.0f, 104.0f),
                    PathNode.CurveTo(70.041595f, 69.89328f, 96.0375f, 41.42344f, 130.0f, 38.29f),
                    PathNode.LineTo(130.0f, 58.4f),
                    PathNode.CurveTo(107.12951f, 61.4398f, 90.03424f, 80.928406f, 90.0f, 104.0f),
                    PathNode.LineTo(90.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 234.0f),
                    PathNode.LineTo(104.0f, 234.0f),
                    PathNode.CurveTo(102.89543f, 234.0f, 102.0f, 233.10457f, 102.0f, 232.0f),
                    PathNode.LineTo(102.0f, 174.0f),
                    PathNode.LineTo(170.0f, 174.0f),
                    PathNode.LineTo(170.0f, 232.0f),
                    PathNode.CurveTo(170.0f, 233.10457f, 169.10457f, 234.0f, 168.0f, 234.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.0f, 104.0f),
                    PathNode.LineTo(170.0f, 162.0f),
                    PathNode.LineTo(102.0f, 162.0f),
                    PathNode.LineTo(102.0f, 104.0f),
                    PathNode.CurveTo(102.0f, 85.22232f, 117.22232f, 70.0f, 136.0f, 70.0f),
                    PathNode.CurveTo(154.77768f, 70.0f, 170.0f, 85.22232f, 170.0f, 104.0f),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
