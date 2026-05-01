package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetBangla: ImageVector
    get() {
        if (_alphabetBangla != null) return _alphabetBangla!!
        _alphabetBangla = tablerOutlineIcon(
            name = "AlphabetBangla",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.904f, 11.973f, 17.0f, 14.0f, 17.0f, 19.0f)
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
                    PathNode.MoveTo(10.0f, 11.0f),
                    PathNode.CurveTo(10.0f, 10.045f, 10.0f, 9.0f, 10.786f, 8.323f),
                    PathNode.CurveTo(12.048f, 7.234f, 13.811f, 8.873f, 13.986f, 10.383f),
                    PathNode.CurveTo(14.072f, 11.124f, 13.771f, 13.492f, 12.497f, 14.91f),
                    PathNode.CurveTo(12.022f, 15.44f, 11.593f, 15.902f, 10.786f, 15.984f),
                    PathNode.CurveTo(10.036f, 16.06f, 9.422f, 15.862f, 8.71f, 15.396f),
                    PathNode.CurveTo(7.572f, 14.653f, 6.383f, 13.399f, 5.374f, 11.666f),
                    PathNode.CurveTo(4.296f, 9.817f, 3.714f, 8.553f, 3.0f, 6.0f)
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
                    PathNode.MoveTo(7.37f, 7.072f),
                    PathNode.CurveTo(8.139f, 6.236f, 12.616f, 2.978f, 15.77f, 6.87f),
                    PathNode.CurveTo(16.152f, 7.342f, 16.343f, 7.578f, 16.67f, 8.5f),
                    PathNode.CurveTo(16.996f, 9.421f, 16.996f, 10.062f, 16.996f, 11.344f),
                    PathNode.LineTo(16.996f, 19.0f)
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
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.CurveTo(17.0f, 8.011f, 18.5f, 6.0f, 21.0f, 6.0f)
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
        return _alphabetBangla!!
    }

private var _alphabetBangla: ImageVector? = null
