package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapShield: ImageVector
    get() {
        if (_mapShield != null) return _mapShield!!
        _mapShield = tablerOutlineIcon(
            name = "MapShield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 9.343145f, 13.656855f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(10.343145f, 8.0f, 9.0f, 9.343145f, 9.0f, 11.0f),
                    PathNode.CurveTo(9.0f, 12.656855f, 10.343145f, 14.0f, 12.0f, 14.0f)
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
                    PathNode.MoveTo(12.249f, 21.47f),
                    PathNode.CurveTo(11.636734f, 21.546549f, 11.023412f, 21.336205f, 10.587f, 20.9f),
                    PathNode.LineTo(6.343f, 16.657f),
                    PathNode.CurveTo(3.797648f, 14.11167f, 3.265725f, 10.179798f, 5.04327f, 7.049645f),
                    PathNode.CurveTo(6.820815f, 3.919492f, 10.470028f, 2.361996f, 13.959963f, 3.243971f),
                    PathNode.CurveTo(17.449898f, 4.125946f, 19.921003f, 7.230168f, 19.998f, 10.829f)
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
                    PathNode.MoveTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 20.0f, 19.5f, 22.0f, 18.5f, 22.0f),
                    PathNode.CurveTo(17.5f, 22.0f, 15.0f, 20.0f, 15.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 16.0f, 17.5f, 15.5f, 18.5f, 14.5f),
                    PathNode.CurveTo(19.5f, 15.5f, 21.0f, 16.0f, 22.0f, 16.0f)
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
        return _mapShield!!
    }

private var _mapShield: ImageVector? = null
