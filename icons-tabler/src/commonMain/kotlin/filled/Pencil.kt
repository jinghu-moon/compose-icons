package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pencil: ImageVector
    get() {
        if (_pencil != null) return _pencil!!
        _pencil = tablerFilledIcon(
            name = "Pencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.085f, 6.5f),
                    PathNode.LineTo(17.5f, 11.915f),
                    PathNode.LineTo(8.707f, 20.707f),
                    PathNode.CurveTo(8.519507f, 20.89455f, 8.265195f, 20.999943f, 8.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(3.447715f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.000057f, 15.734805f, 3.105451f, 15.480493f, 3.293f, 15.293f),
                    PathNode.Close,
                    PathNode.MoveTo(17.491f, 3.802f),
                    PathNode.CurveTo(18.812263f, 4.155854f, 19.84432f, 5.187814f, 20.198298f, 6.509044f),
                    PathNode.CurveTo(20.552277f, 7.830274f, 20.174381f, 9.239982f, 19.207f, 10.207f),
                    PathNode.LineTo(18.915f, 10.5f),
                    PathNode.LineTo(13.5f, 5.085f),
                    PathNode.LineTo(13.793f, 4.793f),
                    PathNode.CurveTo(14.760302f, 3.82608f, 16.16981f, 3.448356f, 17.491f, 3.802f)
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
        return _pencil!!
    }

private var _pencil: ImageVector? = null
