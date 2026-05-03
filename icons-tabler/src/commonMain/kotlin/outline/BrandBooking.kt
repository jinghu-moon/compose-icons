package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBooking: ImageVector
    get() {
        if (_brandBooking != null) return _brandBooking!!
        _brandBooking = tablerOutlineIcon(
            name = "BrandBooking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 8.5f),
                    PathNode.CurveTo(4.0f, 6.014719f, 6.014719f, 4.0f, 8.5f, 4.0f),
                    PathNode.LineTo(15.5f, 4.0f),
                    PathNode.CurveTo(17.98528f, 4.0f, 20.0f, 6.014719f, 20.0f, 8.5f),
                    PathNode.LineTo(20.0f, 15.5f),
                    PathNode.CurveTo(20.0f, 17.98528f, 17.98528f, 20.0f, 15.5f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.LineTo(11.5f, 12.0f),
                    PathNode.CurveTo(12.604569f, 12.0f, 13.5f, 12.895431f, 13.5f, 14.0f),
                    PathNode.CurveTo(13.5f, 15.104569f, 12.604569f, 16.0f, 11.5f, 16.0f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.LineTo(8.0f, 9.0f),
                    PathNode.CurveTo(8.0f, 8.447715f, 8.447715f, 8.0f, 9.0f, 8.0f),
                    PathNode.LineTo(10.5f, 8.0f),
                    PathNode.CurveTo(11.604569f, 8.0f, 12.5f, 8.895431f, 12.5f, 10.0f),
                    PathNode.CurveTo(12.5f, 11.104569f, 11.604569f, 12.0f, 10.5f, 12.0f),
                    PathNode.LineTo(9.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.LineTo(16.01f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandBooking!!
    }

private var _brandBooking: ImageVector? = null
