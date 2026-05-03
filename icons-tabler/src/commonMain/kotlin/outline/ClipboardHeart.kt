package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClipboardHeart: ImageVector
    get() {
        if (_clipboardHeart != null) return _clipboardHeart!!
        _clipboardHeart = tablerOutlineIcon(
            name = "ClipboardHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(5.895431f, 5.0f, 5.0f, 5.895431f, 5.0f, 7.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 20.10457f, 5.895431f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.CurveTo(18.10457f, 21.0f, 19.0f, 20.10457f, 19.0f, 19.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.CurveTo(19.0f, 5.895431f, 18.10457f, 5.0f, 17.0f, 5.0f),
                    PathNode.LineTo(15.0f, 5.0f)
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
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 3.895431f, 9.895431f, 3.0f, 11.0f, 3.0f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.CurveTo(14.104569f, 3.0f, 15.0f, 3.895431f, 15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 6.10457f, 14.104569f, 7.0f, 13.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.CurveTo(9.895431f, 7.0f, 9.0f, 6.10457f, 9.0f, 5.0f)
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
                    PathNode.MoveTo(11.993f, 16.75f),
                    PathNode.LineTo(14.74f, 13.935f),
                    PathNode.CurveTo(15.446061f, 13.199723f, 15.446061f, 12.038277f, 14.74f, 11.303f),
                    PathNode.CurveTo(14.405313f, 10.95463f, 13.943091f, 10.757726f, 13.46f, 10.757726f),
                    PathNode.CurveTo(12.976909f, 10.757726f, 12.514687f, 10.95463f, 12.18f, 11.303f),
                    PathNode.LineTo(11.997f, 11.491f),
                    PathNode.LineTo(11.814f, 11.302f),
                    PathNode.CurveTo(11.479313f, 10.95363f, 11.017091f, 10.756725f, 10.534f, 10.756725f),
                    PathNode.CurveTo(10.050909f, 10.756725f, 9.588687f, 10.95363f, 9.254f, 11.302f),
                    PathNode.CurveTo(8.547423f, 12.037069f, 8.547423f, 13.198931f, 9.254f, 13.934f),
                    PathNode.LineTo(11.992f, 16.759f),
                    PathNode.LineTo(11.993f, 16.75f)
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
        return _clipboardHeart!!
    }

private var _clipboardHeart: ImageVector? = null
