package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mickey: ImageVector
    get() {
        if (_mickey != null) return _mickey!!
        _mickey = tablerOutlineIcon(
            name = "Mickey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.5f, 3.0f),
                    PathNode.CurveTo(6.661477f, 2.999873f, 7.747362f, 3.575941f, 8.398552f, 4.537699f),
                    PathNode.CurveTo(9.049743f, 5.499458f, 9.181406f, 6.721614f, 8.75f, 7.8f),
                    PathNode.CurveTo(7.790721f, 8.303489f, 6.961052f, 9.022261f, 6.326f, 9.9f),
                    PathNode.CurveTo(5.013197f, 10.220729f, 3.63304f, 9.757008f, 2.780238f, 8.708653f),
                    PathNode.CurveTo(1.927435f, 7.660299f, 1.754375f, 6.214644f, 2.33563f, 4.994618f),
                    PathNode.CurveTo(2.916885f, 3.774592f, 4.148587f, 2.998205f, 5.5f, 3.0f)
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
                    PathNode.MoveTo(18.5f, 3.0f),
                    PathNode.CurveTo(19.849403f, 3.001378f, 21.077826f, 3.77837f, 21.65729f, 4.997022f),
                    PathNode.CurveTo(22.236753f, 6.215675f, 22.064034f, 7.658902f, 21.213367f, 8.706404f),
                    PathNode.CurveTo(20.362701f, 9.753904f, 18.985622f, 10.219081f, 17.674f, 9.902f),
                    PathNode.CurveTo(17.039404f, 9.023069f, 16.209682f, 8.303225f, 15.25f, 7.799f),
                    PathNode.CurveTo(14.819023f, 6.720724f, 14.9509f, 5.498898f, 15.602037f, 4.537419f),
                    PathNode.CurveTo(16.253174f, 3.57594f, 17.338785f, 3.000005f, 18.5f, 3.0f)
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
                    PathNode.MoveTo(5.0f, 14.0f),
                    PathNode.CurveTo(5.0f, 17.865993f, 8.134007f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(15.865993f, 21.0f, 19.0f, 17.865993f, 19.0f, 14.0f),
                    PathNode.CurveTo(19.0f, 10.134007f, 15.865993f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(8.134007f, 7.0f, 5.0f, 10.134007f, 5.0f, 14.0f)
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
        return _mickey!!
    }

private var _mickey: ImageVector? = null
