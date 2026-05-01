package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = phosphorLightIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.74f, 77.92f),
                    PathNode.LineTo(134.0f, 117.61f),
                    PathNode.LineTo(134.0f, 38.2f),
                    PathNode.CurveTo(161.83044f, 40.072468f, 187.21982f, 54.7432f, 202.74f, 77.92f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 38.2f),
                    PathNode.LineTo(122.0f, 124.54f),
                    PathNode.LineTo(47.24f, 167.7f),
                    PathNode.CurveTo(33.999443f, 140.7625f, 35.059395f, 108.99713f, 50.066204f, 83.00219f),
                    PathNode.CurveTo(65.07301f, 57.007244f, 92.05132f, 40.20447f, 122.0f, 38.2f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(97.989136f, 217.98679f, 69.95938f, 203.01558f, 53.26f, 178.08f),
                    PathNode.LineTo(208.76f, 88.3f),
                    PathNode.CurveTo(222.4702f, 116.19375f, 220.81773f, 149.18742f, 204.3891f, 175.5717f),
                    PathNode.CurveTo(187.96046f, 201.95598f, 159.08102f, 217.99629f, 128.0f, 218.0f),
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
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
