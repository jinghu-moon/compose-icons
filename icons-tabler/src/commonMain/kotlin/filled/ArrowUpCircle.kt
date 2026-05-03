package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowUpCircle: ImageVector
    get() {
        if (_arrowUpCircle != null) return _arrowUpCircle!!
        _arrowUpCircle = tablerFilledIcon(
            name = "ArrowUpCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.852f, 2.011f),
                    PathNode.LineTo(11.91f, 2.004f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.LineTo(12.075f, 2.003f),
                    PathNode.LineTo(12.201f, 2.02f),
                    PathNode.LineTo(12.312f, 2.05f),
                    PathNode.LineTo(12.423f, 2.094f),
                    PathNode.LineTo(12.521f, 2.146f),
                    PathNode.LineTo(12.625f, 2.22f),
                    PathNode.LineTo(12.707f, 2.293f),
                    PathNode.LineTo(15.707f, 5.293f),
                    PathNode.CurveTo(15.966956f, 5.544075f, 16.071213f, 5.915878f, 15.979697f, 6.265507f),
                    PathNode.CurveTo(15.888182f, 6.615137f, 15.615137f, 6.888182f, 15.265508f, 6.979697f),
                    PathNode.CurveTo(14.915878f, 7.071213f, 14.544074f, 6.966957f, 14.293f, 6.707f),
                    PathNode.LineTo(13.0f, 5.415f),
                    PathNode.LineTo(13.0f, 16.171f),
                    PathNode.CurveTo(14.378126f, 16.658058f, 15.204896f, 18.067162f, 14.957811f, 19.507788f),
                    PathNode.CurveTo(14.710726f, 20.948416f, 13.461662f, 22.001488f, 12.0f, 22.001488f),
                    PathNode.CurveTo(10.538338f, 22.001488f, 9.289274f, 20.948416f, 9.042189f, 19.507788f),
                    PathNode.CurveTo(8.795104f, 18.067162f, 9.621874f, 16.658058f, 11.0f, 16.171f),
                    PathNode.LineTo(11.0f, 5.415f),
                    PathNode.LineTo(9.707f, 6.707f),
                    PathNode.CurveTo(9.350732f, 7.063236f, 8.785086f, 7.098802f, 8.387f, 6.79f),
                    PathNode.LineTo(8.293f, 6.707f),
                    PathNode.CurveTo(7.902618f, 6.3165f, 7.902618f, 5.6835f, 8.293f, 5.293f),
                    PathNode.LineTo(11.293f, 2.293f),
                    PathNode.QuadTo(11.346f, 2.239f, 11.405f, 2.196f),
                    PathNode.LineTo(11.515f, 2.125f),
                    PathNode.LineTo(11.629f, 2.071f),
                    PathNode.LineTo(11.734f, 2.036f),
                    PathNode.Close
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
        return _arrowUpCircle!!
    }

private var _arrowUpCircle: ImageVector? = null
