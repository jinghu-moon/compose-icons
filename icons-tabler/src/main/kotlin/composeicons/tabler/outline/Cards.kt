package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = tablerOutlineIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.604f, 7.197f),
                    PathNode.LineTo(10.742f, 4.088f),
                    PathNode.CurveTo(10.979955f, 3.986009f, 11.249016f, 3.98445f, 11.488136f, 4.083676f),
                    PathNode.CurveTo(11.727258f, 4.182901f, 11.916165f, 4.3745f, 12.012f, 4.615f),
                    PathNode.LineTo(16.936f, 16.517f),
                    PathNode.CurveTo(17.148926f, 17.019106f, 16.92026f, 17.599224f, 16.422f, 17.821f),
                    PathNode.LineTo(9.285f, 20.93f),
                    PathNode.CurveTo(9.046933f, 21.032312f, 8.777617f, 21.03404f, 8.538257f, 20.934793f),
                    PathNode.CurveTo(8.298896f, 20.835546f, 8.109821f, 20.643753f, 8.014f, 20.403f),
                    PathNode.LineTo(3.09f, 8.5f),
                    PathNode.CurveTo(2.877075f, 7.997895f, 3.105741f, 7.417777f, 3.604f, 7.196f),
                    PathNode.LineTo(3.604f, 7.197f)
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
                    PathNode.MoveTo(15.0f, 4.0f),
                    PathNode.LineTo(16.0f, 4.0f),
                    PathNode.CurveTo(16.552284f, 4.0f, 17.0f, 4.447716f, 17.0f, 5.0f),
                    PathNode.LineTo(17.0f, 8.5f)
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
                    PathNode.MoveTo(20.0f, 6.0f),
                    PathNode.CurveTo(20.264f, 6.112f, 20.52f, 6.217f, 20.768f, 6.315f),
                    PathNode.CurveTo(21.276339f, 6.530707f, 21.51361f, 7.117622f, 21.298f, 7.626f),
                    PathNode.LineTo(19.0f, 13.0f)
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
        return _cards!!
    }

private var _cards: ImageVector? = null
