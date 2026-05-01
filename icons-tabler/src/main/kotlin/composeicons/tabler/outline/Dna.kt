package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = tablerOutlineIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.828f, 14.828f),
                    PathNode.CurveTo(15.867826f, 13.823702f, 16.284851f, 12.336489f, 15.918789f, 10.937971f),
                    PathNode.CurveTo(15.552727f, 9.539453f, 14.460547f, 8.447273f, 13.062029f, 8.081211f),
                    PathNode.CurveTo(11.663511f, 7.71515f, 10.176298f, 8.132174f, 9.172f, 9.172f),
                    PathNode.CurveTo(7.656111f, 10.741515f, 7.677791f, 13.23634f, 9.220726f, 14.779274f),
                    PathNode.CurveTo(10.76366f, 16.32221f, 13.258485f, 16.34389f, 14.828f, 14.828f)
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
                    PathNode.MoveTo(9.172f, 20.485f),
                    PathNode.CurveTo(10.734138f, 18.922865f, 10.734138f, 16.390137f, 9.172f, 14.828f),
                    PathNode.CurveTo(7.609863f, 13.265862f, 5.077138f, 13.265862f, 3.515f, 14.828f)
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
                    PathNode.MoveTo(14.828f, 3.515f),
                    PathNode.CurveTo(13.265862f, 5.077138f, 13.265862f, 7.609863f, 14.828f, 9.172f),
                    PathNode.CurveTo(16.390137f, 10.734138f, 18.922865f, 10.734138f, 20.485f, 9.172f)
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
        return _dna!!
    }

private var _dna: ImageVector? = null
