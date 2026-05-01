package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = tablerFilledIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 3.0f),
                    PathNode.CurveTo(21.552284f, 3.0f, 22.0f, 3.447715f, 22.0f, 4.0f),
                    PathNode.CurveTo(22.0f, 4.552285f, 21.552284f, 5.0f, 21.0f, 5.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.CurveTo(17.999857f, 18.810286f, 16.783918f, 20.394812f, 15.035322f, 20.863367f),
                    PathNode.CurveTo(13.286726f, 21.331926f, 11.441413f, 20.5677f, 10.536107f, 19.00004f),
                    PathNode.CurveTo(9.6308f, 17.43238f, 9.891204f, 15.452124f, 11.171018f, 14.171807f),
                    PathNode.CurveTo(12.450831f, 12.891491f, 14.430985f, 12.63031f, 15.999f, 13.535f),
                    PathNode.LineTo(16.0f, 4.0f),
                    PathNode.CurveTo(16.0f, 3.447715f, 16.447716f, 3.0f, 17.0f, 3.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 5.552285f, 13.552285f, 6.0f, 13.0f, 6.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(2.447715f, 6.0f, 2.0f, 5.552285f, 2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 4.447716f, 2.447715f, 4.0f, 3.0f, 4.0f),
                    PathNode.LineTo(13.0f, 4.0f),
                    PathNode.CurveTo(13.552285f, 4.0f, 14.0f, 4.447716f, 14.0f, 5.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 9.0f),
                    PathNode.CurveTo(14.0f, 9.552285f, 13.552285f, 10.0f, 13.0f, 10.0f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.CurveTo(2.447715f, 10.0f, 2.0f, 9.552285f, 2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 8.447715f, 2.447715f, 8.0f, 3.0f, 8.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.CurveTo(13.552285f, 8.0f, 14.0f, 8.447715f, 14.0f, 9.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 13.552285f, 9.552285f, 14.0f, 9.0f, 14.0f),
                    PathNode.LineTo(3.0f, 14.0f),
                    PathNode.CurveTo(2.447715f, 14.0f, 2.0f, 13.552285f, 2.0f, 13.0f),
                    PathNode.CurveTo(2.0f, 12.447715f, 2.447715f, 12.0f, 3.0f, 12.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.552285f, 12.0f, 10.0f, 12.447715f, 10.0f, 13.0f)
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
