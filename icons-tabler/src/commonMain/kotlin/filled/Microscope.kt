package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = tablerFilledIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.707f, 4.293f),
                    PathNode.LineTo(18.707f, 7.293f),
                    PathNode.CurveTo(19.097382f, 7.6835f, 19.097382f, 8.3165f, 18.707f, 8.707f),
                    PathNode.LineTo(17.154f, 10.262f),
                    PathNode.CurveTo(19.71296f, 13.045067f, 19.599623f, 17.357199f, 16.898f, 20.002f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.CurveTo(19.552284f, 20.0f, 20.0f, 20.447716f, 20.0f, 21.0f),
                    PathNode.CurveTo(20.0f, 21.552284f, 19.552284f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(4.447716f, 22.0f, 4.0f, 21.552284f, 4.0f, 21.0f),
                    PathNode.CurveTo(4.0f, 20.447716f, 4.447716f, 20.0f, 5.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(5.447716f, 19.0f, 5.0f, 18.552284f, 5.0f, 18.0f),
                    PathNode.CurveTo(5.0f, 17.447716f, 5.447716f, 17.0f, 6.0f, 17.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.CurveTo(8.552285f, 17.0f, 9.0f, 17.447716f, 9.0f, 18.0f),
                    PathNode.CurveTo(9.0f, 18.552284f, 8.552285f, 19.0f, 8.0f, 19.0f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.CurveTo(13.969428f, 20.000395f, 15.755637f, 18.844656f, 16.562323f, 17.048018f),
                    PathNode.CurveTo(17.369007f, 15.251379f, 17.045883f, 13.148556f, 15.737f, 11.677f),
                    PathNode.LineTo(12.707f, 14.707f),
                    PathNode.CurveTo(12.3165f, 15.097382f, 11.6835f, 15.097382f, 11.293f, 14.707f),
                    PathNode.LineTo(10.5f, 13.915f),
                    PathNode.LineTo(9.707f, 14.707f),
                    PathNode.CurveTo(9.455926f, 14.966956f, 9.084122f, 15.071213f, 8.734492f, 14.979697f),
                    PathNode.CurveTo(8.384863f, 14.888182f, 8.111819f, 14.615137f, 8.020303f, 14.265508f),
                    PathNode.CurveTo(7.928787f, 13.915878f, 8.033044f, 13.544074f, 8.293f, 13.293f),
                    PathNode.LineTo(9.085f, 12.5f),
                    PathNode.LineTo(8.293f, 11.707f),
                    PathNode.CurveTo(7.902618f, 11.3165f, 7.902618f, 10.6835f, 8.293f, 10.293f),
                    PathNode.LineTo(14.293f, 4.293f),
                    PathNode.CurveTo(14.6835f, 3.902618f, 15.3165f, 3.902618f, 15.707f, 4.293f),
                    PathNode.MoveTo(17.707f, 2.293f),
                    PathNode.LineTo(20.707f, 5.293f),
                    PathNode.CurveTo(20.966957f, 5.544075f, 21.071213f, 5.915878f, 20.979696f, 6.265507f),
                    PathNode.CurveTo(20.888182f, 6.615137f, 20.615137f, 6.888182f, 20.265507f, 6.979697f),
                    PathNode.CurveTo(19.915878f, 7.071213f, 19.544077f, 6.966957f, 19.293f, 6.707f),
                    PathNode.LineTo(16.293f, 3.707f),
                    PathNode.CurveTo(16.033043f, 3.455926f, 15.928787f, 3.084122f, 16.020304f, 2.734493f),
                    PathNode.CurveTo(16.111818f, 2.384863f, 16.384863f, 2.111818f, 16.734493f, 2.020303f),
                    PathNode.CurveTo(17.084122f, 1.928787f, 17.455923f, 2.033043f, 17.707f, 2.293f)
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
        return _microscope!!
    }

private var _microscope: ImageVector? = null
