package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMeta: ImageVector
    get() {
        if (_brandMeta != null) return _brandMeta!!
        _brandMeta = tablerOutlineIcon(
            name = "BrandMeta",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 10.174f),
                    PathNode.CurveTo(13.766f, 7.39f, 15.315f, 6.0f, 16.648f, 6.0f),
                    PathNode.CurveTo(18.648f, 6.0f, 19.911f, 8.213001f, 20.648f, 11.217f),
                    PathNode.CurveTo(21.352f, 14.086f, 21.148f, 18.0f, 18.648f, 18.0f),
                    PathNode.CurveTo(17.534f, 18.0f, 16.0f, 16.435f, 14.5f, 14.348f),
                    PathNode.CurveTo(13.545535f, 13.032897f, 12.708959f, 11.636148f, 12.0f, 10.174f)
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
                    PathNode.MoveTo(12.0f, 10.174f),
                    PathNode.CurveTo(10.234f, 7.39f, 8.685f, 6.0f, 7.352f, 6.0f),
                    PathNode.CurveTo(5.352f, 6.0f, 4.089f, 8.213001f, 3.352f, 11.217f),
                    PathNode.CurveTo(2.648f, 14.086f, 2.852f, 18.0f, 5.352f, 18.0f),
                    PathNode.CurveTo(6.466f, 18.0f, 8.0f, 16.435f, 9.5f, 14.348f),
                    PathNode.CurveTo(10.5f, 12.957f, 11.333f, 11.565f, 12.0f, 10.174f)
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
        return _brandMeta!!
    }

private var _brandMeta: ImageVector? = null
