package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = tablerFilledIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 16.0f),
                    PathNode.CurveTo(20.552284f, 16.0f, 21.0f, 16.447716f, 21.0f, 17.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.656855f, 19.656855f, 22.0f, 18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(4.343146f, 22.0f, 3.0f, 20.656855f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 16.447716f, 3.447715f, 16.0f, 4.0f, 16.0f),
                    PathNode.CurveTo(4.552285f, 16.0f, 5.0f, 16.447716f, 5.0f, 17.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 19.552284f, 5.447716f, 20.0f, 6.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(18.552284f, 20.0f, 19.0f, 19.552284f, 19.0f, 19.0f),
                    PathNode.LineTo(19.0f, 17.0f),
                    PathNode.CurveTo(19.0f, 16.447716f, 19.447716f, 16.0f, 20.0f, 16.0f),
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(12.552285f, 3.0f, 13.0f, 3.447715f, 13.0f, 4.0f),
                    PathNode.LineTo(13.0f, 13.585f),
                    PathNode.LineTo(16.293f, 10.293f),
                    PathNode.CurveTo(16.685379f, 9.914028f, 17.309084f, 9.919448f, 17.694818f, 10.305182f),
                    PathNode.CurveTo(18.080553f, 10.690915f, 18.085972f, 11.314621f, 17.707f, 11.707f),
                    PathNode.LineTo(12.707f, 16.707f),
                    PathNode.CurveTo(12.678635f, 16.73545f, 12.64858f, 16.762165f, 12.617f, 16.787f),
                    PathNode.LineTo(12.707f, 16.707f),
                    PathNode.CurveTo(12.52751f, 16.886309f, 12.286573f, 16.99069f, 12.033f, 16.999f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(11.968f, 17.0f),
                    PathNode.LineTo(11.914f, 16.996f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.CurveTo(11.776299f, 17.000011f, 11.559053f, 16.925013f, 11.383f, 16.787f),
                    PathNode.CurveTo(11.35142f, 16.762165f, 11.321365f, 16.73545f, 11.293f, 16.707f),
                    PathNode.LineTo(6.293f, 11.707f),
                    PathNode.CurveTo(5.914028f, 11.314621f, 5.919448f, 10.690915f, 6.305182f, 10.305182f),
                    PathNode.CurveTo(6.690915f, 9.919448f, 7.314621f, 9.914028f, 7.707f, 10.293f),
                    PathNode.LineTo(11.0f, 13.585f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.CurveTo(11.0f, 3.447715f, 11.447715f, 3.0f, 12.0f, 3.0f)
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
        return _download!!
    }

private var _download: ImageVector? = null
