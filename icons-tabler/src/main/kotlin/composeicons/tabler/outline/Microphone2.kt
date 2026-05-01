package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Microphone2: ImageVector
    get() {
        if (_microphone2 != null) return _microphone2!!
        _microphone2 = tablerOutlineIcon(
            name = "Microphone2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 12.9f),
                    PathNode.CurveTo(17.162363f, 13.340041f, 19.357506f, 12.310513f, 20.401768f, 10.366558f),
                    PathNode.CurveTo(21.44603f, 8.422602f, 21.092455f, 6.023943f, 19.531693f, 4.463983f),
                    PathNode.CurveTo(17.970934f, 2.904022f, 15.572093f, 2.551675f, 13.628673f, 3.596934f),
                    PathNode.CurveTo(11.685252f, 4.642193f, 10.65685f, 6.837864f, 11.098f, 9.0f)
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
                    PathNode.MoveTo(15.0f, 12.9f),
                    PathNode.LineTo(11.098f, 9.001f),
                    PathNode.LineTo(3.585f, 17.585f),
                    PathNode.CurveTo(2.803517f, 18.365654f, 2.802846f, 19.632017f, 3.5835f, 20.4135f),
                    PathNode.CurveTo(4.364155f, 21.194983f, 5.630517f, 21.195654f, 6.412f, 20.415f),
                    PathNode.LineTo(15.0f, 12.9f)
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
        return _microphone2!!
    }

private var _microphone2: ImageVector? = null
