package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dashboard: ImageVector
    get() {
        if (_dashboard != null) return _dashboard!!
        _dashboard = tablerFilledIcon(
            name = "Dashboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.954f),
                    PathNode.CurveTo(16.252962f, 2.953777f, 20.040775f, 5.643594f, 21.4421f, 9.65906f),
                    PathNode.CurveTo(22.843426f, 13.674526f, 21.551643f, 18.13703f, 18.222f, 20.783f),
                    PathNode.CurveTo(18.045128f, 20.92351f, 17.825891f, 20.999994f, 17.6f, 21.0f),
                    PathNode.LineTo(6.4f, 21.0f),
                    PathNode.CurveTo(6.174109f, 20.999994f, 5.954873f, 20.92351f, 5.778f, 20.783f),
                    PathNode.CurveTo(2.448356f, 18.13703f, 1.156573f, 13.674526f, 2.557899f, 9.65906f),
                    PathNode.CurveTo(3.959225f, 5.643594f, 7.747038f, 2.953777f, 12.0f, 2.954f),
                    PathNode.MoveTo(16.207f, 8.793f),
                    PathNode.CurveTo(15.8165f, 8.402618f, 15.1835f, 8.402618f, 14.793f, 8.793f),
                    PathNode.LineTo(12.517f, 11.067f),
                    PathNode.CurveTo(11.936338f, 10.912624f, 11.317046f, 11.027064f, 10.829902f, 11.378761f),
                    PathNode.CurveTo(10.342758f, 11.730458f, 10.039223f, 12.282261f, 10.003f, 12.882f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.001429f, 13.776279f, 10.451926f, 14.481612f, 11.155633f, 14.809343f),
                    PathNode.CurveTo(11.859341f, 15.137074f, 12.689127f, 15.027997f, 13.284229f, 14.529535f),
                    PathNode.CurveTo(13.879331f, 14.031074f, 14.13224f, 13.233276f, 13.933f, 12.483f),
                    PathNode.LineTo(16.207f, 10.207f),
                    PathNode.CurveTo(16.597382f, 9.8165f, 16.597382f, 9.1835f, 16.207f, 8.793f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
