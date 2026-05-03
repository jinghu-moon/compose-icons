package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TipJarPound: ImageVector
    get() {
        if (_tipJarPound != null) return _tipJarPound!!
        _tipJarPound = tablerOutlineIcon(
            name = "TipJarPound",
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
                    PathNode.MoveTo(6.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.LineTo(6.0f, 4.0f)
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
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.CurveTo(11.895431f, 10.0f, 11.0f, 10.895431f, 11.0f, 12.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.CurveTo(11.0f, 15.105f, 10.605f, 16.0f, 9.5f, 16.0f),
                    PathNode.LineTo(14.0f, 16.0f)
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
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f)
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
        return _tipJarPound!!
    }

private var _tipJarPound: ImageVector? = null
