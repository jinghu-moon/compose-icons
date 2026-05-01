package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = tablerFilledIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.883f, 2.207f),
                    PathNode.CurveTo(10.86958f, 2.090731f, 11.779192f, 2.754089f, 11.97f, 3.729f),
                    PathNode.LineTo(11.995f, 3.896f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.CurveTo(12.000067f, 11.506975f, 12.379507f, 11.933684f, 12.883f, 11.993f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(19.8f, 12.0f),
                    PathNode.CurveTo(20.90457f, 12.0f, 21.8f, 12.895431f, 21.8f, 14.0f),
                    PathNode.CurveTo(21.79996f, 14.076077f, 21.791233f, 14.151901f, 21.774f, 14.226f),
                    PathNode.CurveTo(20.666819f, 19.003016f, 16.259138f, 22.272444f, 11.366376f, 21.94593f),
                    PathNode.CurveTo(6.473614f, 21.619417f, 2.539448f, 17.793306f, 2.076835f, 12.91153f),
                    PathNode.CurveTo(1.614222f, 8.029756f, 4.759662f, 3.532757f, 9.504f, 2.293f),
                    PathNode.LineTo(9.774f, 2.226f),
                    PathNode.LineTo(9.884f, 2.206f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 3.5f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.CurveTo(14.0f, 9.552285f, 14.447715f, 10.0f, 15.0f, 10.0f),
                    PathNode.LineTo(20.5f, 10.0f),
                    PathNode.CurveTo(20.824335f, 9.999909f, 21.128485f, 9.842526f, 21.31589f, 9.577813f),
                    PathNode.CurveTo(21.503296f, 9.313101f, 21.55068f, 8.973939f, 21.443f, 8.668f),
                    PathNode.CurveTo(20.437025f, 5.810721f, 18.190113f, 3.563441f, 15.333f, 2.557f),
                    PathNode.CurveTo(15.026939f, 2.448913f, 14.687458f, 2.496098f, 14.422476f, 2.683554f),
                    PathNode.CurveTo(14.157493f, 2.871009f, 13.999976f, 3.175415f, 14.0f, 3.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
