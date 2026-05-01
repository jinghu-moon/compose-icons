package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorRegularIcon(
            name = "ChartPolar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.63f, 120.0f),
                    PathNode.LineTo(191.48f, 120.0f),
                    PathNode.CurveTo(187.78664f, 91.02642f, 164.97357f, 68.21336f, 136.0f, 64.52f),
                    PathNode.LineTo(136.0f, 40.37f),
                    PathNode.CurveTo(178.25223f, 44.281887f, 211.71811f, 77.74777f, 215.63f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 120.0f),
                    PathNode.LineTo(80.68f, 120.0f),
                    PathNode.CurveTo(84.11231f, 99.87611f, 99.87611f, 84.11231f, 120.0f, 80.68f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 175.32f),
                    PathNode.CurveTo(99.87611f, 171.8877f, 84.11231f, 156.12389f, 80.68f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 136.0f),
                    PathNode.LineTo(175.32f, 136.0f),
                    PathNode.CurveTo(171.8877f, 156.12389f, 156.12389f, 171.8877f, 136.0f, 175.32f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 80.68f),
                    PathNode.CurveTo(156.12389f, 84.11231f, 171.8877f, 99.87611f, 175.32f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 40.37f),
                    PathNode.LineTo(120.0f, 64.52f),
                    PathNode.CurveTo(91.02642f, 68.21336f, 68.21336f, 91.02642f, 64.52f, 120.0f),
                    PathNode.LineTo(40.37f, 120.0f),
                    PathNode.CurveTo(44.281887f, 77.74777f, 77.74777f, 44.281887f, 120.0f, 40.37f),
                    PathNode.Close,
                    PathNode.MoveTo(40.37f, 136.0f),
                    PathNode.LineTo(64.52f, 136.0f),
                    PathNode.CurveTo(68.21336f, 164.97357f, 91.02642f, 187.78664f, 120.0f, 191.48f),
                    PathNode.LineTo(120.0f, 215.63f),
                    PathNode.CurveTo(77.74777f, 211.71811f, 44.281887f, 178.25223f, 40.37f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 215.63f),
                    PathNode.LineTo(136.0f, 191.48f),
                    PathNode.CurveTo(164.97357f, 187.78664f, 187.78664f, 164.97357f, 191.48f, 136.0f),
                    PathNode.LineTo(215.63f, 136.0f),
                    PathNode.CurveTo(211.71811f, 178.25223f, 178.25223f, 211.71811f, 136.0f, 215.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
