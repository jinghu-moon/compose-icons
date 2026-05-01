package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TipJarEuro: ImageVector
    get() {
        if (_tipJarEuro != null) return _tipJarEuro!!
        _tipJarEuro = tablerOutlineIcon(
            name = "TipJarEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 4.0f),
                    PathNode.LineTo(17.0f, 5.882f),
                    PathNode.CurveTo(17.0f, 6.567f, 17.387f, 7.194f, 18.0f, 7.5f),
                    PathNode.CurveTo(18.613f, 7.806f, 19.0f, 8.433f, 19.0f, 9.118f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(19.0f, 19.656855f, 17.656855f, 21.0f, 16.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(6.343146f, 21.0f, 5.0f, 19.656855f, 5.0f, 18.0f),
                    PathNode.LineTo(5.0f, 9.118f),
                    PathNode.CurveTo(5.0f, 8.433f, 5.387f, 7.806f, 6.0f, 7.5f),
                    PathNode.CurveTo(6.613f, 7.194f, 7.0f, 6.567f, 7.0f, 5.882f),
                    PathNode.LineTo(7.0f, 4.0f)
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
                    PathNode.MoveTo(6.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.LineTo(6.0f, 4.0f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(9.0f, 13.0f)
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
                    PathNode.MoveTo(14.0f, 10.172f),
                    PathNode.CurveTo(12.756673f, 9.73182f, 11.37169f, 10.155329f, 10.587177f, 11.215592f),
                    PathNode.CurveTo(9.802665f, 12.275856f, 9.802665f, 13.724144f, 10.587177f, 14.784408f),
                    PathNode.CurveTo(11.37169f, 15.844671f, 12.756673f, 16.268179f, 14.0f, 15.828f)
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
        return _tipJarEuro!!
    }

private var _tipJarEuro: ImageVector? = null
