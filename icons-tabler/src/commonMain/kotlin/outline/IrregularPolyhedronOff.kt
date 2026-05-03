package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IrregularPolyhedronOff: ImageVector
    get() {
        if (_irregularPolyhedronOff != null) return _irregularPolyhedronOff!!
        _irregularPolyhedronOff = tablerOutlineIcon(
            name = "IrregularPolyhedronOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.706f, 4.73f),
                    PathNode.CurveTo(4.310386f, 4.960367f, 4.121724f, 5.429962f, 4.248f, 5.87f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.LineTo(4.248f, 18.13f),
                    PathNode.CurveTo(4.106295f, 18.62412f, 4.362288f, 19.14519f, 4.84f, 19.335f),
                    PathNode.LineTo(11.122f, 21.838f),
                    PathNode.CurveTo(11.687402f, 22.054026f, 12.312598f, 22.054026f, 12.878f, 21.838f),
                    PathNode.LineTo(19.16f, 19.335f),
                    PathNode.CurveTo(19.2f, 19.319f, 19.239f, 19.3f, 19.276f, 19.28f),
                    PathNode.MoveTo(18.802f, 14.806f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(19.752f, 5.87f),
                    PathNode.CurveTo(19.893705f, 5.375879f, 19.637712f, 4.85481f, 19.16f, 4.665f),
                    PathNode.LineTo(12.878f, 2.162f),
                    PathNode.CurveTo(12.312598f, 1.945975f, 11.687402f, 1.945975f, 11.122f, 2.162f),
                    PathNode.LineTo(7.578f, 3.574f)
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
                    PathNode.MoveTo(4.5f, 5.5f),
                    PathNode.CurveTo(5.161f, 5.714f, 5.661f, 5.88f, 6.0f, 6.0f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(12.29f, 7.997f, 12.603f, 7.94f, 12.878f, 7.83f),
                    PathNode.LineTo(19.5f, 5.5f)
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(11.21f, 13.862f),
                    PathNode.CurveTo(11.720738f, 14.045184f, 12.279262f, 14.045184f, 12.79f, 13.862f),
                    PathNode.LineTo(13.532f, 13.597f),
                    PathNode.MoveTo(16.488f, 12.54f),
                    PathNode.CurveTo(16.8f, 12.43f, 17.304f, 12.249f, 18.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _irregularPolyhedronOff!!
    }

private var _irregularPolyhedronOff: ImageVector? = null
