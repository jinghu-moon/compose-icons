package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Accessible: ImageVector
    get() {
        if (_accessible != null) return _accessible!!
        _accessible = tablerFilledIcon(
            name = "Accessible",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.1674f, 5.746208f, 23.030024f, 10.779379f, 21.433f, 15.318825f),
                    PathNode.CurveTo(19.835976f, 19.858273f, 15.232252f, 22.616514f, 10.476249f, 21.883377f),
                    PathNode.CurveTo(5.720245f, 21.15024f, 2.160861f, 17.133654f, 2.005f, 12.324f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
                    PathNode.Close,
                    PathNode.MoveTo(15.949f, 10.184f),
                    PathNode.CurveTo(15.788678f, 9.702853f, 15.293566f, 9.417905f, 14.797f, 9.521f),
                    PathNode.LineTo(14.684f, 9.551f),
                    PathNode.LineTo(12.0f, 10.446f),
                    PathNode.LineTo(9.316f, 9.551f),
                    PathNode.LineTo(9.203f, 9.521f),
                    PathNode.CurveTo(8.706944f, 9.418904f, 8.212881f, 9.703779f, 8.052727f, 10.184242f),
                    PathNode.CurveTo(7.892573f, 10.664705f, 8.116899f, 11.189044f, 8.575f, 11.405f),
                    PathNode.LineTo(8.684f, 11.449f),
                    PathNode.LineTo(11.0f, 12.22f),
                    PathNode.LineTo(11.0f, 13.196f),
                    PathNode.LineTo(9.168f, 15.946f),
                    PathNode.LineTo(9.108f, 16.046f),
                    PathNode.CurveTo(8.899365f, 16.455847f, 8.997163f, 16.955149f, 9.345f, 17.256f),
                    PathNode.LineTo(9.445f, 17.332f),
                    PathNode.LineTo(9.546f, 17.392f),
                    PathNode.CurveTo(9.955846f, 17.600634f, 10.455149f, 17.502836f, 10.756f, 17.155f),
                    PathNode.LineTo(10.832f, 17.055f),
                    PathNode.LineTo(12.0f, 15.303f),
                    PathNode.LineTo(13.168f, 17.055f),
                    PathNode.LineTo(13.238f, 17.148f),
                    PathNode.CurveTo(13.566437f, 17.53512f, 14.132827f, 17.614712f, 14.555237f, 17.333105f),
                    PathNode.CurveTo(14.977647f, 17.051498f, 15.12202f, 16.498064f, 14.891f, 16.046f),
                    PathNode.LineTo(14.832f, 15.946f),
                    PathNode.LineTo(13.0f, 13.196f),
                    PathNode.LineTo(13.0f, 12.219f),
                    PathNode.LineTo(15.316f, 11.448f),
                    PathNode.LineTo(15.425f, 11.404f),
                    PathNode.CurveTo(15.883891f, 11.18864f, 16.10905f, 10.663983f, 15.949f, 10.183f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.171573f, 6.0f, 10.5f, 6.671573f, 10.5f, 7.5f),
                    PathNode.CurveTo(10.5f, 8.328428f, 11.171573f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(12.828427f, 9.0f, 13.5f, 8.328428f, 13.5f, 7.5f),
                    PathNode.CurveTo(13.5f, 6.671573f, 12.828427f, 6.0f, 12.0f, 6.0f)
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
        return _accessible!!
    }

private var _accessible: ImageVector? = null
