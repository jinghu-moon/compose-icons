package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZulip: ImageVector
    get() {
        if (_brandZulip != null) return _brandZulip!!
        _brandZulip = tablerOutlineIcon(
            name = "BrandZulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.5f, 3.0f),
                    PathNode.LineTo(17.5f, 3.0f),
                    PathNode.CurveTo(18.825f, 3.0f, 20.0f, 4.0f, 20.0f, 5.5f),
                    PathNode.CurveTo(20.0f, 7.5f, 18.295f, 8.764f, 18.0f, 9.0f),
                    PathNode.LineTo(13.5f, 13.0f),
                    PathNode.LineTo(15.5f, 8.0f),
                    PathNode.LineTo(6.5f, 8.0f),
                    PathNode.CurveTo(5.119288f, 8.0f, 4.0f, 6.880712f, 4.0f, 5.5f),
                    PathNode.CurveTo(4.0f, 4.119288f, 5.119288f, 3.0f, 6.5f, 3.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.5f, 21.0f),
                    PathNode.LineTo(6.5f, 21.0f),
                    PathNode.CurveTo(5.175f, 21.0f, 4.0f, 20.0f, 4.0f, 18.5f),
                    PathNode.CurveTo(4.0f, 16.5f, 5.705f, 15.236f, 6.0f, 15.0f),
                    PathNode.LineTo(10.5f, 11.0f),
                    PathNode.LineTo(8.5f, 16.0f),
                    PathNode.LineTo(17.5f, 16.0f),
                    PathNode.CurveTo(18.880713f, 16.0f, 20.0f, 17.119287f, 20.0f, 18.5f),
                    PathNode.CurveTo(20.0f, 19.880713f, 18.880713f, 21.0f, 17.5f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandZulip!!
    }

private var _brandZulip: ImageVector? = null
