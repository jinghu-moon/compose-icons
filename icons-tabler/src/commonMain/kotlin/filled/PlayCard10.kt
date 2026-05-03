package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard10: ImageVector
    get() {
        if (_playCard10 != null) return _playCard10!!
        _playCard10 = tablerFilledIcon(
            name = "PlayCard10",
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
                    PathNode.MoveTo(9.0f, 8.0f),
                    PathNode.CurveTo(8.447715f, 8.0f, 8.0f, 8.447715f, 8.0f, 9.0f),
                    PathNode.LineTo(8.0f, 15.0f),
                    PathNode.CurveTo(8.0f, 15.552285f, 8.447715f, 16.0f, 9.0f, 16.0f),
                    PathNode.CurveTo(9.552285f, 16.0f, 10.0f, 15.552285f, 10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 8.447715f, 9.552285f, 8.0f, 9.0f, 8.0f),
                    PathNode.MoveTo(13.5f, 8.0f),
                    PathNode.CurveTo(12.047f, 8.0f, 11.0f, 9.395f, 11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.CurveTo(11.0f, 14.605f, 12.047f, 16.0f, 13.5f, 16.0f),
                    PathNode.CurveTo(14.953f, 16.0f, 16.0f, 14.605f, 16.0f, 13.0f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.CurveTo(16.0f, 9.395f, 14.953f, 8.0f, 13.5f, 8.0f),
                    PathNode.MoveTo(13.5f, 10.0f),
                    PathNode.CurveTo(13.703f, 10.0f, 14.0f, 10.395f, 14.0f, 11.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.CurveTo(14.0f, 13.605f, 13.703f, 14.0f, 13.5f, 14.0f),
                    PathNode.CurveTo(13.297f, 14.0f, 13.0f, 13.605f, 13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.CurveTo(13.0f, 10.395f, 13.297f, 10.0f, 13.5f, 10.0f),
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
        return _playCard10!!
    }

private var _playCard10: ImageVector? = null
