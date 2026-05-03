package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Speakerphone: ImageVector
    get() {
        if (_speakerphone != null) return _speakerphone!!
        _speakerphone = tablerOutlineIcon(
            name = "Speakerphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 8.0f),
                    PathNode.CurveTo(19.656855f, 8.0f, 21.0f, 9.343145f, 21.0f, 11.0f),
                    PathNode.CurveTo(21.0f, 12.656855f, 19.656855f, 14.0f, 18.0f, 14.0f)
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
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(10.0f, 19.552284f, 9.552285f, 20.0f, 9.0f, 20.0f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.CurveTo(7.447716f, 20.0f, 7.0f, 19.552284f, 7.0f, 19.0f),
                    PathNode.LineTo(7.0f, 14.0f)
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
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(16.524f, 4.23f),
                    PathNode.CurveTo(16.792362f, 4.006473f, 17.165817f, 3.958391f, 17.482048f, 4.106651f),
                    PathNode.CurveTo(17.798279f, 4.254911f, 18.00018f, 4.57274f, 18.0f, 4.922f),
                    PathNode.LineTo(18.0f, 17.078f),
                    PathNode.CurveTo(18.00018f, 17.427261f, 17.798279f, 17.745089f, 17.482048f, 17.893349f),
                    PathNode.CurveTo(17.165817f, 18.041609f, 16.792362f, 17.993526f, 16.524f, 17.77f),
                    PathNode.LineTo(12.0f, 14.0f),
                    PathNode.LineTo(4.0f, 14.0f),
                    PathNode.CurveTo(3.447715f, 14.0f, 3.0f, 13.552285f, 3.0f, 13.0f),
                    PathNode.LineTo(3.0f, 9.0f),
                    PathNode.CurveTo(3.0f, 8.447715f, 3.447715f, 8.0f, 4.0f, 8.0f),
                    PathNode.LineTo(12.0f, 8.0f)
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
        return _speakerphone!!
    }

private var _speakerphone: ImageVector? = null
