package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleMinus2: ImageVector
    get() {
        if (_circleMinus2 != null) return _circleMinus2!!
        _circleMinus2 = tablerOutlineIcon(
            name = "CircleMinus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.475f, 15.029f),
                    PathNode.CurveTo(21.811022f, 11.289991f, 20.538973f, 7.117241f, 17.344343f, 4.759386f),
                    PathNode.CurveTo(14.149714f, 2.40153f, 9.787404f, 2.415737f, 6.6082f, 4.79435f),
                    PathNode.CurveTo(3.428997f, 7.172963f, 2.184153f, 11.353909f, 3.544499f, 15.084137f),
                    PathNode.CurveTo(4.904845f, 18.814363f, 8.548927f, 21.21241f, 12.513f, 20.986f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
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
        return _circleMinus2!!
    }

private var _circleMinus2: ImageVector? = null
