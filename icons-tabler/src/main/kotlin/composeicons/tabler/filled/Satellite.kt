package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Satellite: ImageVector
    get() {
        if (_satellite != null) return _satellite!!
        _satellite = tablerFilledIcon(
            name = "Satellite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 14.0f),
                    PathNode.CurveTo(21.552284f, 14.0f, 22.0f, 14.447715f, 22.0f, 15.0f),
                    PathNode.CurveTo(22.0f, 18.865993f, 18.865993f, 22.0f, 15.0f, 22.0f),
                    PathNode.CurveTo(14.447715f, 22.0f, 14.0f, 21.552284f, 14.0f, 21.0f),
                    PathNode.CurveTo(14.0f, 20.447716f, 14.447715f, 20.0f, 15.0f, 20.0f),
                    PathNode.CurveTo(17.761423f, 20.0f, 20.0f, 17.761423f, 20.0f, 15.0f),
                    PathNode.CurveTo(20.0f, 14.447715f, 20.447716f, 14.0f, 21.0f, 14.0f),
                    PathNode.MoveTo(17.0f, 13.5f),
                    PathNode.CurveTo(17.552284f, 13.5f, 18.0f, 13.947715f, 18.0f, 14.5f),
                    PathNode.CurveTo(18.0f, 16.432997f, 16.432997f, 18.0f, 14.5f, 18.0f),
                    PathNode.CurveTo(13.970906f, 17.999413f, 13.533835f, 17.58679f, 13.502828f, 17.058605f),
                    PathNode.CurveTo(13.471821f, 16.53042f, 13.85761f, 16.06949f, 14.383f, 16.007f),
                    PathNode.LineTo(14.5f, 16.0f),
                    PathNode.CurveTo(15.272622f, 15.999963f, 15.918828f, 15.413054f, 15.993f, 14.644f),
                    PathNode.LineTo(16.0f, 14.5f),
                    PathNode.CurveTo(16.0f, 13.947715f, 16.447716f, 13.5f, 17.0f, 13.5f),
                    PathNode.MoveTo(3.171f, 11.413f),
                    PathNode.LineTo(7.171f, 15.414f),
                    PathNode.QuadTo(7.383f, 15.626f, 7.616f, 15.798f),
                    PathNode.LineTo(6.707f, 16.708f),
                    PathNode.CurveTo(6.3165f, 17.098383f, 5.6835f, 17.098383f, 5.293f, 16.708f),
                    PathNode.LineTo(2.293f, 13.708f),
                    PathNode.CurveTo(2.105223f, 13.520432f, 1.999713f, 13.265909f, 1.999713f, 13.0005f),
                    PathNode.CurveTo(1.999713f, 12.735091f, 2.105223f, 12.480568f, 2.293f, 12.293f),
                    PathNode.Close,
                    PathNode.MoveTo(8.414f, 3.0f),
                    PathNode.LineTo(14.0f, 8.586f),
                    PathNode.CurveTo(14.780764f, 9.367f, 14.780764f, 10.633f, 14.0f, 11.414f),
                    PathNode.LineTo(13.414f, 11.999f),
                    PathNode.LineTo(14.207f, 12.793f),
                    PathNode.CurveTo(14.585972f, 13.185379f, 14.580552f, 13.809085f, 14.194818f, 14.194818f),
                    PathNode.CurveTo(13.809085f, 14.580552f, 13.185379f, 14.585972f, 12.793f, 14.207f),
                    PathNode.LineTo(12.0f, 13.413f),
                    PathNode.LineTo(11.414f, 14.0f),
                    PathNode.CurveTo(10.633f, 14.780764f, 9.367f, 14.780764f, 8.586f, 14.0f),
                    PathNode.LineTo(3.0f, 8.414f),
                    PathNode.CurveTo(2.295852f, 7.708182f, 2.219078f, 6.591549f, 2.82f, 5.796f),
                    PathNode.LineTo(2.947f, 5.644f),
                    PathNode.LineTo(3.0f, 5.586f),
                    PathNode.LineTo(5.586f, 3.0f),
                    PathNode.CurveTo(6.367f, 2.219236f, 7.633001f, 2.219236f, 8.414f, 3.0f),
                    PathNode.MoveTo(13.707f, 2.293f),
                    PathNode.LineTo(16.707f, 5.293f),
                    PathNode.CurveTo(17.097382f, 5.6835f, 17.097382f, 6.3165f, 16.707f, 6.707f),
                    PathNode.LineTo(15.799f, 7.617f),
                    PathNode.CurveTo(15.682086f, 7.45945f, 15.55374f, 7.310716f, 15.415f, 7.172f),
                    PathNode.LineTo(11.414f, 3.172f),
                    PathNode.LineTo(12.293f, 2.292f),
                    PathNode.CurveTo(12.6835f, 1.901618f, 13.3165f, 1.901618f, 13.707f, 2.292f)
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
        return _satellite!!
    }

private var _satellite: ImageVector? = null
