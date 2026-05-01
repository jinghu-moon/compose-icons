package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Click: ImageVector
    get() {
        if (_click != null) return _click!!
        _click = tablerFilledIcon(
            name = "Click",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.CurveTo(7.0f, 12.552285f, 6.552285f, 13.0f, 6.0f, 13.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.CurveTo(2.447715f, 13.0f, 2.0f, 12.552285f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 11.447715f, 2.447715f, 11.0f, 3.0f, 11.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(6.552285f, 11.0f, 7.0f, 11.447715f, 7.0f, 12.0f),
                    PathNode.MoveTo(13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.CurveTo(13.0f, 6.552285f, 12.552285f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(11.447715f, 7.0f, 11.0f, 6.552285f, 11.0f, 6.0f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.CurveTo(11.0f, 2.447715f, 11.447715f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(12.552285f, 2.0f, 13.0f, 2.447715f, 13.0f, 3.0f),
                    PathNode.MoveTo(6.307f, 4.893f),
                    PathNode.LineTo(8.507f, 7.093f),
                    PathNode.CurveTo(8.885972f, 7.485379f, 8.880552f, 8.109085f, 8.494819f, 8.494819f),
                    PathNode.CurveTo(8.109085f, 8.880552f, 7.485379f, 8.885972f, 7.093f, 8.507f),
                    PathNode.LineTo(4.893f, 6.307f),
                    PathNode.CurveTo(4.514028f, 5.914621f, 4.519448f, 5.290915f, 4.905182f, 4.905182f),
                    PathNode.CurveTo(5.290915f, 4.519448f, 5.914621f, 4.514028f, 6.307f, 4.893f),
                    PathNode.MoveTo(19.107f, 4.893f),
                    PathNode.CurveTo(19.497381f, 5.2835f, 19.497381f, 5.9165f, 19.107f, 6.307f),
                    PathNode.LineTo(16.907f, 8.507f),
                    PathNode.CurveTo(16.514622f, 8.885972f, 15.890915f, 8.880552f, 15.505181f, 8.494819f),
                    PathNode.CurveTo(15.119448f, 8.109085f, 15.114028f, 7.485379f, 15.493f, 7.093f),
                    PathNode.LineTo(17.693f, 4.893f),
                    PathNode.CurveTo(18.0835f, 4.502618f, 18.7165f, 4.502618f, 19.107f, 4.893f),
                    PathNode.MoveTo(8.507f, 15.493f),
                    PathNode.CurveTo(8.897382f, 15.8835f, 8.897382f, 16.5165f, 8.507f, 16.907f),
                    PathNode.LineTo(6.307f, 19.107f),
                    PathNode.CurveTo(6.055926f, 19.366957f, 5.684122f, 19.471212f, 5.334493f, 19.379698f),
                    PathNode.CurveTo(4.984864f, 19.288181f, 4.711818f, 19.015137f, 4.620303f, 18.665508f),
                    PathNode.CurveTo(4.528788f, 18.315878f, 4.633044f, 17.944075f, 4.893f, 17.693f),
                    PathNode.LineTo(7.093f, 15.493f),
                    PathNode.CurveTo(7.4835f, 15.102618f, 8.1165f, 15.102618f, 8.507f, 15.493f),
                    PathNode.MoveTo(11.927f, 11.003f),
                    PathNode.LineTo(11.976f, 11.0f),
                    PathNode.LineTo(12.074f, 11.003f),
                    PathNode.LineTo(12.171f, 11.015f),
                    PathNode.LineTo(12.268f, 11.037f),
                    PathNode.LineTo(21.316f, 14.051f),
                    PathNode.CurveTo(22.161f, 14.333f, 22.244f, 15.496f, 21.447f, 15.894f),
                    PathNode.LineTo(17.745f, 17.745f),
                    PathNode.LineTo(15.895f, 21.447f),
                    PathNode.CurveTo(15.496f, 22.244f, 14.333f, 22.161f, 14.051f, 21.317f),
                    PathNode.LineTo(11.048f, 12.306f),
                    PathNode.LineTo(11.015f, 12.171f),
                    PathNode.LineTo(11.003f, 12.074f),
                    PathNode.LineTo(11.003f, 11.926f),
                    PathNode.LineTo(11.015f, 11.829f),
                    PathNode.LineTo(11.037f, 11.732f),
                    PathNode.LineTo(11.067f, 11.638f),
                    PathNode.LineTo(11.107f, 11.548f),
                    PathNode.LineTo(11.157f, 11.464f),
                    PathNode.LineTo(11.243f, 11.347f),
                    PathNode.LineTo(11.31f, 11.277f),
                    PathNode.LineTo(11.347f, 11.243f),
                    PathNode.LineTo(11.423f, 11.183f),
                    PathNode.LineTo(11.504f, 11.131f),
                    PathNode.LineTo(11.591f, 11.088f),
                    PathNode.LineTo(11.694f, 11.048f),
                    PathNode.LineTo(11.829f, 11.015f),
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
        return _click!!
    }

private var _click: ImageVector? = null
