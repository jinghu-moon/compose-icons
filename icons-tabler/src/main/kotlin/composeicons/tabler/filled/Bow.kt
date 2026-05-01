package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bow: ImageVector
    get() {
        if (_bow != null) return _bow!!
        _bow = tablerFilledIcon(
            name = "Bow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 2.0f),
                    PathNode.LineTo(21.081f, 2.003f),
                    PathNode.LineTo(21.201f, 2.02f),
                    PathNode.LineTo(21.312f, 2.05f),
                    PathNode.LineTo(21.423f, 2.094f),
                    PathNode.LineTo(21.521f, 2.146f),
                    PathNode.LineTo(21.617f, 2.213f),
                    PathNode.LineTo(21.707f, 2.293f),
                    PathNode.QuadTo(21.761f, 2.346f, 21.804f, 2.405f),
                    PathNode.LineTo(21.875f, 2.515f),
                    PathNode.LineTo(21.906f, 2.577f),
                    PathNode.LineTo(21.94f, 2.658f),
                    PathNode.LineTo(21.964f, 2.734f),
                    PathNode.LineTo(21.994f, 2.882f),
                    PathNode.LineTo(22.0f, 3.0f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.CurveTo(22.0f, 7.552285f, 21.552284f, 8.0f, 21.0f, 8.0f),
                    PathNode.CurveTo(20.447716f, 8.0f, 20.0f, 7.552285f, 20.0f, 7.0f),
                    PathNode.LineTo(20.0f, 5.414f),
                    PathNode.LineTo(17.93f, 7.484f),
                    PathNode.CurveTo(19.231f, 9.108f, 20.0f, 11.19f, 20.0f, 13.5f),
                    PathNode.CurveTo(20.0f, 16.203f, 18.953f, 18.962f, 17.207f, 20.707f),
                    PathNode.CurveTo(16.8165f, 21.097382f, 16.1835f, 21.097382f, 15.793f, 20.707f),
                    PathNode.LineTo(10.25f, 15.165f),
                    PathNode.LineTo(7.0f, 18.414f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(7.0f, 21.552284f, 6.552285f, 22.0f, 6.0f, 22.0f),
                    PathNode.CurveTo(5.447716f, 22.0f, 5.0f, 21.552284f, 5.0f, 21.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(2.493025f, 18.999933f, 2.066316f, 18.620493f, 2.007f, 18.117f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 17.447716f, 2.447715f, 17.0f, 3.0f, 17.0f),
                    PathNode.LineTo(5.584f, 17.0f),
                    PathNode.LineTo(8.835f, 13.75f),
                    PathNode.LineTo(3.293f, 8.207f),
                    PathNode.CurveTo(2.903396f, 7.817282f, 2.902501f, 7.185821f, 3.291f, 6.795f),
                    PathNode.CurveTo(5.036f, 5.04f, 7.78f, 4.0f, 10.5f, 4.0f),
                    PathNode.CurveTo(12.81f, 4.0f, 14.893f, 4.768f, 16.515f, 6.07f),
                    PathNode.LineTo(18.584f, 4.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.CurveTo(16.493025f, 3.999933f, 16.066317f, 3.620493f, 16.007f, 3.117f),
                    PathNode.LineTo(16.0f, 3.0f),
                    PathNode.CurveTo(16.0f, 2.447715f, 16.447716f, 2.0f, 17.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.505f, 8.91f),
                    PathNode.LineTo(12.415f, 13.0f),
                    PathNode.LineTo(17.01f, 17.594f),
                    PathNode.CurveTo(17.610184f, 16.4156f, 17.946318f, 15.120544f, 17.995f, 13.799f),
                    PathNode.LineTo(18.0f, 13.5f),
                    PathNode.CurveTo(18.0f, 11.746f, 17.45f, 10.164f, 16.505f, 8.91f),
                    PathNode.MoveTo(10.5f, 6.0f),
                    PathNode.CurveTo(9.06f, 6.0f, 7.61f, 6.36f, 6.402f, 6.987f),
                    PathNode.LineTo(11.0f, 11.585f),
                    PathNode.LineTo(15.09f, 7.495f),
                    PathNode.CurveTo(13.836f, 6.55f, 12.254f, 6.0f, 10.5f, 6.0f)
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
        return _bow!!
    }

private var _bow: ImageVector? = null
