package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCardStar: ImageVector
    get() {
        if (_playCardStar != null) return _playCardStar!!
        _playCardStar = tablerFilledIcon(
            name = "PlayCardStar",
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
                    PathNode.MoveTo(12.03f, 8.5f),
                    PathNode.LineTo(11.915f, 8.505f),
                    PathNode.CurveTo(11.531f, 8.545f, 11.191f, 8.778f, 11.017f, 9.128f),
                    PathNode.LineTo(10.507f, 10.155f),
                    PathNode.LineTo(9.369f, 10.321f),
                    PathNode.CurveTo(8.946f, 10.38f, 8.589f, 10.678f, 8.455f, 11.089f),
                    PathNode.LineTo(8.422f, 11.214f),
                    PathNode.CurveTo(8.344614f, 11.592608f, 8.466069f, 11.984509f, 8.744f, 12.253f),
                    PathNode.LineTo(9.564f, 13.05f),
                    PathNode.LineTo(9.37f, 14.177f),
                    PathNode.CurveTo(9.3f, 14.609f, 9.477f, 15.034f, 9.824f, 15.285f),
                    PathNode.LineTo(9.931f, 15.353f),
                    PathNode.CurveTo(10.264121f, 15.541087f, 10.669785f, 15.547861f, 11.009f, 15.371f),
                    PathNode.LineTo(12.031f, 14.835f),
                    PathNode.LineTo(13.05f, 15.37f),
                    PathNode.CurveTo(13.427f, 15.57f, 13.89f, 15.538f, 14.24f, 15.284f),
                    PathNode.LineTo(14.34f, 15.204f),
                    PathNode.CurveTo(14.621f, 14.945f, 14.756f, 14.559f, 14.69f, 14.176f),
                    PathNode.LineTo(14.496f, 13.05f),
                    PathNode.LineTo(15.319f, 12.251f),
                    PathNode.CurveTo(15.629f, 11.949f, 15.739f, 11.499f, 15.606f, 11.09f),
                    PathNode.LineTo(15.564f, 10.98f),
                    PathNode.CurveTo(15.405786f, 10.624745f, 15.076011f, 10.375809f, 14.691f, 10.321f),
                    PathNode.LineTo(13.553f, 10.155f),
                    PathNode.LineTo(13.045f, 9.129f),
                    PathNode.CurveTo(12.854559f, 8.74303f, 12.461396f, 8.498756f, 12.031f, 8.499f),
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
        return _playCardStar!!
    }

private var _playCardStar: ImageVector? = null
