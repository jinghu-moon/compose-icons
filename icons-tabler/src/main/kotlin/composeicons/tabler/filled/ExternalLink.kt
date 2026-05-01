package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) return _externalLink!!
        _externalLink = tablerFilledIcon(
            name = "ExternalLink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.CurveTo(12.552285f, 5.0f, 13.0f, 5.447716f, 13.0f, 6.0f),
                    PathNode.CurveTo(13.0f, 6.552285f, 12.552285f, 7.0f, 12.0f, 7.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(5.447716f, 7.0f, 5.0f, 7.447716f, 5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(5.0f, 18.552284f, 5.447716f, 19.0f, 6.0f, 19.0f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.CurveTo(16.552284f, 19.0f, 17.0f, 18.552284f, 17.0f, 18.0f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.CurveTo(17.0f, 11.447715f, 17.447716f, 11.0f, 18.0f, 11.0f),
                    PathNode.CurveTo(18.552284f, 11.0f, 19.0f, 11.447715f, 19.0f, 12.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(19.0f, 19.656855f, 17.656855f, 21.0f, 16.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.343146f, 21.0f, 3.0f, 19.656855f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 6.343146f, 4.343146f, 5.0f, 6.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.LineTo(20.075f, 3.003f),
                    PathNode.LineTo(20.201f, 3.02f),
                    PathNode.LineTo(20.312f, 3.05f),
                    PathNode.LineTo(20.423f, 3.094f),
                    PathNode.LineTo(20.521f, 3.146f),
                    PathNode.LineTo(20.617f, 3.213f),
                    PathNode.LineTo(20.707f, 3.293f),
                    PathNode.QuadTo(20.761f, 3.346f, 20.804f, 3.405f),
                    PathNode.LineTo(20.875f, 3.515f),
                    PathNode.LineTo(20.929f, 3.629f),
                    PathNode.LineTo(20.964f, 3.734f),
                    PathNode.LineTo(20.994f, 3.882f),
                    PathNode.LineTo(21.0f, 4.0f),
                    PathNode.LineTo(21.0f, 9.0f),
                    PathNode.CurveTo(21.0f, 9.552285f, 20.552284f, 10.0f, 20.0f, 10.0f),
                    PathNode.CurveTo(19.447716f, 10.0f, 19.0f, 9.552285f, 19.0f, 9.0f),
                    PathNode.LineTo(19.0f, 6.414f),
                    PathNode.LineTo(11.707f, 13.707f),
                    PathNode.CurveTo(11.314621f, 14.085972f, 10.690915f, 14.080552f, 10.305182f, 13.694818f),
                    PathNode.CurveTo(9.919448f, 13.309085f, 9.914028f, 12.685379f, 10.293f, 12.293f),
                    PathNode.LineTo(17.584f, 5.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(14.447715f, 5.0f, 14.0f, 4.552285f, 14.0f, 4.0f),
                    PathNode.CurveTo(14.0f, 3.447715f, 14.447715f, 3.0f, 15.0f, 3.0f)
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
        return _externalLink!!
    }

private var _externalLink: ImageVector? = null
