package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IdBadgeOff: ImageVector
    get() {
        if (_idBadgeOff != null) return _idBadgeOff!!
        _idBadgeOff = tablerOutlineIcon(
            name = "IdBadgeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.141f, 3.125f),
                    PathNode.CurveTo(7.41976f, 3.04191f, 7.709121f, 2.999802f, 8.0f, 3.0f),
                    PathNode.LineTo(16.0f, 3.0f),
                    PathNode.CurveTo(17.656855f, 3.0f, 19.0f, 4.343146f, 19.0f, 6.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.MoveTo(18.87f, 18.874f),
                    PathNode.CurveTo(18.485365f, 20.136986f, 17.320255f, 21.00006f, 16.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(6.343146f, 21.0f, 5.0f, 19.656855f, 5.0f, 18.0f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.CurveTo(4.9998f, 5.705622f, 5.042929f, 5.412818f, 5.128f, 5.131f)
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
                    PathNode.MoveTo(11.179f, 11.176f),
                    PathNode.CurveTo(10.370231f, 11.540409f, 9.898136f, 12.394014f, 10.019361f, 13.272767f),
                    PathNode.CurveTo(10.140587f, 14.15152f, 10.826163f, 14.845422f, 11.703388f, 14.977245f),
                    PathNode.CurveTo(12.580614f, 15.109069f, 13.439855f, 14.647311f, 13.814f, 13.843f)
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
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(14.0f, 6.0f)
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
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.LineTo(15.0f, 18.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _idBadgeOff!!
    }

private var _idBadgeOff: ImageVector? = null
