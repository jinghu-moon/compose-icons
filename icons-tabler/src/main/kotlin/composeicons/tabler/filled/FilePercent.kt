package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FilePercent: ImageVector
    get() {
        if (_filePercent != null) return _filePercent!!
        _filePercent = tablerFilledIcon(
            name = "FilePercent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.117f, 2.007f),
                    PathNode.CurveTo(12.576491f, 2.061188f, 12.938812f, 2.423509f, 12.993f, 2.883f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(13.005f, 7.15f),
                    PathNode.CurveTo(13.078939f, 8.133892f, 13.859354f, 8.916854f, 14.843f, 8.994f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.LineTo(19.117f, 9.007f),
                    PathNode.CurveTo(19.57649f, 9.061188f, 19.938812f, 9.423509f, 19.993f, 9.883f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.000088f, 20.588558f, 18.761822f, 21.901804f, 17.176f, 21.995f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.411443f, 22.000088f, 4.098196f, 20.761822f, 4.005f, 19.176f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(3.999912f, 3.411442f, 5.238179f, 2.098195f, 6.824f, 2.005f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.01f, 16.0f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.CurveTo(13.470906f, 16.000587f, 13.033835f, 16.41321f, 13.002828f, 16.941395f),
                    PathNode.CurveTo(12.971821f, 17.46958f, 13.35761f, 17.93051f, 13.883f, 17.993f),
                    PathNode.LineTo(14.01f, 18.0f),
                    PathNode.CurveTo(14.562284f, 18.0f, 15.01f, 17.552284f, 15.01f, 17.0f),
                    PathNode.CurveTo(15.01f, 16.447716f, 14.562284f, 16.0f, 14.01f, 16.0f),
                    PathNode.MoveTo(14.707f, 12.293f),
                    PathNode.CurveTo(14.3165f, 11.902618f, 13.6835f, 11.902618f, 13.293f, 12.293f),
                    PathNode.LineTo(9.293f, 16.293f),
                    PathNode.CurveTo(8.914028f, 16.685379f, 8.919448f, 17.309084f, 9.305182f, 17.694818f),
                    PathNode.CurveTo(9.690915f, 18.080553f, 10.314621f, 18.085972f, 10.707f, 17.707f),
                    PathNode.LineTo(14.707f, 13.707f),
                    PathNode.CurveTo(15.097382f, 13.3165f, 15.097382f, 12.6835f, 14.707f, 12.293f),
                    PathNode.MoveTo(10.01f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.CurveTo(9.470906f, 12.000587f, 9.033835f, 12.413211f, 9.002828f, 12.941395f),
                    PathNode.CurveTo(8.971821f, 13.469579f, 9.35761f, 13.93051f, 9.883f, 13.993f),
                    PathNode.LineTo(10.01f, 14.0f),
                    PathNode.CurveTo(10.562284f, 14.0f, 11.01f, 13.552285f, 11.01f, 13.0f),
                    PathNode.CurveTo(11.01f, 12.447715f, 10.562284f, 12.0f, 10.01f, 12.0f),
                    PathNode.MoveTo(14.999f, 2.999f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f),
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
        return _filePercent!!
    }

private var _filePercent: ImageVector? = null
