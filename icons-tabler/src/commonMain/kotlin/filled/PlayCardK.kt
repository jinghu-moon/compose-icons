package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCardK: ImageVector
    get() {
        if (_playCardK != null) return _playCardK!!
        _playCardK = tablerFilledIcon(
            name = "PlayCardK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.656855f, 2.0f, 20.0f, 3.343146f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 3.343146f, 5.343146f, 2.0f, 7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.01f, 18.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.CurveTo(16.470907f, 18.000587f, 16.033834f, 18.41321f, 16.002829f, 18.941395f),
                    PathNode.CurveTo(15.971821f, 19.46958f, 16.357609f, 19.93051f, 16.883f, 19.993f),
                    PathNode.LineTo(17.01f, 20.0f),
                    PathNode.CurveTo(17.562284f, 20.0f, 18.01f, 19.552284f, 18.01f, 19.0f),
                    PathNode.CurveTo(18.01f, 18.447716f, 17.562284f, 18.0f, 17.01f, 18.0f),
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.CurveTo(9.447715f, 8.0f, 9.0f, 8.447715f, 9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 15.552285f, 9.447715f, 16.0f, 10.0f, 16.0f),
                    PathNode.CurveTo(10.552285f, 16.0f, 11.0f, 15.552285f, 11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 13.415f),
                    PathNode.LineTo(13.293f, 15.707f),
                    PathNode.CurveTo(13.649268f, 16.063234f, 14.214914f, 16.098803f, 14.613f, 15.79f),
                    PathNode.LineTo(14.707f, 15.707f),
                    PathNode.LineTo(14.79f, 15.613f),
                    PathNode.CurveTo(15.098803f, 15.214914f, 15.063235f, 14.649268f, 14.707f, 14.293f),
                    PathNode.LineTo(12.415f, 12.0f),
                    PathNode.LineTo(14.707f, 9.707f),
                    PathNode.CurveTo(14.966956f, 9.455926f, 15.071213f, 9.084122f, 14.979697f, 8.734492f),
                    PathNode.CurveTo(14.888182f, 8.384863f, 14.615137f, 8.111819f, 14.265508f, 8.020303f),
                    PathNode.CurveTo(13.915878f, 7.928787f, 13.544074f, 8.033044f, 13.293f, 8.293f),
                    PathNode.LineTo(11.0f, 10.584f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.CurveTo(10.999933f, 8.493025f, 10.620493f, 8.066316f, 10.117f, 8.007f),
                    PathNode.Close,
                    PathNode.MoveTo(7.01f, 4.0f),
                    PathNode.LineTo(7.0f, 4.0f),
                    PathNode.CurveTo(6.470907f, 4.000587f, 6.033836f, 4.413211f, 6.002828f, 4.941395f),
                    PathNode.CurveTo(5.971821f, 5.469579f, 6.35761f, 5.930509f, 6.883f, 5.993f),
                    PathNode.LineTo(7.01f, 6.0f),
                    PathNode.CurveTo(7.562285f, 6.0f, 8.01f, 5.552285f, 8.01f, 5.0f),
                    PathNode.CurveTo(8.01f, 4.447716f, 7.562285f, 4.0f, 7.01f, 4.0f)
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
        return _playCardK!!
    }

private var _playCardK: ImageVector? = null
